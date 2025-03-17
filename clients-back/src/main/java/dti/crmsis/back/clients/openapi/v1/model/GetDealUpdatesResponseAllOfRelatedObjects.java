package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.AddActivityResponseRelatedObjectsPerson;
import dti.crmsis.back.clients.openapi.v1.model.GetActivitiesResponseRelatedObjectsUser;
import dti.crmsis.back.clients.openapi.v1.model.RelatedDealData;
import dti.crmsis.back.clients.openapi.v1.model.RelatedOrganizationData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetDealUpdatesResponseAllOfRelatedObjects  {

    private RelatedDealData deal;
    private RelatedOrganizationData organization;
    private GetActivitiesResponseRelatedObjectsUser user;
    private AddActivityResponseRelatedObjectsPerson person;

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

    public GetDealUpdatesResponseAllOfRelatedObjects deal(RelatedDealData deal) {
        this.deal = deal;
        return this;
    }

    /**
    * Get organization
    * @return organization
    **/
    @JsonProperty("organization")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public RelatedOrganizationData getOrganization() {
        return organization;
    }

    /**
     * Set organization
     **/
    public void setOrganization(RelatedOrganizationData organization) {
        this.organization = organization;
    }

    public GetDealUpdatesResponseAllOfRelatedObjects organization(RelatedOrganizationData organization) {
        this.organization = organization;
        return this;
    }

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

    public GetDealUpdatesResponseAllOfRelatedObjects user(GetActivitiesResponseRelatedObjectsUser user) {
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

    public GetDealUpdatesResponseAllOfRelatedObjects person(AddActivityResponseRelatedObjectsPerson person) {
        this.person = person;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetDealUpdatesResponseAllOfRelatedObjects {\n");

        sb.append("    deal: ").append(toIndentedString(deal)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    person: ").append(toIndentedString(person)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetDealUpdatesResponseAllOfRelatedObjects} object that
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

        GetDealUpdatesResponseAllOfRelatedObjects model = (GetDealUpdatesResponseAllOfRelatedObjects) obj;

        return java.util.Objects.equals(deal, model.deal) &&
        java.util.Objects.equals(organization, model.organization) &&
        java.util.Objects.equals(user, model.user) &&
        java.util.Objects.equals(person, model.person);
    }

    /**
     * Returns a hash code for a {@code GetDealUpdatesResponseAllOfRelatedObjects}.
     *
     * @return a hash code value for a {@code GetDealUpdatesResponseAllOfRelatedObjects}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(deal,
        organization,
        user,
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
    public static class GetDealUpdatesResponseAllOfRelatedObjectsQueryParam  {

        @jakarta.ws.rs.QueryParam("deal")
        private RelatedDealData deal;
        @jakarta.ws.rs.QueryParam("organization")
        private RelatedOrganizationData organization;
        @jakarta.ws.rs.QueryParam("user")
        private GetActivitiesResponseRelatedObjectsUser user;
        @jakarta.ws.rs.QueryParam("person")
        private AddActivityResponseRelatedObjectsPerson person;

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

        public GetDealUpdatesResponseAllOfRelatedObjectsQueryParam deal(RelatedDealData deal) {
            this.deal = deal;
            return this;
        }

        /**
        * Get organization
        * @return organization
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("organization")
        public RelatedOrganizationData getOrganization() {
            return organization;
        }

        /**
         * Set organization
         **/
        public void setOrganization(RelatedOrganizationData organization) {
            this.organization = organization;
        }

        public GetDealUpdatesResponseAllOfRelatedObjectsQueryParam organization(RelatedOrganizationData organization) {
            this.organization = organization;
            return this;
        }

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

        public GetDealUpdatesResponseAllOfRelatedObjectsQueryParam user(GetActivitiesResponseRelatedObjectsUser user) {
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

        public GetDealUpdatesResponseAllOfRelatedObjectsQueryParam person(AddActivityResponseRelatedObjectsPerson person) {
            this.person = person;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetDealUpdatesResponseAllOfRelatedObjectsQueryParam {\n");

            sb.append("    deal: ").append(toIndentedString(deal)).append("\n");
            sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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
