package dti.crmsis.back.taskassignment.dslexecutors.sort;

import dti.crmsis.back.taskassignment.TaskAssignmentContext;
import dti.crmsis.back.taskassignment.dsl.DslUserSortByRandomBlock;
import dti.crmsis.back.taskassignment.dslexecutors.BlockType;
import jakarta.enterprise.context.Dependent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@BlockType(DslUserSortByRandomBlock.TYPE)
@Dependent
public class DslUserSortByRandomExecutor
        extends DslUserSortExecutor<DslUserSortByRandomBlock> {
    @Override
    public List<String> sortManagers(List<String> managers) {
        List<String> sortManagers = new ArrayList<String>(managers);
        Collections.shuffle(sortManagers);
        return sortManagers;
    }
}
