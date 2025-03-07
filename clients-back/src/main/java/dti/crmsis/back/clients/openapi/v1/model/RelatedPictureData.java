package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.RelatedPictureDataPICTUREID;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The picture that is associated with the item
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class RelatedPictureData  {

    private RelatedPictureDataPICTUREID PICTURE_ID;

    /**
    * Get PICTURE_ID
    * @return PICTURE_ID
    **/
    @JsonProperty("PICTURE_ID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RelatedPictureDataPICTUREID getPICTUREID() {
        return PICTURE_ID;
    }

    /**
     * Set PICTURE_ID
     **/
    public void setPICTUREID(RelatedPictureDataPICTUREID PICTURE_ID) {
        this.PICTURE_ID = PICTURE_ID;
    }

    public RelatedPictureData PICTURE_ID(RelatedPictureDataPICTUREID PICTURE_ID) {
        this.PICTURE_ID = PICTURE_ID;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelatedPictureData {\n");

        sb.append("    PICTURE_ID: ").append(toIndentedString(PICTURE_ID)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code RelatedPictureData} object that
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

        RelatedPictureData model = (RelatedPictureData) obj;

        return java.util.Objects.equals(PICTURE_ID, model.PICTURE_ID);
    }

    /**
     * Returns a hash code for a {@code RelatedPictureData}.
     *
     * @return a hash code value for a {@code RelatedPictureData}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(PICTURE_ID);
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

    /**
      * The picture that is associated with the item
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RelatedPictureDataQueryParam  {

        /**
          * The picture that is associated with the item
         **/
        @jakarta.ws.rs.QueryParam("PICTURE_ID")
        private RelatedPictureDataPICTUREID PICTURE_ID;

        /**
        * Get PICTURE_ID
        * @return PICTURE_ID
        **/
        @JsonProperty("PICTURE_ID")
        public RelatedPictureDataPICTUREID getPICTUREID() {
            return PICTURE_ID;
        }

        /**
         * Set PICTURE_ID
         **/
        public void setPICTUREID(RelatedPictureDataPICTUREID PICTURE_ID) {
            this.PICTURE_ID = PICTURE_ID;
        }

        public RelatedPictureDataQueryParam PICTURE_ID(RelatedPictureDataPICTUREID PICTURE_ID) {
            this.PICTURE_ID = PICTURE_ID;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class RelatedPictureDataQueryParam {\n");

            sb.append("    PICTURE_ID: ").append(toIndentedString(PICTURE_ID)).append("\n");
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
