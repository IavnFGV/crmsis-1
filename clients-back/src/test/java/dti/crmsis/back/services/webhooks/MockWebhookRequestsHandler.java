package dti.crmsis.back.services.webhooks;

import dti.crmsis.back.dao.crmsis.RawRequestEntity;
import dti.crmsis.back.services.webhooks.WebhookRequestsHandler;
import io.quarkus.test.Mock;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Collections;
import java.util.List;

//@Mock
//@ApplicationScoped
public class MockWebhookRequestsHandler extends WebhookRequestsHandler  {

    @Override
    protected List<RawRequestEntity> getRequestEntities(int pageIndex, int pageSize, Long idSelector) {
        RawRequestEntity mock = new RawRequestEntity();
        mock.setId(999L);
        mock.setRequestData("{\"key\":\"value\"}");
        mock.setCustomerName("test-customer");

        return Collections.singletonList(mock);
    }
}