package dti.crmsis.back;

import io.quarkus.test.junit.QuarkusTestProfile;

import java.util.Set;

public class TestProfile implements QuarkusTestProfile {

    @Override
    public Set<Class<?>> getEnabledAlternatives() {
        return Set.of();
    }
}
