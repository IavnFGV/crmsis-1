package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.AddActivityResponseRelatedObjectsPerson;
import dti.crmsis.back.clients.openapi.v1.model.GetActivitiesResponseRelatedObjectsUser;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class AddParticipantsResponseRelatedObjects  {

    private GetActivitiesResponseRelatedObjectsUser user;
    private AddActivityResponseRelatedObjectsPerson person;

    /**
    * Get user
    * @return user
    **/
    @JsonProperty("user")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetActivitiesResponseRelatedObjectsUser getUser() {
        return user;
    }

    /**
     * Set user
     **/
    public void setUser(GetActivitiesResponseRelatedObjectsUser user) {
        this.user = user;
    }

    public AddParticipantsResponseRelatedObjects user(GetActivitiesResponseRelatedObjectsUser user) {
        this.user = user;
        return this;
    }

    /**
    * Get person
    * @return person
    **/
    @JsonProperty("person")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public AddActivityResponseRelatedObjectsPerson getPerson() {
        return person;
    }

    /**
     * Set person
     **/
    public void setPerson(AddActivityResponseRelatedObjectsPerson person) {
        this.person = person;
    }

    public AddParticipantsResponseRelatedObjects person(AddActivityResponseRelatedObjectsPerson person) {
        this.person = person;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddParticipantsResponseRelatedObjects {\n");

        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    person: ").append(toIndentedString(person)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddParticipantsResponseRelatedObjects} object that
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

        AddParticipantsResponseRelatedObjects model = (AddParticipantsResponseRelatedObjects) obj;

        return java.util.Objects.equals(user, model.user) &&
        java.util.Objects.equals(person, model.person);
    }

    /**
     * Returns a hash code for a {@code AddParticipantsResponseRelatedObjects}.
     *
     * @return a hash code value for a {@code AddParticipantsResponseRelatedObjects}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(user,
        person);
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
    public static class AddParticipantsResponseRelatedObjectsQueryParam  {

        @jakarta.ws.rs.QueryParam("user")
        private GetActivitiesResponseRelatedObjectsUser user;
        @jakarta.ws.rs.QueryParam("person")
        private AddActivityResponseRelatedObjectsPerson person;

        /**
        * Get user
        * @return user
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("user")
        public GetActivitiesResponseRelatedObjectsUser getUser() {
            return user;
        }

        /**
         * Set user
         **/
        public void setUser(GetActivitiesResponseRelatedObjectsUser user) {
            this.user = user;
        }

        public AddParticipantsResponseRelatedObjectsQueryParam user(GetActivitiesResponseRelatedObjectsUser user) {
            this.user = user;
            return this;
        }

        /**
        * Get person
        * @return person
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("person")
        public AddActivityResponseRelatedObjectsPerson getPerson() {
            return person;
        }

        /**
         * Set person
         **/
        public void setPerson(AddActivityResponseRelatedObjectsPerson person) {
            this.person = person;
        }

        public AddParticipantsResponseRelatedObjectsQueryParam person(AddActivityResponseRelatedObjectsPerson person) {
            this.person = person;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddParticipantsResponseRelatedObjectsQueryParam {\n");

            sb.append("    user: ").append(toIndentedString(user)).append("\n");
            sb.append("    person: ").append(toIndentedString(person)).append("\n");
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
