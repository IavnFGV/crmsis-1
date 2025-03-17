package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.MailMessageDataFromInner;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class MailMessageItemForList  {

    /**
      * ID of the mail message.
     **/
    private Integer id;
    /**
      * The array of mail message sender (object)
     **/
    private List<MailMessageDataFromInner> from;
    /**
      * The array of mail message receiver (object)
     **/
    private List<MailMessageDataFromInner> to;
    /**
      * The array of mail message copies (object)
     **/
    private List<MailMessageDataFromInner> cc;
    /**
      * The array of mail message blind copies (object)
     **/
    private List<MailMessageDataFromInner> bcc;
    /**
      * The mail message body URL
     **/
    private String bodyUrl;
    /**
      * The connection account ID
     **/
    private String accountId;
    /**
      * ID of the user whom mail message will be assigned to
     **/
    private Integer userId;
    /**
      * ID of the mail message thread
     **/
    private Integer mailThreadId;
    /**
      * The subject of mail message
     **/
    private String subject;
    /**
      * The snippet of mail message. Snippet length is up to 225 characters.
     **/
    private String snippet;

    public enum MailTrackingStatusEnum {
        OPENED(String.valueOf("opened")), NOT_OPENED(String.valueOf("not opened"));

        // caching enum access
        private static final java.util.EnumSet<MailTrackingStatusEnum> values = java.util.EnumSet.allOf(MailTrackingStatusEnum.class);

        String value;

        MailTrackingStatusEnum (String v) {
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
        public static MailTrackingStatusEnum fromString(String v) {
            for (MailTrackingStatusEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            return null;
        }
    }
    /**
      * The status of tracking mail message. Value is `null` if tracking is not enabled.
     **/
    private MailTrackingStatusEnum mailTrackingStatus;

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
      * If the mail message has a draft status then the value is the mail message object as JSON formatted string, otherwise `null`.
     **/
    private String draft;

    public enum DraftFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<DraftFlagEnum> values = java.util.EnumSet.allOf(DraftFlagEnum.class);

        BigDecimal value;

        DraftFlagEnum (BigDecimal v) {
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
        public static DraftFlagEnum fromString(String v) {
            for (DraftFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private DraftFlagEnum draftFlag = DraftFlagEnum.NUMBER_0;

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
    /**
      * Creation or receival time of the mail message
     **/
    private OffsetDateTime messageTime;
    /**
      * The insertion into the database time of the mail message
     **/
    private OffsetDateTime addTime;
    /**
      * The updating time in the database of the mail message
     **/
    private OffsetDateTime updateTime;

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
    /**
      * The Mail Message ID assigned by the sync provider
     **/
    private String nylasId;
    /**
      * The name of the S3 bucket
     **/
    private String s3Bucket;
    /**
      * The path of the S3 bucket
     **/
    private String s3BucketPath;
    /**
      * If the Mail Message has been deleted on the provider side or not
     **/
    private Boolean externalDeletedFlag;
    /**
      * The Mail Message ID assigned by the mail user agent
     **/
    private String muaMessageId;
    /**
      * The ID of the mail template
     **/
    private Integer templateId;
    /**
      * The add date and time of the Mail Message
     **/
    private String timestamp;
    /**
      * The type of the data item
     **/
    private String itemType;
    /**
      * The ID of the company
     **/
    private Integer companyId;

    /**
    * ID of the mail message.
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

    public MailMessageItemForList id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The array of mail message sender (object)
    * @return from
    **/
    @JsonProperty("from")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<MailMessageDataFromInner> getFrom() {
        return from;
    }

    /**
     * Set from
     **/
    public void setFrom(List<MailMessageDataFromInner> from) {
        this.from = from;
    }

    public MailMessageItemForList from(List<MailMessageDataFromInner> from) {
        this.from = from;
        return this;
    }
    public MailMessageItemForList addFromItem(MailMessageDataFromInner fromItem) {
        if (this.from == null){
            from = new ArrayList<>();
        }
        this.from.add(fromItem);
        return this;
    }

    /**
    * The array of mail message receiver (object)
    * @return to
    **/
    @JsonProperty("to")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<MailMessageDataFromInner> getTo() {
        return to;
    }

    /**
     * Set to
     **/
    public void setTo(List<MailMessageDataFromInner> to) {
        this.to = to;
    }

    public MailMessageItemForList to(List<MailMessageDataFromInner> to) {
        this.to = to;
        return this;
    }
    public MailMessageItemForList addToItem(MailMessageDataFromInner toItem) {
        if (this.to == null){
            to = new ArrayList<>();
        }
        this.to.add(toItem);
        return this;
    }

    /**
    * The array of mail message copies (object)
    * @return cc
    **/
    @JsonProperty("cc")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<MailMessageDataFromInner> getCc() {
        return cc;
    }

    /**
     * Set cc
     **/
    public void setCc(List<MailMessageDataFromInner> cc) {
        this.cc = cc;
    }

    public MailMessageItemForList cc(List<MailMessageDataFromInner> cc) {
        this.cc = cc;
        return this;
    }
    public MailMessageItemForList addCcItem(MailMessageDataFromInner ccItem) {
        if (this.cc == null){
            cc = new ArrayList<>();
        }
        this.cc.add(ccItem);
        return this;
    }

    /**
    * The array of mail message blind copies (object)
    * @return bcc
    **/
    @JsonProperty("bcc")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<MailMessageDataFromInner> getBcc() {
        return bcc;
    }

    /**
     * Set bcc
     **/
    public void setBcc(List<MailMessageDataFromInner> bcc) {
        this.bcc = bcc;
    }

    public MailMessageItemForList bcc(List<MailMessageDataFromInner> bcc) {
        this.bcc = bcc;
        return this;
    }
    public MailMessageItemForList addBccItem(MailMessageDataFromInner bccItem) {
        if (this.bcc == null){
            bcc = new ArrayList<>();
        }
        this.bcc.add(bccItem);
        return this;
    }

    /**
    * The mail message body URL
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

    public MailMessageItemForList bodyUrl(String bodyUrl) {
        this.bodyUrl = bodyUrl;
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

    public MailMessageItemForList accountId(String accountId) {
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

    public MailMessageItemForList userId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
    * ID of the mail message thread
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

    public MailMessageItemForList mailThreadId(Integer mailThreadId) {
        this.mailThreadId = mailThreadId;
        return this;
    }

    /**
    * The subject of mail message
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

    public MailMessageItemForList subject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
    * The snippet of mail message. Snippet length is up to 225 characters.
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

    public MailMessageItemForList snippet(String snippet) {
        this.snippet = snippet;
        return this;
    }

    /**
    * The status of tracking mail message. Value is `null` if tracking is not enabled.
    * @return mailTrackingStatus
    **/
    @JsonProperty("mail_tracking_status")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public MailTrackingStatusEnum getMailTrackingStatus() {
        return mailTrackingStatus;
    }

    /**
     * Set mailTrackingStatus
     **/
    public void setMailTrackingStatus(MailTrackingStatusEnum mailTrackingStatus) {
        this.mailTrackingStatus = mailTrackingStatus;
    }

    public MailMessageItemForList mailTrackingStatus(MailTrackingStatusEnum mailTrackingStatus) {
        this.mailTrackingStatus = mailTrackingStatus;
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

    public MailMessageItemForList mailLinkTrackingEnabledFlag(MailLinkTrackingEnabledFlagEnum mailLinkTrackingEnabledFlag) {
        this.mailLinkTrackingEnabledFlag = mailLinkTrackingEnabledFlag;
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

    public MailMessageItemForList readFlag(ReadFlagEnum readFlag) {
        this.readFlag = readFlag;
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

    public MailMessageItemForList draft(String draft) {
        this.draft = draft;
        return this;
    }

    /**
    * Get draftFlag
    * @return draftFlag
    **/
    @JsonProperty("draft_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public DraftFlagEnum getDraftFlag() {
        return draftFlag;
    }

    /**
     * Set draftFlag
     **/
    public void setDraftFlag(DraftFlagEnum draftFlag) {
        this.draftFlag = draftFlag;
    }

    public MailMessageItemForList draftFlag(DraftFlagEnum draftFlag) {
        this.draftFlag = draftFlag;
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

    public MailMessageItemForList syncedFlag(SyncedFlagEnum syncedFlag) {
        this.syncedFlag = syncedFlag;
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

    public MailMessageItemForList deletedFlag(DeletedFlagEnum deletedFlag) {
        this.deletedFlag = deletedFlag;
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

    public MailMessageItemForList hasBodyFlag(HasBodyFlagEnum hasBodyFlag) {
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

    public MailMessageItemForList sentFlag(SentFlagEnum sentFlag) {
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

    public MailMessageItemForList sentFromPipedriveFlag(SentFromPipedriveFlagEnum sentFromPipedriveFlag) {
        this.sentFromPipedriveFlag = sentFromPipedriveFlag;
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

    public MailMessageItemForList smartBccFlag(SmartBccFlagEnum smartBccFlag) {
        this.smartBccFlag = smartBccFlag;
        return this;
    }

    /**
    * Creation or receival time of the mail message
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

    public MailMessageItemForList messageTime(OffsetDateTime messageTime) {
        this.messageTime = messageTime;
        return this;
    }

    /**
    * The insertion into the database time of the mail message
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

    public MailMessageItemForList addTime(OffsetDateTime addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The updating time in the database of the mail message
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

    public MailMessageItemForList updateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
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

    public MailMessageItemForList hasAttachmentsFlag(HasAttachmentsFlagEnum hasAttachmentsFlag) {
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

    public MailMessageItemForList hasInlineAttachmentsFlag(HasInlineAttachmentsFlagEnum hasInlineAttachmentsFlag) {
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

    public MailMessageItemForList hasRealAttachmentsFlag(HasRealAttachmentsFlagEnum hasRealAttachmentsFlag) {
        this.hasRealAttachmentsFlag = hasRealAttachmentsFlag;
        return this;
    }

    /**
    * The Mail Message ID assigned by the sync provider
    * @return nylasId
    **/
    @JsonProperty("nylas_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getNylasId() {
        return nylasId;
    }

    /**
     * Set nylasId
     **/
    public void setNylasId(String nylasId) {
        this.nylasId = nylasId;
    }

    public MailMessageItemForList nylasId(String nylasId) {
        this.nylasId = nylasId;
        return this;
    }

    /**
    * The name of the S3 bucket
    * @return s3Bucket
    **/
    @JsonProperty("s3_bucket")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getS3Bucket() {
        return s3Bucket;
    }

    /**
     * Set s3Bucket
     **/
    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    public MailMessageItemForList s3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
        return this;
    }

    /**
    * The path of the S3 bucket
    * @return s3BucketPath
    **/
    @JsonProperty("s3_bucket_path")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getS3BucketPath() {
        return s3BucketPath;
    }

    /**
     * Set s3BucketPath
     **/
    public void setS3BucketPath(String s3BucketPath) {
        this.s3BucketPath = s3BucketPath;
    }

    public MailMessageItemForList s3BucketPath(String s3BucketPath) {
        this.s3BucketPath = s3BucketPath;
        return this;
    }

    /**
    * If the Mail Message has been deleted on the provider side or not
    * @return externalDeletedFlag
    **/
    @JsonProperty("external_deleted_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getExternalDeletedFlag() {
        return externalDeletedFlag;
    }

    /**
     * Set externalDeletedFlag
     **/
    public void setExternalDeletedFlag(Boolean externalDeletedFlag) {
        this.externalDeletedFlag = externalDeletedFlag;
    }

    public MailMessageItemForList externalDeletedFlag(Boolean externalDeletedFlag) {
        this.externalDeletedFlag = externalDeletedFlag;
        return this;
    }

    /**
    * The Mail Message ID assigned by the mail user agent
    * @return muaMessageId
    **/
    @JsonProperty("mua_message_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getMuaMessageId() {
        return muaMessageId;
    }

    /**
     * Set muaMessageId
     **/
    public void setMuaMessageId(String muaMessageId) {
        this.muaMessageId = muaMessageId;
    }

    public MailMessageItemForList muaMessageId(String muaMessageId) {
        this.muaMessageId = muaMessageId;
        return this;
    }

    /**
    * The ID of the mail template
    * @return templateId
    **/
    @JsonProperty("template_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getTemplateId() {
        return templateId;
    }

    /**
     * Set templateId
     **/
    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public MailMessageItemForList templateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
    * The add date and time of the Mail Message
    * @return timestamp
    **/
    @JsonProperty("timestamp")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Set timestamp
     **/
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public MailMessageItemForList timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
    * The type of the data item
    * @return itemType
    **/
    @JsonProperty("item_type")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getItemType() {
        return itemType;
    }

    /**
     * Set itemType
     **/
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public MailMessageItemForList itemType(String itemType) {
        this.itemType = itemType;
        return this;
    }

    /**
    * The ID of the company
    * @return companyId
    **/
    @JsonProperty("company_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * Set companyId
     **/
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public MailMessageItemForList companyId(Integer companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MailMessageItemForList {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
        sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
        sb.append("    bodyUrl: ").append(toIndentedString(bodyUrl)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    mailThreadId: ").append(toIndentedString(mailThreadId)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
        sb.append("    mailTrackingStatus: ").append(toIndentedString(mailTrackingStatus)).append("\n");
        sb.append("    mailLinkTrackingEnabledFlag: ").append(toIndentedString(mailLinkTrackingEnabledFlag)).append("\n");
        sb.append("    readFlag: ").append(toIndentedString(readFlag)).append("\n");
        sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
        sb.append("    draftFlag: ").append(toIndentedString(draftFlag)).append("\n");
        sb.append("    syncedFlag: ").append(toIndentedString(syncedFlag)).append("\n");
        sb.append("    deletedFlag: ").append(toIndentedString(deletedFlag)).append("\n");
        sb.append("    hasBodyFlag: ").append(toIndentedString(hasBodyFlag)).append("\n");
        sb.append("    sentFlag: ").append(toIndentedString(sentFlag)).append("\n");
        sb.append("    sentFromPipedriveFlag: ").append(toIndentedString(sentFromPipedriveFlag)).append("\n");
        sb.append("    smartBccFlag: ").append(toIndentedString(smartBccFlag)).append("\n");
        sb.append("    messageTime: ").append(toIndentedString(messageTime)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    hasAttachmentsFlag: ").append(toIndentedString(hasAttachmentsFlag)).append("\n");
        sb.append("    hasInlineAttachmentsFlag: ").append(toIndentedString(hasInlineAttachmentsFlag)).append("\n");
        sb.append("    hasRealAttachmentsFlag: ").append(toIndentedString(hasRealAttachmentsFlag)).append("\n");
        sb.append("    nylasId: ").append(toIndentedString(nylasId)).append("\n");
        sb.append("    s3Bucket: ").append(toIndentedString(s3Bucket)).append("\n");
        sb.append("    s3BucketPath: ").append(toIndentedString(s3BucketPath)).append("\n");
        sb.append("    externalDeletedFlag: ").append(toIndentedString(externalDeletedFlag)).append("\n");
        sb.append("    muaMessageId: ").append(toIndentedString(muaMessageId)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
        sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code MailMessageItemForList} object that
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

        MailMessageItemForList model = (MailMessageItemForList) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(from, model.from) &&
        java.util.Objects.equals(to, model.to) &&
        java.util.Objects.equals(cc, model.cc) &&
        java.util.Objects.equals(bcc, model.bcc) &&
        java.util.Objects.equals(bodyUrl, model.bodyUrl) &&
        java.util.Objects.equals(accountId, model.accountId) &&
        java.util.Objects.equals(userId, model.userId) &&
        java.util.Objects.equals(mailThreadId, model.mailThreadId) &&
        java.util.Objects.equals(subject, model.subject) &&
        java.util.Objects.equals(snippet, model.snippet) &&
        java.util.Objects.equals(mailTrackingStatus, model.mailTrackingStatus) &&
        java.util.Objects.equals(mailLinkTrackingEnabledFlag, model.mailLinkTrackingEnabledFlag) &&
        java.util.Objects.equals(readFlag, model.readFlag) &&
        java.util.Objects.equals(draft, model.draft) &&
        java.util.Objects.equals(draftFlag, model.draftFlag) &&
        java.util.Objects.equals(syncedFlag, model.syncedFlag) &&
        java.util.Objects.equals(deletedFlag, model.deletedFlag) &&
        java.util.Objects.equals(hasBodyFlag, model.hasBodyFlag) &&
        java.util.Objects.equals(sentFlag, model.sentFlag) &&
        java.util.Objects.equals(sentFromPipedriveFlag, model.sentFromPipedriveFlag) &&
        java.util.Objects.equals(smartBccFlag, model.smartBccFlag) &&
        java.util.Objects.equals(messageTime, model.messageTime) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(updateTime, model.updateTime) &&
        java.util.Objects.equals(hasAttachmentsFlag, model.hasAttachmentsFlag) &&
        java.util.Objects.equals(hasInlineAttachmentsFlag, model.hasInlineAttachmentsFlag) &&
        java.util.Objects.equals(hasRealAttachmentsFlag, model.hasRealAttachmentsFlag) &&
        java.util.Objects.equals(nylasId, model.nylasId) &&
        java.util.Objects.equals(s3Bucket, model.s3Bucket) &&
        java.util.Objects.equals(s3BucketPath, model.s3BucketPath) &&
        java.util.Objects.equals(externalDeletedFlag, model.externalDeletedFlag) &&
        java.util.Objects.equals(muaMessageId, model.muaMessageId) &&
        java.util.Objects.equals(templateId, model.templateId) &&
        java.util.Objects.equals(timestamp, model.timestamp) &&
        java.util.Objects.equals(itemType, model.itemType) &&
        java.util.Objects.equals(companyId, model.companyId);
    }

    /**
     * Returns a hash code for a {@code MailMessageItemForList}.
     *
     * @return a hash code value for a {@code MailMessageItemForList}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        from,
        to,
        cc,
        bcc,
        bodyUrl,
        accountId,
        userId,
        mailThreadId,
        subject,
        snippet,
        mailTrackingStatus,
        mailLinkTrackingEnabledFlag,
        readFlag,
        draft,
        draftFlag,
        syncedFlag,
        deletedFlag,
        hasBodyFlag,
        sentFlag,
        sentFromPipedriveFlag,
        smartBccFlag,
        messageTime,
        addTime,
        updateTime,
        hasAttachmentsFlag,
        hasInlineAttachmentsFlag,
        hasRealAttachmentsFlag,
        nylasId,
        s3Bucket,
        s3BucketPath,
        externalDeletedFlag,
        muaMessageId,
        templateId,
        timestamp,
        itemType,
        companyId);
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
    public static class MailMessageItemForListQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("from")
        private List<MailMessageDataFromInner> from = null;
        @jakarta.ws.rs.QueryParam("to")
        private List<MailMessageDataFromInner> to = null;
        @jakarta.ws.rs.QueryParam("cc")
        private List<MailMessageDataFromInner> cc = null;
        @jakarta.ws.rs.QueryParam("bcc")
        private List<MailMessageDataFromInner> bcc = null;
        @jakarta.ws.rs.QueryParam("bodyUrl")
        private String bodyUrl;
        @jakarta.ws.rs.QueryParam("accountId")
        private String accountId;
        @jakarta.ws.rs.QueryParam("userId")
        private Integer userId;
        @jakarta.ws.rs.QueryParam("mailThreadId")
        private Integer mailThreadId;
        @jakarta.ws.rs.QueryParam("subject")
        private String subject;
        @jakarta.ws.rs.QueryParam("snippet")
        private String snippet;

    public enum MailTrackingStatusEnum {
        OPENED(String.valueOf("opened")), NOT_OPENED(String.valueOf("not opened"));

        // caching enum access
        private static final java.util.EnumSet<MailTrackingStatusEnum> values = java.util.EnumSet.allOf(MailTrackingStatusEnum.class);

        String value;

        MailTrackingStatusEnum (String v) {
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
        public static MailTrackingStatusEnum fromString(String v) {
            for (MailTrackingStatusEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            return null;
        }
    }
        private MailTrackingStatusEnum mailTrackingStatus;

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
        @jakarta.ws.rs.QueryParam("draft")
        private String draft;

    public enum DraftFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<DraftFlagEnum> values = java.util.EnumSet.allOf(DraftFlagEnum.class);

        BigDecimal value;

        DraftFlagEnum (BigDecimal v) {
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
        public static DraftFlagEnum fromString(String v) {
            for (DraftFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private DraftFlagEnum draftFlag = DraftFlagEnum.NUMBER_0;

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
        @jakarta.ws.rs.QueryParam("messageTime")
        private OffsetDateTime messageTime;
        @jakarta.ws.rs.QueryParam("addTime")
        private OffsetDateTime addTime;
        @jakarta.ws.rs.QueryParam("updateTime")
        private OffsetDateTime updateTime;

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
        @jakarta.ws.rs.QueryParam("nylasId")
        private String nylasId;
        @jakarta.ws.rs.QueryParam("s3Bucket")
        private String s3Bucket;
        @jakarta.ws.rs.QueryParam("s3BucketPath")
        private String s3BucketPath;
        @jakarta.ws.rs.QueryParam("externalDeletedFlag")
        private Boolean externalDeletedFlag;
        @jakarta.ws.rs.QueryParam("muaMessageId")
        private String muaMessageId;
        @jakarta.ws.rs.QueryParam("templateId")
        private Integer templateId;
        @jakarta.ws.rs.QueryParam("timestamp")
        private String timestamp;
        @jakarta.ws.rs.QueryParam("itemType")
        private String itemType;
        @jakarta.ws.rs.QueryParam("companyId")
        private Integer companyId;

        /**
        * ID of the mail message.
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

        public MailMessageItemForListQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The array of mail message sender (object)
        * @return from
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("from")
        public List<MailMessageDataFromInner> getFrom() {
            return from;
        }

        /**
         * Set from
         **/
        public void setFrom(List<MailMessageDataFromInner> from) {
            this.from = from;
        }

        public MailMessageItemForListQueryParam from(List<MailMessageDataFromInner> from) {
            this.from = from;
            return this;
        }
        public MailMessageItemForListQueryParam addFromItem(MailMessageDataFromInner fromItem) {
            this.from.add(fromItem);
            return this;
        }

        /**
        * The array of mail message receiver (object)
        * @return to
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("to")
        public List<MailMessageDataFromInner> getTo() {
            return to;
        }

        /**
         * Set to
         **/
        public void setTo(List<MailMessageDataFromInner> to) {
            this.to = to;
        }

        public MailMessageItemForListQueryParam to(List<MailMessageDataFromInner> to) {
            this.to = to;
            return this;
        }
        public MailMessageItemForListQueryParam addToItem(MailMessageDataFromInner toItem) {
            this.to.add(toItem);
            return this;
        }

        /**
        * The array of mail message copies (object)
        * @return cc
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("cc")
        public List<MailMessageDataFromInner> getCc() {
            return cc;
        }

        /**
         * Set cc
         **/
        public void setCc(List<MailMessageDataFromInner> cc) {
            this.cc = cc;
        }

        public MailMessageItemForListQueryParam cc(List<MailMessageDataFromInner> cc) {
            this.cc = cc;
            return this;
        }
        public MailMessageItemForListQueryParam addCcItem(MailMessageDataFromInner ccItem) {
            this.cc.add(ccItem);
            return this;
        }

        /**
        * The array of mail message blind copies (object)
        * @return bcc
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("bcc")
        public List<MailMessageDataFromInner> getBcc() {
            return bcc;
        }

        /**
         * Set bcc
         **/
        public void setBcc(List<MailMessageDataFromInner> bcc) {
            this.bcc = bcc;
        }

        public MailMessageItemForListQueryParam bcc(List<MailMessageDataFromInner> bcc) {
            this.bcc = bcc;
            return this;
        }
        public MailMessageItemForListQueryParam addBccItem(MailMessageDataFromInner bccItem) {
            this.bcc.add(bccItem);
            return this;
        }

        /**
        * The mail message body URL
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

        public MailMessageItemForListQueryParam bodyUrl(String bodyUrl) {
            this.bodyUrl = bodyUrl;
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

        public MailMessageItemForListQueryParam accountId(String accountId) {
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

        public MailMessageItemForListQueryParam userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        /**
        * ID of the mail message thread
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

        public MailMessageItemForListQueryParam mailThreadId(Integer mailThreadId) {
            this.mailThreadId = mailThreadId;
            return this;
        }

        /**
        * The subject of mail message
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

        public MailMessageItemForListQueryParam subject(String subject) {
            this.subject = subject;
            return this;
        }

        /**
        * The snippet of mail message. Snippet length is up to 225 characters.
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

        public MailMessageItemForListQueryParam snippet(String snippet) {
            this.snippet = snippet;
            return this;
        }

        /**
        * The status of tracking mail message. Value is `null` if tracking is not enabled.
        * @return mailTrackingStatus
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("mail_tracking_status")
        public MailTrackingStatusEnum getMailTrackingStatus() {
            return mailTrackingStatus;
        }

        /**
         * Set mailTrackingStatus
         **/
        public void setMailTrackingStatus(MailTrackingStatusEnum mailTrackingStatus) {
            this.mailTrackingStatus = mailTrackingStatus;
        }

        public MailMessageItemForListQueryParam mailTrackingStatus(MailTrackingStatusEnum mailTrackingStatus) {
            this.mailTrackingStatus = mailTrackingStatus;
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

        public MailMessageItemForListQueryParam mailLinkTrackingEnabledFlag(MailLinkTrackingEnabledFlagEnum mailLinkTrackingEnabledFlag) {
            this.mailLinkTrackingEnabledFlag = mailLinkTrackingEnabledFlag;
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

        public MailMessageItemForListQueryParam readFlag(ReadFlagEnum readFlag) {
            this.readFlag = readFlag;
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

        public MailMessageItemForListQueryParam draft(String draft) {
            this.draft = draft;
            return this;
        }

        /**
        * Get draftFlag
        * @return draftFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("draft_flag")
        public DraftFlagEnum getDraftFlag() {
            return draftFlag;
        }

        /**
         * Set draftFlag
         **/
        public void setDraftFlag(DraftFlagEnum draftFlag) {
            this.draftFlag = draftFlag;
        }

        public MailMessageItemForListQueryParam draftFlag(DraftFlagEnum draftFlag) {
            this.draftFlag = draftFlag;
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

        public MailMessageItemForListQueryParam syncedFlag(SyncedFlagEnum syncedFlag) {
            this.syncedFlag = syncedFlag;
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

        public MailMessageItemForListQueryParam deletedFlag(DeletedFlagEnum deletedFlag) {
            this.deletedFlag = deletedFlag;
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

        public MailMessageItemForListQueryParam hasBodyFlag(HasBodyFlagEnum hasBodyFlag) {
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

        public MailMessageItemForListQueryParam sentFlag(SentFlagEnum sentFlag) {
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

        public MailMessageItemForListQueryParam sentFromPipedriveFlag(SentFromPipedriveFlagEnum sentFromPipedriveFlag) {
            this.sentFromPipedriveFlag = sentFromPipedriveFlag;
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

        public MailMessageItemForListQueryParam smartBccFlag(SmartBccFlagEnum smartBccFlag) {
            this.smartBccFlag = smartBccFlag;
            return this;
        }

        /**
        * Creation or receival time of the mail message
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

        public MailMessageItemForListQueryParam messageTime(OffsetDateTime messageTime) {
            this.messageTime = messageTime;
            return this;
        }

        /**
        * The insertion into the database time of the mail message
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

        public MailMessageItemForListQueryParam addTime(OffsetDateTime addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The updating time in the database of the mail message
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

        public MailMessageItemForListQueryParam updateTime(OffsetDateTime updateTime) {
            this.updateTime = updateTime;
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

        public MailMessageItemForListQueryParam hasAttachmentsFlag(HasAttachmentsFlagEnum hasAttachmentsFlag) {
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

        public MailMessageItemForListQueryParam hasInlineAttachmentsFlag(HasInlineAttachmentsFlagEnum hasInlineAttachmentsFlag) {
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

        public MailMessageItemForListQueryParam hasRealAttachmentsFlag(HasRealAttachmentsFlagEnum hasRealAttachmentsFlag) {
            this.hasRealAttachmentsFlag = hasRealAttachmentsFlag;
            return this;
        }

        /**
        * The Mail Message ID assigned by the sync provider
        * @return nylasId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("nylas_id")
        public String getNylasId() {
            return nylasId;
        }

        /**
         * Set nylasId
         **/
        public void setNylasId(String nylasId) {
            this.nylasId = nylasId;
        }

        public MailMessageItemForListQueryParam nylasId(String nylasId) {
            this.nylasId = nylasId;
            return this;
        }

        /**
        * The name of the S3 bucket
        * @return s3Bucket
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("s3_bucket")
        public String getS3Bucket() {
            return s3Bucket;
        }

        /**
         * Set s3Bucket
         **/
        public void setS3Bucket(String s3Bucket) {
            this.s3Bucket = s3Bucket;
        }

        public MailMessageItemForListQueryParam s3Bucket(String s3Bucket) {
            this.s3Bucket = s3Bucket;
            return this;
        }

        /**
        * The path of the S3 bucket
        * @return s3BucketPath
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("s3_bucket_path")
        public String getS3BucketPath() {
            return s3BucketPath;
        }

        /**
         * Set s3BucketPath
         **/
        public void setS3BucketPath(String s3BucketPath) {
            this.s3BucketPath = s3BucketPath;
        }

        public MailMessageItemForListQueryParam s3BucketPath(String s3BucketPath) {
            this.s3BucketPath = s3BucketPath;
            return this;
        }

        /**
        * If the Mail Message has been deleted on the provider side or not
        * @return externalDeletedFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("external_deleted_flag")
        public Boolean getExternalDeletedFlag() {
            return externalDeletedFlag;
        }

        /**
         * Set externalDeletedFlag
         **/
        public void setExternalDeletedFlag(Boolean externalDeletedFlag) {
            this.externalDeletedFlag = externalDeletedFlag;
        }

        public MailMessageItemForListQueryParam externalDeletedFlag(Boolean externalDeletedFlag) {
            this.externalDeletedFlag = externalDeletedFlag;
            return this;
        }

        /**
        * The Mail Message ID assigned by the mail user agent
        * @return muaMessageId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("mua_message_id")
        public String getMuaMessageId() {
            return muaMessageId;
        }

        /**
         * Set muaMessageId
         **/
        public void setMuaMessageId(String muaMessageId) {
            this.muaMessageId = muaMessageId;
        }

        public MailMessageItemForListQueryParam muaMessageId(String muaMessageId) {
            this.muaMessageId = muaMessageId;
            return this;
        }

        /**
        * The ID of the mail template
        * @return templateId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("template_id")
        public Integer getTemplateId() {
            return templateId;
        }

        /**
         * Set templateId
         **/
        public void setTemplateId(Integer templateId) {
            this.templateId = templateId;
        }

        public MailMessageItemForListQueryParam templateId(Integer templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
        * The add date and time of the Mail Message
        * @return timestamp
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        public String getTimestamp() {
            return timestamp;
        }

        /**
         * Set timestamp
         **/
        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public MailMessageItemForListQueryParam timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
        * The type of the data item
        * @return itemType
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("item_type")
        public String getItemType() {
            return itemType;
        }

        /**
         * Set itemType
         **/
        public void setItemType(String itemType) {
            this.itemType = itemType;
        }

        public MailMessageItemForListQueryParam itemType(String itemType) {
            this.itemType = itemType;
            return this;
        }

        /**
        * The ID of the company
        * @return companyId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("company_id")
        public Integer getCompanyId() {
            return companyId;
        }

        /**
         * Set companyId
         **/
        public void setCompanyId(Integer companyId) {
            this.companyId = companyId;
        }

        public MailMessageItemForListQueryParam companyId(Integer companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MailMessageItemForListQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    from: ").append(toIndentedString(from)).append("\n");
            sb.append("    to: ").append(toIndentedString(to)).append("\n");
            sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
            sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
            sb.append("    bodyUrl: ").append(toIndentedString(bodyUrl)).append("\n");
            sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
            sb.append("    mailThreadId: ").append(toIndentedString(mailThreadId)).append("\n");
            sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
            sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
            sb.append("    mailTrackingStatus: ").append(toIndentedString(mailTrackingStatus)).append("\n");
            sb.append("    mailLinkTrackingEnabledFlag: ").append(toIndentedString(mailLinkTrackingEnabledFlag)).append("\n");
            sb.append("    readFlag: ").append(toIndentedString(readFlag)).append("\n");
            sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
            sb.append("    draftFlag: ").append(toIndentedString(draftFlag)).append("\n");
            sb.append("    syncedFlag: ").append(toIndentedString(syncedFlag)).append("\n");
            sb.append("    deletedFlag: ").append(toIndentedString(deletedFlag)).append("\n");
            sb.append("    hasBodyFlag: ").append(toIndentedString(hasBodyFlag)).append("\n");
            sb.append("    sentFlag: ").append(toIndentedString(sentFlag)).append("\n");
            sb.append("    sentFromPipedriveFlag: ").append(toIndentedString(sentFromPipedriveFlag)).append("\n");
            sb.append("    smartBccFlag: ").append(toIndentedString(smartBccFlag)).append("\n");
            sb.append("    messageTime: ").append(toIndentedString(messageTime)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
            sb.append("    hasAttachmentsFlag: ").append(toIndentedString(hasAttachmentsFlag)).append("\n");
            sb.append("    hasInlineAttachmentsFlag: ").append(toIndentedString(hasInlineAttachmentsFlag)).append("\n");
            sb.append("    hasRealAttachmentsFlag: ").append(toIndentedString(hasRealAttachmentsFlag)).append("\n");
            sb.append("    nylasId: ").append(toIndentedString(nylasId)).append("\n");
            sb.append("    s3Bucket: ").append(toIndentedString(s3Bucket)).append("\n");
            sb.append("    s3BucketPath: ").append(toIndentedString(s3BucketPath)).append("\n");
            sb.append("    externalDeletedFlag: ").append(toIndentedString(externalDeletedFlag)).append("\n");
            sb.append("    muaMessageId: ").append(toIndentedString(muaMessageId)).append("\n");
            sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
            sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
            sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
            sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
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
