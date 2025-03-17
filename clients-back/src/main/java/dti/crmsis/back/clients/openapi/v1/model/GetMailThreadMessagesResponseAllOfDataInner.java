package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.MailThreadAllOfPartiesToInner;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetMailThreadMessagesResponseAllOfDataInner  {

    /**
      * ID of the mail thread
     **/
    private Integer id;
    /**
      * The connection account ID
     **/
    private String accountId;
    /**
      * ID of the user whom mail message will be assigned to
     **/
    private Integer userId;
    /**
      * The subject
     **/
    private String subject;
    /**
      * A snippet
     **/
    private String snippet;

    public enum ReadFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<ReadFlagEnum> values = java.util.EnumSet.allOf(ReadFlagEnum.class);

        BigDecimal value;

        ReadFlagEnum (BigDecimal v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ReadFlagEnum fromString(String v) {
            for (ReadFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private ReadFlagEnum readFlag = ReadFlagEnum.NUMBER_0;
    /**
      * Mail tracking status
     **/
    private String mailTrackingStatus;

    public enum HasAttachmentsFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<HasAttachmentsFlagEnum> values = java.util.EnumSet.allOf(HasAttachmentsFlagEnum.class);

        BigDecimal value;

        HasAttachmentsFlagEnum (BigDecimal v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static HasAttachmentsFlagEnum fromString(String v) {
            for (HasAttachmentsFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private HasAttachmentsFlagEnum hasAttachmentsFlag = HasAttachmentsFlagEnum.NUMBER_0;

    public enum HasInlineAttachmentsFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<HasInlineAttachmentsFlagEnum> values = java.util.EnumSet.allOf(HasInlineAttachmentsFlagEnum.class);

        BigDecimal value;

        HasInlineAttachmentsFlagEnum (BigDecimal v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static HasInlineAttachmentsFlagEnum fromString(String v) {
            for (HasInlineAttachmentsFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private HasInlineAttachmentsFlagEnum hasInlineAttachmentsFlag = HasInlineAttachmentsFlagEnum.NUMBER_0;

    public enum HasRealAttachmentsFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<HasRealAttachmentsFlagEnum> values = java.util.EnumSet.allOf(HasRealAttachmentsFlagEnum.class);

        BigDecimal value;

        HasRealAttachmentsFlagEnum (BigDecimal v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static HasRealAttachmentsFlagEnum fromString(String v) {
            for (HasRealAttachmentsFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private HasRealAttachmentsFlagEnum hasRealAttachmentsFlag = HasRealAttachmentsFlagEnum.NUMBER_0;

    public enum DeletedFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<DeletedFlagEnum> values = java.util.EnumSet.allOf(DeletedFlagEnum.class);

        BigDecimal value;

        DeletedFlagEnum (BigDecimal v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DeletedFlagEnum fromString(String v) {
            for (DeletedFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private DeletedFlagEnum deletedFlag = DeletedFlagEnum.NUMBER_0;

    public enum SyncedFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<SyncedFlagEnum> values = java.util.EnumSet.allOf(SyncedFlagEnum.class);

        BigDecimal value;

        SyncedFlagEnum (BigDecimal v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SyncedFlagEnum fromString(String v) {
            for (SyncedFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private SyncedFlagEnum syncedFlag = SyncedFlagEnum.NUMBER_0;

    public enum SmartBccFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<SmartBccFlagEnum> values = java.util.EnumSet.allOf(SmartBccFlagEnum.class);

        BigDecimal value;

        SmartBccFlagEnum (BigDecimal v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SmartBccFlagEnum fromString(String v) {
            for (SmartBccFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private SmartBccFlagEnum smartBccFlag = SmartBccFlagEnum.NUMBER_0;

    public enum MailLinkTrackingEnabledFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<MailLinkTrackingEnabledFlagEnum> values = java.util.EnumSet.allOf(MailLinkTrackingEnabledFlagEnum.class);

        BigDecimal value;

        MailLinkTrackingEnabledFlagEnum (BigDecimal v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MailLinkTrackingEnabledFlagEnum fromString(String v) {
            for (MailLinkTrackingEnabledFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private MailLinkTrackingEnabledFlagEnum mailLinkTrackingEnabledFlag = MailLinkTrackingEnabledFlagEnum.NUMBER_0;
    /**
      * Senders of the mail thread
     **/
    private List<MailThreadAllOfPartiesToInner> from;
    /**
      * Recipients of the mail thread
     **/
    private List<MailThreadAllOfPartiesToInner> to;
    /**
      * Participants of the Cc
     **/
    private List<MailThreadAllOfPartiesToInner> cc;
    /**
      * Participants of the Bcc
     **/
    private List<MailThreadAllOfPartiesToInner> bcc;
    /**
      * A link to the mail thread message
     **/
    private String bodyUrl;
    /**
      * ID of the mail thread
     **/
    private Integer mailThreadId;
    /**
      * If the mail message has a draft status then the value is the mail message object as JSON formatted string, otherwise `null`.
     **/
    private String draft;

    public enum HasBodyFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<HasBodyFlagEnum> values = java.util.EnumSet.allOf(HasBodyFlagEnum.class);

        BigDecimal value;

        HasBodyFlagEnum (BigDecimal v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static HasBodyFlagEnum fromString(String v) {
            for (HasBodyFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private HasBodyFlagEnum hasBodyFlag = HasBodyFlagEnum.NUMBER_0;

    public enum SentFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<SentFlagEnum> values = java.util.EnumSet.allOf(SentFlagEnum.class);

        BigDecimal value;

        SentFlagEnum (BigDecimal v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SentFlagEnum fromString(String v) {
            for (SentFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private SentFlagEnum sentFlag = SentFlagEnum.NUMBER_0;

    public enum SentFromPipedriveFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<SentFromPipedriveFlagEnum> values = java.util.EnumSet.allOf(SentFromPipedriveFlagEnum.class);

        BigDecimal value;

        SentFromPipedriveFlagEnum (BigDecimal v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SentFromPipedriveFlagEnum fromString(String v) {
            for (SentFromPipedriveFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private SentFromPipedriveFlagEnum sentFromPipedriveFlag = SentFromPipedriveFlagEnum.NUMBER_0;
    /**
      * The time when the mail message was received or created
     **/
    private OffsetDateTime messageTime;
    /**
      * The time when the mail message was inserted to database
     **/
    private OffsetDateTime addTime;
    /**
      * The time when the mail message was updated in database received
     **/
    private OffsetDateTime updateTime;

    /**
    * ID of the mail thread
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

    public GetMailThreadMessagesResponseAllOfDataInner id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The connection account ID
    * @return accountId
    **/
    @JsonProperty("account_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getAccountId() {
        return accountId;
    }

    /**
     * Set accountId
     **/
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public GetMailThreadMessagesResponseAllOfDataInner accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
    * ID of the user whom mail message will be assigned to
    * @return userId
    **/
    @JsonProperty("user_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getUserId() {
        return userId;
    }

    /**
     * Set userId
     **/
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public GetMailThreadMessagesResponseAllOfDataInner userId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
    * The subject
    * @return subject
    **/
    @JsonProperty("subject")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getSubject() {
        return subject;
    }

    /**
     * Set subject
     **/
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public GetMailThreadMessagesResponseAllOfDataInner subject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
    * A snippet
    * @return snippet
    **/
    @JsonProperty("snippet")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getSnippet() {
        return snippet;
    }

    /**
     * Set snippet
     **/
    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public GetMailThreadMessagesResponseAllOfDataInner snippet(String snippet) {
        this.snippet = snippet;
        return this;
    }

    /**
    * Get readFlag
    * @return readFlag
    **/
    @JsonProperty("read_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ReadFlagEnum getReadFlag() {
        return readFlag;
    }

    /**
     * Set readFlag
     **/
    public void setReadFlag(ReadFlagEnum readFlag) {
        this.readFlag = readFlag;
    }

    public GetMailThreadMessagesResponseAllOfDataInner readFlag(ReadFlagEnum readFlag) {
        this.readFlag = readFlag;
        return this;
    }

    /**
    * Mail tracking status
    * @return mailTrackingStatus
    **/
    @JsonProperty("mail_tracking_status")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getMailTrackingStatus() {
        return mailTrackingStatus;
    }

    /**
     * Set mailTrackingStatus
     **/
    public void setMailTrackingStatus(String mailTrackingStatus) {
        this.mailTrackingStatus = mailTrackingStatus;
    }

    public GetMailThreadMessagesResponseAllOfDataInner mailTrackingStatus(String mailTrackingStatus) {
        this.mailTrackingStatus = mailTrackingStatus;
        return this;
    }

    /**
    * Get hasAttachmentsFlag
    * @return hasAttachmentsFlag
    **/
    @JsonProperty("has_attachments_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public HasAttachmentsFlagEnum getHasAttachmentsFlag() {
        return hasAttachmentsFlag;
    }

    /**
     * Set hasAttachmentsFlag
     **/
    public void setHasAttachmentsFlag(HasAttachmentsFlagEnum hasAttachmentsFlag) {
        this.hasAttachmentsFlag = hasAttachmentsFlag;
    }

    public GetMailThreadMessagesResponseAllOfDataInner hasAttachmentsFlag(HasAttachmentsFlagEnum hasAttachmentsFlag) {
        this.hasAttachmentsFlag = hasAttachmentsFlag;
        return this;
    }

    /**
    * Get hasInlineAttachmentsFlag
    * @return hasInlineAttachmentsFlag
    **/
    @JsonProperty("has_inline_attachments_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public HasInlineAttachmentsFlagEnum getHasInlineAttachmentsFlag() {
        return hasInlineAttachmentsFlag;
    }

    /**
     * Set hasInlineAttachmentsFlag
     **/
    public void setHasInlineAttachmentsFlag(HasInlineAttachmentsFlagEnum hasInlineAttachmentsFlag) {
        this.hasInlineAttachmentsFlag = hasInlineAttachmentsFlag;
    }

    public GetMailThreadMessagesResponseAllOfDataInner hasInlineAttachmentsFlag(HasInlineAttachmentsFlagEnum hasInlineAttachmentsFlag) {
        this.hasInlineAttachmentsFlag = hasInlineAttachmentsFlag;
        return this;
    }

    /**
    * Get hasRealAttachmentsFlag
    * @return hasRealAttachmentsFlag
    **/
    @JsonProperty("has_real_attachments_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public HasRealAttachmentsFlagEnum getHasRealAttachmentsFlag() {
        return hasRealAttachmentsFlag;
    }

    /**
     * Set hasRealAttachmentsFlag
     **/
    public void setHasRealAttachmentsFlag(HasRealAttachmentsFlagEnum hasRealAttachmentsFlag) {
        this.hasRealAttachmentsFlag = hasRealAttachmentsFlag;
    }

    public GetMailThreadMessagesResponseAllOfDataInner hasRealAttachmentsFlag(HasRealAttachmentsFlagEnum hasRealAttachmentsFlag) {
        this.hasRealAttachmentsFlag = hasRealAttachmentsFlag;
        return this;
    }

    /**
    * Get deletedFlag
    * @return deletedFlag
    **/
    @JsonProperty("deleted_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public DeletedFlagEnum getDeletedFlag() {
        return deletedFlag;
    }

    /**
     * Set deletedFlag
     **/
    public void setDeletedFlag(DeletedFlagEnum deletedFlag) {
        this.deletedFlag = deletedFlag;
    }

    public GetMailThreadMessagesResponseAllOfDataInner deletedFlag(DeletedFlagEnum deletedFlag) {
        this.deletedFlag = deletedFlag;
        return this;
    }

    /**
    * Get syncedFlag
    * @return syncedFlag
    **/
    @JsonProperty("synced_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SyncedFlagEnum getSyncedFlag() {
        return syncedFlag;
    }

    /**
     * Set syncedFlag
     **/
    public void setSyncedFlag(SyncedFlagEnum syncedFlag) {
        this.syncedFlag = syncedFlag;
    }

    public GetMailThreadMessagesResponseAllOfDataInner syncedFlag(SyncedFlagEnum syncedFlag) {
        this.syncedFlag = syncedFlag;
        return this;
    }

    /**
    * Get smartBccFlag
    * @return smartBccFlag
    **/
    @JsonProperty("smart_bcc_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SmartBccFlagEnum getSmartBccFlag() {
        return smartBccFlag;
    }

    /**
     * Set smartBccFlag
     **/
    public void setSmartBccFlag(SmartBccFlagEnum smartBccFlag) {
        this.smartBccFlag = smartBccFlag;
    }

    public GetMailThreadMessagesResponseAllOfDataInner smartBccFlag(SmartBccFlagEnum smartBccFlag) {
        this.smartBccFlag = smartBccFlag;
        return this;
    }

    /**
    * Get mailLinkTrackingEnabledFlag
    * @return mailLinkTrackingEnabledFlag
    **/
    @JsonProperty("mail_link_tracking_enabled_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public MailLinkTrackingEnabledFlagEnum getMailLinkTrackingEnabledFlag() {
        return mailLinkTrackingEnabledFlag;
    }

    /**
     * Set mailLinkTrackingEnabledFlag
     **/
    public void setMailLinkTrackingEnabledFlag(MailLinkTrackingEnabledFlagEnum mailLinkTrackingEnabledFlag) {
        this.mailLinkTrackingEnabledFlag = mailLinkTrackingEnabledFlag;
    }

    public GetMailThreadMessagesResponseAllOfDataInner mailLinkTrackingEnabledFlag(MailLinkTrackingEnabledFlagEnum mailLinkTrackingEnabledFlag) {
        this.mailLinkTrackingEnabledFlag = mailLinkTrackingEnabledFlag;
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

    public GetMailThreadMessagesResponseAllOfDataInner from(List<MailThreadAllOfPartiesToInner> from) {
        this.from = from;
        return this;
    }
    public GetMailThreadMessagesResponseAllOfDataInner addFromItem(MailThreadAllOfPartiesToInner fromItem) {
        if (this.from == null){
            from = new ArrayList<>();
        }
        this.from.add(fromItem);
        return this;
    }

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

    public GetMailThreadMessagesResponseAllOfDataInner to(List<MailThreadAllOfPartiesToInner> to) {
        this.to = to;
        return this;
    }
    public GetMailThreadMessagesResponseAllOfDataInner addToItem(MailThreadAllOfPartiesToInner toItem) {
        if (this.to == null){
            to = new ArrayList<>();
        }
        this.to.add(toItem);
        return this;
    }

    /**
    * Participants of the Cc
    * @return cc
    **/
    @JsonProperty("cc")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<MailThreadAllOfPartiesToInner> getCc() {
        return cc;
    }

    /**
     * Set cc
     **/
    public void setCc(List<MailThreadAllOfPartiesToInner> cc) {
        this.cc = cc;
    }

    public GetMailThreadMessagesResponseAllOfDataInner cc(List<MailThreadAllOfPartiesToInner> cc) {
        this.cc = cc;
        return this;
    }
    public GetMailThreadMessagesResponseAllOfDataInner addCcItem(MailThreadAllOfPartiesToInner ccItem) {
        if (this.cc == null){
            cc = new ArrayList<>();
        }
        this.cc.add(ccItem);
        return this;
    }

    /**
    * Participants of the Bcc
    * @return bcc
    **/
    @JsonProperty("bcc")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<MailThreadAllOfPartiesToInner> getBcc() {
        return bcc;
    }

    /**
     * Set bcc
     **/
    public void setBcc(List<MailThreadAllOfPartiesToInner> bcc) {
        this.bcc = bcc;
    }

    public GetMailThreadMessagesResponseAllOfDataInner bcc(List<MailThreadAllOfPartiesToInner> bcc) {
        this.bcc = bcc;
        return this;
    }
    public GetMailThreadMessagesResponseAllOfDataInner addBccItem(MailThreadAllOfPartiesToInner bccItem) {
        if (this.bcc == null){
            bcc = new ArrayList<>();
        }
        this.bcc.add(bccItem);
        return this;
    }

    /**
    * A link to the mail thread message
    * @return bodyUrl
    **/
    @JsonProperty("body_url")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getBodyUrl() {
        return bodyUrl;
    }

    /**
     * Set bodyUrl
     **/
    public void setBodyUrl(String bodyUrl) {
        this.bodyUrl = bodyUrl;
    }

    public GetMailThreadMessagesResponseAllOfDataInner bodyUrl(String bodyUrl) {
        this.bodyUrl = bodyUrl;
        return this;
    }

    /**
    * ID of the mail thread
    * @return mailThreadId
    **/
    @JsonProperty("mail_thread_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getMailThreadId() {
        return mailThreadId;
    }

    /**
     * Set mailThreadId
     **/
    public void setMailThreadId(Integer mailThreadId) {
        this.mailThreadId = mailThreadId;
    }

    public GetMailThreadMessagesResponseAllOfDataInner mailThreadId(Integer mailThreadId) {
        this.mailThreadId = mailThreadId;
        return this;
    }

    /**
    * If the mail message has a draft status then the value is the mail message object as JSON formatted string, otherwise `null`.
    * @return draft
    **/
    @JsonProperty("draft")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDraft() {
        return draft;
    }

    /**
     * Set draft
     **/
    public void setDraft(String draft) {
        this.draft = draft;
    }

    public GetMailThreadMessagesResponseAllOfDataInner draft(String draft) {
        this.draft = draft;
        return this;
    }

    /**
    * Get hasBodyFlag
    * @return hasBodyFlag
    **/
    @JsonProperty("has_body_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public HasBodyFlagEnum getHasBodyFlag() {
        return hasBodyFlag;
    }

    /**
     * Set hasBodyFlag
     **/
    public void setHasBodyFlag(HasBodyFlagEnum hasBodyFlag) {
        this.hasBodyFlag = hasBodyFlag;
    }

    public GetMailThreadMessagesResponseAllOfDataInner hasBodyFlag(HasBodyFlagEnum hasBodyFlag) {
        this.hasBodyFlag = hasBodyFlag;
        return this;
    }

    /**
    * Get sentFlag
    * @return sentFlag
    **/
    @JsonProperty("sent_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SentFlagEnum getSentFlag() {
        return sentFlag;
    }

    /**
     * Set sentFlag
     **/
    public void setSentFlag(SentFlagEnum sentFlag) {
        this.sentFlag = sentFlag;
    }

    public GetMailThreadMessagesResponseAllOfDataInner sentFlag(SentFlagEnum sentFlag) {
        this.sentFlag = sentFlag;
        return this;
    }

    /**
    * Get sentFromPipedriveFlag
    * @return sentFromPipedriveFlag
    **/
    @JsonProperty("sent_from_pipedrive_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SentFromPipedriveFlagEnum getSentFromPipedriveFlag() {
        return sentFromPipedriveFlag;
    }

    /**
     * Set sentFromPipedriveFlag
     **/
    public void setSentFromPipedriveFlag(SentFromPipedriveFlagEnum sentFromPipedriveFlag) {
        this.sentFromPipedriveFlag = sentFromPipedriveFlag;
    }

    public GetMailThreadMessagesResponseAllOfDataInner sentFromPipedriveFlag(SentFromPipedriveFlagEnum sentFromPipedriveFlag) {
        this.sentFromPipedriveFlag = sentFromPipedriveFlag;
        return this;
    }

    /**
    * The time when the mail message was received or created
    * @return messageTime
    **/
    @JsonProperty("message_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public OffsetDateTime getMessageTime() {
        return messageTime;
    }

    /**
     * Set messageTime
     **/
    public void setMessageTime(OffsetDateTime messageTime) {
        this.messageTime = messageTime;
    }

    public GetMailThreadMessagesResponseAllOfDataInner messageTime(OffsetDateTime messageTime) {
        this.messageTime = messageTime;
        return this;
    }

    /**
    * The time when the mail message was inserted to database
    * @return addTime
    **/
    @JsonProperty("add_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public OffsetDateTime getAddTime() {
        return addTime;
    }

    /**
     * Set addTime
     **/
    public void setAddTime(OffsetDateTime addTime) {
        this.addTime = addTime;
    }

    public GetMailThreadMessagesResponseAllOfDataInner addTime(OffsetDateTime addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The time when the mail message was updated in database received
    * @return updateTime
    **/
    @JsonProperty("update_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * Set updateTime
     **/
    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public GetMailThreadMessagesResponseAllOfDataInner updateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetMailThreadMessagesResponseAllOfDataInner {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
        sb.append("    readFlag: ").append(toIndentedString(readFlag)).append("\n");
        sb.append("    mailTrackingStatus: ").append(toIndentedString(mailTrackingStatus)).append("\n");
        sb.append("    hasAttachmentsFlag: ").append(toIndentedString(hasAttachmentsFlag)).append("\n");
        sb.append("    hasInlineAttachmentsFlag: ").append(toIndentedString(hasInlineAttachmentsFlag)).append("\n");
        sb.append("    hasRealAttachmentsFlag: ").append(toIndentedString(hasRealAttachmentsFlag)).append("\n");
        sb.append("    deletedFlag: ").append(toIndentedString(deletedFlag)).append("\n");
        sb.append("    syncedFlag: ").append(toIndentedString(syncedFlag)).append("\n");
        sb.append("    smartBccFlag: ").append(toIndentedString(smartBccFlag)).append("\n");
        sb.append("    mailLinkTrackingEnabledFlag: ").append(toIndentedString(mailLinkTrackingEnabledFlag)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
        sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
        sb.append("    bodyUrl: ").append(toIndentedString(bodyUrl)).append("\n");
        sb.append("    mailThreadId: ").append(toIndentedString(mailThreadId)).append("\n");
        sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
        sb.append("    hasBodyFlag: ").append(toIndentedString(hasBodyFlag)).append("\n");
        sb.append("    sentFlag: ").append(toIndentedString(sentFlag)).append("\n");
        sb.append("    sentFromPipedriveFlag: ").append(toIndentedString(sentFromPipedriveFlag)).append("\n");
        sb.append("    messageTime: ").append(toIndentedString(messageTime)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetMailThreadMessagesResponseAllOfDataInner} object that
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

        GetMailThreadMessagesResponseAllOfDataInner model = (GetMailThreadMessagesResponseAllOfDataInner) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(accountId, model.accountId) &&
        java.util.Objects.equals(userId, model.userId) &&
        java.util.Objects.equals(subject, model.subject) &&
        java.util.Objects.equals(snippet, model.snippet) &&
        java.util.Objects.equals(readFlag, model.readFlag) &&
        java.util.Objects.equals(mailTrackingStatus, model.mailTrackingStatus) &&
        java.util.Objects.equals(hasAttachmentsFlag, model.hasAttachmentsFlag) &&
        java.util.Objects.equals(hasInlineAttachmentsFlag, model.hasInlineAttachmentsFlag) &&
        java.util.Objects.equals(hasRealAttachmentsFlag, model.hasRealAttachmentsFlag) &&
        java.util.Objects.equals(deletedFlag, model.deletedFlag) &&
        java.util.Objects.equals(syncedFlag, model.syncedFlag) &&
        java.util.Objects.equals(smartBccFlag, model.smartBccFlag) &&
        java.util.Objects.equals(mailLinkTrackingEnabledFlag, model.mailLinkTrackingEnabledFlag) &&
        java.util.Objects.equals(from, model.from) &&
        java.util.Objects.equals(to, model.to) &&
        java.util.Objects.equals(cc, model.cc) &&
        java.util.Objects.equals(bcc, model.bcc) &&
        java.util.Objects.equals(bodyUrl, model.bodyUrl) &&
        java.util.Objects.equals(mailThreadId, model.mailThreadId) &&
        java.util.Objects.equals(draft, model.draft) &&
        java.util.Objects.equals(hasBodyFlag, model.hasBodyFlag) &&
        java.util.Objects.equals(sentFlag, model.sentFlag) &&
        java.util.Objects.equals(sentFromPipedriveFlag, model.sentFromPipedriveFlag) &&
        java.util.Objects.equals(messageTime, model.messageTime) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(updateTime, model.updateTime);
    }

    /**
     * Returns a hash code for a {@code GetMailThreadMessagesResponseAllOfDataInner}.
     *
     * @return a hash code value for a {@code GetMailThreadMessagesResponseAllOfDataInner}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        accountId,
        userId,
        subject,
        snippet,
        readFlag,
        mailTrackingStatus,
        hasAttachmentsFlag,
        hasInlineAttachmentsFlag,
        hasRealAttachmentsFlag,
        deletedFlag,
        syncedFlag,
        smartBccFlag,
        mailLinkTrackingEnabledFlag,
        from,
        to,
        cc,
        bcc,
        bodyUrl,
        mailThreadId,
        draft,
        hasBodyFlag,
        sentFlag,
        sentFromPipedriveFlag,
        messageTime,
        addTime,
        updateTime);
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
    public static class GetMailThreadMessagesResponseAllOfDataInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("accountId")
        private String accountId;
        @jakarta.ws.rs.QueryParam("userId")
        private Integer userId;
        @jakarta.ws.rs.QueryParam("subject")
        private String subject;
        @jakarta.ws.rs.QueryParam("snippet")
        private String snippet;

    public enum ReadFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<ReadFlagEnum> values = java.util.EnumSet.allOf(ReadFlagEnum.class);

        BigDecimal value;

        ReadFlagEnum (BigDecimal v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ReadFlagEnum fromString(String v) {
            for (ReadFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private ReadFlagEnum readFlag = ReadFlagEnum.NUMBER_0;
        @jakarta.ws.rs.QueryParam("mailTrackingStatus")
        private String mailTrackingStatus;

    public enum HasAttachmentsFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<HasAttachmentsFlagEnum> values = java.util.EnumSet.allOf(HasAttachmentsFlagEnum.class);

        BigDecimal value;

        HasAttachmentsFlagEnum (BigDecimal v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static HasAttachmentsFlagEnum fromString(String v) {
            for (HasAttachmentsFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private HasAttachmentsFlagEnum hasAttachmentsFlag = HasAttachmentsFlagEnum.NUMBER_0;

    public enum HasInlineAttachmentsFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<HasInlineAttachmentsFlagEnum> values = java.util.EnumSet.allOf(HasInlineAttachmentsFlagEnum.class);

        BigDecimal value;

        HasInlineAttachmentsFlagEnum (BigDecimal v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static HasInlineAttachmentsFlagEnum fromString(String v) {
            for (HasInlineAttachmentsFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private HasInlineAttachmentsFlagEnum hasInlineAttachmentsFlag = HasInlineAttachmentsFlagEnum.NUMBER_0;

    public enum HasRealAttachmentsFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<HasRealAttachmentsFlagEnum> values = java.util.EnumSet.allOf(HasRealAttachmentsFlagEnum.class);

        BigDecimal value;

        HasRealAttachmentsFlagEnum (BigDecimal v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static HasRealAttachmentsFlagEnum fromString(String v) {
            for (HasRealAttachmentsFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private HasRealAttachmentsFlagEnum hasRealAttachmentsFlag = HasRealAttachmentsFlagEnum.NUMBER_0;

    public enum DeletedFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<DeletedFlagEnum> values = java.util.EnumSet.allOf(DeletedFlagEnum.class);

        BigDecimal value;

        DeletedFlagEnum (BigDecimal v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DeletedFlagEnum fromString(String v) {
            for (DeletedFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private DeletedFlagEnum deletedFlag = DeletedFlagEnum.NUMBER_0;

    public enum SyncedFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<SyncedFlagEnum> values = java.util.EnumSet.allOf(SyncedFlagEnum.class);

        BigDecimal value;

        SyncedFlagEnum (BigDecimal v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SyncedFlagEnum fromString(String v) {
            for (SyncedFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private SyncedFlagEnum syncedFlag = SyncedFlagEnum.NUMBER_0;

    public enum SmartBccFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<SmartBccFlagEnum> values = java.util.EnumSet.allOf(SmartBccFlagEnum.class);

        BigDecimal value;

        SmartBccFlagEnum (BigDecimal v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SmartBccFlagEnum fromString(String v) {
            for (SmartBccFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private SmartBccFlagEnum smartBccFlag = SmartBccFlagEnum.NUMBER_0;

    public enum MailLinkTrackingEnabledFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<MailLinkTrackingEnabledFlagEnum> values = java.util.EnumSet.allOf(MailLinkTrackingEnabledFlagEnum.class);

        BigDecimal value;

        MailLinkTrackingEnabledFlagEnum (BigDecimal v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MailLinkTrackingEnabledFlagEnum fromString(String v) {
            for (MailLinkTrackingEnabledFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private MailLinkTrackingEnabledFlagEnum mailLinkTrackingEnabledFlag = MailLinkTrackingEnabledFlagEnum.NUMBER_0;
        @jakarta.ws.rs.QueryParam("from")
        private List<MailThreadAllOfPartiesToInner> from = null;
        @jakarta.ws.rs.QueryParam("to")
        private List<MailThreadAllOfPartiesToInner> to = null;
        @jakarta.ws.rs.QueryParam("cc")
        private List<MailThreadAllOfPartiesToInner> cc = null;
        @jakarta.ws.rs.QueryParam("bcc")
        private List<MailThreadAllOfPartiesToInner> bcc = null;
        @jakarta.ws.rs.QueryParam("bodyUrl")
        private String bodyUrl;
        @jakarta.ws.rs.QueryParam("mailThreadId")
        private Integer mailThreadId;
        @jakarta.ws.rs.QueryParam("draft")
        private String draft;

    public enum HasBodyFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<HasBodyFlagEnum> values = java.util.EnumSet.allOf(HasBodyFlagEnum.class);

        BigDecimal value;

        HasBodyFlagEnum (BigDecimal v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static HasBodyFlagEnum fromString(String v) {
            for (HasBodyFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private HasBodyFlagEnum hasBodyFlag = HasBodyFlagEnum.NUMBER_0;

    public enum SentFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<SentFlagEnum> values = java.util.EnumSet.allOf(SentFlagEnum.class);

        BigDecimal value;

        SentFlagEnum (BigDecimal v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SentFlagEnum fromString(String v) {
            for (SentFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private SentFlagEnum sentFlag = SentFlagEnum.NUMBER_0;

    public enum SentFromPipedriveFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<SentFromPipedriveFlagEnum> values = java.util.EnumSet.allOf(SentFromPipedriveFlagEnum.class);

        BigDecimal value;

        SentFromPipedriveFlagEnum (BigDecimal v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SentFromPipedriveFlagEnum fromString(String v) {
            for (SentFromPipedriveFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private SentFromPipedriveFlagEnum sentFromPipedriveFlag = SentFromPipedriveFlagEnum.NUMBER_0;
        @jakarta.ws.rs.QueryParam("messageTime")
        private OffsetDateTime messageTime;
        @jakarta.ws.rs.QueryParam("addTime")
        private OffsetDateTime addTime;
        @jakarta.ws.rs.QueryParam("updateTime")
        private OffsetDateTime updateTime;

        /**
        * ID of the mail thread
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

        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The connection account ID
        * @return accountId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("account_id")
        public String getAccountId() {
            return accountId;
        }

        /**
         * Set accountId
         **/
        public void setAccountId(String accountId) {
            this.accountId = accountId;
        }

        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
        * ID of the user whom mail message will be assigned to
        * @return userId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("user_id")
        public Integer getUserId() {
            return userId;
        }

        /**
         * Set userId
         **/
        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        /**
        * The subject
        * @return subject
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("subject")
        public String getSubject() {
            return subject;
        }

        /**
         * Set subject
         **/
        public void setSubject(String subject) {
            this.subject = subject;
        }

        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam subject(String subject) {
            this.subject = subject;
            return this;
        }

        /**
        * A snippet
        * @return snippet
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("snippet")
        public String getSnippet() {
            return snippet;
        }

        /**
         * Set snippet
         **/
        public void setSnippet(String snippet) {
            this.snippet = snippet;
        }

        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam snippet(String snippet) {
            this.snippet = snippet;
            return this;
        }

        /**
        * Get readFlag
        * @return readFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("read_flag")
        public ReadFlagEnum getReadFlag() {
            return readFlag;
        }

        /**
         * Set readFlag
         **/
        public void setReadFlag(ReadFlagEnum readFlag) {
            this.readFlag = readFlag;
        }

        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam readFlag(ReadFlagEnum readFlag) {
            this.readFlag = readFlag;
            return this;
        }

        /**
        * Mail tracking status
        * @return mailTrackingStatus
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("mail_tracking_status")
        public String getMailTrackingStatus() {
            return mailTrackingStatus;
        }

        /**
         * Set mailTrackingStatus
         **/
        public void setMailTrackingStatus(String mailTrackingStatus) {
            this.mailTrackingStatus = mailTrackingStatus;
        }

        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam mailTrackingStatus(String mailTrackingStatus) {
            this.mailTrackingStatus = mailTrackingStatus;
            return this;
        }

        /**
        * Get hasAttachmentsFlag
        * @return hasAttachmentsFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("has_attachments_flag")
        public HasAttachmentsFlagEnum getHasAttachmentsFlag() {
            return hasAttachmentsFlag;
        }

        /**
         * Set hasAttachmentsFlag
         **/
        public void setHasAttachmentsFlag(HasAttachmentsFlagEnum hasAttachmentsFlag) {
            this.hasAttachmentsFlag = hasAttachmentsFlag;
        }

        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam hasAttachmentsFlag(HasAttachmentsFlagEnum hasAttachmentsFlag) {
            this.hasAttachmentsFlag = hasAttachmentsFlag;
            return this;
        }

        /**
        * Get hasInlineAttachmentsFlag
        * @return hasInlineAttachmentsFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("has_inline_attachments_flag")
        public HasInlineAttachmentsFlagEnum getHasInlineAttachmentsFlag() {
            return hasInlineAttachmentsFlag;
        }

        /**
         * Set hasInlineAttachmentsFlag
         **/
        public void setHasInlineAttachmentsFlag(HasInlineAttachmentsFlagEnum hasInlineAttachmentsFlag) {
            this.hasInlineAttachmentsFlag = hasInlineAttachmentsFlag;
        }

        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam hasInlineAttachmentsFlag(HasInlineAttachmentsFlagEnum hasInlineAttachmentsFlag) {
            this.hasInlineAttachmentsFlag = hasInlineAttachmentsFlag;
            return this;
        }

        /**
        * Get hasRealAttachmentsFlag
        * @return hasRealAttachmentsFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("has_real_attachments_flag")
        public HasRealAttachmentsFlagEnum getHasRealAttachmentsFlag() {
            return hasRealAttachmentsFlag;
        }

        /**
         * Set hasRealAttachmentsFlag
         **/
        public void setHasRealAttachmentsFlag(HasRealAttachmentsFlagEnum hasRealAttachmentsFlag) {
            this.hasRealAttachmentsFlag = hasRealAttachmentsFlag;
        }

        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam hasRealAttachmentsFlag(HasRealAttachmentsFlagEnum hasRealAttachmentsFlag) {
            this.hasRealAttachmentsFlag = hasRealAttachmentsFlag;
            return this;
        }

        /**
        * Get deletedFlag
        * @return deletedFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("deleted_flag")
        public DeletedFlagEnum getDeletedFlag() {
            return deletedFlag;
        }

        /**
         * Set deletedFlag
         **/
        public void setDeletedFlag(DeletedFlagEnum deletedFlag) {
            this.deletedFlag = deletedFlag;
        }

        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam deletedFlag(DeletedFlagEnum deletedFlag) {
            this.deletedFlag = deletedFlag;
            return this;
        }

        /**
        * Get syncedFlag
        * @return syncedFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("synced_flag")
        public SyncedFlagEnum getSyncedFlag() {
            return syncedFlag;
        }

        /**
         * Set syncedFlag
         **/
        public void setSyncedFlag(SyncedFlagEnum syncedFlag) {
            this.syncedFlag = syncedFlag;
        }

        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam syncedFlag(SyncedFlagEnum syncedFlag) {
            this.syncedFlag = syncedFlag;
            return this;
        }

        /**
        * Get smartBccFlag
        * @return smartBccFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("smart_bcc_flag")
        public SmartBccFlagEnum getSmartBccFlag() {
            return smartBccFlag;
        }

        /**
         * Set smartBccFlag
         **/
        public void setSmartBccFlag(SmartBccFlagEnum smartBccFlag) {
            this.smartBccFlag = smartBccFlag;
        }

        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam smartBccFlag(SmartBccFlagEnum smartBccFlag) {
            this.smartBccFlag = smartBccFlag;
            return this;
        }

        /**
        * Get mailLinkTrackingEnabledFlag
        * @return mailLinkTrackingEnabledFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("mail_link_tracking_enabled_flag")
        public MailLinkTrackingEnabledFlagEnum getMailLinkTrackingEnabledFlag() {
            return mailLinkTrackingEnabledFlag;
        }

        /**
         * Set mailLinkTrackingEnabledFlag
         **/
        public void setMailLinkTrackingEnabledFlag(MailLinkTrackingEnabledFlagEnum mailLinkTrackingEnabledFlag) {
            this.mailLinkTrackingEnabledFlag = mailLinkTrackingEnabledFlag;
        }

        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam mailLinkTrackingEnabledFlag(MailLinkTrackingEnabledFlagEnum mailLinkTrackingEnabledFlag) {
            this.mailLinkTrackingEnabledFlag = mailLinkTrackingEnabledFlag;
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

        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam from(List<MailThreadAllOfPartiesToInner> from) {
            this.from = from;
            return this;
        }
        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam addFromItem(MailThreadAllOfPartiesToInner fromItem) {
            this.from.add(fromItem);
            return this;
        }

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

        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam to(List<MailThreadAllOfPartiesToInner> to) {
            this.to = to;
            return this;
        }
        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam addToItem(MailThreadAllOfPartiesToInner toItem) {
            this.to.add(toItem);
            return this;
        }

        /**
        * Participants of the Cc
        * @return cc
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("cc")
        public List<MailThreadAllOfPartiesToInner> getCc() {
            return cc;
        }

        /**
         * Set cc
         **/
        public void setCc(List<MailThreadAllOfPartiesToInner> cc) {
            this.cc = cc;
        }

        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam cc(List<MailThreadAllOfPartiesToInner> cc) {
            this.cc = cc;
            return this;
        }
        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam addCcItem(MailThreadAllOfPartiesToInner ccItem) {
            this.cc.add(ccItem);
            return this;
        }

        /**
        * Participants of the Bcc
        * @return bcc
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("bcc")
        public List<MailThreadAllOfPartiesToInner> getBcc() {
            return bcc;
        }

        /**
         * Set bcc
         **/
        public void setBcc(List<MailThreadAllOfPartiesToInner> bcc) {
            this.bcc = bcc;
        }

        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam bcc(List<MailThreadAllOfPartiesToInner> bcc) {
            this.bcc = bcc;
            return this;
        }
        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam addBccItem(MailThreadAllOfPartiesToInner bccItem) {
            this.bcc.add(bccItem);
            return this;
        }

        /**
        * A link to the mail thread message
        * @return bodyUrl
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("body_url")
        public String getBodyUrl() {
            return bodyUrl;
        }

        /**
         * Set bodyUrl
         **/
        public void setBodyUrl(String bodyUrl) {
            this.bodyUrl = bodyUrl;
        }

        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam bodyUrl(String bodyUrl) {
            this.bodyUrl = bodyUrl;
            return this;
        }

        /**
        * ID of the mail thread
        * @return mailThreadId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("mail_thread_id")
        public Integer getMailThreadId() {
            return mailThreadId;
        }

        /**
         * Set mailThreadId
         **/
        public void setMailThreadId(Integer mailThreadId) {
            this.mailThreadId = mailThreadId;
        }

        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam mailThreadId(Integer mailThreadId) {
            this.mailThreadId = mailThreadId;
            return this;
        }

        /**
        * If the mail message has a draft status then the value is the mail message object as JSON formatted string, otherwise `null`.
        * @return draft
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("draft")
        public String getDraft() {
            return draft;
        }

        /**
         * Set draft
         **/
        public void setDraft(String draft) {
            this.draft = draft;
        }

        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam draft(String draft) {
            this.draft = draft;
            return this;
        }

        /**
        * Get hasBodyFlag
        * @return hasBodyFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("has_body_flag")
        public HasBodyFlagEnum getHasBodyFlag() {
            return hasBodyFlag;
        }

        /**
         * Set hasBodyFlag
         **/
        public void setHasBodyFlag(HasBodyFlagEnum hasBodyFlag) {
            this.hasBodyFlag = hasBodyFlag;
        }

        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam hasBodyFlag(HasBodyFlagEnum hasBodyFlag) {
            this.hasBodyFlag = hasBodyFlag;
            return this;
        }

        /**
        * Get sentFlag
        * @return sentFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("sent_flag")
        public SentFlagEnum getSentFlag() {
            return sentFlag;
        }

        /**
         * Set sentFlag
         **/
        public void setSentFlag(SentFlagEnum sentFlag) {
            this.sentFlag = sentFlag;
        }

        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam sentFlag(SentFlagEnum sentFlag) {
            this.sentFlag = sentFlag;
            return this;
        }

        /**
        * Get sentFromPipedriveFlag
        * @return sentFromPipedriveFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("sent_from_pipedrive_flag")
        public SentFromPipedriveFlagEnum getSentFromPipedriveFlag() {
            return sentFromPipedriveFlag;
        }

        /**
         * Set sentFromPipedriveFlag
         **/
        public void setSentFromPipedriveFlag(SentFromPipedriveFlagEnum sentFromPipedriveFlag) {
            this.sentFromPipedriveFlag = sentFromPipedriveFlag;
        }

        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam sentFromPipedriveFlag(SentFromPipedriveFlagEnum sentFromPipedriveFlag) {
            this.sentFromPipedriveFlag = sentFromPipedriveFlag;
            return this;
        }

        /**
        * The time when the mail message was received or created
        * @return messageTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("message_time")
        public OffsetDateTime getMessageTime() {
            return messageTime;
        }

        /**
         * Set messageTime
         **/
        public void setMessageTime(OffsetDateTime messageTime) {
            this.messageTime = messageTime;
        }

        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam messageTime(OffsetDateTime messageTime) {
            this.messageTime = messageTime;
            return this;
        }

        /**
        * The time when the mail message was inserted to database
        * @return addTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("add_time")
        public OffsetDateTime getAddTime() {
            return addTime;
        }

        /**
         * Set addTime
         **/
        public void setAddTime(OffsetDateTime addTime) {
            this.addTime = addTime;
        }

        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam addTime(OffsetDateTime addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The time when the mail message was updated in database received
        * @return updateTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("update_time")
        public OffsetDateTime getUpdateTime() {
            return updateTime;
        }

        /**
         * Set updateTime
         **/
        public void setUpdateTime(OffsetDateTime updateTime) {
            this.updateTime = updateTime;
        }

        public GetMailThreadMessagesResponseAllOfDataInnerQueryParam updateTime(OffsetDateTime updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetMailThreadMessagesResponseAllOfDataInnerQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
            sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
            sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
            sb.append("    readFlag: ").append(toIndentedString(readFlag)).append("\n");
            sb.append("    mailTrackingStatus: ").append(toIndentedString(mailTrackingStatus)).append("\n");
            sb.append("    hasAttachmentsFlag: ").append(toIndentedString(hasAttachmentsFlag)).append("\n");
            sb.append("    hasInlineAttachmentsFlag: ").append(toIndentedString(hasInlineAttachmentsFlag)).append("\n");
            sb.append("    hasRealAttachmentsFlag: ").append(toIndentedString(hasRealAttachmentsFlag)).append("\n");
            sb.append("    deletedFlag: ").append(toIndentedString(deletedFlag)).append("\n");
            sb.append("    syncedFlag: ").append(toIndentedString(syncedFlag)).append("\n");
            sb.append("    smartBccFlag: ").append(toIndentedString(smartBccFlag)).append("\n");
            sb.append("    mailLinkTrackingEnabledFlag: ").append(toIndentedString(mailLinkTrackingEnabledFlag)).append("\n");
            sb.append("    from: ").append(toIndentedString(from)).append("\n");
            sb.append("    to: ").append(toIndentedString(to)).append("\n");
            sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
            sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
            sb.append("    bodyUrl: ").append(toIndentedString(bodyUrl)).append("\n");
            sb.append("    mailThreadId: ").append(toIndentedString(mailThreadId)).append("\n");
            sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
            sb.append("    hasBodyFlag: ").append(toIndentedString(hasBodyFlag)).append("\n");
            sb.append("    sentFlag: ").append(toIndentedString(sentFlag)).append("\n");
            sb.append("    sentFromPipedriveFlag: ").append(toIndentedString(sentFromPipedriveFlag)).append("\n");
            sb.append("    messageTime: ").append(toIndentedString(messageTime)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
