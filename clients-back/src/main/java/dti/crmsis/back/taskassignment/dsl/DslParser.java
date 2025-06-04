package dti.crmsis.back.taskassignment.dsl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import dti.crmsis.back.messaging.TopicUtils;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.jboss.logging.Logger;

import java.util.Map;
import java.util.Optional;

@ApplicationScoped
public class DslParser {

    private static final Logger LOG = Logger.getLogger(DslParser.class);

    @Inject
    ObjectMapper mapper;

    public DslFlowBlock parseFlow(String json) {
        JsonNode root = null;
        try {
            root = mapper.readTree(json);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        Map<String, DslBlock> map = mapper.convertValue(root,
                mapper.getTypeFactory().constructMapType(Map.class, String.class, DslBlock.class));
        if (map.isEmpty()) {
            throw new RuntimeException("map is empty");
        }
        if (map.size() > 1) {
            throw new RuntimeException("map contains more than one block");
        }
        Optional<DslBlock> dslBlock = map.entrySet().stream().findFirst().map(Map.Entry::getValue);
        if (dslBlock.isPresent()) {
            if (!(dslBlock.get() instanceof DslFlowBlock)) {
                throw new RuntimeException("DslFlowBlock is not a DslFlowBlock");
            }
            return (DslFlowBlock) dslBlock.get();
        } else {
            throw new RuntimeException("Should not be here");
        }
    }


    public Map<String, DslBlock> parseString(String json) {
        JsonNode root = null;
        try {
            root = mapper.readTree(json);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return mapper.convertValue(root,
                mapper.getTypeFactory().constructMapType(Map.class, String.class, DslBlock.class));
    }

}
