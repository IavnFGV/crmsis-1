package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class MergePersonsRequest  {

    /**
      * The ID of the person that will not be overwritten. This person’s data will be prioritized in case of conflict with the other person.
     **/
    private Integer mergeWithId;

    /**
    * The ID of the person that will not be overwritten. This person’s data will be prioritized in case of conflict with the other person.
    * @return mergeWithId
    **/
    @JsonProperty("merge_with_id")
    public Integer getMergeWithId() {
        return mergeWithId;
    }

    /**
     * Set mergeWithId
     **/
    public void setMergeWithId(Integer mergeWithId) {
        this.mergeWithId = mergeWithId;
    }

    public MergePersonsRequest mergeWithId(Integer mergeWithId) {
        this.mergeWithId = mergeWithId;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergePersonsRequest {\n");

        sb.append("    mergeWithId: ").append(toIndentedString(mergeWithId)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code MergePersonsRequest} object that
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

        MergePersonsRequest model = (MergePersonsRequest) obj;

        return java.util.Objects.equals(mergeWithId, model.mergeWithId);
    }

    /**
     * Returns a hash code for a {@code MergePersonsRequest}.
     *
     * @return a hash code value for a {@code MergePersonsRequest}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(mergeWithId);
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
    public static class MergePersonsRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("mergeWithId")
        private Integer mergeWithId;

        /**
        * The ID of the person that will not be overwritten. This person’s data will be prioritized in case of conflict with the other person.
        * @return mergeWithId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("merge_with_id")
        public Integer getMergeWithId() {
            return mergeWithId;
        }

        /**
         * Set mergeWithId
         **/
        public void setMergeWithId(Integer mergeWithId) {
            this.mergeWithId = mergeWithId;
        }

        public MergePersonsRequestQueryParam mergeWithId(Integer mergeWithId) {
            this.mergeWithId = mergeWithId;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MergePersonsRequestQueryParam {\n");

            sb.append("    mergeWithId: ").append(toIndentedString(mergeWithId)).append("\n");
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
