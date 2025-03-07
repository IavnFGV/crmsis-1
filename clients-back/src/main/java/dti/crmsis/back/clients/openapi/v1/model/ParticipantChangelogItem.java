package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class ParticipantChangelogItem  {

    /**
      * The ID of the user
     **/
    private Integer actorUserId;
    /**
      * The ID of the person
     **/
    private Integer personId;
    /**
      * Deal participant action type
     **/
    private String action;
    /**
      * The deal participant action log time
     **/
    private String time;

    /**
    * The ID of the user
    * @return actorUserId
    **/
    @JsonProperty("actor_user_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getActorUserId() {
        return actorUserId;
    }

    /**
     * Set actorUserId
     **/
    public void setActorUserId(Integer actorUserId) {
        this.actorUserId = actorUserId;
    }

    public ParticipantChangelogItem actorUserId(Integer actorUserId) {
        this.actorUserId = actorUserId;
        return this;
    }

    /**
    * The ID of the person
    * @return personId
    **/
    @JsonProperty("person_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getPersonId() {
        return personId;
    }

    /**
     * Set personId
     **/
    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public ParticipantChangelogItem personId(Integer personId) {
        this.personId = personId;
        return this;
    }

    /**
    * Deal participant action type
    * @return action
    **/
    @JsonProperty("action")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getAction() {
        return action;
    }

    /**
     * Set action
     **/
    public void setAction(String action) {
        this.action = action;
    }

    public ParticipantChangelogItem action(String action) {
        this.action = action;
        return this;
    }

    /**
    * The deal participant action log time
    * @return time
    **/
    @JsonProperty("time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTime() {
        return time;
    }

    /**
     * Set time
     **/
    public void setTime(String time) {
        this.time = time;
    }

    public ParticipantChangelogItem time(String time) {
        this.time = time;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParticipantChangelogItem {\n");

        sb.append("    actorUserId: ").append(toIndentedString(actorUserId)).append("\n");
        sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code ParticipantChangelogItem} object that
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

        ParticipantChangelogItem model = (ParticipantChangelogItem) obj;

        return java.util.Objects.equals(actorUserId, model.actorUserId) &&
        java.util.Objects.equals(personId, model.personId) &&
        java.util.Objects.equals(action, model.action) &&
        java.util.Objects.equals(time, model.time);
    }

    /**
     * Returns a hash code for a {@code ParticipantChangelogItem}.
     *
     * @return a hash code value for a {@code ParticipantChangelogItem}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(actorUserId,
        personId,
        action,
        time);
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
    public static class ParticipantChangelogItemQueryParam  {

        @jakarta.ws.rs.QueryParam("actorUserId")
        private Integer actorUserId;
        @jakarta.ws.rs.QueryParam("personId")
        private Integer personId;
        @jakarta.ws.rs.QueryParam("action")
        private String action;
        @jakarta.ws.rs.QueryParam("time")
        private String time;

        /**
        * The ID of the user
        * @return actorUserId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("actor_user_id")
        public Integer getActorUserId() {
            return actorUserId;
        }

        /**
         * Set actorUserId
         **/
        public void setActorUserId(Integer actorUserId) {
            this.actorUserId = actorUserId;
        }

        public ParticipantChangelogItemQueryParam actorUserId(Integer actorUserId) {
            this.actorUserId = actorUserId;
            return this;
        }

        /**
        * The ID of the person
        * @return personId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("person_id")
        public Integer getPersonId() {
            return personId;
        }

        /**
         * Set personId
         **/
        public void setPersonId(Integer personId) {
            this.personId = personId;
        }

        public ParticipantChangelogItemQueryParam personId(Integer personId) {
            this.personId = personId;
            return this;
        }

        /**
        * Deal participant action type
        * @return action
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        public String getAction() {
            return action;
        }

        /**
         * Set action
         **/
        public void setAction(String action) {
            this.action = action;
        }

        public ParticipantChangelogItemQueryParam action(String action) {
            this.action = action;
            return this;
        }

        /**
        * The deal participant action log time
        * @return time
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("time")
        public String getTime() {
            return time;
        }

        /**
         * Set time
         **/
        public void setTime(String time) {
            this.time = time;
        }

        public ParticipantChangelogItemQueryParam time(String time) {
            this.time = time;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ParticipantChangelogItemQueryParam {\n");

            sb.append("    actorUserId: ").append(toIndentedString(actorUserId)).append("\n");
            sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
            sb.append("    action: ").append(toIndentedString(action)).append("\n");
            sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
