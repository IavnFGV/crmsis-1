package dti.crmsis.back.dao.sql;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import java.util.Collection;


@ApplicationScoped
public class NativeRepository {
    @Inject
    @PersistenceContext(unitName = "default")
    EntityManager em;

    public void markDealAsDeleted(Collection<DeleteDeal> dealList){
        Query nativeQuery = em.createNativeQuery("UPDATE DEALS SET DELETED=1 where ID_PIPEDRIVE = ?");
        for(DeleteDeal deal: dealList){
            nativeQuery.setParameter(1,deal.dealId);
            nativeQuery.executeUpdate();
        }
        em.flush();
    }
}
