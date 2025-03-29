package dti.crmsis.back.clients.dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeyValueStore {

    private final Map<String, String> values = new HashMap<>();

    @JsonAnyGetter
    public Map<String, String> getValues() {
        return values;
    }

    @JsonAnySetter
    public void addValue(String key, String value) {
        values.put(key, value);
    }
}

