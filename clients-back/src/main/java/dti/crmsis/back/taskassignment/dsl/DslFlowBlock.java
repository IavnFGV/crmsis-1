package dti.crmsis.back.taskassignment.dsl;

import java.util.Map;

public final class DslFlowBlock implements DslBlock {

    String version;
    String initialBlock;
    String successOnTopic;
    Map<String, DslBlock> blocks;

    @Override
    public String getType() {
        return "flow";
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getInitialBlock() {
        return initialBlock;
    }

    public void setInitialBlock(String initialBlock) {
        this.initialBlock = initialBlock;
    }

    public String getSuccessOnTopic() {
        return successOnTopic;
    }

    public void setSuccessOnTopic(String successOnTopic) {
        this.successOnTopic = successOnTopic;
    }

    public Map<String, DslBlock> getBlocks() {
        return blocks;
    }

    public void setBlocks(Map<String, DslBlock> blocks) {
        this.blocks = blocks;
    }
}