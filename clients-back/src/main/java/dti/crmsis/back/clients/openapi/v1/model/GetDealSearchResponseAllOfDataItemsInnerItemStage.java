package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetDealSearchResponseAllOfDataItemsInnerItemStage  {

    /**
      * The ID of the stage of the deal
     **/
    private Integer id;
    /**
      * The name of the stage of the deal
     **/
    private String name;

    /**
    * The ID of the stage of the deal
    * @return id
    **/
    @JsonProperty("id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(Integer id) {
        this.id = id;
    }

    public GetDealSearchResponseAllOfDataItemsInnerItemStage id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The name of the stage of the deal
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

    public GetDealSearchResponseAllOfDataItemsInnerItemStage name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetDealSearchResponseAllOfDataItemsInnerItemStage {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetDealSearchResponseAllOfDataItemsInnerItemStage} object that
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

        GetDealSearchResponseAllOfDataItemsInnerItemStage model = (GetDealSearchResponseAllOfDataItemsInnerItemStage) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(name, model.name);
    }

    /**
     * Returns a hash code for a {@code GetDealSearchResponseAllOfDataItemsInnerItemStage}.
     *
     * @return a hash code value for a {@code GetDealSearchResponseAllOfDataItemsInnerItemStage}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        name);
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
    public static class GetDealSearchResponseAllOfDataItemsInnerItemStageQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;

        /**
        * The ID of the stage of the deal
        * @return id
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        public Integer getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(Integer id) {
            this.id = id;
        }

        public GetDealSearchResponseAllOfDataItemsInnerItemStageQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The name of the stage of the deal
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

        public GetDealSearchResponseAllOfDataItemsInnerItemStageQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetDealSearchResponseAllOfDataItemsInnerItemStageQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
