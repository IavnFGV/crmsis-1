package dti.crmsis.back.taskassignment;

import java.util.Map;

public record DslConfig(
    int version,
    Map<String, DslBlock> blocks
) {}