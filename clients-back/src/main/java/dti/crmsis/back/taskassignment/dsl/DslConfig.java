package dti.crmsis.back.taskassignment.dsl;

import java.util.Map;

public record DslConfig(
    String version,
    String initialBlock,
    String successOnTopic,
    Map<String, DslBlock> blocks
) {}