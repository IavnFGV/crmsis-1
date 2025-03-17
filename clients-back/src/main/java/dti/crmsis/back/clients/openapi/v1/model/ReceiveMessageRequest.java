package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.ReceiveMessageRequestAttachmentsInner;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class ReceiveMessageRequest  {

    /**
      * The ID of the message
     **/
    private String id;
    /**
      * The channel ID as in the provider
     **/
    private String channelId;
    /**
      * The ID of the provider's user that sent the message
     **/
    private String senderId;
    /**
      * The ID of the conversation
     **/
    private String conversationId;
    /**
      * The body of the message
     **/
    private String message;

    public enum StatusEnum {
        SENT(String.valueOf("sent")), DELIVERED(String.valueOf("delivered")), READ(String.valueOf("read")), FAILED(String.valueOf("failed"));

        // caching enum access
        private static final java.util.EnumSet<StatusEnum> values = java.util.EnumSet.allOf(StatusEnum.class);

        String value;

        StatusEnum (String v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StatusEnum fromString(String v) {
            for (StatusEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    /**
      * The status of the message
     **/
    private StatusEnum status;
    /**
      * The date and time when the message was created in the provider, in UTC. Format: YYYY-MM-DD HH:MM
     **/
    private OffsetDateTime createdAt;
    /**
      * The date and time when the message can no longer receive a reply, in UTC. Format: YYYY-MM-DD HH:MM
     **/
    private OffsetDateTime replyBy;
    /**
      * A URL that can open the conversation in the provider's side
     **/
    private String conversationLink;
    /**
      * The list of attachments available in the message
     **/
    private List<ReceiveMessageRequestAttachmentsInner> attachments;

    /**
    * The ID of the message
    * @return id
    **/
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(String id) {
        this.id = id;
    }

    public ReceiveMessageRequest id(String id) {
        this.id = id;
        return this;
    }

    /**
    * The channel ID as in the provider
    * @return channelId
    **/
    @JsonProperty("channel_id")
    public String getChannelId() {
        return channelId;
    }

    /**
     * Set channelId
     **/
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public ReceiveMessageRequest channelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
    * The ID of the provider's user that sent the message
    * @return senderId
    **/
    @JsonProperty("sender_id")
    public String getSenderId() {
        return senderId;
    }

    /**
     * Set senderId
     **/
    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public ReceiveMessageRequest senderId(String senderId) {
        this.senderId = senderId;
        return this;
    }

    /**
    * The ID of the conversation
    * @return conversationId
    **/
    @JsonProperty("conversation_id")
    public String getConversationId() {
        return conversationId;
    }

    /**
     * Set conversationId
     **/
    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public ReceiveMessageRequest conversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }

    /**
    * The body of the message
    * @return message
    **/
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Set message
     **/
    public void setMessage(String message) {
        this.message = message;
    }

    public ReceiveMessageRequest message(String message) {
        this.message = message;
        return this;
    }

    /**
    * The status of the message
    * @return status
    **/
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }

    /**
     * Set status
     **/
    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ReceiveMessageRequest status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
    * The date and time when the message was created in the provider, in UTC. Format: YYYY-MM-DD HH:MM
    * @return createdAt
    **/
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Set createdAt
     **/
    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ReceiveMessageRequest createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
    * The date and time when the message can no longer receive a reply, in UTC. Format: YYYY-MM-DD HH:MM
    * @return replyBy
    **/
    @JsonProperty("reply_by")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public OffsetDateTime getReplyBy() {
        return replyBy;
    }

    /**
     * Set replyBy
     **/
    public void setReplyBy(OffsetDateTime replyBy) {
        this.replyBy = replyBy;
    }

    public ReceiveMessageRequest replyBy(OffsetDateTime replyBy) {
        this.replyBy = replyBy;
        return this;
    }

    /**
    * A URL that can open the conversation in the provider's side
    * @return conversationLink
    **/
    @JsonProperty("conversation_link")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getConversationLink() {
        return conversationLink;
    }

    /**
     * Set conversationLink
     **/
    public void setConversationLink(String conversationLink) {
        this.conversationLink = conversationLink;
    }

    public ReceiveMessageRequest conversationLink(String conversationLink) {
        this.conversationLink = conversationLink;
        return this;
    }

    /**
    * The list of attachments available in the message
    * @return attachments
    **/
    @JsonProperty("attachments")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<ReceiveMessageRequestAttachmentsInner> getAttachments() {
        return attachments;
    }

    /**
     * Set attachments
     **/
    public void setAttachments(List<ReceiveMessageRequestAttachmentsInner> attachments) {
        this.attachments = attachments;
    }

    public ReceiveMessageRequest attachments(List<ReceiveMessageRequestAttachmentsInner> attachments) {
        this.attachments = attachments;
        return this;
    }
    public ReceiveMessageRequest addAttachmentsItem(ReceiveMessageRequestAttachmentsInner attachmentsItem) {
        if (this.attachments == null){
            attachments = new ArrayList<>();
        }
        this.attachments.add(attachmentsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReceiveMessageRequest {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
        sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
        sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    replyBy: ").append(toIndentedString(replyBy)).append("\n");
        sb.append("    conversationLink: ").append(toIndentedString(conversationLink)).append("\n");
        sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code ReceiveMessageRequest} object that
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

        ReceiveMessageRequest model = (ReceiveMessageRequest) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(channelId, model.channelId) &&
        java.util.Objects.equals(senderId, model.senderId) &&
        java.util.Objects.equals(conversationId, model.conversationId) &&
        java.util.Objects.equals(message, model.message) &&
        java.util.Objects.equals(status, model.status) &&
        java.util.Objects.equals(createdAt, model.createdAt) &&
        java.util.Objects.equals(replyBy, model.replyBy) &&
        java.util.Objects.equals(conversationLink, model.conversationLink) &&
        java.util.Objects.equals(attachments, model.attachments);
    }

    /**
     * Returns a hash code for a {@code ReceiveMessageRequest}.
     *
     * @return a hash code value for a {@code ReceiveMessageRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        channelId,
        senderId,
        conversationId,
        message,
        status,
        createdAt,
        replyBy,
        conversationLink,
        attachments);
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
    public static class ReceiveMessageRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private String id;
        @jakarta.ws.rs.QueryParam("channelId")
        private String channelId;
        @jakarta.ws.rs.QueryParam("senderId")
        private String senderId;
        @jakarta.ws.rs.QueryParam("conversationId")
        private String conversationId;
        @jakarta.ws.rs.QueryParam("message")
        private String message;

    public enum StatusEnum {
        SENT(String.valueOf("sent")), DELIVERED(String.valueOf("delivered")), READ(String.valueOf("read")), FAILED(String.valueOf("failed"));

        // caching enum access
        private static final java.util.EnumSet<StatusEnum> values = java.util.EnumSet.allOf(StatusEnum.class);

        String value;

        StatusEnum (String v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StatusEnum fromString(String v) {
            for (StatusEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private StatusEnum status;
        @jakarta.ws.rs.QueryParam("createdAt")
        private OffsetDateTime createdAt;
        @jakarta.ws.rs.QueryParam("replyBy")
        private OffsetDateTime replyBy;
        @jakarta.ws.rs.QueryParam("conversationLink")
        private String conversationLink;
        @jakarta.ws.rs.QueryParam("attachments")
        private List<ReceiveMessageRequestAttachmentsInner> attachments = null;

        /**
        * The ID of the message
        * @return id
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        public String getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(String id) {
            this.id = id;
        }

        public ReceiveMessageRequestQueryParam id(String id) {
            this.id = id;
            return this;
        }

        /**
        * The channel ID as in the provider
        * @return channelId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("channel_id")
        public String getChannelId() {
            return channelId;
        }

        /**
         * Set channelId
         **/
        public void setChannelId(String channelId) {
            this.channelId = channelId;
        }

        public ReceiveMessageRequestQueryParam channelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        /**
        * The ID of the provider's user that sent the message
        * @return senderId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("sender_id")
        public String getSenderId() {
            return senderId;
        }

        /**
         * Set senderId
         **/
        public void setSenderId(String senderId) {
            this.senderId = senderId;
        }

        public ReceiveMessageRequestQueryParam senderId(String senderId) {
            this.senderId = senderId;
            return this;
        }

        /**
        * The ID of the conversation
        * @return conversationId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("conversation_id")
        public String getConversationId() {
            return conversationId;
        }

        /**
         * Set conversationId
         **/
        public void setConversationId(String conversationId) {
            this.conversationId = conversationId;
        }

        public ReceiveMessageRequestQueryParam conversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }

        /**
        * The body of the message
        * @return message
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        public String getMessage() {
            return message;
        }

        /**
         * Set message
         **/
        public void setMessage(String message) {
            this.message = message;
        }

        public ReceiveMessageRequestQueryParam message(String message) {
            this.message = message;
            return this;
        }

        /**
        * The status of the message
        * @return status
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        public StatusEnum getStatus() {
            return status;
        }

        /**
         * Set status
         **/
        public void setStatus(StatusEnum status) {
            this.status = status;
        }

        public ReceiveMessageRequestQueryParam status(StatusEnum status) {
            this.status = status;
            return this;
        }

        /**
        * The date and time when the message was created in the provider, in UTC. Format: YYYY-MM-DD HH:MM
        * @return createdAt
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("created_at")
        public OffsetDateTime getCreatedAt() {
            return createdAt;
        }

        /**
         * Set createdAt
         **/
        public void setCreatedAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
        }

        public ReceiveMessageRequestQueryParam createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
        * The date and time when the message can no longer receive a reply, in UTC. Format: YYYY-MM-DD HH:MM
        * @return replyBy
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("reply_by")
        public OffsetDateTime getReplyBy() {
            return replyBy;
        }

        /**
         * Set replyBy
         **/
        public void setReplyBy(OffsetDateTime replyBy) {
            this.replyBy = replyBy;
        }

        public ReceiveMessageRequestQueryParam replyBy(OffsetDateTime replyBy) {
            this.replyBy = replyBy;
            return this;
        }

        /**
        * A URL that can open the conversation in the provider's side
        * @return conversationLink
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("conversation_link")
        public String getConversationLink() {
            return conversationLink;
        }

        /**
         * Set conversationLink
         **/
        public void setConversationLink(String conversationLink) {
            this.conversationLink = conversationLink;
        }

        public ReceiveMessageRequestQueryParam conversationLink(String conversationLink) {
            this.conversationLink = conversationLink;
            return this;
        }

        /**
        * The list of attachments available in the message
        * @return attachments
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("attachments")
        public List<ReceiveMessageRequestAttachmentsInner> getAttachments() {
            return attachments;
        }

        /**
         * Set attachments
         **/
        public void setAttachments(List<ReceiveMessageRequestAttachmentsInner> attachments) {
            this.attachments = attachments;
        }

        public ReceiveMessageRequestQueryParam attachments(List<ReceiveMessageRequestAttachmentsInner> attachments) {
            this.attachments = attachments;
            return this;
        }
        public ReceiveMessageRequestQueryParam addAttachmentsItem(ReceiveMessageRequestAttachmentsInner attachmentsItem) {
            this.attachments.add(attachmentsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ReceiveMessageRequestQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
            sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
            sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
            sb.append("    message: ").append(toIndentedString(message)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
            sb.append("    replyBy: ").append(toIndentedString(replyBy)).append("\n");
            sb.append("    conversationLink: ").append(toIndentedString(conversationLink)).append("\n");
            sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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
