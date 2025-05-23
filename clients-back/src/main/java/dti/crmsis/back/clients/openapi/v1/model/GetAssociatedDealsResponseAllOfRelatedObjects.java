package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.AddActivityResponseRelatedObjectsPerson;
import dti.crmsis.back.clients.openapi.v1.model.BasePipeline;
import dti.crmsis.back.clients.openapi.v1.model.BaseStage;
import dti.crmsis.back.clients.openapi.v1.model.GetActivitiesResponseRelatedObjectsUser;
import dti.crmsis.back.clients.openapi.v1.model.RelatedOrganizationDataWithActiveFlag;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetAssociatedDealsResponseAllOfRelatedObjects  {

    private RelatedOrganizationDataWithActiveFlag organization;
    private AddActivityResponseRelatedObjectsPerson person;
    private GetActivitiesResponseRelatedObjectsUser user;
    private BaseStage stage;
    private BasePipeline pipeline;

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

    public GetAssociatedDealsResponseAllOfRelatedObjects organization(RelatedOrganizationDataWithActiveFlag organization) {
        this.organization = organization;
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

    public GetAssociatedDealsResponseAllOfRelatedObjects person(AddActivityResponseRelatedObjectsPerson person) {
        this.person = person;
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

    public GetAssociatedDealsResponseAllOfRelatedObjects user(GetActivitiesResponseRelatedObjectsUser user) {
        this.user = user;
        return this;
    }

    /**
    * Get stage
    * @return stage
    **/
    @JsonProperty("stage")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BaseStage getStage() {
        return stage;
    }

    /**
     * Set stage
     **/
    public void setStage(BaseStage stage) {
        this.stage = stage;
    }

    public GetAssociatedDealsResponseAllOfRelatedObjects stage(BaseStage stage) {
        this.stage = stage;
        return this;
    }

    /**
    * Get pipeline
    * @return pipeline
    **/
    @JsonProperty("pipeline")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BasePipeline getPipeline() {
        return pipeline;
    }

    /**
     * Set pipeline
     **/
    public void setPipeline(BasePipeline pipeline) {
        this.pipeline = pipeline;
    }

    public GetAssociatedDealsResponseAllOfRelatedObjects pipeline(BasePipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAssociatedDealsResponseAllOfRelatedObjects {\n");

        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    person: ").append(toIndentedString(person)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
        sb.append("    pipeline: ").append(toIndentedString(pipeline)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetAssociatedDealsResponseAllOfRelatedObjects} object that
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

        GetAssociatedDealsResponseAllOfRelatedObjects model = (GetAssociatedDealsResponseAllOfRelatedObjects) obj;

        return java.util.Objects.equals(organization, model.organization) &&
        java.util.Objects.equals(person, model.person) &&
        java.util.Objects.equals(user, model.user) &&
        java.util.Objects.equals(stage, model.stage) &&
        java.util.Objects.equals(pipeline, model.pipeline);
    }

    /**
     * Returns a hash code for a {@code GetAssociatedDealsResponseAllOfRelatedObjects}.
     *
     * @return a hash code value for a {@code GetAssociatedDealsResponseAllOfRelatedObjects}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(organization,
        person,
        user,
        stage,
        pipeline);
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
    public static class GetAssociatedDealsResponseAllOfRelatedObjectsQueryParam  {

        @jakarta.ws.rs.QueryParam("organization")
        private RelatedOrganizationDataWithActiveFlag organization;
        @jakarta.ws.rs.QueryParam("person")
        private AddActivityResponseRelatedObjectsPerson person;
        @jakarta.ws.rs.QueryParam("user")
        private GetActivitiesResponseRelatedObjectsUser user;
        @jakarta.ws.rs.QueryParam("stage")
        private BaseStage stage;
        @jakarta.ws.rs.QueryParam("pipeline")
        private BasePipeline pipeline;

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

        public GetAssociatedDealsResponseAllOfRelatedObjectsQueryParam organization(RelatedOrganizationDataWithActiveFlag organization) {
            this.organization = organization;
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

        public GetAssociatedDealsResponseAllOfRelatedObjectsQueryParam person(AddActivityResponseRelatedObjectsPerson person) {
            this.person = person;
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

        public GetAssociatedDealsResponseAllOfRelatedObjectsQueryParam user(GetActivitiesResponseRelatedObjectsUser user) {
            this.user = user;
            return this;
        }

        /**
        * Get stage
        * @return stage
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("stage")
        public BaseStage getStage() {
            return stage;
        }

        /**
         * Set stage
         **/
        public void setStage(BaseStage stage) {
            this.stage = stage;
        }

        public GetAssociatedDealsResponseAllOfRelatedObjectsQueryParam stage(BaseStage stage) {
            this.stage = stage;
            return this;
        }

        /**
        * Get pipeline
        * @return pipeline
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("pipeline")
        public BasePipeline getPipeline() {
            return pipeline;
        }

        /**
         * Set pipeline
         **/
        public void setPipeline(BasePipeline pipeline) {
            this.pipeline = pipeline;
        }

        public GetAssociatedDealsResponseAllOfRelatedObjectsQueryParam pipeline(BasePipeline pipeline) {
            this.pipeline = pipeline;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetAssociatedDealsResponseAllOfRelatedObjectsQueryParam {\n");

            sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
            sb.append("    person: ").append(toIndentedString(person)).append("\n");
            sb.append("    user: ").append(toIndentedString(user)).append("\n");
            sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
            sb.append("    pipeline: ").append(toIndentedString(pipeline)).append("\n");
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
