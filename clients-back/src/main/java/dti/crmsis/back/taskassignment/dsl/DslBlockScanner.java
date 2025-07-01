package dti.crmsis.back.taskassignment.dsl;

import java.lang.reflect.Field;
import java.util.*;

public class DslBlockScanner {


    public interface DslBlockVisitorWithPath<T extends DslBlock> {
        void visit(T block, String path);
    }

    public static void scan(DslBlock root, String pathPrefix, DslBlockVisitorWithPath visitor) {
        Set<DslBlock> visited = new HashSet<>();
        scanRecursive(root, pathPrefix, visitor, visited);
    }

    private static void scanRecursive(DslBlock block, String path, DslBlockVisitorWithPath visitor, Set<DslBlock> visited) {
        if (block == null || visited.contains(block)) return;

        visitor.visit(block, path);
        visited.add(block);

        for (Field field : block.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            try {
                Object value = field.get(block);

                if (value instanceof DslBlock child) {
                    scanRecursive(child, path + "." + field.getName(), visitor, visited);
                } else if (value instanceof Collection<?> collection) {
                    int index = 0;
                    for (Object item : collection) {
                        if (item instanceof DslBlock child) {
                            scanRecursive(child, path + "." + field.getName() + "[" + index + "]", visitor, visited);
                        }
                        index++;
                    }
                } else if (value instanceof Map<?, ?> map) {
                    for (Map.Entry<?, ?> entry : map.entrySet()) {
                        Object val = entry.getValue();
                        if (val instanceof DslBlock child) {
                            String key = String.valueOf(entry.getKey());
                            scanRecursive(child, path + "." + field.getName() + "[" + key + "]", visitor, visited);
                        }
                    }
                }

            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static Map<String, String> scanFlowWithPaths(DslFlowBlock flowBlock, DslBlockVisitorWithPath visitor) {
        Map<String, String> nameToPath = new HashMap<>();

        for (Map.Entry<String, DslBlock> entry : flowBlock.getBlocks().entrySet()) {
            String name = entry.getKey();
            DslBlock block = entry.getValue();
            String path = "root.blocks[" + name + "]";

            nameToPath.put(name, path);
            scan(block, path, visitor);
        }

        return nameToPath;
    }
}
