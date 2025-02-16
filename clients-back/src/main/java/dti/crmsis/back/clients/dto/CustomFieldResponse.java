package dti.crmsis.back.clients.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CustomFieldResponse {

    @JsonProperty("success")
    private boolean success;

    @JsonProperty("data")
    private List<Field> data;

    public boolean isSuccess() {
        return success;
    }

    public List<Field> getData() {
        return data;
    }

    public static class Field {
        @JsonProperty("id")
        private Long id;

        @JsonProperty("key")
        private String key;

        @JsonProperty("name")
        private String name;

        @JsonProperty("field_type")
        private String fieldType;

        public String getKey() {
            return key;
        }

        public String getName() {
            return name;
        }

        public String getFieldType() {
            return fieldType;
        }
    }
}
