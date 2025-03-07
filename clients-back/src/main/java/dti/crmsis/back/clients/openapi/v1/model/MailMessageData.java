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

@JsonIgnoreProperties(ignoreUnknown = true)
public class MailMessageData  {

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

        @JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
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

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
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

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
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

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
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

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
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

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
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

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
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

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
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

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
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

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
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

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
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

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
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

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
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
    * ID of the mail message.
    * @return id
    **/
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(Integer id) {
        this.id = id;
    }

    public MailMessageData id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The array of mail message sender (object)
    * @return from
    **/
    @JsonProperty("from")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<MailMessageDataFromInner> getFrom() {
        return from;
    }

    /**
     * Set from
     **/
    public void setFrom(List<MailMessageDataFromInner> from) {
        this.from = from;
    }

    public MailMessageData from(List<MailMessageDataFromInner> from) {
        this.from = from;
        return this;
    }
    public MailMessageData addFromItem(MailMessageDataFromInner fromItem) {
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<MailMessageDataFromInner> getTo() {
        return to;
    }

    /**
     * Set to
     **/
    public void setTo(List<MailMessageDataFromInner> to) {
        this.to = to;
    }

    public MailMessageData to(List<MailMessageDataFromInner> to) {
        this.to = to;
        return this;
    }
    public MailMessageData addToItem(MailMessageDataFromInner toItem) {
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<MailMessageDataFromInner> getCc() {
        return cc;
    }

    /**
     * Set cc
     **/
    public void setCc(List<MailMessageDataFromInner> cc) {
        this.cc = cc;
    }

    public MailMessageData cc(List<MailMessageDataFromInner> cc) {
        this.cc = cc;
        return this;
    }
    public MailMessageData addCcItem(MailMessageDataFromInner ccItem) {
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<MailMessageDataFromInner> getBcc() {
        return bcc;
    }

    /**
     * Set bcc
     **/
    public void setBcc(List<MailMessageDataFromInner> bcc) {
        this.bcc = bcc;
    }

    public MailMessageData bcc(List<MailMessageDataFromInner> bcc) {
        this.bcc = bcc;
        return this;
    }
    public MailMessageData addBccItem(MailMessageDataFromInner bccItem) {
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBodyUrl() {
        return bodyUrl;
    }

    /**
     * Set bodyUrl
     **/
    public void setBodyUrl(String bodyUrl) {
        this.bodyUrl = bodyUrl;
    }

    public MailMessageData bodyUrl(String bodyUrl) {
        this.bodyUrl = bodyUrl;
        return this;
    }

    /**
    * The connection account ID
    * @return accountId
    **/
    @JsonProperty("account_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAccountId() {
        return accountId;
    }

    /**
     * Set accountId
     **/
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public MailMessageData accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
    * ID of the user whom mail message will be assigned to
    * @return userId
    **/
    @JsonProperty("user_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getUserId() {
        return userId;
    }

    /**
     * Set userId
     **/
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public MailMessageData userId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
    * ID of the mail message thread
    * @return mailThreadId
    **/
    @JsonProperty("mail_thread_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getMailThreadId() {
        return mailThreadId;
    }

    /**
     * Set mailThreadId
     **/
    public void setMailThreadId(Integer mailThreadId) {
        this.mailThreadId = mailThreadId;
    }

    public MailMessageData mailThreadId(Integer mailThreadId) {
        this.mailThreadId = mailThreadId;
        return this;
    }

    /**
    * The subject of mail message
    * @return subject
    **/
    @JsonProperty("subject")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSubject() {
        return subject;
    }

    /**
     * Set subject
     **/
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public MailMessageData subject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
    * The snippet of mail message. Snippet length is up to 225 characters.
    * @return snippet
    **/
    @JsonProperty("snippet")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSnippet() {
        return snippet;
    }

    /**
     * Set snippet
     **/
    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public MailMessageData snippet(String snippet) {
        this.snippet = snippet;
        return this;
    }

    /**
    * The status of tracking mail message. Value is `null` if tracking is not enabled.
    * @return mailTrackingStatus
    **/
    @JsonProperty("mail_tracking_status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MailTrackingStatusEnum getMailTrackingStatus() {
        return mailTrackingStatus;
    }

    /**
     * Set mailTrackingStatus
     **/
    public void setMailTrackingStatus(MailTrackingStatusEnum mailTrackingStatus) {
        this.mailTrackingStatus = mailTrackingStatus;
    }

    public MailMessageData mailTrackingStatus(MailTrackingStatusEnum mailTrackingStatus) {
        this.mailTrackingStatus = mailTrackingStatus;
        return this;
    }

    /**
    * Get mailLinkTrackingEnabledFlag
    * @return mailLinkTrackingEnabledFlag
    **/
    @JsonProperty("mail_link_tracking_enabled_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MailLinkTrackingEnabledFlagEnum getMailLinkTrackingEnabledFlag() {
        return mailLinkTrackingEnabledFlag;
    }

    /**
     * Set mailLinkTrackingEnabledFlag
     **/
    public void setMailLinkTrackingEnabledFlag(MailLinkTrackingEnabledFlagEnum mailLinkTrackingEnabledFlag) {
        this.mailLinkTrackingEnabledFlag = mailLinkTrackingEnabledFlag;
    }

    public MailMessageData mailLinkTrackingEnabledFlag(MailLinkTrackingEnabledFlagEnum mailLinkTrackingEnabledFlag) {
        this.mailLinkTrackingEnabledFlag = mailLinkTrackingEnabledFlag;
        return this;
    }

    /**
    * Get readFlag
    * @return readFlag
    **/
    @JsonProperty("read_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ReadFlagEnum getReadFlag() {
        return readFlag;
    }

    /**
     * Set readFlag
     **/
    public void setReadFlag(ReadFlagEnum readFlag) {
        this.readFlag = readFlag;
    }

    public MailMessageData readFlag(ReadFlagEnum readFlag) {
        this.readFlag = readFlag;
        return this;
    }

    /**
    * If the mail message has a draft status then the value is the mail message object as JSON formatted string, otherwise `null`.
    * @return draft
    **/
    @JsonProperty("draft")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDraft() {
        return draft;
    }

    /**
     * Set draft
     **/
    public void setDraft(String draft) {
        this.draft = draft;
    }

    public MailMessageData draft(String draft) {
        this.draft = draft;
        return this;
    }

    /**
    * Get draftFlag
    * @return draftFlag
    **/
    @JsonProperty("draft_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DraftFlagEnum getDraftFlag() {
        return draftFlag;
    }

    /**
     * Set draftFlag
     **/
    public void setDraftFlag(DraftFlagEnum draftFlag) {
        this.draftFlag = draftFlag;
    }

    public MailMessageData draftFlag(DraftFlagEnum draftFlag) {
        this.draftFlag = draftFlag;
        return this;
    }

    /**
    * Get syncedFlag
    * @return syncedFlag
    **/
    @JsonProperty("synced_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SyncedFlagEnum getSyncedFlag() {
        return syncedFlag;
    }

    /**
     * Set syncedFlag
     **/
    public void setSyncedFlag(SyncedFlagEnum syncedFlag) {
        this.syncedFlag = syncedFlag;
    }

    public MailMessageData syncedFlag(SyncedFlagEnum syncedFlag) {
        this.syncedFlag = syncedFlag;
        return this;
    }

    /**
    * Get deletedFlag
    * @return deletedFlag
    **/
    @JsonProperty("deleted_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DeletedFlagEnum getDeletedFlag() {
        return deletedFlag;
    }

    /**
     * Set deletedFlag
     **/
    public void setDeletedFlag(DeletedFlagEnum deletedFlag) {
        this.deletedFlag = deletedFlag;
    }

    public MailMessageData deletedFlag(DeletedFlagEnum deletedFlag) {
        this.deletedFlag = deletedFlag;
        return this;
    }

    /**
    * Get hasBodyFlag
    * @return hasBodyFlag
    **/
    @JsonProperty("has_body_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public HasBodyFlagEnum getHasBodyFlag() {
        return hasBodyFlag;
    }

    /**
     * Set hasBodyFlag
     **/
    public void setHasBodyFlag(HasBodyFlagEnum hasBodyFlag) {
        this.hasBodyFlag = hasBodyFlag;
    }

    public MailMessageData hasBodyFlag(HasBodyFlagEnum hasBodyFlag) {
        this.hasBodyFlag = hasBodyFlag;
        return this;
    }

    /**
    * Get sentFlag
    * @return sentFlag
    **/
    @JsonProperty("sent_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SentFlagEnum getSentFlag() {
        return sentFlag;
    }

    /**
     * Set sentFlag
     **/
    public void setSentFlag(SentFlagEnum sentFlag) {
        this.sentFlag = sentFlag;
    }

    public MailMessageData sentFlag(SentFlagEnum sentFlag) {
        this.sentFlag = sentFlag;
        return this;
    }

    /**
    * Get sentFromPipedriveFlag
    * @return sentFromPipedriveFlag
    **/
    @JsonProperty("sent_from_pipedrive_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SentFromPipedriveFlagEnum getSentFromPipedriveFlag() {
        return sentFromPipedriveFlag;
    }

    /**
     * Set sentFromPipedriveFlag
     **/
    public void setSentFromPipedriveFlag(SentFromPipedriveFlagEnum sentFromPipedriveFlag) {
        this.sentFromPipedriveFlag = sentFromPipedriveFlag;
    }

    public MailMessageData sentFromPipedriveFlag(SentFromPipedriveFlagEnum sentFromPipedriveFlag) {
        this.sentFromPipedriveFlag = sentFromPipedriveFlag;
        return this;
    }

    /**
    * Get smartBccFlag
    * @return smartBccFlag
    **/
    @JsonProperty("smart_bcc_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SmartBccFlagEnum getSmartBccFlag() {
        return smartBccFlag;
    }

    /**
     * Set smartBccFlag
     **/
    public void setSmartBccFlag(SmartBccFlagEnum smartBccFlag) {
        this.smartBccFlag = smartBccFlag;
    }

    public MailMessageData smartBccFlag(SmartBccFlagEnum smartBccFlag) {
        this.smartBccFlag = smartBccFlag;
        return this;
    }

    /**
    * Creation or receival time of the mail message
    * @return messageTime
    **/
    @JsonProperty("message_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OffsetDateTime getMessageTime() {
        return messageTime;
    }

    /**
     * Set messageTime
     **/
    public void setMessageTime(OffsetDateTime messageTime) {
        this.messageTime = messageTime;
    }

    public MailMessageData messageTime(OffsetDateTime messageTime) {
        this.messageTime = messageTime;
        return this;
    }

    /**
    * The insertion into the database time of the mail message
    * @return addTime
    **/
    @JsonProperty("add_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OffsetDateTime getAddTime() {
        return addTime;
    }

    /**
     * Set addTime
     **/
    public void setAddTime(OffsetDateTime addTime) {
        this.addTime = addTime;
    }

    public MailMessageData addTime(OffsetDateTime addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The updating time in the database of the mail message
    * @return updateTime
    **/
    @JsonProperty("update_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * Set updateTime
     **/
    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public MailMessageData updateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
    * Get hasAttachmentsFlag
    * @return hasAttachmentsFlag
    **/
    @JsonProperty("has_attachments_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public HasAttachmentsFlagEnum getHasAttachmentsFlag() {
        return hasAttachmentsFlag;
    }

    /**
     * Set hasAttachmentsFlag
     **/
    public void setHasAttachmentsFlag(HasAttachmentsFlagEnum hasAttachmentsFlag) {
        this.hasAttachmentsFlag = hasAttachmentsFlag;
    }

    public MailMessageData hasAttachmentsFlag(HasAttachmentsFlagEnum hasAttachmentsFlag) {
        this.hasAttachmentsFlag = hasAttachmentsFlag;
        return this;
    }

    /**
    * Get hasInlineAttachmentsFlag
    * @return hasInlineAttachmentsFlag
    **/
    @JsonProperty("has_inline_attachments_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public HasInlineAttachmentsFlagEnum getHasInlineAttachmentsFlag() {
        return hasInlineAttachmentsFlag;
    }

    /**
     * Set hasInlineAttachmentsFlag
     **/
    public void setHasInlineAttachmentsFlag(HasInlineAttachmentsFlagEnum hasInlineAttachmentsFlag) {
        this.hasInlineAttachmentsFlag = hasInlineAttachmentsFlag;
    }

    public MailMessageData hasInlineAttachmentsFlag(HasInlineAttachmentsFlagEnum hasInlineAttachmentsFlag) {
        this.hasInlineAttachmentsFlag = hasInlineAttachmentsFlag;
        return this;
    }

    /**
    * Get hasRealAttachmentsFlag
    * @return hasRealAttachmentsFlag
    **/
    @JsonProperty("has_real_attachments_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public HasRealAttachmentsFlagEnum getHasRealAttachmentsFlag() {
        return hasRealAttachmentsFlag;
    }

    /**
     * Set hasRealAttachmentsFlag
     **/
    public void setHasRealAttachmentsFlag(HasRealAttachmentsFlagEnum hasRealAttachmentsFlag) {
        this.hasRealAttachmentsFlag = hasRealAttachmentsFlag;
    }

    public MailMessageData hasRealAttachmentsFlag(HasRealAttachmentsFlagEnum hasRealAttachmentsFlag) {
        this.hasRealAttachmentsFlag = hasRealAttachmentsFlag;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MailMessageData {\n");

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
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code MailMessageData} object that
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

        MailMessageData model = (MailMessageData) obj;

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
        java.util.Objects.equals(hasRealAttachmentsFlag, model.hasRealAttachmentsFlag);
    }

    /**
     * Returns a hash code for a {@code MailMessageData}.
     *
     * @return a hash code value for a {@code MailMessageData}.
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
        hasRealAttachmentsFlag);
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MailMessageDataQueryParam  {

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

        @JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
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

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
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

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
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

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
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

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
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

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
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

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
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

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
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

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
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

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
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

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
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

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
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

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
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
        * ID of the mail message.
        * @return id
        **/
        @JsonProperty("id")
        public Integer getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(Integer id) {
            this.id = id;
        }

        public MailMessageDataQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The array of mail message sender (object)
        * @return from
        **/
        @JsonProperty("from")
        public List<MailMessageDataFromInner> getFrom() {
            return from;
        }

        /**
         * Set from
         **/
        public void setFrom(List<MailMessageDataFromInner> from) {
            this.from = from;
        }

        public MailMessageDataQueryParam from(List<MailMessageDataFromInner> from) {
            this.from = from;
            return this;
        }
        public MailMessageDataQueryParam addFromItem(MailMessageDataFromInner fromItem) {
            this.from.add(fromItem);
            return this;
        }

        /**
        * The array of mail message receiver (object)
        * @return to
        **/
        @JsonProperty("to")
        public List<MailMessageDataFromInner> getTo() {
            return to;
        }

        /**
         * Set to
         **/
        public void setTo(List<MailMessageDataFromInner> to) {
            this.to = to;
        }

        public MailMessageDataQueryParam to(List<MailMessageDataFromInner> to) {
            this.to = to;
            return this;
        }
        public MailMessageDataQueryParam addToItem(MailMessageDataFromInner toItem) {
            this.to.add(toItem);
            return this;
        }

        /**
        * The array of mail message copies (object)
        * @return cc
        **/
        @JsonProperty("cc")
        public List<MailMessageDataFromInner> getCc() {
            return cc;
        }

        /**
         * Set cc
         **/
        public void setCc(List<MailMessageDataFromInner> cc) {
            this.cc = cc;
        }

        public MailMessageDataQueryParam cc(List<MailMessageDataFromInner> cc) {
            this.cc = cc;
            return this;
        }
        public MailMessageDataQueryParam addCcItem(MailMessageDataFromInner ccItem) {
            this.cc.add(ccItem);
            return this;
        }

        /**
        * The array of mail message blind copies (object)
        * @return bcc
        **/
        @JsonProperty("bcc")
        public List<MailMessageDataFromInner> getBcc() {
            return bcc;
        }

        /**
         * Set bcc
         **/
        public void setBcc(List<MailMessageDataFromInner> bcc) {
            this.bcc = bcc;
        }

        public MailMessageDataQueryParam bcc(List<MailMessageDataFromInner> bcc) {
            this.bcc = bcc;
            return this;
        }
        public MailMessageDataQueryParam addBccItem(MailMessageDataFromInner bccItem) {
            this.bcc.add(bccItem);
            return this;
        }

        /**
        * The mail message body URL
        * @return bodyUrl
        **/
        @JsonProperty("body_url")
        public String getBodyUrl() {
            return bodyUrl;
        }

        /**
         * Set bodyUrl
         **/
        public void setBodyUrl(String bodyUrl) {
            this.bodyUrl = bodyUrl;
        }

        public MailMessageDataQueryParam bodyUrl(String bodyUrl) {
            this.bodyUrl = bodyUrl;
            return this;
        }

        /**
        * The connection account ID
        * @return accountId
        **/
        @JsonProperty("account_id")
        public String getAccountId() {
            return accountId;
        }

        /**
         * Set accountId
         **/
        public void setAccountId(String accountId) {
            this.accountId = accountId;
        }

        public MailMessageDataQueryParam accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
        * ID of the user whom mail message will be assigned to
        * @return userId
        **/
        @JsonProperty("user_id")
        public Integer getUserId() {
            return userId;
        }

        /**
         * Set userId
         **/
        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public MailMessageDataQueryParam userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        /**
        * ID of the mail message thread
        * @return mailThreadId
        **/
        @JsonProperty("mail_thread_id")
        public Integer getMailThreadId() {
            return mailThreadId;
        }

        /**
         * Set mailThreadId
         **/
        public void setMailThreadId(Integer mailThreadId) {
            this.mailThreadId = mailThreadId;
        }

        public MailMessageDataQueryParam mailThreadId(Integer mailThreadId) {
            this.mailThreadId = mailThreadId;
            return this;
        }

        /**
        * The subject of mail message
        * @return subject
        **/
        @JsonProperty("subject")
        public String getSubject() {
            return subject;
        }

        /**
         * Set subject
         **/
        public void setSubject(String subject) {
            this.subject = subject;
        }

        public MailMessageDataQueryParam subject(String subject) {
            this.subject = subject;
            return this;
        }

        /**
        * The snippet of mail message. Snippet length is up to 225 characters.
        * @return snippet
        **/
        @JsonProperty("snippet")
        public String getSnippet() {
            return snippet;
        }

        /**
         * Set snippet
         **/
        public void setSnippet(String snippet) {
            this.snippet = snippet;
        }

        public MailMessageDataQueryParam snippet(String snippet) {
            this.snippet = snippet;
            return this;
        }

        /**
        * The status of tracking mail message. Value is `null` if tracking is not enabled.
        * @return mailTrackingStatus
        **/
        @JsonProperty("mail_tracking_status")
        public MailTrackingStatusEnum getMailTrackingStatus() {
            return mailTrackingStatus;
        }

        /**
         * Set mailTrackingStatus
         **/
        public void setMailTrackingStatus(MailTrackingStatusEnum mailTrackingStatus) {
            this.mailTrackingStatus = mailTrackingStatus;
        }

        public MailMessageDataQueryParam mailTrackingStatus(MailTrackingStatusEnum mailTrackingStatus) {
            this.mailTrackingStatus = mailTrackingStatus;
            return this;
        }

        /**
        * Get mailLinkTrackingEnabledFlag
        * @return mailLinkTrackingEnabledFlag
        **/
        @JsonProperty("mail_link_tracking_enabled_flag")
        public MailLinkTrackingEnabledFlagEnum getMailLinkTrackingEnabledFlag() {
            return mailLinkTrackingEnabledFlag;
        }

        /**
         * Set mailLinkTrackingEnabledFlag
         **/
        public void setMailLinkTrackingEnabledFlag(MailLinkTrackingEnabledFlagEnum mailLinkTrackingEnabledFlag) {
            this.mailLinkTrackingEnabledFlag = mailLinkTrackingEnabledFlag;
        }

        public MailMessageDataQueryParam mailLinkTrackingEnabledFlag(MailLinkTrackingEnabledFlagEnum mailLinkTrackingEnabledFlag) {
            this.mailLinkTrackingEnabledFlag = mailLinkTrackingEnabledFlag;
            return this;
        }

        /**
        * Get readFlag
        * @return readFlag
        **/
        @JsonProperty("read_flag")
        public ReadFlagEnum getReadFlag() {
            return readFlag;
        }

        /**
         * Set readFlag
         **/
        public void setReadFlag(ReadFlagEnum readFlag) {
            this.readFlag = readFlag;
        }

        public MailMessageDataQueryParam readFlag(ReadFlagEnum readFlag) {
            this.readFlag = readFlag;
            return this;
        }

        /**
        * If the mail message has a draft status then the value is the mail message object as JSON formatted string, otherwise `null`.
        * @return draft
        **/
        @JsonProperty("draft")
        public String getDraft() {
            return draft;
        }

        /**
         * Set draft
         **/
        public void setDraft(String draft) {
            this.draft = draft;
        }

        public MailMessageDataQueryParam draft(String draft) {
            this.draft = draft;
            return this;
        }

        /**
        * Get draftFlag
        * @return draftFlag
        **/
        @JsonProperty("draft_flag")
        public DraftFlagEnum getDraftFlag() {
            return draftFlag;
        }

        /**
         * Set draftFlag
         **/
        public void setDraftFlag(DraftFlagEnum draftFlag) {
            this.draftFlag = draftFlag;
        }

        public MailMessageDataQueryParam draftFlag(DraftFlagEnum draftFlag) {
            this.draftFlag = draftFlag;
            return this;
        }

        /**
        * Get syncedFlag
        * @return syncedFlag
        **/
        @JsonProperty("synced_flag")
        public SyncedFlagEnum getSyncedFlag() {
            return syncedFlag;
        }

        /**
         * Set syncedFlag
         **/
        public void setSyncedFlag(SyncedFlagEnum syncedFlag) {
            this.syncedFlag = syncedFlag;
        }

        public MailMessageDataQueryParam syncedFlag(SyncedFlagEnum syncedFlag) {
            this.syncedFlag = syncedFlag;
            return this;
        }

        /**
        * Get deletedFlag
        * @return deletedFlag
        **/
        @JsonProperty("deleted_flag")
        public DeletedFlagEnum getDeletedFlag() {
            return deletedFlag;
        }

        /**
         * Set deletedFlag
         **/
        public void setDeletedFlag(DeletedFlagEnum deletedFlag) {
            this.deletedFlag = deletedFlag;
        }

        public MailMessageDataQueryParam deletedFlag(DeletedFlagEnum deletedFlag) {
            this.deletedFlag = deletedFlag;
            return this;
        }

        /**
        * Get hasBodyFlag
        * @return hasBodyFlag
        **/
        @JsonProperty("has_body_flag")
        public HasBodyFlagEnum getHasBodyFlag() {
            return hasBodyFlag;
        }

        /**
         * Set hasBodyFlag
         **/
        public void setHasBodyFlag(HasBodyFlagEnum hasBodyFlag) {
            this.hasBodyFlag = hasBodyFlag;
        }

        public MailMessageDataQueryParam hasBodyFlag(HasBodyFlagEnum hasBodyFlag) {
            this.hasBodyFlag = hasBodyFlag;
            return this;
        }

        /**
        * Get sentFlag
        * @return sentFlag
        **/
        @JsonProperty("sent_flag")
        public SentFlagEnum getSentFlag() {
            return sentFlag;
        }

        /**
         * Set sentFlag
         **/
        public void setSentFlag(SentFlagEnum sentFlag) {
            this.sentFlag = sentFlag;
        }

        public MailMessageDataQueryParam sentFlag(SentFlagEnum sentFlag) {
            this.sentFlag = sentFlag;
            return this;
        }

        /**
        * Get sentFromPipedriveFlag
        * @return sentFromPipedriveFlag
        **/
        @JsonProperty("sent_from_pipedrive_flag")
        public SentFromPipedriveFlagEnum getSentFromPipedriveFlag() {
            return sentFromPipedriveFlag;
        }

        /**
         * Set sentFromPipedriveFlag
         **/
        public void setSentFromPipedriveFlag(SentFromPipedriveFlagEnum sentFromPipedriveFlag) {
            this.sentFromPipedriveFlag = sentFromPipedriveFlag;
        }

        public MailMessageDataQueryParam sentFromPipedriveFlag(SentFromPipedriveFlagEnum sentFromPipedriveFlag) {
            this.sentFromPipedriveFlag = sentFromPipedriveFlag;
            return this;
        }

        /**
        * Get smartBccFlag
        * @return smartBccFlag
        **/
        @JsonProperty("smart_bcc_flag")
        public SmartBccFlagEnum getSmartBccFlag() {
            return smartBccFlag;
        }

        /**
         * Set smartBccFlag
         **/
        public void setSmartBccFlag(SmartBccFlagEnum smartBccFlag) {
            this.smartBccFlag = smartBccFlag;
        }

        public MailMessageDataQueryParam smartBccFlag(SmartBccFlagEnum smartBccFlag) {
            this.smartBccFlag = smartBccFlag;
            return this;
        }

        /**
        * Creation or receival time of the mail message
        * @return messageTime
        **/
        @JsonProperty("message_time")
        public OffsetDateTime getMessageTime() {
            return messageTime;
        }

        /**
         * Set messageTime
         **/
        public void setMessageTime(OffsetDateTime messageTime) {
            this.messageTime = messageTime;
        }

        public MailMessageDataQueryParam messageTime(OffsetDateTime messageTime) {
            this.messageTime = messageTime;
            return this;
        }

        /**
        * The insertion into the database time of the mail message
        * @return addTime
        **/
        @JsonProperty("add_time")
        public OffsetDateTime getAddTime() {
            return addTime;
        }

        /**
         * Set addTime
         **/
        public void setAddTime(OffsetDateTime addTime) {
            this.addTime = addTime;
        }

        public MailMessageDataQueryParam addTime(OffsetDateTime addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The updating time in the database of the mail message
        * @return updateTime
        **/
        @JsonProperty("update_time")
        public OffsetDateTime getUpdateTime() {
            return updateTime;
        }

        /**
         * Set updateTime
         **/
        public void setUpdateTime(OffsetDateTime updateTime) {
            this.updateTime = updateTime;
        }

        public MailMessageDataQueryParam updateTime(OffsetDateTime updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
        * Get hasAttachmentsFlag
        * @return hasAttachmentsFlag
        **/
        @JsonProperty("has_attachments_flag")
        public HasAttachmentsFlagEnum getHasAttachmentsFlag() {
            return hasAttachmentsFlag;
        }

        /**
         * Set hasAttachmentsFlag
         **/
        public void setHasAttachmentsFlag(HasAttachmentsFlagEnum hasAttachmentsFlag) {
            this.hasAttachmentsFlag = hasAttachmentsFlag;
        }

        public MailMessageDataQueryParam hasAttachmentsFlag(HasAttachmentsFlagEnum hasAttachmentsFlag) {
            this.hasAttachmentsFlag = hasAttachmentsFlag;
            return this;
        }

        /**
        * Get hasInlineAttachmentsFlag
        * @return hasInlineAttachmentsFlag
        **/
        @JsonProperty("has_inline_attachments_flag")
        public HasInlineAttachmentsFlagEnum getHasInlineAttachmentsFlag() {
            return hasInlineAttachmentsFlag;
        }

        /**
         * Set hasInlineAttachmentsFlag
         **/
        public void setHasInlineAttachmentsFlag(HasInlineAttachmentsFlagEnum hasInlineAttachmentsFlag) {
            this.hasInlineAttachmentsFlag = hasInlineAttachmentsFlag;
        }

        public MailMessageDataQueryParam hasInlineAttachmentsFlag(HasInlineAttachmentsFlagEnum hasInlineAttachmentsFlag) {
            this.hasInlineAttachmentsFlag = hasInlineAttachmentsFlag;
            return this;
        }

        /**
        * Get hasRealAttachmentsFlag
        * @return hasRealAttachmentsFlag
        **/
        @JsonProperty("has_real_attachments_flag")
        public HasRealAttachmentsFlagEnum getHasRealAttachmentsFlag() {
            return hasRealAttachmentsFlag;
        }

        /**
         * Set hasRealAttachmentsFlag
         **/
        public void setHasRealAttachmentsFlag(HasRealAttachmentsFlagEnum hasRealAttachmentsFlag) {
            this.hasRealAttachmentsFlag = hasRealAttachmentsFlag;
        }

        public MailMessageDataQueryParam hasRealAttachmentsFlag(HasRealAttachmentsFlagEnum hasRealAttachmentsFlag) {
            this.hasRealAttachmentsFlag = hasRealAttachmentsFlag;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MailMessageDataQueryParam {\n");

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
