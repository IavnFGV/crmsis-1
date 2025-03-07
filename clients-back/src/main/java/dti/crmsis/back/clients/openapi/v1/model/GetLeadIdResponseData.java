package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetLeadIdResponseData  {

    private UUID id;

    /**
    * Get id
    * @return id
    **/
    @JsonProperty("id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public UUID getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(UUID id) {
        this.id = id;
    }

    public GetLeadIdResponseData id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetLeadIdResponseData {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetLeadIdResponseData} object that
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

        GetLeadIdResponseData model = (GetLeadIdResponseData) obj;

        return java.util.Objects.equals(id, model.id);
    }

    /**
     * Returns a hash code for a {@code GetLeadIdResponseData}.
     *
     * @return a hash code value for a {@code GetLeadIdResponseData}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(id);
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
    public static class GetLeadIdResponseDataQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private UUID id;

        /**
        * Get id
        * @return id
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        public UUID getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(UUID id) {
            this.id = id;
        }

        public GetLeadIdResponseDataQueryParam id(UUID id) {
            this.id = id;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetLeadIdResponseDataQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
