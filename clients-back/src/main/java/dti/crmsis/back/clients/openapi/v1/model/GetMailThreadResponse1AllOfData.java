package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.MailThreadAllOfParties;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The mail thread object
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetMailThreadResponse1AllOfData  {

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
    private MailThreadAllOfParties parties;
    /**
      * Parties of the drafted mail thread
     **/
    private List<Object> draftsParties;
    /**
      * Folders in which messages from thread are being stored
     **/
    private List<String> folders;
    /**
      * Version
     **/
    private BigDecimal version;
    /**
      * A snippet from a draft
     **/
    private String snippetDraft;
    /**
      * A snippet from a message sent
     **/
    private String snippetSent;
    /**
      * An amount of messages
     **/
    private Integer messageCount;

    public enum HasDraftFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<HasDraftFlagEnum> values = java.util.EnumSet.allOf(HasDraftFlagEnum.class);

        BigDecimal value;

        HasDraftFlagEnum (BigDecimal v) {
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
        public static HasDraftFlagEnum fromString(String v) {
            for (HasDraftFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private HasDraftFlagEnum hasDraftFlag = HasDraftFlagEnum.NUMBER_0;

    public enum HasSentFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<HasSentFlagEnum> values = java.util.EnumSet.allOf(HasSentFlagEnum.class);

        BigDecimal value;

        HasSentFlagEnum (BigDecimal v) {
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
        public static HasSentFlagEnum fromString(String v) {
            for (HasSentFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private HasSentFlagEnum hasSentFlag = HasSentFlagEnum.NUMBER_0;

    public enum ArchivedFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<ArchivedFlagEnum> values = java.util.EnumSet.allOf(ArchivedFlagEnum.class);

        BigDecimal value;

        ArchivedFlagEnum (BigDecimal v) {
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
        public static ArchivedFlagEnum fromString(String v) {
            for (ArchivedFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private ArchivedFlagEnum archivedFlag = ArchivedFlagEnum.NUMBER_0;

    public enum SharedFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<SharedFlagEnum> values = java.util.EnumSet.allOf(SharedFlagEnum.class);

        BigDecimal value;

        SharedFlagEnum (BigDecimal v) {
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
        public static SharedFlagEnum fromString(String v) {
            for (SharedFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private SharedFlagEnum sharedFlag = SharedFlagEnum.NUMBER_0;

    public enum ExternalDeletedFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<ExternalDeletedFlagEnum> values = java.util.EnumSet.allOf(ExternalDeletedFlagEnum.class);

        BigDecimal value;

        ExternalDeletedFlagEnum (BigDecimal v) {
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
        public static ExternalDeletedFlagEnum fromString(String v) {
            for (ExternalDeletedFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private ExternalDeletedFlagEnum externalDeletedFlag = ExternalDeletedFlagEnum.NUMBER_0;

    public enum FirstMessageToMeFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<FirstMessageToMeFlagEnum> values = java.util.EnumSet.allOf(FirstMessageToMeFlagEnum.class);

        BigDecimal value;

        FirstMessageToMeFlagEnum (BigDecimal v) {
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
        public static FirstMessageToMeFlagEnum fromString(String v) {
            for (FirstMessageToMeFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private FirstMessageToMeFlagEnum firstMessageToMeFlag = FirstMessageToMeFlagEnum.NUMBER_0;
    /**
      * Last message timestamp
     **/
    private OffsetDateTime lastMessageTimestamp;
    /**
      * The time when the mail thread has had the first message received or created
     **/
    private OffsetDateTime firstMessageTimestamp;
    /**
      * The last time when the mail thread has had a message sent
     **/
    private OffsetDateTime lastMessageSentTimestamp;
    /**
      * The last time when the mail thread has had a message received
     **/
    private OffsetDateTime lastMessageReceivedTimestamp;
    /**
      * The time when the mail thread was inserted to database
     **/
    private OffsetDateTime addTime;
    /**
      * The time when the mail thread was updated in database received
     **/
    private OffsetDateTime updateTime;
    /**
      * The ID of the deal
     **/
    private Integer dealId;
    /**
      * Status of the deal
     **/
    private String dealStatus;
    /**
      * The ID of the lead
     **/
    private UUID leadId;

    public enum AllMessagesSentFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<AllMessagesSentFlagEnum> values = java.util.EnumSet.allOf(AllMessagesSentFlagEnum.class);

        BigDecimal value;

        AllMessagesSentFlagEnum (BigDecimal v) {
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
        public static AllMessagesSentFlagEnum fromString(String v) {
            for (AllMessagesSentFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private AllMessagesSentFlagEnum allMessagesSentFlag = AllMessagesSentFlagEnum.NUMBER_0;

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

    public GetMailThreadResponse1AllOfData id(Integer id) {
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

    public GetMailThreadResponse1AllOfData accountId(String accountId) {
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

    public GetMailThreadResponse1AllOfData userId(Integer userId) {
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

    public GetMailThreadResponse1AllOfData subject(String subject) {
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

    public GetMailThreadResponse1AllOfData snippet(String snippet) {
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

    public GetMailThreadResponse1AllOfData readFlag(ReadFlagEnum readFlag) {
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

    public GetMailThreadResponse1AllOfData mailTrackingStatus(String mailTrackingStatus) {
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

    public GetMailThreadResponse1AllOfData hasAttachmentsFlag(HasAttachmentsFlagEnum hasAttachmentsFlag) {
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

    public GetMailThreadResponse1AllOfData hasInlineAttachmentsFlag(HasInlineAttachmentsFlagEnum hasInlineAttachmentsFlag) {
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

    public GetMailThreadResponse1AllOfData hasRealAttachmentsFlag(HasRealAttachmentsFlagEnum hasRealAttachmentsFlag) {
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

    public GetMailThreadResponse1AllOfData deletedFlag(DeletedFlagEnum deletedFlag) {
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

    public GetMailThreadResponse1AllOfData syncedFlag(SyncedFlagEnum syncedFlag) {
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

    public GetMailThreadResponse1AllOfData smartBccFlag(SmartBccFlagEnum smartBccFlag) {
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

    public GetMailThreadResponse1AllOfData mailLinkTrackingEnabledFlag(MailLinkTrackingEnabledFlagEnum mailLinkTrackingEnabledFlag) {
        this.mailLinkTrackingEnabledFlag = mailLinkTrackingEnabledFlag;
        return this;
    }

    /**
    * Get parties
    * @return parties
    **/
    @JsonProperty("parties")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public MailThreadAllOfParties getParties() {
        return parties;
    }

    /**
     * Set parties
     **/
    public void setParties(MailThreadAllOfParties parties) {
        this.parties = parties;
    }

    public GetMailThreadResponse1AllOfData parties(MailThreadAllOfParties parties) {
        this.parties = parties;
        return this;
    }

    /**
    * Parties of the drafted mail thread
    * @return draftsParties
    **/
    @JsonProperty("drafts_parties")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Object> getDraftsParties() {
        return draftsParties;
    }

    /**
     * Set draftsParties
     **/
    public void setDraftsParties(List<Object> draftsParties) {
        this.draftsParties = draftsParties;
    }

    public GetMailThreadResponse1AllOfData draftsParties(List<Object> draftsParties) {
        this.draftsParties = draftsParties;
        return this;
    }
    public GetMailThreadResponse1AllOfData addDraftsPartiesItem(Object draftsPartiesItem) {
        if (this.draftsParties == null){
            draftsParties = new ArrayList<>();
        }
        this.draftsParties.add(draftsPartiesItem);
        return this;
    }

    /**
    * Folders in which messages from thread are being stored
    * @return folders
    **/
    @JsonProperty("folders")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getFolders() {
        return folders;
    }

    /**
     * Set folders
     **/
    public void setFolders(List<String> folders) {
        this.folders = folders;
    }

    public GetMailThreadResponse1AllOfData folders(List<String> folders) {
        this.folders = folders;
        return this;
    }
    public GetMailThreadResponse1AllOfData addFoldersItem(String foldersItem) {
        if (this.folders == null){
            folders = new ArrayList<>();
        }
        this.folders.add(foldersItem);
        return this;
    }

    /**
    * Version
    * @return version
    **/
    @JsonProperty("version")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * Set version
     **/
    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    public GetMailThreadResponse1AllOfData version(BigDecimal version) {
        this.version = version;
        return this;
    }

    /**
    * A snippet from a draft
    * @return snippetDraft
    **/
    @JsonProperty("snippet_draft")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getSnippetDraft() {
        return snippetDraft;
    }

    /**
     * Set snippetDraft
     **/
    public void setSnippetDraft(String snippetDraft) {
        this.snippetDraft = snippetDraft;
    }

    public GetMailThreadResponse1AllOfData snippetDraft(String snippetDraft) {
        this.snippetDraft = snippetDraft;
        return this;
    }

    /**
    * A snippet from a message sent
    * @return snippetSent
    **/
    @JsonProperty("snippet_sent")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getSnippetSent() {
        return snippetSent;
    }

    /**
     * Set snippetSent
     **/
    public void setSnippetSent(String snippetSent) {
        this.snippetSent = snippetSent;
    }

    public GetMailThreadResponse1AllOfData snippetSent(String snippetSent) {
        this.snippetSent = snippetSent;
        return this;
    }

    /**
    * An amount of messages
    * @return messageCount
    **/
    @JsonProperty("message_count")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getMessageCount() {
        return messageCount;
    }

    /**
     * Set messageCount
     **/
    public void setMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
    }

    public GetMailThreadResponse1AllOfData messageCount(Integer messageCount) {
        this.messageCount = messageCount;
        return this;
    }

    /**
    * Get hasDraftFlag
    * @return hasDraftFlag
    **/
    @JsonProperty("has_draft_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public HasDraftFlagEnum getHasDraftFlag() {
        return hasDraftFlag;
    }

    /**
     * Set hasDraftFlag
     **/
    public void setHasDraftFlag(HasDraftFlagEnum hasDraftFlag) {
        this.hasDraftFlag = hasDraftFlag;
    }

    public GetMailThreadResponse1AllOfData hasDraftFlag(HasDraftFlagEnum hasDraftFlag) {
        this.hasDraftFlag = hasDraftFlag;
        return this;
    }

    /**
    * Get hasSentFlag
    * @return hasSentFlag
    **/
    @JsonProperty("has_sent_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public HasSentFlagEnum getHasSentFlag() {
        return hasSentFlag;
    }

    /**
     * Set hasSentFlag
     **/
    public void setHasSentFlag(HasSentFlagEnum hasSentFlag) {
        this.hasSentFlag = hasSentFlag;
    }

    public GetMailThreadResponse1AllOfData hasSentFlag(HasSentFlagEnum hasSentFlag) {
        this.hasSentFlag = hasSentFlag;
        return this;
    }

    /**
    * Get archivedFlag
    * @return archivedFlag
    **/
    @JsonProperty("archived_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ArchivedFlagEnum getArchivedFlag() {
        return archivedFlag;
    }

    /**
     * Set archivedFlag
     **/
    public void setArchivedFlag(ArchivedFlagEnum archivedFlag) {
        this.archivedFlag = archivedFlag;
    }

    public GetMailThreadResponse1AllOfData archivedFlag(ArchivedFlagEnum archivedFlag) {
        this.archivedFlag = archivedFlag;
        return this;
    }

    /**
    * Get sharedFlag
    * @return sharedFlag
    **/
    @JsonProperty("shared_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SharedFlagEnum getSharedFlag() {
        return sharedFlag;
    }

    /**
     * Set sharedFlag
     **/
    public void setSharedFlag(SharedFlagEnum sharedFlag) {
        this.sharedFlag = sharedFlag;
    }

    public GetMailThreadResponse1AllOfData sharedFlag(SharedFlagEnum sharedFlag) {
        this.sharedFlag = sharedFlag;
        return this;
    }

    /**
    * Get externalDeletedFlag
    * @return externalDeletedFlag
    **/
    @JsonProperty("external_deleted_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ExternalDeletedFlagEnum getExternalDeletedFlag() {
        return externalDeletedFlag;
    }

    /**
     * Set externalDeletedFlag
     **/
    public void setExternalDeletedFlag(ExternalDeletedFlagEnum externalDeletedFlag) {
        this.externalDeletedFlag = externalDeletedFlag;
    }

    public GetMailThreadResponse1AllOfData externalDeletedFlag(ExternalDeletedFlagEnum externalDeletedFlag) {
        this.externalDeletedFlag = externalDeletedFlag;
        return this;
    }

    /**
    * Get firstMessageToMeFlag
    * @return firstMessageToMeFlag
    **/
    @JsonProperty("first_message_to_me_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public FirstMessageToMeFlagEnum getFirstMessageToMeFlag() {
        return firstMessageToMeFlag;
    }

    /**
     * Set firstMessageToMeFlag
     **/
    public void setFirstMessageToMeFlag(FirstMessageToMeFlagEnum firstMessageToMeFlag) {
        this.firstMessageToMeFlag = firstMessageToMeFlag;
    }

    public GetMailThreadResponse1AllOfData firstMessageToMeFlag(FirstMessageToMeFlagEnum firstMessageToMeFlag) {
        this.firstMessageToMeFlag = firstMessageToMeFlag;
        return this;
    }

    /**
    * Last message timestamp
    * @return lastMessageTimestamp
    **/
    @JsonProperty("last_message_timestamp")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public OffsetDateTime getLastMessageTimestamp() {
        return lastMessageTimestamp;
    }

    /**
     * Set lastMessageTimestamp
     **/
    public void setLastMessageTimestamp(OffsetDateTime lastMessageTimestamp) {
        this.lastMessageTimestamp = lastMessageTimestamp;
    }

    public GetMailThreadResponse1AllOfData lastMessageTimestamp(OffsetDateTime lastMessageTimestamp) {
        this.lastMessageTimestamp = lastMessageTimestamp;
        return this;
    }

    /**
    * The time when the mail thread has had the first message received or created
    * @return firstMessageTimestamp
    **/
    @JsonProperty("first_message_timestamp")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public OffsetDateTime getFirstMessageTimestamp() {
        return firstMessageTimestamp;
    }

    /**
     * Set firstMessageTimestamp
     **/
    public void setFirstMessageTimestamp(OffsetDateTime firstMessageTimestamp) {
        this.firstMessageTimestamp = firstMessageTimestamp;
    }

    public GetMailThreadResponse1AllOfData firstMessageTimestamp(OffsetDateTime firstMessageTimestamp) {
        this.firstMessageTimestamp = firstMessageTimestamp;
        return this;
    }

    /**
    * The last time when the mail thread has had a message sent
    * @return lastMessageSentTimestamp
    **/
    @JsonProperty("last_message_sent_timestamp")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public OffsetDateTime getLastMessageSentTimestamp() {
        return lastMessageSentTimestamp;
    }

    /**
     * Set lastMessageSentTimestamp
     **/
    public void setLastMessageSentTimestamp(OffsetDateTime lastMessageSentTimestamp) {
        this.lastMessageSentTimestamp = lastMessageSentTimestamp;
    }

    public GetMailThreadResponse1AllOfData lastMessageSentTimestamp(OffsetDateTime lastMessageSentTimestamp) {
        this.lastMessageSentTimestamp = lastMessageSentTimestamp;
        return this;
    }

    /**
    * The last time when the mail thread has had a message received
    * @return lastMessageReceivedTimestamp
    **/
    @JsonProperty("last_message_received_timestamp")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public OffsetDateTime getLastMessageReceivedTimestamp() {
        return lastMessageReceivedTimestamp;
    }

    /**
     * Set lastMessageReceivedTimestamp
     **/
    public void setLastMessageReceivedTimestamp(OffsetDateTime lastMessageReceivedTimestamp) {
        this.lastMessageReceivedTimestamp = lastMessageReceivedTimestamp;
    }

    public GetMailThreadResponse1AllOfData lastMessageReceivedTimestamp(OffsetDateTime lastMessageReceivedTimestamp) {
        this.lastMessageReceivedTimestamp = lastMessageReceivedTimestamp;
        return this;
    }

    /**
    * The time when the mail thread was inserted to database
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

    public GetMailThreadResponse1AllOfData addTime(OffsetDateTime addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The time when the mail thread was updated in database received
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

    public GetMailThreadResponse1AllOfData updateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
    * The ID of the deal
    * @return dealId
    **/
    @JsonProperty("deal_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getDealId() {
        return dealId;
    }

    /**
     * Set dealId
     **/
    public void setDealId(Integer dealId) {
        this.dealId = dealId;
    }

    public GetMailThreadResponse1AllOfData dealId(Integer dealId) {
        this.dealId = dealId;
        return this;
    }

    /**
    * Status of the deal
    * @return dealStatus
    **/
    @JsonProperty("deal_status")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDealStatus() {
        return dealStatus;
    }

    /**
     * Set dealStatus
     **/
    public void setDealStatus(String dealStatus) {
        this.dealStatus = dealStatus;
    }

    public GetMailThreadResponse1AllOfData dealStatus(String dealStatus) {
        this.dealStatus = dealStatus;
        return this;
    }

    /**
    * The ID of the lead
    * @return leadId
    **/
    @JsonProperty("lead_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public UUID getLeadId() {
        return leadId;
    }

    /**
     * Set leadId
     **/
    public void setLeadId(UUID leadId) {
        this.leadId = leadId;
    }

    public GetMailThreadResponse1AllOfData leadId(UUID leadId) {
        this.leadId = leadId;
        return this;
    }

    /**
    * Get allMessagesSentFlag
    * @return allMessagesSentFlag
    **/
    @JsonProperty("all_messages_sent_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public AllMessagesSentFlagEnum getAllMessagesSentFlag() {
        return allMessagesSentFlag;
    }

    /**
     * Set allMessagesSentFlag
     **/
    public void setAllMessagesSentFlag(AllMessagesSentFlagEnum allMessagesSentFlag) {
        this.allMessagesSentFlag = allMessagesSentFlag;
    }

    public GetMailThreadResponse1AllOfData allMessagesSentFlag(AllMessagesSentFlagEnum allMessagesSentFlag) {
        this.allMessagesSentFlag = allMessagesSentFlag;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetMailThreadResponse1AllOfData {\n");

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
        sb.append("    parties: ").append(toIndentedString(parties)).append("\n");
        sb.append("    draftsParties: ").append(toIndentedString(draftsParties)).append("\n");
        sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    snippetDraft: ").append(toIndentedString(snippetDraft)).append("\n");
        sb.append("    snippetSent: ").append(toIndentedString(snippetSent)).append("\n");
        sb.append("    messageCount: ").append(toIndentedString(messageCount)).append("\n");
        sb.append("    hasDraftFlag: ").append(toIndentedString(hasDraftFlag)).append("\n");
        sb.append("    hasSentFlag: ").append(toIndentedString(hasSentFlag)).append("\n");
        sb.append("    archivedFlag: ").append(toIndentedString(archivedFlag)).append("\n");
        sb.append("    sharedFlag: ").append(toIndentedString(sharedFlag)).append("\n");
        sb.append("    externalDeletedFlag: ").append(toIndentedString(externalDeletedFlag)).append("\n");
        sb.append("    firstMessageToMeFlag: ").append(toIndentedString(firstMessageToMeFlag)).append("\n");
        sb.append("    lastMessageTimestamp: ").append(toIndentedString(lastMessageTimestamp)).append("\n");
        sb.append("    firstMessageTimestamp: ").append(toIndentedString(firstMessageTimestamp)).append("\n");
        sb.append("    lastMessageSentTimestamp: ").append(toIndentedString(lastMessageSentTimestamp)).append("\n");
        sb.append("    lastMessageReceivedTimestamp: ").append(toIndentedString(lastMessageReceivedTimestamp)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
        sb.append("    dealStatus: ").append(toIndentedString(dealStatus)).append("\n");
        sb.append("    leadId: ").append(toIndentedString(leadId)).append("\n");
        sb.append("    allMessagesSentFlag: ").append(toIndentedString(allMessagesSentFlag)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetMailThreadResponse1AllOfData} object that
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

        GetMailThreadResponse1AllOfData model = (GetMailThreadResponse1AllOfData) obj;

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
        java.util.Objects.equals(parties, model.parties) &&
        java.util.Objects.equals(draftsParties, model.draftsParties) &&
        java.util.Objects.equals(folders, model.folders) &&
        java.util.Objects.equals(version, model.version) &&
        java.util.Objects.equals(snippetDraft, model.snippetDraft) &&
        java.util.Objects.equals(snippetSent, model.snippetSent) &&
        java.util.Objects.equals(messageCount, model.messageCount) &&
        java.util.Objects.equals(hasDraftFlag, model.hasDraftFlag) &&
        java.util.Objects.equals(hasSentFlag, model.hasSentFlag) &&
        java.util.Objects.equals(archivedFlag, model.archivedFlag) &&
        java.util.Objects.equals(sharedFlag, model.sharedFlag) &&
        java.util.Objects.equals(externalDeletedFlag, model.externalDeletedFlag) &&
        java.util.Objects.equals(firstMessageToMeFlag, model.firstMessageToMeFlag) &&
        java.util.Objects.equals(lastMessageTimestamp, model.lastMessageTimestamp) &&
        java.util.Objects.equals(firstMessageTimestamp, model.firstMessageTimestamp) &&
        java.util.Objects.equals(lastMessageSentTimestamp, model.lastMessageSentTimestamp) &&
        java.util.Objects.equals(lastMessageReceivedTimestamp, model.lastMessageReceivedTimestamp) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(updateTime, model.updateTime) &&
        java.util.Objects.equals(dealId, model.dealId) &&
        java.util.Objects.equals(dealStatus, model.dealStatus) &&
        java.util.Objects.equals(leadId, model.leadId) &&
        java.util.Objects.equals(allMessagesSentFlag, model.allMessagesSentFlag);
    }

    /**
     * Returns a hash code for a {@code GetMailThreadResponse1AllOfData}.
     *
     * @return a hash code value for a {@code GetMailThreadResponse1AllOfData}.
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
        parties,
        draftsParties,
        folders,
        version,
        snippetDraft,
        snippetSent,
        messageCount,
        hasDraftFlag,
        hasSentFlag,
        archivedFlag,
        sharedFlag,
        externalDeletedFlag,
        firstMessageToMeFlag,
        lastMessageTimestamp,
        firstMessageTimestamp,
        lastMessageSentTimestamp,
        lastMessageReceivedTimestamp,
        addTime,
        updateTime,
        dealId,
        dealStatus,
        leadId,
        allMessagesSentFlag);
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
      * The mail thread object
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetMailThreadResponse1AllOfDataQueryParam  {

        /**
          * The mail thread object
         **/
        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        /**
          * The mail thread object
         **/
        @jakarta.ws.rs.QueryParam("accountId")
        private String accountId;
        /**
          * The mail thread object
         **/
        @jakarta.ws.rs.QueryParam("userId")
        private Integer userId;
        /**
          * The mail thread object
         **/
        @jakarta.ws.rs.QueryParam("subject")
        private String subject;
        /**
          * The mail thread object
         **/
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
        /**
          * The mail thread object
         **/
        private ReadFlagEnum readFlag = ReadFlagEnum.NUMBER_0;
        /**
          * The mail thread object
         **/
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
        /**
          * The mail thread object
         **/
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
        /**
          * The mail thread object
         **/
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
        /**
          * The mail thread object
         **/
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
        /**
          * The mail thread object
         **/
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
        /**
          * The mail thread object
         **/
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
        /**
          * The mail thread object
         **/
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
        /**
          * The mail thread object
         **/
        private MailLinkTrackingEnabledFlagEnum mailLinkTrackingEnabledFlag = MailLinkTrackingEnabledFlagEnum.NUMBER_0;
        /**
          * The mail thread object
         **/
        @jakarta.ws.rs.QueryParam("parties")
        private MailThreadAllOfParties parties;
        /**
          * The mail thread object
         **/
        @jakarta.ws.rs.QueryParam("draftsParties")
        private List<Object> draftsParties = null;
        /**
          * The mail thread object
         **/
        @jakarta.ws.rs.QueryParam("folders")
        private List<String> folders = null;
        /**
          * The mail thread object
         **/
        @jakarta.ws.rs.QueryParam("version")
        private BigDecimal version;
        /**
          * The mail thread object
         **/
        @jakarta.ws.rs.QueryParam("snippetDraft")
        private String snippetDraft;
        /**
          * The mail thread object
         **/
        @jakarta.ws.rs.QueryParam("snippetSent")
        private String snippetSent;
        /**
          * The mail thread object
         **/
        @jakarta.ws.rs.QueryParam("messageCount")
        private Integer messageCount;

    public enum HasDraftFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<HasDraftFlagEnum> values = java.util.EnumSet.allOf(HasDraftFlagEnum.class);

        BigDecimal value;

        HasDraftFlagEnum (BigDecimal v) {
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
        public static HasDraftFlagEnum fromString(String v) {
            for (HasDraftFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        /**
          * The mail thread object
         **/
        private HasDraftFlagEnum hasDraftFlag = HasDraftFlagEnum.NUMBER_0;

    public enum HasSentFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<HasSentFlagEnum> values = java.util.EnumSet.allOf(HasSentFlagEnum.class);

        BigDecimal value;

        HasSentFlagEnum (BigDecimal v) {
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
        public static HasSentFlagEnum fromString(String v) {
            for (HasSentFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        /**
          * The mail thread object
         **/
        private HasSentFlagEnum hasSentFlag = HasSentFlagEnum.NUMBER_0;

    public enum ArchivedFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<ArchivedFlagEnum> values = java.util.EnumSet.allOf(ArchivedFlagEnum.class);

        BigDecimal value;

        ArchivedFlagEnum (BigDecimal v) {
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
        public static ArchivedFlagEnum fromString(String v) {
            for (ArchivedFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        /**
          * The mail thread object
         **/
        private ArchivedFlagEnum archivedFlag = ArchivedFlagEnum.NUMBER_0;

    public enum SharedFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<SharedFlagEnum> values = java.util.EnumSet.allOf(SharedFlagEnum.class);

        BigDecimal value;

        SharedFlagEnum (BigDecimal v) {
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
        public static SharedFlagEnum fromString(String v) {
            for (SharedFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        /**
          * The mail thread object
         **/
        private SharedFlagEnum sharedFlag = SharedFlagEnum.NUMBER_0;

    public enum ExternalDeletedFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<ExternalDeletedFlagEnum> values = java.util.EnumSet.allOf(ExternalDeletedFlagEnum.class);

        BigDecimal value;

        ExternalDeletedFlagEnum (BigDecimal v) {
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
        public static ExternalDeletedFlagEnum fromString(String v) {
            for (ExternalDeletedFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        /**
          * The mail thread object
         **/
        private ExternalDeletedFlagEnum externalDeletedFlag = ExternalDeletedFlagEnum.NUMBER_0;

    public enum FirstMessageToMeFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<FirstMessageToMeFlagEnum> values = java.util.EnumSet.allOf(FirstMessageToMeFlagEnum.class);

        BigDecimal value;

        FirstMessageToMeFlagEnum (BigDecimal v) {
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
        public static FirstMessageToMeFlagEnum fromString(String v) {
            for (FirstMessageToMeFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        /**
          * The mail thread object
         **/
        private FirstMessageToMeFlagEnum firstMessageToMeFlag = FirstMessageToMeFlagEnum.NUMBER_0;
        /**
          * The mail thread object
         **/
        @jakarta.ws.rs.QueryParam("lastMessageTimestamp")
        private OffsetDateTime lastMessageTimestamp;
        /**
          * The mail thread object
         **/
        @jakarta.ws.rs.QueryParam("firstMessageTimestamp")
        private OffsetDateTime firstMessageTimestamp;
        /**
          * The mail thread object
         **/
        @jakarta.ws.rs.QueryParam("lastMessageSentTimestamp")
        private OffsetDateTime lastMessageSentTimestamp;
        /**
          * The mail thread object
         **/
        @jakarta.ws.rs.QueryParam("lastMessageReceivedTimestamp")
        private OffsetDateTime lastMessageReceivedTimestamp;
        /**
          * The mail thread object
         **/
        @jakarta.ws.rs.QueryParam("addTime")
        private OffsetDateTime addTime;
        /**
          * The mail thread object
         **/
        @jakarta.ws.rs.QueryParam("updateTime")
        private OffsetDateTime updateTime;
        /**
          * The mail thread object
         **/
        @jakarta.ws.rs.QueryParam("dealId")
        private Integer dealId;
        /**
          * The mail thread object
         **/
        @jakarta.ws.rs.QueryParam("dealStatus")
        private String dealStatus;
        /**
          * The mail thread object
         **/
        @jakarta.ws.rs.QueryParam("leadId")
        private UUID leadId;

    public enum AllMessagesSentFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<AllMessagesSentFlagEnum> values = java.util.EnumSet.allOf(AllMessagesSentFlagEnum.class);

        BigDecimal value;

        AllMessagesSentFlagEnum (BigDecimal v) {
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
        public static AllMessagesSentFlagEnum fromString(String v) {
            for (AllMessagesSentFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        /**
          * The mail thread object
         **/
        private AllMessagesSentFlagEnum allMessagesSentFlag = AllMessagesSentFlagEnum.NUMBER_0;

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

        public GetMailThreadResponse1AllOfDataQueryParam id(Integer id) {
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

        public GetMailThreadResponse1AllOfDataQueryParam accountId(String accountId) {
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

        public GetMailThreadResponse1AllOfDataQueryParam userId(Integer userId) {
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

        public GetMailThreadResponse1AllOfDataQueryParam subject(String subject) {
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

        public GetMailThreadResponse1AllOfDataQueryParam snippet(String snippet) {
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

        public GetMailThreadResponse1AllOfDataQueryParam readFlag(ReadFlagEnum readFlag) {
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

        public GetMailThreadResponse1AllOfDataQueryParam mailTrackingStatus(String mailTrackingStatus) {
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

        public GetMailThreadResponse1AllOfDataQueryParam hasAttachmentsFlag(HasAttachmentsFlagEnum hasAttachmentsFlag) {
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

        public GetMailThreadResponse1AllOfDataQueryParam hasInlineAttachmentsFlag(HasInlineAttachmentsFlagEnum hasInlineAttachmentsFlag) {
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

        public GetMailThreadResponse1AllOfDataQueryParam hasRealAttachmentsFlag(HasRealAttachmentsFlagEnum hasRealAttachmentsFlag) {
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

        public GetMailThreadResponse1AllOfDataQueryParam deletedFlag(DeletedFlagEnum deletedFlag) {
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

        public GetMailThreadResponse1AllOfDataQueryParam syncedFlag(SyncedFlagEnum syncedFlag) {
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

        public GetMailThreadResponse1AllOfDataQueryParam smartBccFlag(SmartBccFlagEnum smartBccFlag) {
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

        public GetMailThreadResponse1AllOfDataQueryParam mailLinkTrackingEnabledFlag(MailLinkTrackingEnabledFlagEnum mailLinkTrackingEnabledFlag) {
            this.mailLinkTrackingEnabledFlag = mailLinkTrackingEnabledFlag;
            return this;
        }

        /**
        * Get parties
        * @return parties
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("parties")
        public MailThreadAllOfParties getParties() {
            return parties;
        }

        /**
         * Set parties
         **/
        public void setParties(MailThreadAllOfParties parties) {
            this.parties = parties;
        }

        public GetMailThreadResponse1AllOfDataQueryParam parties(MailThreadAllOfParties parties) {
            this.parties = parties;
            return this;
        }

        /**
        * Parties of the drafted mail thread
        * @return draftsParties
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("drafts_parties")
        public List<Object> getDraftsParties() {
            return draftsParties;
        }

        /**
         * Set draftsParties
         **/
        public void setDraftsParties(List<Object> draftsParties) {
            this.draftsParties = draftsParties;
        }

        public GetMailThreadResponse1AllOfDataQueryParam draftsParties(List<Object> draftsParties) {
            this.draftsParties = draftsParties;
            return this;
        }
        public GetMailThreadResponse1AllOfDataQueryParam addDraftsPartiesItem(Object draftsPartiesItem) {
            this.draftsParties.add(draftsPartiesItem);
            return this;
        }

        /**
        * Folders in which messages from thread are being stored
        * @return folders
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("folders")
        public List<String> getFolders() {
            return folders;
        }

        /**
         * Set folders
         **/
        public void setFolders(List<String> folders) {
            this.folders = folders;
        }

        public GetMailThreadResponse1AllOfDataQueryParam folders(List<String> folders) {
            this.folders = folders;
            return this;
        }
        public GetMailThreadResponse1AllOfDataQueryParam addFoldersItem(String foldersItem) {
            this.folders.add(foldersItem);
            return this;
        }

        /**
        * Version
        * @return version
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        public BigDecimal getVersion() {
            return version;
        }

        /**
         * Set version
         **/
        public void setVersion(BigDecimal version) {
            this.version = version;
        }

        public GetMailThreadResponse1AllOfDataQueryParam version(BigDecimal version) {
            this.version = version;
            return this;
        }

        /**
        * A snippet from a draft
        * @return snippetDraft
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("snippet_draft")
        public String getSnippetDraft() {
            return snippetDraft;
        }

        /**
         * Set snippetDraft
         **/
        public void setSnippetDraft(String snippetDraft) {
            this.snippetDraft = snippetDraft;
        }

        public GetMailThreadResponse1AllOfDataQueryParam snippetDraft(String snippetDraft) {
            this.snippetDraft = snippetDraft;
            return this;
        }

        /**
        * A snippet from a message sent
        * @return snippetSent
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("snippet_sent")
        public String getSnippetSent() {
            return snippetSent;
        }

        /**
         * Set snippetSent
         **/
        public void setSnippetSent(String snippetSent) {
            this.snippetSent = snippetSent;
        }

        public GetMailThreadResponse1AllOfDataQueryParam snippetSent(String snippetSent) {
            this.snippetSent = snippetSent;
            return this;
        }

        /**
        * An amount of messages
        * @return messageCount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("message_count")
        public Integer getMessageCount() {
            return messageCount;
        }

        /**
         * Set messageCount
         **/
        public void setMessageCount(Integer messageCount) {
            this.messageCount = messageCount;
        }

        public GetMailThreadResponse1AllOfDataQueryParam messageCount(Integer messageCount) {
            this.messageCount = messageCount;
            return this;
        }

        /**
        * Get hasDraftFlag
        * @return hasDraftFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("has_draft_flag")
        public HasDraftFlagEnum getHasDraftFlag() {
            return hasDraftFlag;
        }

        /**
         * Set hasDraftFlag
         **/
        public void setHasDraftFlag(HasDraftFlagEnum hasDraftFlag) {
            this.hasDraftFlag = hasDraftFlag;
        }

        public GetMailThreadResponse1AllOfDataQueryParam hasDraftFlag(HasDraftFlagEnum hasDraftFlag) {
            this.hasDraftFlag = hasDraftFlag;
            return this;
        }

        /**
        * Get hasSentFlag
        * @return hasSentFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("has_sent_flag")
        public HasSentFlagEnum getHasSentFlag() {
            return hasSentFlag;
        }

        /**
         * Set hasSentFlag
         **/
        public void setHasSentFlag(HasSentFlagEnum hasSentFlag) {
            this.hasSentFlag = hasSentFlag;
        }

        public GetMailThreadResponse1AllOfDataQueryParam hasSentFlag(HasSentFlagEnum hasSentFlag) {
            this.hasSentFlag = hasSentFlag;
            return this;
        }

        /**
        * Get archivedFlag
        * @return archivedFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("archived_flag")
        public ArchivedFlagEnum getArchivedFlag() {
            return archivedFlag;
        }

        /**
         * Set archivedFlag
         **/
        public void setArchivedFlag(ArchivedFlagEnum archivedFlag) {
            this.archivedFlag = archivedFlag;
        }

        public GetMailThreadResponse1AllOfDataQueryParam archivedFlag(ArchivedFlagEnum archivedFlag) {
            this.archivedFlag = archivedFlag;
            return this;
        }

        /**
        * Get sharedFlag
        * @return sharedFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("shared_flag")
        public SharedFlagEnum getSharedFlag() {
            return sharedFlag;
        }

        /**
         * Set sharedFlag
         **/
        public void setSharedFlag(SharedFlagEnum sharedFlag) {
            this.sharedFlag = sharedFlag;
        }

        public GetMailThreadResponse1AllOfDataQueryParam sharedFlag(SharedFlagEnum sharedFlag) {
            this.sharedFlag = sharedFlag;
            return this;
        }

        /**
        * Get externalDeletedFlag
        * @return externalDeletedFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("external_deleted_flag")
        public ExternalDeletedFlagEnum getExternalDeletedFlag() {
            return externalDeletedFlag;
        }

        /**
         * Set externalDeletedFlag
         **/
        public void setExternalDeletedFlag(ExternalDeletedFlagEnum externalDeletedFlag) {
            this.externalDeletedFlag = externalDeletedFlag;
        }

        public GetMailThreadResponse1AllOfDataQueryParam externalDeletedFlag(ExternalDeletedFlagEnum externalDeletedFlag) {
            this.externalDeletedFlag = externalDeletedFlag;
            return this;
        }

        /**
        * Get firstMessageToMeFlag
        * @return firstMessageToMeFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("first_message_to_me_flag")
        public FirstMessageToMeFlagEnum getFirstMessageToMeFlag() {
            return firstMessageToMeFlag;
        }

        /**
         * Set firstMessageToMeFlag
         **/
        public void setFirstMessageToMeFlag(FirstMessageToMeFlagEnum firstMessageToMeFlag) {
            this.firstMessageToMeFlag = firstMessageToMeFlag;
        }

        public GetMailThreadResponse1AllOfDataQueryParam firstMessageToMeFlag(FirstMessageToMeFlagEnum firstMessageToMeFlag) {
            this.firstMessageToMeFlag = firstMessageToMeFlag;
            return this;
        }

        /**
        * Last message timestamp
        * @return lastMessageTimestamp
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("last_message_timestamp")
        public OffsetDateTime getLastMessageTimestamp() {
            return lastMessageTimestamp;
        }

        /**
         * Set lastMessageTimestamp
         **/
        public void setLastMessageTimestamp(OffsetDateTime lastMessageTimestamp) {
            this.lastMessageTimestamp = lastMessageTimestamp;
        }

        public GetMailThreadResponse1AllOfDataQueryParam lastMessageTimestamp(OffsetDateTime lastMessageTimestamp) {
            this.lastMessageTimestamp = lastMessageTimestamp;
            return this;
        }

        /**
        * The time when the mail thread has had the first message received or created
        * @return firstMessageTimestamp
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("first_message_timestamp")
        public OffsetDateTime getFirstMessageTimestamp() {
            return firstMessageTimestamp;
        }

        /**
         * Set firstMessageTimestamp
         **/
        public void setFirstMessageTimestamp(OffsetDateTime firstMessageTimestamp) {
            this.firstMessageTimestamp = firstMessageTimestamp;
        }

        public GetMailThreadResponse1AllOfDataQueryParam firstMessageTimestamp(OffsetDateTime firstMessageTimestamp) {
            this.firstMessageTimestamp = firstMessageTimestamp;
            return this;
        }

        /**
        * The last time when the mail thread has had a message sent
        * @return lastMessageSentTimestamp
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("last_message_sent_timestamp")
        public OffsetDateTime getLastMessageSentTimestamp() {
            return lastMessageSentTimestamp;
        }

        /**
         * Set lastMessageSentTimestamp
         **/
        public void setLastMessageSentTimestamp(OffsetDateTime lastMessageSentTimestamp) {
            this.lastMessageSentTimestamp = lastMessageSentTimestamp;
        }

        public GetMailThreadResponse1AllOfDataQueryParam lastMessageSentTimestamp(OffsetDateTime lastMessageSentTimestamp) {
            this.lastMessageSentTimestamp = lastMessageSentTimestamp;
            return this;
        }

        /**
        * The last time when the mail thread has had a message received
        * @return lastMessageReceivedTimestamp
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("last_message_received_timestamp")
        public OffsetDateTime getLastMessageReceivedTimestamp() {
            return lastMessageReceivedTimestamp;
        }

        /**
         * Set lastMessageReceivedTimestamp
         **/
        public void setLastMessageReceivedTimestamp(OffsetDateTime lastMessageReceivedTimestamp) {
            this.lastMessageReceivedTimestamp = lastMessageReceivedTimestamp;
        }

        public GetMailThreadResponse1AllOfDataQueryParam lastMessageReceivedTimestamp(OffsetDateTime lastMessageReceivedTimestamp) {
            this.lastMessageReceivedTimestamp = lastMessageReceivedTimestamp;
            return this;
        }

        /**
        * The time when the mail thread was inserted to database
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

        public GetMailThreadResponse1AllOfDataQueryParam addTime(OffsetDateTime addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The time when the mail thread was updated in database received
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

        public GetMailThreadResponse1AllOfDataQueryParam updateTime(OffsetDateTime updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
        * The ID of the deal
        * @return dealId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("deal_id")
        public Integer getDealId() {
            return dealId;
        }

        /**
         * Set dealId
         **/
        public void setDealId(Integer dealId) {
            this.dealId = dealId;
        }

        public GetMailThreadResponse1AllOfDataQueryParam dealId(Integer dealId) {
            this.dealId = dealId;
            return this;
        }

        /**
        * Status of the deal
        * @return dealStatus
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("deal_status")
        public String getDealStatus() {
            return dealStatus;
        }

        /**
         * Set dealStatus
         **/
        public void setDealStatus(String dealStatus) {
            this.dealStatus = dealStatus;
        }

        public GetMailThreadResponse1AllOfDataQueryParam dealStatus(String dealStatus) {
            this.dealStatus = dealStatus;
            return this;
        }

        /**
        * The ID of the lead
        * @return leadId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("lead_id")
        public UUID getLeadId() {
            return leadId;
        }

        /**
         * Set leadId
         **/
        public void setLeadId(UUID leadId) {
            this.leadId = leadId;
        }

        public GetMailThreadResponse1AllOfDataQueryParam leadId(UUID leadId) {
            this.leadId = leadId;
            return this;
        }

        /**
        * Get allMessagesSentFlag
        * @return allMessagesSentFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("all_messages_sent_flag")
        public AllMessagesSentFlagEnum getAllMessagesSentFlag() {
            return allMessagesSentFlag;
        }

        /**
         * Set allMessagesSentFlag
         **/
        public void setAllMessagesSentFlag(AllMessagesSentFlagEnum allMessagesSentFlag) {
            this.allMessagesSentFlag = allMessagesSentFlag;
        }

        public GetMailThreadResponse1AllOfDataQueryParam allMessagesSentFlag(AllMessagesSentFlagEnum allMessagesSentFlag) {
            this.allMessagesSentFlag = allMessagesSentFlag;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetMailThreadResponse1AllOfDataQueryParam {\n");

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
            sb.append("    parties: ").append(toIndentedString(parties)).append("\n");
            sb.append("    draftsParties: ").append(toIndentedString(draftsParties)).append("\n");
            sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
            sb.append("    version: ").append(toIndentedString(version)).append("\n");
            sb.append("    snippetDraft: ").append(toIndentedString(snippetDraft)).append("\n");
            sb.append("    snippetSent: ").append(toIndentedString(snippetSent)).append("\n");
            sb.append("    messageCount: ").append(toIndentedString(messageCount)).append("\n");
            sb.append("    hasDraftFlag: ").append(toIndentedString(hasDraftFlag)).append("\n");
            sb.append("    hasSentFlag: ").append(toIndentedString(hasSentFlag)).append("\n");
            sb.append("    archivedFlag: ").append(toIndentedString(archivedFlag)).append("\n");
            sb.append("    sharedFlag: ").append(toIndentedString(sharedFlag)).append("\n");
            sb.append("    externalDeletedFlag: ").append(toIndentedString(externalDeletedFlag)).append("\n");
            sb.append("    firstMessageToMeFlag: ").append(toIndentedString(firstMessageToMeFlag)).append("\n");
            sb.append("    lastMessageTimestamp: ").append(toIndentedString(lastMessageTimestamp)).append("\n");
            sb.append("    firstMessageTimestamp: ").append(toIndentedString(firstMessageTimestamp)).append("\n");
            sb.append("    lastMessageSentTimestamp: ").append(toIndentedString(lastMessageSentTimestamp)).append("\n");
            sb.append("    lastMessageReceivedTimestamp: ").append(toIndentedString(lastMessageReceivedTimestamp)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
            sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
            sb.append("    dealStatus: ").append(toIndentedString(dealStatus)).append("\n");
            sb.append("    leadId: ").append(toIndentedString(leadId)).append("\n");
            sb.append("    allMessagesSentFlag: ").append(toIndentedString(allMessagesSentFlag)).append("\n");
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
