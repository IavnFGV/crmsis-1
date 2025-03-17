package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class MergeOrganizationsRequest  {

    /**
      * The ID of the organization that the organization will be merged with
     **/
    private Integer mergeWithId;

    /**
    * The ID of the organization that the organization will be merged with
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

    public MergeOrganizationsRequest mergeWithId(Integer mergeWithId) {
        this.mergeWithId = mergeWithId;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeOrganizationsRequest {\n");

        sb.append("    mergeWithId: ").append(toIndentedString(mergeWithId)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code MergeOrganizationsRequest} object that
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

        MergeOrganizationsRequest model = (MergeOrganizationsRequest) obj;

        return java.util.Objects.equals(mergeWithId, model.mergeWithId);
    }

    /**
     * Returns a hash code for a {@code MergeOrganizationsRequest}.
     *
     * @return a hash code value for a {@code MergeOrganizationsRequest}.
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
    public static class MergeOrganizationsRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("mergeWithId")
        private Integer mergeWithId;

        /**
        * The ID of the organization that the organization will be merged with
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

        public MergeOrganizationsRequestQueryParam mergeWithId(Integer mergeWithId) {
            this.mergeWithId = mergeWithId;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MergeOrganizationsRequestQueryParam {\n");

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
