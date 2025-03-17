package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.AddActivityResponseRelatedObjectsPerson;
import dti.crmsis.back.clients.openapi.v1.model.GetActivitiesResponseRelatedObjectsUser;
import dti.crmsis.back.clients.openapi.v1.model.RelatedDealData;
import dti.crmsis.back.clients.openapi.v1.model.RelatedOrganizationDataWithActiveFlag;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class AddActivityResponseRelatedObjects  {

    private GetActivitiesResponseRelatedObjectsUser user;
    private RelatedDealData deal;
    private AddActivityResponseRelatedObjectsPerson person;
    private RelatedOrganizationDataWithActiveFlag organization;

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

    public AddActivityResponseRelatedObjects user(GetActivitiesResponseRelatedObjectsUser user) {
        this.user = user;
        return this;
    }

    /**
    * Get deal
    * @return deal
    **/
    @JsonProperty("deal")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public RelatedDealData getDeal() {
        return deal;
    }

    /**
     * Set deal
     **/
    public void setDeal(RelatedDealData deal) {
        this.deal = deal;
    }

    public AddActivityResponseRelatedObjects deal(RelatedDealData deal) {
        this.deal = deal;
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

    public AddActivityResponseRelatedObjects person(AddActivityResponseRelatedObjectsPerson person) {
        this.person = person;
        return this;
    }

    /**
    * Get organization
    * @return organization
    **/
    @JsonProperty("organization")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public RelatedOrganizationDataWithActiveFlag getOrganization() {
        return organization;
    }

    /**
     * Set organization
     **/
    public void setOrganization(RelatedOrganizationDataWithActiveFlag organization) {
        this.organization = organization;
    }

    public AddActivityResponseRelatedObjects organization(RelatedOrganizationDataWithActiveFlag organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddActivityResponseRelatedObjects {\n");

        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    deal: ").append(toIndentedString(deal)).append("\n");
        sb.append("    person: ").append(toIndentedString(person)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddActivityResponseRelatedObjects} object that
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

        AddActivityResponseRelatedObjects model = (AddActivityResponseRelatedObjects) obj;

        return java.util.Objects.equals(user, model.user) &&
        java.util.Objects.equals(deal, model.deal) &&
        java.util.Objects.equals(person, model.person) &&
        java.util.Objects.equals(organization, model.organization);
    }

    /**
     * Returns a hash code for a {@code AddActivityResponseRelatedObjects}.
     *
     * @return a hash code value for a {@code AddActivityResponseRelatedObjects}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(user,
        deal,
        person,
        organization);
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
    public static class AddActivityResponseRelatedObjectsQueryParam  {

        @jakarta.ws.rs.QueryParam("user")
        private GetActivitiesResponseRelatedObjectsUser user;
        @jakarta.ws.rs.QueryParam("deal")
        private RelatedDealData deal;
        @jakarta.ws.rs.QueryParam("person")
        private AddActivityResponseRelatedObjectsPerson person;
        @jakarta.ws.rs.QueryParam("organization")
        private RelatedOrganizationDataWithActiveFlag organization;

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

        public AddActivityResponseRelatedObjectsQueryParam user(GetActivitiesResponseRelatedObjectsUser user) {
            this.user = user;
            return this;
        }

        /**
        * Get deal
        * @return deal
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("deal")
        public RelatedDealData getDeal() {
            return deal;
        }

        /**
         * Set deal
         **/
        public void setDeal(RelatedDealData deal) {
            this.deal = deal;
        }

        public AddActivityResponseRelatedObjectsQueryParam deal(RelatedDealData deal) {
            this.deal = deal;
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

        public AddActivityResponseRelatedObjectsQueryParam person(AddActivityResponseRelatedObjectsPerson person) {
            this.person = person;
            return this;
        }

        /**
        * Get organization
        * @return organization
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("organization")
        public RelatedOrganizationDataWithActiveFlag getOrganization() {
            return organization;
        }

        /**
         * Set organization
         **/
        public void setOrganization(RelatedOrganizationDataWithActiveFlag organization) {
            this.organization = organization;
        }

        public AddActivityResponseRelatedObjectsQueryParam organization(RelatedOrganizationDataWithActiveFlag organization) {
            this.organization = organization;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddActivityResponseRelatedObjectsQueryParam {\n");

            sb.append("    user: ").append(toIndentedString(user)).append("\n");
            sb.append("    deal: ").append(toIndentedString(deal)).append("\n");
            sb.append("    person: ").append(toIndentedString(person)).append("\n");
            sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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
