package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Member of a thread
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class MailThreadAllOfPartiesToInner  {

    /**
      * ID of the mail thread participant
     **/
    private Integer id;
    /**
      * Name of the mail thread participant
     **/
    private String name;
    /**
      * Whether the mail thread participant was last to send an email
     **/
    private Boolean latestSent;
    /**
      * Email address of the mail thread participant
     **/
    private String emailAddress;
    /**
      * Message time
     **/
    private BigDecimal messageTime;
    /**
      * ID of the linked person
     **/
    private Integer linkedPersonId;
    /**
      * Email of the linked person
     **/
    private String linkedPersonName;
    /**
      * ID of the mail message party
     **/
    private Integer mailMessagePartyId;
    /**
      * Linked Organization ID
     **/
    private Integer linkedOrganizationId;

    /**
    * ID of the mail thread participant
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

    public MailThreadAllOfPartiesToInner id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * Name of the mail thread participant
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

    public MailThreadAllOfPartiesToInner name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Whether the mail thread participant was last to send an email
    * @return latestSent
    **/
    @JsonProperty("latest_sent")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getLatestSent() {
        return latestSent;
    }

    /**
     * Set latestSent
     **/
    public void setLatestSent(Boolean latestSent) {
        this.latestSent = latestSent;
    }

    public MailThreadAllOfPartiesToInner latestSent(Boolean latestSent) {
        this.latestSent = latestSent;
        return this;
    }

    /**
    * Email address of the mail thread participant
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

    public MailThreadAllOfPartiesToInner emailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
    * Message time
    * @return messageTime
    **/
    @JsonProperty("message_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getMessageTime() {
        return messageTime;
    }

    /**
     * Set messageTime
     **/
    public void setMessageTime(BigDecimal messageTime) {
        this.messageTime = messageTime;
    }

    public MailThreadAllOfPartiesToInner messageTime(BigDecimal messageTime) {
        this.messageTime = messageTime;
        return this;
    }

    /**
    * ID of the linked person
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

    public MailThreadAllOfPartiesToInner linkedPersonId(Integer linkedPersonId) {
        this.linkedPersonId = linkedPersonId;
        return this;
    }

    /**
    * Email of the linked person
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

    public MailThreadAllOfPartiesToInner linkedPersonName(String linkedPersonName) {
        this.linkedPersonName = linkedPersonName;
        return this;
    }

    /**
    * ID of the mail message party
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

    public MailThreadAllOfPartiesToInner mailMessagePartyId(Integer mailMessagePartyId) {
        this.mailMessagePartyId = mailMessagePartyId;
        return this;
    }

    /**
    * Linked Organization ID
    * @return linkedOrganizationId
    **/
    @JsonProperty("linked_organization_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getLinkedOrganizationId() {
        return linkedOrganizationId;
    }

    /**
     * Set linkedOrganizationId
     **/
    public void setLinkedOrganizationId(Integer linkedOrganizationId) {
        this.linkedOrganizationId = linkedOrganizationId;
    }

    public MailThreadAllOfPartiesToInner linkedOrganizationId(Integer linkedOrganizationId) {
        this.linkedOrganizationId = linkedOrganizationId;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MailThreadAllOfPartiesToInner {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    latestSent: ").append(toIndentedString(latestSent)).append("\n");
        sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
        sb.append("    messageTime: ").append(toIndentedString(messageTime)).append("\n");
        sb.append("    linkedPersonId: ").append(toIndentedString(linkedPersonId)).append("\n");
        sb.append("    linkedPersonName: ").append(toIndentedString(linkedPersonName)).append("\n");
        sb.append("    mailMessagePartyId: ").append(toIndentedString(mailMessagePartyId)).append("\n");
        sb.append("    linkedOrganizationId: ").append(toIndentedString(linkedOrganizationId)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code MailThreadAllOfPartiesToInner} object that
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

        MailThreadAllOfPartiesToInner model = (MailThreadAllOfPartiesToInner) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(latestSent, model.latestSent) &&
        java.util.Objects.equals(emailAddress, model.emailAddress) &&
        java.util.Objects.equals(messageTime, model.messageTime) &&
        java.util.Objects.equals(linkedPersonId, model.linkedPersonId) &&
        java.util.Objects.equals(linkedPersonName, model.linkedPersonName) &&
        java.util.Objects.equals(mailMessagePartyId, model.mailMessagePartyId) &&
        java.util.Objects.equals(linkedOrganizationId, model.linkedOrganizationId);
    }

    /**
     * Returns a hash code for a {@code MailThreadAllOfPartiesToInner}.
     *
     * @return a hash code value for a {@code MailThreadAllOfPartiesToInner}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        name,
        latestSent,
        emailAddress,
        messageTime,
        linkedPersonId,
        linkedPersonName,
        mailMessagePartyId,
        linkedOrganizationId);
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
      * Member of a thread
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class MailThreadAllOfPartiesToInnerQueryParam  {

        /**
          * Member of a thread
         **/
        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        /**
          * Member of a thread
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * Member of a thread
         **/
        @jakarta.ws.rs.QueryParam("latestSent")
        private Boolean latestSent;
        /**
          * Member of a thread
         **/
        @jakarta.ws.rs.QueryParam("emailAddress")
        private String emailAddress;
        /**
          * Member of a thread
         **/
        @jakarta.ws.rs.QueryParam("messageTime")
        private BigDecimal messageTime;
        /**
          * Member of a thread
         **/
        @jakarta.ws.rs.QueryParam("linkedPersonId")
        private Integer linkedPersonId;
        /**
          * Member of a thread
         **/
        @jakarta.ws.rs.QueryParam("linkedPersonName")
        private String linkedPersonName;
        /**
          * Member of a thread
         **/
        @jakarta.ws.rs.QueryParam("mailMessagePartyId")
        private Integer mailMessagePartyId;
        /**
          * Member of a thread
         **/
        @jakarta.ws.rs.QueryParam("linkedOrganizationId")
        private Integer linkedOrganizationId;

        /**
        * ID of the mail thread participant
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

        public MailThreadAllOfPartiesToInnerQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * Name of the mail thread participant
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

        public MailThreadAllOfPartiesToInnerQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Whether the mail thread participant was last to send an email
        * @return latestSent
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("latest_sent")
        public Boolean getLatestSent() {
            return latestSent;
        }

        /**
         * Set latestSent
         **/
        public void setLatestSent(Boolean latestSent) {
            this.latestSent = latestSent;
        }

        public MailThreadAllOfPartiesToInnerQueryParam latestSent(Boolean latestSent) {
            this.latestSent = latestSent;
            return this;
        }

        /**
        * Email address of the mail thread participant
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

        public MailThreadAllOfPartiesToInnerQueryParam emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        /**
        * Message time
        * @return messageTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("message_time")
        public BigDecimal getMessageTime() {
            return messageTime;
        }

        /**
         * Set messageTime
         **/
        public void setMessageTime(BigDecimal messageTime) {
            this.messageTime = messageTime;
        }

        public MailThreadAllOfPartiesToInnerQueryParam messageTime(BigDecimal messageTime) {
            this.messageTime = messageTime;
            return this;
        }

        /**
        * ID of the linked person
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

        public MailThreadAllOfPartiesToInnerQueryParam linkedPersonId(Integer linkedPersonId) {
            this.linkedPersonId = linkedPersonId;
            return this;
        }

        /**
        * Email of the linked person
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

        public MailThreadAllOfPartiesToInnerQueryParam linkedPersonName(String linkedPersonName) {
            this.linkedPersonName = linkedPersonName;
            return this;
        }

        /**
        * ID of the mail message party
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

        public MailThreadAllOfPartiesToInnerQueryParam mailMessagePartyId(Integer mailMessagePartyId) {
            this.mailMessagePartyId = mailMessagePartyId;
            return this;
        }

        /**
        * Linked Organization ID
        * @return linkedOrganizationId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("linked_organization_id")
        public Integer getLinkedOrganizationId() {
            return linkedOrganizationId;
        }

        /**
         * Set linkedOrganizationId
         **/
        public void setLinkedOrganizationId(Integer linkedOrganizationId) {
            this.linkedOrganizationId = linkedOrganizationId;
        }

        public MailThreadAllOfPartiesToInnerQueryParam linkedOrganizationId(Integer linkedOrganizationId) {
            this.linkedOrganizationId = linkedOrganizationId;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MailThreadAllOfPartiesToInnerQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    latestSent: ").append(toIndentedString(latestSent)).append("\n");
            sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
            sb.append("    messageTime: ").append(toIndentedString(messageTime)).append("\n");
            sb.append("    linkedPersonId: ").append(toIndentedString(linkedPersonId)).append("\n");
            sb.append("    linkedPersonName: ").append(toIndentedString(linkedPersonName)).append("\n");
            sb.append("    mailMessagePartyId: ").append(toIndentedString(mailMessagePartyId)).append("\n");
            sb.append("    linkedOrganizationId: ").append(toIndentedString(linkedOrganizationId)).append("\n");
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
