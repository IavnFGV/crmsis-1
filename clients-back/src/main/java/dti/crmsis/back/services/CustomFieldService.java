package dti.crmsis.back.services;

import dti.crmsis.back.dao.pd.*;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.enterprise.context.ApplicationScoped;
import org.jboss.logging.Logger;

@ApplicationScoped
public class CustomFieldService {

    private static final Logger logger = Logger.getLogger(InitialEventsProcessorGenerated.class);


    public PanacheEntityBase saveCustomField(

            String mainEntityClassName, Long mainEntityId, String customFieldName, String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        switch (mainEntityClassName) {
            case "activity":
                ActivityCustomFieldEntity activityCustomFieldEntity =
                        new ActivityCustomFieldEntity();
                activityCustomFieldEntity.mainEntityId = mainEntityId;
                activityCustomFieldEntity.key = customFieldName;
                activityCustomFieldEntity.value = value;
                return activityCustomFieldEntity;
            case "deal":
                DealCustomFieldEntity dealCustomFieldEntity = new DealCustomFieldEntity();
                dealCustomFieldEntity.mainEntityId = mainEntityId;
                dealCustomFieldEntity.key = customFieldName;
                dealCustomFieldEntity.value = value;
                return dealCustomFieldEntity;
            case "organization":
                OrganizationCustomFieldEntity organizationCustomFieldEntity =
                        new OrganizationCustomFieldEntity();
                organizationCustomFieldEntity.mainEntityId = mainEntityId;
                organizationCustomFieldEntity.key = customFieldName;
                organizationCustomFieldEntity.value = value;
                return organizationCustomFieldEntity;
            case "person":
                PersonCustomFieldEntity personCustomFieldEntity = new PersonCustomFieldEntity();
                personCustomFieldEntity.mainEntityId = mainEntityId;
                personCustomFieldEntity.key = customFieldName;
                personCustomFieldEntity.value = value;
                return personCustomFieldEntity;
            case "ProductEntity":
                ProductCustomFieldEntity productCustomFieldEntity = new ProductCustomFieldEntity();
                productCustomFieldEntity.mainEntityId = mainEntityId;
                productCustomFieldEntity.key = customFieldName;
                productCustomFieldEntity.value = value;
                return productCustomFieldEntity;
            default:
                logger.warn("Unknown main entity type: " + mainEntityClassName);
                break;
        }
        return null;
    }

}
