package dti.crmsis.back.dao.app;

import java.util.Objects;

public class ManagerWorkweekId {
    public String managerId;
    public Long workweekId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ManagerWorkweekId)) return false;
        ManagerWorkweekId that = (ManagerWorkweekId) o;
        return Objects.equals(managerId, that.managerId) && Objects.equals(workweekId, that.workweekId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(managerId, workweekId);
    }
}
