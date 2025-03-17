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

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateProductFieldResponse  {

    /**
      * The name of the field
     **/
    private String name;
    /**
      * When `field_type` is either set or enum, possible options on update must be supplied as an array of objects each containing id and label, for example: [{\"id\":1, \"label\":\"red\"},{\"id\":2, \"label\":\"blue\"},{\"id\":3, \"label\":\"lilac\"}]
     **/
    private List<Object> options;

    /**
    * The name of the field
    * @return name
    **/
    @JsonProperty("name")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public UpdateProductFieldResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
    * When `field_type` is either set or enum, possible options on update must be supplied as an array of objects each containing id and label, for example: [{\"id\":1, \"label\":\"red\"},{\"id\":2, \"label\":\"blue\"},{\"id\":3, \"label\":\"lilac\"}]
    * @return options
    **/
    @JsonProperty("options")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Object> getOptions() {
        return options;
    }

    /**
     * Set options
     **/
    public void setOptions(List<Object> options) {
        this.options = options;
    }

    public UpdateProductFieldResponse options(List<Object> options) {
        this.options = options;
        return this;
    }
    public UpdateProductFieldResponse addOptionsItem(Object optionsItem) {
        if (this.options == null){
            options = new ArrayList<>();
        }
        this.options.add(optionsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateProductFieldResponse {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code UpdateProductFieldResponse} object that
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

        UpdateProductFieldResponse model = (UpdateProductFieldResponse) obj;

        return java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(options, model.options);
    }

    /**
     * Returns a hash code for a {@code UpdateProductFieldResponse}.
     *
     * @return a hash code value for a {@code UpdateProductFieldResponse}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,
        options);
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

    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class UpdateProductFieldResponseQueryParam  {

        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("options")
        private List<Object> options = null;

        /**
        * The name of the field
        * @return name
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public UpdateProductFieldResponseQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * When `field_type` is either set or enum, possible options on update must be supplied as an array of objects each containing id and label, for example: [{\"id\":1, \"label\":\"red\"},{\"id\":2, \"label\":\"blue\"},{\"id\":3, \"label\":\"lilac\"}]
        * @return options
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("options")
        public List<Object> getOptions() {
            return options;
        }

        /**
         * Set options
         **/
        public void setOptions(List<Object> options) {
            this.options = options;
        }

        public UpdateProductFieldResponseQueryParam options(List<Object> options) {
            this.options = options;
            return this;
        }
        public UpdateProductFieldResponseQueryParam addOptionsItem(Object optionsItem) {
            this.options.add(optionsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class UpdateProductFieldResponseQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
