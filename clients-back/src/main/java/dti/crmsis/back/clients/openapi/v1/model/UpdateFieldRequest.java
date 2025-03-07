package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateFieldRequest  {

    /**
      * The name of the field
     **/
    private String name;
    /**
      * When `field_type` is either set or enum, possible options must be supplied as a JSON-encoded sequential array of objects. All active items must be supplied and already existing items must have their ID supplied. New items only require a label. Example: `[{\"id\":123,\"label\":\"Existing Item\"},{\"label\":\"New Item\"}]`
     **/
    private List<Object> options;
    /**
      * Whether the field is available in 'add new' modal or not (both in web and mobile app)
     **/
    private Boolean addVisibleFlag = true;

    /**
    * The name of the field
    * @return name
    **/
    @JsonProperty("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public UpdateFieldRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
    * When `field_type` is either set or enum, possible options must be supplied as a JSON-encoded sequential array of objects. All active items must be supplied and already existing items must have their ID supplied. New items only require a label. Example: `[{\"id\":123,\"label\":\"Existing Item\"},{\"label\":\"New Item\"}]`
    * @return options
    **/
    @JsonProperty("options")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Object> getOptions() {
        return options;
    }

    /**
     * Set options
     **/
    public void setOptions(List<Object> options) {
        this.options = options;
    }

    public UpdateFieldRequest options(List<Object> options) {
        this.options = options;
        return this;
    }
    public UpdateFieldRequest addOptionsItem(Object optionsItem) {
        if (this.options == null){
            options = new ArrayList<>();
        }
        this.options.add(optionsItem);
        return this;
    }

    /**
    * Whether the field is available in 'add new' modal or not (both in web and mobile app)
    * @return addVisibleFlag
    **/
    @JsonProperty("add_visible_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAddVisibleFlag() {
        return addVisibleFlag;
    }

    /**
     * Set addVisibleFlag
     **/
    public void setAddVisibleFlag(Boolean addVisibleFlag) {
        this.addVisibleFlag = addVisibleFlag;
    }

    public UpdateFieldRequest addVisibleFlag(Boolean addVisibleFlag) {
        this.addVisibleFlag = addVisibleFlag;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFieldRequest {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    addVisibleFlag: ").append(toIndentedString(addVisibleFlag)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code UpdateFieldRequest} object that
     * contains the same values as this object.
     *
     * @param   obj   the object to compare with.
     * @return  {@code true} if the objects are the same;
     *          {@code false} otherwise.
     **/
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        UpdateFieldRequest model = (UpdateFieldRequest) obj;

        return java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(options, model.options) &&
        java.util.Objects.equals(addVisibleFlag, model.addVisibleFlag);
    }

    /**
     * Returns a hash code for a {@code UpdateFieldRequest}.
     *
     * @return a hash code value for a {@code UpdateFieldRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,
        options,
        addVisibleFlag);
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private static String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class UpdateFieldRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("options")
        private List<Object> options = null;
        @jakarta.ws.rs.QueryParam("addVisibleFlag")
        private Boolean addVisibleFlag = true;

        /**
        * The name of the field
        * @return name
        **/
        @JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public UpdateFieldRequestQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * When `field_type` is either set or enum, possible options must be supplied as a JSON-encoded sequential array of objects. All active items must be supplied and already existing items must have their ID supplied. New items only require a label. Example: `[{\"id\":123,\"label\":\"Existing Item\"},{\"label\":\"New Item\"}]`
        * @return options
        **/
        @JsonProperty("options")
        public List<Object> getOptions() {
            return options;
        }

        /**
         * Set options
         **/
        public void setOptions(List<Object> options) {
            this.options = options;
        }

        public UpdateFieldRequestQueryParam options(List<Object> options) {
            this.options = options;
            return this;
        }
        public UpdateFieldRequestQueryParam addOptionsItem(Object optionsItem) {
            this.options.add(optionsItem);
            return this;
        }

        /**
        * Whether the field is available in 'add new' modal or not (both in web and mobile app)
        * @return addVisibleFlag
        **/
        @JsonProperty("add_visible_flag")
        public Boolean getAddVisibleFlag() {
            return addVisibleFlag;
        }

        /**
         * Set addVisibleFlag
         **/
        public void setAddVisibleFlag(Boolean addVisibleFlag) {
            this.addVisibleFlag = addVisibleFlag;
        }

        public UpdateFieldRequestQueryParam addVisibleFlag(Boolean addVisibleFlag) {
            this.addVisibleFlag = addVisibleFlag;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class UpdateFieldRequestQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    options: ").append(toIndentedString(options)).append("\n");
            sb.append("    addVisibleFlag: ").append(toIndentedString(addVisibleFlag)).append("\n");
            sb.append("}");
            return sb.toString();
        }

        /**
         * Convert the given object to string with each line indented by 4 spaces
         * (except the first line).
         */
        private static String toIndentedString(Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }
    }}
