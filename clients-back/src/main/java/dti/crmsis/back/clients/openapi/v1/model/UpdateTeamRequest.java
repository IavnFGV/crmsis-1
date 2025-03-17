package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateTeamRequest  {

    /**
      * The team name
     **/
    private String name;
    /**
      * The team description
     **/
    private String description;
    /**
      * The team manager ID
     **/
    private Integer managerId;
    /**
      * The list of user IDs
     **/
    private List<Integer> users;

    public enum ActiveFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<ActiveFlagEnum> values = java.util.EnumSet.allOf(ActiveFlagEnum.class);

        BigDecimal value;

        ActiveFlagEnum (BigDecimal v) {
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
        public static ActiveFlagEnum fromString(String v) {
            for (ActiveFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private ActiveFlagEnum activeFlag;

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
    private DeletedFlagEnum deletedFlag;

    /**
    * The team name
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

    public UpdateTeamRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The team description
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

    public UpdateTeamRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
    * The team manager ID
    * @return managerId
    **/
    @JsonProperty("manager_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getManagerId() {
        return managerId;
    }

    /**
     * Set managerId
     **/
    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public UpdateTeamRequest managerId(Integer managerId) {
        this.managerId = managerId;
        return this;
    }

    /**
    * The list of user IDs
    * @return users
    **/
    @JsonProperty("users")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integer> getUsers() {
        return users;
    }

    /**
     * Set users
     **/
    public void setUsers(List<Integer> users) {
        this.users = users;
    }

    public UpdateTeamRequest users(List<Integer> users) {
        this.users = users;
        return this;
    }
    public UpdateTeamRequest addUsersItem(Integer usersItem) {
        if (this.users == null){
            users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    /**
    * Get activeFlag
    * @return activeFlag
    **/
    @JsonProperty("active_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ActiveFlagEnum getActiveFlag() {
        return activeFlag;
    }

    /**
     * Set activeFlag
     **/
    public void setActiveFlag(ActiveFlagEnum activeFlag) {
        this.activeFlag = activeFlag;
    }

    public UpdateTeamRequest activeFlag(ActiveFlagEnum activeFlag) {
        this.activeFlag = activeFlag;
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

    public UpdateTeamRequest deletedFlag(DeletedFlagEnum deletedFlag) {
        this.deletedFlag = deletedFlag;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTeamRequest {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    managerId: ").append(toIndentedString(managerId)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    deletedFlag: ").append(toIndentedString(deletedFlag)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code UpdateTeamRequest} object that
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

        UpdateTeamRequest model = (UpdateTeamRequest) obj;

        return java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(description, model.description) &&
        java.util.Objects.equals(managerId, model.managerId) &&
        java.util.Objects.equals(users, model.users) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(deletedFlag, model.deletedFlag);
    }

    /**
     * Returns a hash code for a {@code UpdateTeamRequest}.
     *
     * @return a hash code value for a {@code UpdateTeamRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,
        description,
        managerId,
        users,
        activeFlag,
        deletedFlag);
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
    public static class UpdateTeamRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("description")
        private String description;
        @jakarta.ws.rs.QueryParam("managerId")
        private Integer managerId;
        @jakarta.ws.rs.QueryParam("users")
        private List<Integer> users = null;

    public enum ActiveFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<ActiveFlagEnum> values = java.util.EnumSet.allOf(ActiveFlagEnum.class);

        BigDecimal value;

        ActiveFlagEnum (BigDecimal v) {
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
        public static ActiveFlagEnum fromString(String v) {
            for (ActiveFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private ActiveFlagEnum activeFlag;

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
        private DeletedFlagEnum deletedFlag;

        /**
        * The team name
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

        public UpdateTeamRequestQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The team description
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

        public UpdateTeamRequestQueryParam description(String description) {
            this.description = description;
            return this;
        }

        /**
        * The team manager ID
        * @return managerId
        **/
        @JsonProperty("manager_id")
        public Integer getManagerId() {
            return managerId;
        }

        /**
         * Set managerId
         **/
        public void setManagerId(Integer managerId) {
            this.managerId = managerId;
        }

        public UpdateTeamRequestQueryParam managerId(Integer managerId) {
            this.managerId = managerId;
            return this;
        }

        /**
        * The list of user IDs
        * @return users
        **/
        @JsonProperty("users")
        public List<Integer> getUsers() {
            return users;
        }

        /**
         * Set users
         **/
        public void setUsers(List<Integer> users) {
            this.users = users;
        }

        public UpdateTeamRequestQueryParam users(List<Integer> users) {
            this.users = users;
            return this;
        }
        public UpdateTeamRequestQueryParam addUsersItem(Integer usersItem) {
            this.users.add(usersItem);
            return this;
        }

        /**
        * Get activeFlag
        * @return activeFlag
        **/
        @JsonProperty("active_flag")
        public ActiveFlagEnum getActiveFlag() {
            return activeFlag;
        }

        /**
         * Set activeFlag
         **/
        public void setActiveFlag(ActiveFlagEnum activeFlag) {
            this.activeFlag = activeFlag;
        }

        public UpdateTeamRequestQueryParam activeFlag(ActiveFlagEnum activeFlag) {
            this.activeFlag = activeFlag;
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

        public UpdateTeamRequestQueryParam deletedFlag(DeletedFlagEnum deletedFlag) {
            this.deletedFlag = deletedFlag;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class UpdateTeamRequestQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    managerId: ").append(toIndentedString(managerId)).append("\n");
            sb.append("    users: ").append(toIndentedString(users)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
            sb.append("    deletedFlag: ").append(toIndentedString(deletedFlag)).append("\n");
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
