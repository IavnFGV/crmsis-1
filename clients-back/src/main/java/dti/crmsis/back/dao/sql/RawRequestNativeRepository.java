package dti.crmsis.back.dao.sql;

import io.quarkus.agroal.DataSource;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;


@ApplicationScoped
public class RawRequestNativeRepository {

//    @Inject
    @PersistenceContext(unitName = "webhooks")
    EntityManager em;

    public List<Long> getSkippedRequests(Long afterId, int limit) {
        String sql = """
                    SELECT r.ID
                    FROM SB_WH_MUFIKSOFT.RAW_REQUESTS r
                    JOIN SB_PD_MUFIKSOFT.PROCESS_REPORTS p ON r.ID = p.RAW_REQUEST_ID
                    WHERE p.STATUS != 'OK' AND r.ID > ?
                    ORDER BY 
                             CASE
                                  WHEN r.REQUEST_DATA->>'$.meta.timestamp' REGEXP '^[0-9]+$'
                                      THEN FROM_UNIXTIME(CAST(r.REQUEST_DATA->>'$.meta.timestamp' AS UNSIGNED))
                                  ELSE STR_TO_DATE(r.REQUEST_DATA->>'$.meta.timestamp', '%Y-%m-%dT%H:%i:%s.%fZ')
                              END
                              , r.ID ASC
                """;

        return em.createNativeQuery(sql)
                .setParameter(1, afterId)
                .setMaxResults(limit)
                .getResultStream()
                .map(id -> ((Number) id).longValue())
                .toList();
    }


}

