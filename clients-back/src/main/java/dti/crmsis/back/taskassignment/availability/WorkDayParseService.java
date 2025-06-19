package dti.crmsis.back.taskassignment.availability;

import com.fasterxml.jackson.databind.ObjectMapper;
import dti.crmsis.back.dao.app.WorkDayEntity;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class WorkDayParseService {
    @Inject
    ObjectMapper objectMapper;

    public WorkDayDto parse(WorkDayEntity entity) {
        try {
            WorkDayDto dto = objectMapper.readValue(entity.configJson, WorkDayDto.class);
            dto.name = entity.name;
            return dto;
        } catch (Exception e) {
            throw new RuntimeException("Failed to parse WorkDay config for " + entity.name, e);
        }
    }
}
