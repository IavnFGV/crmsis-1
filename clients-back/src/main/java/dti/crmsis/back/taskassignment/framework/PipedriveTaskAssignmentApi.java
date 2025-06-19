package dti.crmsis.back.taskassignment.framework;

import dti.crmsis.back.services.PipedriveService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.jboss.logging.Logger;

@ApplicationScoped
public class PipedriveTaskAssignmentApi implements TaskAssignmentApi {
    private static final Logger LOG = Logger.getLogger(PipedriveTaskAssignmentApi.class);

    @Inject
    PipedriveService pipedriveService;

    @Override
    public void assign(Long dealId, Long userPipedriveId) {
        try {
            LOG.infof("Assigning manager to deal [%s] [%s]", userPipedriveId, dealId);
            pipedriveService.assignManager(dealId, userPipedriveId);
        } catch (Exception e) {
            LOG.errorf("CANT assign manager to deal [ idPipedrive, dealId] : [%s,%d,%s]", userPipedriveId);
            LOG.error(e.getMessage(), e);
            throw new ProblemWithPipedriveException("CANT assign manager to deal");
        }
    }
}
