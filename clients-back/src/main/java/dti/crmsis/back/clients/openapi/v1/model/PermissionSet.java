package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PermissionSet  {

    /**
      * The ID of user permission set
     **/
    private String id;
    /**
      * The name of the permission set
     **/
    private String name;
    /**
      * The description of the permission set
     **/
    private String description;

    public enum AppEnum {
        SALES(String.valueOf("sales")), PROJECTS(String.valueOf("projects")), CAMPAIGNS(String.valueOf("campaigns")), GLOBAL(String.valueOf("global")), ACCOUNT_SETTINGS(String.valueOf("account_settings"));

        // caching enum access
        private static final java.util.EnumSet<AppEnum> values = java.util.EnumSet.allOf(AppEnum.class);

        String value;

        AppEnum (String v) {
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
        public static AppEnum fromString(String v) {
            for (AppEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    /**
      * The app that permission set belongs to
     **/
    private AppEnum app;

    public enum TypeEnum {
        ADMIN(String.valueOf("admin")), MANAGER(String.valueOf("manager")), REGULAR(String.valueOf("regular")), CUSTOM(String.valueOf("custom"));

        // caching enum access
        private static final java.util.EnumSet<TypeEnum> values = java.util.EnumSet.allOf(TypeEnum.class);

        String value;

        TypeEnum (String v) {
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
        public static TypeEnum fromString(String v) {
            for (TypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    /**
      * The type of permission set
     **/
    private TypeEnum type;
    /**
      * The number of users assigned to this permission set
     **/
    private Integer assignmentCount;

    /**
    * The ID of user permission set
    * @return id
    **/
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(String id) {
        this.id = id;
    }

    public PermissionSet id(String id) {
        this.id = id;
        return this;
    }

    /**
    * The name of the permission set
    * @return name
    **/
    @JsonProperty("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public PermissionSet name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The description of the permission set
    * @return description
    **/
    @JsonProperty("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Set description
     **/
    public void setDescription(String description) {
        this.description = description;
    }

    public PermissionSet description(String description) {
        this.description = description;
        return this;
    }

    /**
    * The app that permission set belongs to
    * @return app
    **/
    @JsonProperty("app")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AppEnum getApp() {
        return app;
    }

    /**
     * Set app
     **/
    public void setApp(AppEnum app) {
        this.app = app;
    }

    public PermissionSet app(AppEnum app) {
        this.app = app;
        return this;
    }

    /**
    * The type of permission set
    * @return type
    **/
    @JsonProperty("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TypeEnum getType() {
        return type;
    }

    /**
     * Set type
     **/
    public void setType(TypeEnum type) {
        this.type = type;
    }

    public PermissionSet type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
    * The number of users assigned to this permission set
    * @return assignmentCount
    **/
    @JsonProperty("assignment_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAssignmentCount() {
        return assignmentCount;
    }

    /**
     * Set assignmentCount
     **/
    public void setAssignmentCount(Integer assignmentCount) {
        this.assignmentCount = assignmentCount;
    }

    public PermissionSet assignmentCount(Integer assignmentCount) {
        this.assignmentCount = assignmentCount;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionSet {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    assignmentCount: ").append(toIndentedString(assignmentCount)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code PermissionSet} object that
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

        PermissionSet model = (PermissionSet) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(description, model.description) &&
        java.util.Objects.equals(app, model.app) &&
        java.util.Objects.equals(type, model.type) &&
        java.util.Objects.equals(assignmentCount, model.assignmentCount);
    }

    /**
     * Returns a hash code for a {@code PermissionSet}.
     *
     * @return a hash code value for a {@code PermissionSet}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        name,
        description,
        app,
        type,
        assignmentCount);
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
    public static class PermissionSetQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private String id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("description")
        private String description;

    public enum AppEnum {
        SALES(String.valueOf("sales")), PROJECTS(String.valueOf("projects")), CAMPAIGNS(String.valueOf("campaigns")), GLOBAL(String.valueOf("global")), ACCOUNT_SETTINGS(String.valueOf("account_settings"));

        // caching enum access
        private static final java.util.EnumSet<AppEnum> values = java.util.EnumSet.allOf(AppEnum.class);

        String value;

        AppEnum (String v) {
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
        public static AppEnum fromString(String v) {
            for (AppEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private AppEnum app;

    public enum TypeEnum {
        ADMIN(String.valueOf("admin")), MANAGER(String.valueOf("manager")), REGULAR(String.valueOf("regular")), CUSTOM(String.valueOf("custom"));

        // caching enum access
        private static final java.util.EnumSet<TypeEnum> values = java.util.EnumSet.allOf(TypeEnum.class);

        String value;

        TypeEnum (String v) {
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
        public static TypeEnum fromString(String v) {
            for (TypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private TypeEnum type;
        @jakarta.ws.rs.QueryParam("assignmentCount")
        private Integer assignmentCount;

        /**
        * The ID of user permission set
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

        public PermissionSetQueryParam id(String id) {
            this.id = id;
            return this;
        }

        /**
        * The name of the permission set
        * @return name
        **/
        @JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public PermissionSetQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The description of the permission set
        * @return description
        **/
        @JsonProperty("description")
        public String getDescription() {
            return description;
        }

        /**
         * Set description
         **/
        public void setDescription(String description) {
            this.description = description;
        }

        public PermissionSetQueryParam description(String description) {
            this.description = description;
            return this;
        }

        /**
        * The app that permission set belongs to
        * @return app
        **/
        @JsonProperty("app")
        public AppEnum getApp() {
            return app;
        }

        /**
         * Set app
         **/
        public void setApp(AppEnum app) {
            this.app = app;
        }

        public PermissionSetQueryParam app(AppEnum app) {
            this.app = app;
            return this;
        }

        /**
        * The type of permission set
        * @return type
        **/
        @JsonProperty("type")
        public TypeEnum getType() {
            return type;
        }

        /**
         * Set type
         **/
        public void setType(TypeEnum type) {
            this.type = type;
        }

        public PermissionSetQueryParam type(TypeEnum type) {
            this.type = type;
            return this;
        }

        /**
        * The number of users assigned to this permission set
        * @return assignmentCount
        **/
        @JsonProperty("assignment_count")
        public Integer getAssignmentCount() {
            return assignmentCount;
        }

        /**
         * Set assignmentCount
         **/
        public void setAssignmentCount(Integer assignmentCount) {
            this.assignmentCount = assignmentCount;
        }

        public PermissionSetQueryParam assignmentCount(Integer assignmentCount) {
            this.assignmentCount = assignmentCount;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PermissionSetQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    app: ").append(toIndentedString(app)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    assignmentCount: ").append(toIndentedString(assignmentCount)).append("\n");
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
