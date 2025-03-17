package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class AddOrUpdateRoleSettingRequest  {


    public enum SettingKeyEnum {
        DEAL_DEFAULT_VISIBILITY(String.valueOf("deal_default_visibility")), LEAD_DEFAULT_VISIBILITY(String.valueOf("lead_default_visibility")), ORG_DEFAULT_VISIBILITY(String.valueOf("org_default_visibility")), PERSON_DEFAULT_VISIBILITY(String.valueOf("person_default_visibility")), PRODUCT_DEFAULT_VISIBILITY(String.valueOf("product_default_visibility"));

        // caching enum access
        private static final java.util.EnumSet<SettingKeyEnum> values = java.util.EnumSet.allOf(SettingKeyEnum.class);

        String value;

        SettingKeyEnum (String v) {
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
        public static SettingKeyEnum fromString(String v) {
            for (SettingKeyEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private SettingKeyEnum settingKey;

    public enum ValueEnum {
        NUMBER_1(1), NUMBER_3(3), NUMBER_5(5), NUMBER_7(7);

        // caching enum access
        private static final java.util.EnumSet<ValueEnum> values = java.util.EnumSet.allOf(ValueEnum.class);

        Integer value;

        ValueEnum (Integer v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public Integer value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ValueEnum fromString(String v) {
            for (ValueEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    /**
      * Possible values for the `default_visibility` setting depending on the subscription plan:<br> <table class='role-setting'> <caption><b>Essential / Advanced plan</b></caption> <tr><th><b>Value</b></th><th><b>Description</b></th></tr> <tr><td>`1`</td><td>Owner & Followers</td></tr> <tr><td>`3`</td><td>Entire company</td></tr> </table> <br> <table class='role-setting'> <caption><b>Professional / Enterprise plan</b></caption> <tr><th><b>Value</b></th><th><b>Description</b></th></tr> <tr><td>`1`</td><td>Owner only</td></tr> <tr><td>`3`</td><td>Owner&#39;s visibility group</td></tr> <tr><td>`5`</td><td>Owner&#39;s visibility group and sub-groups</td></tr> <tr><td>`7`</td><td>Entire company</td></tr> </table> <br> Read more about visibility groups <a href='https://support.pipedrive.com/en/article/visibility-groups'>here</a>.
     **/
    private ValueEnum value;

    /**
    * Get settingKey
    * @return settingKey
    **/
    @JsonProperty("setting_key")
    public SettingKeyEnum getSettingKey() {
        return settingKey;
    }

    /**
     * Set settingKey
     **/
    public void setSettingKey(SettingKeyEnum settingKey) {
        this.settingKey = settingKey;
    }

    public AddOrUpdateRoleSettingRequest settingKey(SettingKeyEnum settingKey) {
        this.settingKey = settingKey;
        return this;
    }

    /**
    * Possible values for the `default_visibility` setting depending on the subscription plan:<br> <table class='role-setting'> <caption><b>Essential / Advanced plan</b></caption> <tr><th><b>Value</b></th><th><b>Description</b></th></tr> <tr><td>`1`</td><td>Owner & Followers</td></tr> <tr><td>`3`</td><td>Entire company</td></tr> </table> <br> <table class='role-setting'> <caption><b>Professional / Enterprise plan</b></caption> <tr><th><b>Value</b></th><th><b>Description</b></th></tr> <tr><td>`1`</td><td>Owner only</td></tr> <tr><td>`3`</td><td>Owner&#39;s visibility group</td></tr> <tr><td>`5`</td><td>Owner&#39;s visibility group and sub-groups</td></tr> <tr><td>`7`</td><td>Entire company</td></tr> </table> <br> Read more about visibility groups <a href='https://support.pipedrive.com/en/article/visibility-groups'>here</a>.
    * @return value
    **/
    @JsonProperty("value")
    public ValueEnum getValue() {
        return value;
    }

    /**
     * Set value
     **/
    public void setValue(ValueEnum value) {
        this.value = value;
    }

    public AddOrUpdateRoleSettingRequest value(ValueEnum value) {
        this.value = value;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddOrUpdateRoleSettingRequest {\n");

        sb.append("    settingKey: ").append(toIndentedString(settingKey)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddOrUpdateRoleSettingRequest} object that
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

        AddOrUpdateRoleSettingRequest model = (AddOrUpdateRoleSettingRequest) obj;

        return java.util.Objects.equals(settingKey, model.settingKey) &&
        java.util.Objects.equals(value, model.value);
    }

    /**
     * Returns a hash code for a {@code AddOrUpdateRoleSettingRequest}.
     *
     * @return a hash code value for a {@code AddOrUpdateRoleSettingRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(settingKey,
        value);
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
    public static class AddOrUpdateRoleSettingRequestQueryParam  {


    public enum SettingKeyEnum {
        DEAL_DEFAULT_VISIBILITY(String.valueOf("deal_default_visibility")), LEAD_DEFAULT_VISIBILITY(String.valueOf("lead_default_visibility")), ORG_DEFAULT_VISIBILITY(String.valueOf("org_default_visibility")), PERSON_DEFAULT_VISIBILITY(String.valueOf("person_default_visibility")), PRODUCT_DEFAULT_VISIBILITY(String.valueOf("product_default_visibility"));

        // caching enum access
        private static final java.util.EnumSet<SettingKeyEnum> values = java.util.EnumSet.allOf(SettingKeyEnum.class);

        String value;

        SettingKeyEnum (String v) {
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
        public static SettingKeyEnum fromString(String v) {
            for (SettingKeyEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private SettingKeyEnum settingKey;

    public enum ValueEnum {
        NUMBER_1(1), NUMBER_3(3), NUMBER_5(5), NUMBER_7(7);

        // caching enum access
        private static final java.util.EnumSet<ValueEnum> values = java.util.EnumSet.allOf(ValueEnum.class);

        Integer value;

        ValueEnum (Integer v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public Integer value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ValueEnum fromString(String v) {
            for (ValueEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private ValueEnum value;

        /**
        * Get settingKey
        * @return settingKey
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("setting_key")
        public SettingKeyEnum getSettingKey() {
            return settingKey;
        }

        /**
         * Set settingKey
         **/
        public void setSettingKey(SettingKeyEnum settingKey) {
            this.settingKey = settingKey;
        }

        public AddOrUpdateRoleSettingRequestQueryParam settingKey(SettingKeyEnum settingKey) {
            this.settingKey = settingKey;
            return this;
        }

        /**
        * Possible values for the `default_visibility` setting depending on the subscription plan:<br> <table class='role-setting'> <caption><b>Essential / Advanced plan</b></caption> <tr><th><b>Value</b></th><th><b>Description</b></th></tr> <tr><td>`1`</td><td>Owner & Followers</td></tr> <tr><td>`3`</td><td>Entire company</td></tr> </table> <br> <table class='role-setting'> <caption><b>Professional / Enterprise plan</b></caption> <tr><th><b>Value</b></th><th><b>Description</b></th></tr> <tr><td>`1`</td><td>Owner only</td></tr> <tr><td>`3`</td><td>Owner&#39;s visibility group</td></tr> <tr><td>`5`</td><td>Owner&#39;s visibility group and sub-groups</td></tr> <tr><td>`7`</td><td>Entire company</td></tr> </table> <br> Read more about visibility groups <a href='https://support.pipedrive.com/en/article/visibility-groups'>here</a>.
        * @return value
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        public ValueEnum getValue() {
            return value;
        }

        /**
         * Set value
         **/
        public void setValue(ValueEnum value) {
            this.value = value;
        }

        public AddOrUpdateRoleSettingRequestQueryParam value(ValueEnum value) {
            this.value = value;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddOrUpdateRoleSettingRequestQueryParam {\n");

            sb.append("    settingKey: ").append(toIndentedString(settingKey)).append("\n");
            sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
