package dti.crmsis.back.services;

import jakarta.enterprise.context.ApplicationScoped;
import org.jboss.logging.Logger;

import java.io.InputStream;
import java.util.Properties;

@ApplicationScoped
public class AppVersion {

    private static final Logger LOG = Logger.getLogger(AppVersion.class);
    private String version = "unknown";

    public AppVersion() {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("version.properties")) {
            if (input != null) {
                Properties props = new Properties();
                props.load(input);
                version = props.getProperty("version", version);
            } else {
                LOG.warn("version.properties not found");
            }
        } catch (Exception e) {
            LOG.error("Failed to read version.properties", e);
        }
    }

    public String getVersion() {
        return version;
    }
}
