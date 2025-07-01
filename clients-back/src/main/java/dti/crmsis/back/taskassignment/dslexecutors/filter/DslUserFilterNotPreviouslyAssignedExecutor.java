package dti.crmsis.back.taskassignment.dslexecutors.filter;

import dti.crmsis.back.taskassignment.TaskAssignmentContext;
import dti.crmsis.back.taskassignment.dsl.DslUserFilterNotPreviouslyAssignedBlock;
import dti.crmsis.back.taskassignment.dslexecutors.BlockType;
import jakarta.enterprise.context.Dependent;

import java.util.ArrayList;
import java.util.List;

@BlockType(DslUserFilterNotPreviouslyAssignedBlock.TYPE)
@Dependent
public class DslUserFilterNotPreviouslyAssignedExecutor
        extends DslUserFilterExecutor<DslUserFilterNotPreviouslyAssignedBlock> {
    @Override
    public List<String> calculateUsers(TaskAssignmentContext context, List<String> prevList) {
        List<String> result = new ArrayList<>(prevList);
        result.removeAll(context.getPrevAssignedUsers());
        return result;
    }

    @Override
    public List<String> calculateInitialUsers(TaskAssignmentContext context) {
        throw new UnsupportedOperationException("There is no initial users for this filter");
    }
}
