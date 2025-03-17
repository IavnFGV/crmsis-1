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

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteTeamUserRequest  {

    /**
      * The list of user IDs
     **/
    private List<Integer> users = new ArrayList<>();

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

    public DeleteTeamUserRequest users(List<Integer> users) {
        this.users = users;
        return this;
    }
    public DeleteTeamUserRequest addUsersItem(Integer usersItem) {
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
        sb.append("class DeleteTeamUserRequest {\n");

        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code DeleteTeamUserRequest} object that
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

        DeleteTeamUserRequest model = (DeleteTeamUserRequest) obj;

        return java.util.Objects.equals(users, model.users);
    }

    /**
     * Returns a hash code for a {@code DeleteTeamUserRequest}.
     *
     * @return a hash code value for a {@code DeleteTeamUserRequest}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(users);
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
    public static class DeleteTeamUserRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("users")
        private List<Integer> users = new ArrayList<>();

        /**
        * The list of user IDs
        * @return users
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("users")
        public List<Integer> getUsers() {
            return users;
        }

        /**
         * Set users
         **/
        public void setUsers(List<Integer> users) {
            this.users = users;
        }

        public DeleteTeamUserRequestQueryParam users(List<Integer> users) {
            this.users = users;
            return this;
        }
        public DeleteTeamUserRequestQueryParam addUsersItem(Integer usersItem) {
            this.users.add(usersItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DeleteTeamUserRequestQueryParam {\n");

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
