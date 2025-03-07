package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddTeamRequest  {

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

    public AddTeamRequest name(String name) {
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

    public AddTeamRequest description(String description) {
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

    public AddTeamRequest managerId(Integer managerId) {
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

    public AddTeamRequest users(List<Integer> users) {
        this.users = users;
        return this;
    }
    public AddTeamRequest addUsersItem(Integer usersItem) {
        if (this.users == null){
            users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddTeamRequest {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    managerId: ").append(toIndentedString(managerId)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddTeamRequest} object that
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

        AddTeamRequest model = (AddTeamRequest) obj;

        return java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(description, model.description) &&
        java.util.Objects.equals(managerId, model.managerId) &&
        java.util.Objects.equals(users, model.users);
    }

    /**
     * Returns a hash code for a {@code AddTeamRequest}.
     *
     * @return a hash code value for a {@code AddTeamRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,
        description,
        managerId,
        users);
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
    public static class AddTeamRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("description")
        private String description;
        @jakarta.ws.rs.QueryParam("managerId")
        private Integer managerId;
        @jakarta.ws.rs.QueryParam("users")
        private List<Integer> users = null;

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

        public AddTeamRequestQueryParam name(String name) {
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

        public AddTeamRequestQueryParam description(String description) {
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

        public AddTeamRequestQueryParam managerId(Integer managerId) {
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

        public AddTeamRequestQueryParam users(List<Integer> users) {
            this.users = users;
            return this;
        }
        public AddTeamRequestQueryParam addUsersItem(Integer usersItem) {
            this.users.add(usersItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddTeamRequestQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    managerId: ").append(toIndentedString(managerId)).append("\n");
            sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
