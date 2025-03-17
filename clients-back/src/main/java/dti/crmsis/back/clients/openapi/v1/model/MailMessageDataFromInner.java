package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class MailMessageDataFromInner  {

    /**
      * ID of the mail participant
     **/
    private Integer id;
    /**
      * Mail address of the mail participant
     **/
    private String emailAddress;
    /**
      * Name of the mail participant
     **/
    private String name;
    /**
      * ID of the linked person to the mail message
     **/
    private Integer linkedPersonId;
    /**
      * Name of the linked person to the mail message
     **/
    private String linkedPersonName;
    /**
      * ID of the mail message participant
     **/
    private Integer mailMessagePartyId;

    /**
    * ID of the mail participant
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

    public MailMessageDataFromInner id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * Mail address of the mail participant
    * @return emailAddress
    **/
    @JsonProperty("email_address")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Set emailAddress
     **/
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public MailMessageDataFromInner emailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
    * Name of the mail participant
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

    public MailMessageDataFromInner name(String name) {
        this.name = name;
        return this;
    }

    /**
    * ID of the linked person to the mail message
    * @return linkedPersonId
    **/
    @JsonProperty("linked_person_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getLinkedPersonId() {
        return linkedPersonId;
    }

    /**
     * Set linkedPersonId
     **/
    public void setLinkedPersonId(Integer linkedPersonId) {
        this.linkedPersonId = linkedPersonId;
    }

    public MailMessageDataFromInner linkedPersonId(Integer linkedPersonId) {
        this.linkedPersonId = linkedPersonId;
        return this;
    }

    /**
    * Name of the linked person to the mail message
    * @return linkedPersonName
    **/
    @JsonProperty("linked_person_name")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLinkedPersonName() {
        return linkedPersonName;
    }

    /**
     * Set linkedPersonName
     **/
    public void setLinkedPersonName(String linkedPersonName) {
        this.linkedPersonName = linkedPersonName;
    }

    public MailMessageDataFromInner linkedPersonName(String linkedPersonName) {
        this.linkedPersonName = linkedPersonName;
        return this;
    }

    /**
    * ID of the mail message participant
    * @return mailMessagePartyId
    **/
    @JsonProperty("mail_message_party_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getMailMessagePartyId() {
        return mailMessagePartyId;
    }

    /**
     * Set mailMessagePartyId
     **/
    public void setMailMessagePartyId(Integer mailMessagePartyId) {
        this.mailMessagePartyId = mailMessagePartyId;
    }

    public MailMessageDataFromInner mailMessagePartyId(Integer mailMessagePartyId) {
        this.mailMessagePartyId = mailMessagePartyId;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MailMessageDataFromInner {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    linkedPersonId: ").append(toIndentedString(linkedPersonId)).append("\n");
        sb.append("    linkedPersonName: ").append(toIndentedString(linkedPersonName)).append("\n");
        sb.append("    mailMessagePartyId: ").append(toIndentedString(mailMessagePartyId)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code MailMessageDataFromInner} object that
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

        MailMessageDataFromInner model = (MailMessageDataFromInner) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(emailAddress, model.emailAddress) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(linkedPersonId, model.linkedPersonId) &&
        java.util.Objects.equals(linkedPersonName, model.linkedPersonName) &&
        java.util.Objects.equals(mailMessagePartyId, model.mailMessagePartyId);
    }

    /**
     * Returns a hash code for a {@code MailMessageDataFromInner}.
     *
     * @return a hash code value for a {@code MailMessageDataFromInner}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        emailAddress,
        name,
        linkedPersonId,
        linkedPersonName,
        mailMessagePartyId);
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
    public static class MailMessageDataFromInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("emailAddress")
        private String emailAddress;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("linkedPersonId")
        private Integer linkedPersonId;
        @jakarta.ws.rs.QueryParam("linkedPersonName")
        private String linkedPersonName;
        @jakarta.ws.rs.QueryParam("mailMessagePartyId")
        private Integer mailMessagePartyId;

        /**
        * ID of the mail participant
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

        public MailMessageDataFromInnerQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * Mail address of the mail participant
        * @return emailAddress
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("email_address")
        public String getEmailAddress() {
            return emailAddress;
        }

        /**
         * Set emailAddress
         **/
        public void setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }

        public MailMessageDataFromInnerQueryParam emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        /**
        * Name of the mail participant
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

        public MailMessageDataFromInnerQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * ID of the linked person to the mail message
        * @return linkedPersonId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("linked_person_id")
        public Integer getLinkedPersonId() {
            return linkedPersonId;
        }

        /**
         * Set linkedPersonId
         **/
        public void setLinkedPersonId(Integer linkedPersonId) {
            this.linkedPersonId = linkedPersonId;
        }

        public MailMessageDataFromInnerQueryParam linkedPersonId(Integer linkedPersonId) {
            this.linkedPersonId = linkedPersonId;
            return this;
        }

        /**
        * Name of the linked person to the mail message
        * @return linkedPersonName
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("linked_person_name")
        public String getLinkedPersonName() {
            return linkedPersonName;
        }

        /**
         * Set linkedPersonName
         **/
        public void setLinkedPersonName(String linkedPersonName) {
            this.linkedPersonName = linkedPersonName;
        }

        public MailMessageDataFromInnerQueryParam linkedPersonName(String linkedPersonName) {
            this.linkedPersonName = linkedPersonName;
            return this;
        }

        /**
        * ID of the mail message participant
        * @return mailMessagePartyId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("mail_message_party_id")
        public Integer getMailMessagePartyId() {
            return mailMessagePartyId;
        }

        /**
         * Set mailMessagePartyId
         **/
        public void setMailMessagePartyId(Integer mailMessagePartyId) {
            this.mailMessagePartyId = mailMessagePartyId;
        }

        public MailMessageDataFromInnerQueryParam mailMessagePartyId(Integer mailMessagePartyId) {
            this.mailMessagePartyId = mailMessagePartyId;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MailMessageDataFromInnerQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    linkedPersonId: ").append(toIndentedString(linkedPersonId)).append("\n");
            sb.append("    linkedPersonName: ").append(toIndentedString(linkedPersonName)).append("\n");
            sb.append("    mailMessagePartyId: ").append(toIndentedString(mailMessagePartyId)).append("\n");
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
