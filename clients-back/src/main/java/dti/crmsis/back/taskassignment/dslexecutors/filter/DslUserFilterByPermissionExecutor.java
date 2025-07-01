package dti.crmsis.back.taskassignment.dslexecutors.filter;

import dti.crmsis.back.dao.app.ManagerProductBindingRepository;
import dti.crmsis.back.taskassignment.TaskAssignmentContext;
import dti.crmsis.back.taskassignment.dsl.DslUserFilterByPermissionBlock;
import dti.crmsis.back.taskassignment.dslexecutors.BlockType;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

import java.util.List;

@BlockType(DslUserFilterByPermissionBlock.TYPE)
@Dependent
public class DslUserFilterByPermissionExecutor
        extends DslUserFilterExecutor<DslUserFilterByPermissionBlock> {

    @Inject
    ManagerProductBindingRepository managerProductBindingRepository;

    @Override
    public List<String> calculateInitialUsers(TaskAssignmentContext context) {
        return managerProductBindingRepository.findActiveManagerEmailsByProduct(context.getProductName());
    }

    @Override
    public List<String> calculateUsers(TaskAssignmentContext context, List<String> prevList) {
        if (prevList == null || prevList.isEmpty()) {
            return calculateInitialUsers(context);
        }
        return managerProductBindingRepository.filterActiveManagerEmailsByProduct(prevList, List.of(context.getProductName()));
    }
}
