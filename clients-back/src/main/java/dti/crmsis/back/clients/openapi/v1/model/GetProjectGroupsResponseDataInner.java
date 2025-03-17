package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetProjectGroupsResponseDataInner  {

    /**
      * ID of the group
     **/
    private BigDecimal id;
    /**
      * Name of the group
     **/
    private String name;
    /**
      * Order number of the group
     **/
    private BigDecimal orderNr;

    /**
    * ID of the group
    * @return id
    **/
    @JsonProperty("id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(BigDecimal id) {
        this.id = id;
    }

    public GetProjectGroupsResponseDataInner id(BigDecimal id) {
        this.id = id;
        return this;
    }

    /**
    * Name of the group
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

    public GetProjectGroupsResponseDataInner name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Order number of the group
    * @return orderNr
    **/
    @JsonProperty("order_nr")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getOrderNr() {
        return orderNr;
    }

    /**
     * Set orderNr
     **/
    public void setOrderNr(BigDecimal orderNr) {
        this.orderNr = orderNr;
    }

    public GetProjectGroupsResponseDataInner orderNr(BigDecimal orderNr) {
        this.orderNr = orderNr;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetProjectGroupsResponseDataInner {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    orderNr: ").append(toIndentedString(orderNr)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetProjectGroupsResponseDataInner} object that
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

        GetProjectGroupsResponseDataInner model = (GetProjectGroupsResponseDataInner) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(orderNr, model.orderNr);
    }

    /**
     * Returns a hash code for a {@code GetProjectGroupsResponseDataInner}.
     *
     * @return a hash code value for a {@code GetProjectGroupsResponseDataInner}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        name,
        orderNr);
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
    public static class GetProjectGroupsResponseDataInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private BigDecimal id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("orderNr")
        private BigDecimal orderNr;

        /**
        * ID of the group
        * @return id
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        public BigDecimal getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(BigDecimal id) {
            this.id = id;
        }

        public GetProjectGroupsResponseDataInnerQueryParam id(BigDecimal id) {
            this.id = id;
            return this;
        }

        /**
        * Name of the group
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

        public GetProjectGroupsResponseDataInnerQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Order number of the group
        * @return orderNr
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("order_nr")
        public BigDecimal getOrderNr() {
            return orderNr;
        }

        /**
         * Set orderNr
         **/
        public void setOrderNr(BigDecimal orderNr) {
            this.orderNr = orderNr;
        }

        public GetProjectGroupsResponseDataInnerQueryParam orderNr(BigDecimal orderNr) {
            this.orderNr = orderNr;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetProjectGroupsResponseDataInnerQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    orderNr: ").append(toIndentedString(orderNr)).append("\n");
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
