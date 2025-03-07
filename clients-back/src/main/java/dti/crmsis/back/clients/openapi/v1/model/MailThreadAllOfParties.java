package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.MailThreadAllOfPartiesToInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Parties of the mail thread
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class MailThreadAllOfParties  {

    /**
      * Recipients of the mail thread
     **/
    private List<MailThreadAllOfPartiesToInner> to;
    /**
      * Senders of the mail thread
     **/
    private List<MailThreadAllOfPartiesToInner> from;

    /**
    * Recipients of the mail thread
    * @return to
    **/
    @JsonProperty("to")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<MailThreadAllOfPartiesToInner> getTo() {
        return to;
    }

    /**
     * Set to
     **/
    public void setTo(List<MailThreadAllOfPartiesToInner> to) {
        this.to = to;
    }

    public MailThreadAllOfParties to(List<MailThreadAllOfPartiesToInner> to) {
        this.to = to;
        return this;
    }
    public MailThreadAllOfParties addToItem(MailThreadAllOfPartiesToInner toItem) {
        if (this.to == null){
            to = new ArrayList<>();
        }
        this.to.add(toItem);
        return this;
    }

    /**
    * Senders of the mail thread
    * @return from
    **/
    @JsonProperty("from")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<MailThreadAllOfPartiesToInner> getFrom() {
        return from;
    }

    /**
     * Set from
     **/
    public void setFrom(List<MailThreadAllOfPartiesToInner> from) {
        this.from = from;
    }

    public MailThreadAllOfParties from(List<MailThreadAllOfPartiesToInner> from) {
        this.from = from;
        return this;
    }
    public MailThreadAllOfParties addFromItem(MailThreadAllOfPartiesToInner fromItem) {
        if (this.from == null){
            from = new ArrayList<>();
        }
        this.from.add(fromItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MailThreadAllOfParties {\n");

        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code MailThreadAllOfParties} object that
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

        MailThreadAllOfParties model = (MailThreadAllOfParties) obj;

        return java.util.Objects.equals(to, model.to) &&
        java.util.Objects.equals(from, model.from);
    }

    /**
     * Returns a hash code for a {@code MailThreadAllOfParties}.
     *
     * @return a hash code value for a {@code MailThreadAllOfParties}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(to,
        from);
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
      * Parties of the mail thread
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class MailThreadAllOfPartiesQueryParam  {

        /**
          * Parties of the mail thread
         **/
        @jakarta.ws.rs.QueryParam("to")
        private List<MailThreadAllOfPartiesToInner> to = null;
        /**
          * Parties of the mail thread
         **/
        @jakarta.ws.rs.QueryParam("from")
        private List<MailThreadAllOfPartiesToInner> from = null;

        /**
        * Recipients of the mail thread
        * @return to
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("to")
        public List<MailThreadAllOfPartiesToInner> getTo() {
            return to;
        }

        /**
         * Set to
         **/
        public void setTo(List<MailThreadAllOfPartiesToInner> to) {
            this.to = to;
        }

        public MailThreadAllOfPartiesQueryParam to(List<MailThreadAllOfPartiesToInner> to) {
            this.to = to;
            return this;
        }
        public MailThreadAllOfPartiesQueryParam addToItem(MailThreadAllOfPartiesToInner toItem) {
            this.to.add(toItem);
            return this;
        }

        /**
        * Senders of the mail thread
        * @return from
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("from")
        public List<MailThreadAllOfPartiesToInner> getFrom() {
            return from;
        }

        /**
         * Set from
         **/
        public void setFrom(List<MailThreadAllOfPartiesToInner> from) {
            this.from = from;
        }

        public MailThreadAllOfPartiesQueryParam from(List<MailThreadAllOfPartiesToInner> from) {
            this.from = from;
            return this;
        }
        public MailThreadAllOfPartiesQueryParam addFromItem(MailThreadAllOfPartiesToInner fromItem) {
            this.from.add(fromItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MailThreadAllOfPartiesQueryParam {\n");

            sb.append("    to: ").append(toIndentedString(to)).append("\n");
            sb.append("    from: ").append(toIndentedString(from)).append("\n");
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
