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
public class DeleteActivitiesResponseData  {

    /**
      * An array of the IDs of activities that were deleted
     **/
    private List<Integer> id;

    /**
    * An array of the IDs of activities that were deleted
    * @return id
    **/
    @JsonProperty("id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Integer> getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(List<Integer> id) {
        this.id = id;
    }

    public DeleteActivitiesResponseData id(List<Integer> id) {
        this.id = id;
        return this;
    }
    public DeleteActivitiesResponseData addIdItem(Integer idItem) {
        if (this.id == null){
            id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteActivitiesResponseData {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code DeleteActivitiesResponseData} object that
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

        DeleteActivitiesResponseData model = (DeleteActivitiesResponseData) obj;

        return java.util.Objects.equals(id, model.id);
    }

    /**
     * Returns a hash code for a {@code DeleteActivitiesResponseData}.
     *
     * @return a hash code value for a {@code DeleteActivitiesResponseData}.
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
    public static class DeleteActivitiesResponseDataQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private List<Integer> id = null;

        /**
        * An array of the IDs of activities that were deleted
        * @return id
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        public List<Integer> getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(List<Integer> id) {
            this.id = id;
        }

        public DeleteActivitiesResponseDataQueryParam id(List<Integer> id) {
            this.id = id;
            return this;
        }
        public DeleteActivitiesResponseDataQueryParam addIdItem(Integer idItem) {
            this.id.add(idItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DeleteActivitiesResponseDataQueryParam {\n");

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
