package dti.crmsis.back.services;


import dti.crmsis.back.dao.app.ManagerWorkweek;
import dti.crmsis.back.dao.app.Workweek;
import dti.crmsis.back.dto.v1.WorkweekDto;
import io.quarkus.hibernate.orm.panache.Panache;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class WorkweekService {

    @Transactional
    public Workweek getByManagerId(String managerId) {
        ManagerWorkweek link = ManagerWorkweek.find("managerId", managerId).firstResult();
        if (link == null) {
            return null;
        }
        return Workweek.findById(link.workweekId);
    }

    @Transactional
    public void saveOrUpdate(WorkweekDto payload) {
        ManagerWorkweek link = ManagerWorkweek.find("managerId", payload.managerId).firstResult();
        Workweek workweek;

        if (link != null) {
            workweek = Workweek.findById(link.workweekId);
            if (workweek == null) throw new IllegalStateException("Linked workweek not found");
            workweek.type = payload.type;
            workweek.configJson = payload.configJson;
        } else {
            workweek = new Workweek();
            workweek.type = payload.type;
            workweek.configJson = payload.configJson;
            workweek.persist();

            link = new ManagerWorkweek();
            link.managerId = payload.managerId;
            link.workweekId = workweek.id;
            link.persist();
        }
    }

    @Transactional
    public List<Workweek> getAll() {
        return Workweek.listAll();
    }

}