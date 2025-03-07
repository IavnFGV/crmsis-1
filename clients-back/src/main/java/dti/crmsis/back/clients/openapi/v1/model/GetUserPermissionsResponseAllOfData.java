package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetUserPermissionsResponseAllOfData  {

    /**
      * If the user can add custom fields
     **/
    private Boolean canAddCustomFields;
    /**
      * If the user can add products
     **/
    private Boolean canAddProducts;
    /**
      * If the user can add prospects as leads
     **/
    private Boolean canAddProspectsAsLeads;
    /**
      * If the user can bulk edit items
     **/
    private Boolean canBulkEditItems;
    /**
      * If the user can change visibility of items
     **/
    private Boolean canChangeVisibilityOfItems;
    /**
      * If the user can convert deals to leads
     **/
    private Boolean canConvertDealsToLeads;
    /**
      * If the user can create workflows
     **/
    private Boolean canCreateOwnWorkflow;
    /**
      * If the user can delete activities
     **/
    private Boolean canDeleteActivities;
    /**
      * If the user can delete custom fields
     **/
    private Boolean canDeleteCustomFields;
    /**
      * If the user can delete deals
     **/
    private Boolean canDeleteDeals;
    /**
      * If the user can edit custom fields
     **/
    private Boolean canEditCustomFields;
    /**
      * If the user can edit deals' closed date
     **/
    private Boolean canEditDealsClosedDate;
    /**
      * If the user can edit products
     **/
    private Boolean canEditProducts;
    /**
      * If the user can edit shared filters
     **/
    private Boolean canEditSharedFilters;
    /**
      * If the user can export data from item lists
     **/
    private Boolean canExportDataFromLists;
    /**
      * If the user can follow other users
     **/
    private Boolean canFollowOtherUsers;
    /**
      * If the user can merge deals
     **/
    private Boolean canMergeDeals;
    /**
      * If the user can merge organizations
     **/
    private Boolean canMergeOrganizations;
    /**
      * If the user can merge people
     **/
    private Boolean canMergePeople;
    /**
      * If the user can modify labels
     **/
    private Boolean canModifyLabels;
    /**
      * If the user can see company-wide statistics
     **/
    private Boolean canSeeCompanyWideStatistics;
    /**
      * If the user can see the summary on the deals page
     **/
    private Boolean canSeeDealsListSummary;
    /**
      * If the user can see the names of hidden items
     **/
    private Boolean canSeeHiddenItemsNames;
    /**
      * If the user can see other users
     **/
    private Boolean canSeeOtherUsers;
    /**
      * If the user can see other users' statistics
     **/
    private Boolean canSeeOtherUsersStatistics;
    /**
      * If the user can see security dashboard
     **/
    private Boolean canSeeSecurityDashboard;
    /**
      * If the user can share filters
     **/
    private Boolean canShareFilters;
    /**
      * If the user can share insights
     **/
    private Boolean canShareInsights;
    /**
      * If the user can use API
     **/
    private Boolean canUseApi;
    /**
      * If the user can use email tracking
     **/
    private Boolean canUseEmailTracking;
    /**
      * If the user can use import
     **/
    private Boolean canUseImport;

    /**
    * If the user can add custom fields
    * @return canAddCustomFields
    **/
    @JsonProperty("can_add_custom_fields")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanAddCustomFields() {
        return canAddCustomFields;
    }

    /**
     * Set canAddCustomFields
     **/
    public void setCanAddCustomFields(Boolean canAddCustomFields) {
        this.canAddCustomFields = canAddCustomFields;
    }

    public GetUserPermissionsResponseAllOfData canAddCustomFields(Boolean canAddCustomFields) {
        this.canAddCustomFields = canAddCustomFields;
        return this;
    }

    /**
    * If the user can add products
    * @return canAddProducts
    **/
    @JsonProperty("can_add_products")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanAddProducts() {
        return canAddProducts;
    }

    /**
     * Set canAddProducts
     **/
    public void setCanAddProducts(Boolean canAddProducts) {
        this.canAddProducts = canAddProducts;
    }

    public GetUserPermissionsResponseAllOfData canAddProducts(Boolean canAddProducts) {
        this.canAddProducts = canAddProducts;
        return this;
    }

    /**
    * If the user can add prospects as leads
    * @return canAddProspectsAsLeads
    **/
    @JsonProperty("can_add_prospects_as_leads")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanAddProspectsAsLeads() {
        return canAddProspectsAsLeads;
    }

    /**
     * Set canAddProspectsAsLeads
     **/
    public void setCanAddProspectsAsLeads(Boolean canAddProspectsAsLeads) {
        this.canAddProspectsAsLeads = canAddProspectsAsLeads;
    }

    public GetUserPermissionsResponseAllOfData canAddProspectsAsLeads(Boolean canAddProspectsAsLeads) {
        this.canAddProspectsAsLeads = canAddProspectsAsLeads;
        return this;
    }

    /**
    * If the user can bulk edit items
    * @return canBulkEditItems
    **/
    @JsonProperty("can_bulk_edit_items")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanBulkEditItems() {
        return canBulkEditItems;
    }

    /**
     * Set canBulkEditItems
     **/
    public void setCanBulkEditItems(Boolean canBulkEditItems) {
        this.canBulkEditItems = canBulkEditItems;
    }

    public GetUserPermissionsResponseAllOfData canBulkEditItems(Boolean canBulkEditItems) {
        this.canBulkEditItems = canBulkEditItems;
        return this;
    }

    /**
    * If the user can change visibility of items
    * @return canChangeVisibilityOfItems
    **/
    @JsonProperty("can_change_visibility_of_items")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanChangeVisibilityOfItems() {
        return canChangeVisibilityOfItems;
    }

    /**
     * Set canChangeVisibilityOfItems
     **/
    public void setCanChangeVisibilityOfItems(Boolean canChangeVisibilityOfItems) {
        this.canChangeVisibilityOfItems = canChangeVisibilityOfItems;
    }

    public GetUserPermissionsResponseAllOfData canChangeVisibilityOfItems(Boolean canChangeVisibilityOfItems) {
        this.canChangeVisibilityOfItems = canChangeVisibilityOfItems;
        return this;
    }

    /**
    * If the user can convert deals to leads
    * @return canConvertDealsToLeads
    **/
    @JsonProperty("can_convert_deals_to_leads")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanConvertDealsToLeads() {
        return canConvertDealsToLeads;
    }

    /**
     * Set canConvertDealsToLeads
     **/
    public void setCanConvertDealsToLeads(Boolean canConvertDealsToLeads) {
        this.canConvertDealsToLeads = canConvertDealsToLeads;
    }

    public GetUserPermissionsResponseAllOfData canConvertDealsToLeads(Boolean canConvertDealsToLeads) {
        this.canConvertDealsToLeads = canConvertDealsToLeads;
        return this;
    }

    /**
    * If the user can create workflows
    * @return canCreateOwnWorkflow
    **/
    @JsonProperty("can_create_own_workflow")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanCreateOwnWorkflow() {
        return canCreateOwnWorkflow;
    }

    /**
     * Set canCreateOwnWorkflow
     **/
    public void setCanCreateOwnWorkflow(Boolean canCreateOwnWorkflow) {
        this.canCreateOwnWorkflow = canCreateOwnWorkflow;
    }

    public GetUserPermissionsResponseAllOfData canCreateOwnWorkflow(Boolean canCreateOwnWorkflow) {
        this.canCreateOwnWorkflow = canCreateOwnWorkflow;
        return this;
    }

    /**
    * If the user can delete activities
    * @return canDeleteActivities
    **/
    @JsonProperty("can_delete_activities")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanDeleteActivities() {
        return canDeleteActivities;
    }

    /**
     * Set canDeleteActivities
     **/
    public void setCanDeleteActivities(Boolean canDeleteActivities) {
        this.canDeleteActivities = canDeleteActivities;
    }

    public GetUserPermissionsResponseAllOfData canDeleteActivities(Boolean canDeleteActivities) {
        this.canDeleteActivities = canDeleteActivities;
        return this;
    }

    /**
    * If the user can delete custom fields
    * @return canDeleteCustomFields
    **/
    @JsonProperty("can_delete_custom_fields")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanDeleteCustomFields() {
        return canDeleteCustomFields;
    }

    /**
     * Set canDeleteCustomFields
     **/
    public void setCanDeleteCustomFields(Boolean canDeleteCustomFields) {
        this.canDeleteCustomFields = canDeleteCustomFields;
    }

    public GetUserPermissionsResponseAllOfData canDeleteCustomFields(Boolean canDeleteCustomFields) {
        this.canDeleteCustomFields = canDeleteCustomFields;
        return this;
    }

    /**
    * If the user can delete deals
    * @return canDeleteDeals
    **/
    @JsonProperty("can_delete_deals")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanDeleteDeals() {
        return canDeleteDeals;
    }

    /**
     * Set canDeleteDeals
     **/
    public void setCanDeleteDeals(Boolean canDeleteDeals) {
        this.canDeleteDeals = canDeleteDeals;
    }

    public GetUserPermissionsResponseAllOfData canDeleteDeals(Boolean canDeleteDeals) {
        this.canDeleteDeals = canDeleteDeals;
        return this;
    }

    /**
    * If the user can edit custom fields
    * @return canEditCustomFields
    **/
    @JsonProperty("can_edit_custom_fields")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanEditCustomFields() {
        return canEditCustomFields;
    }

    /**
     * Set canEditCustomFields
     **/
    public void setCanEditCustomFields(Boolean canEditCustomFields) {
        this.canEditCustomFields = canEditCustomFields;
    }

    public GetUserPermissionsResponseAllOfData canEditCustomFields(Boolean canEditCustomFields) {
        this.canEditCustomFields = canEditCustomFields;
        return this;
    }

    /**
    * If the user can edit deals' closed date
    * @return canEditDealsClosedDate
    **/
    @JsonProperty("can_edit_deals_closed_date")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanEditDealsClosedDate() {
        return canEditDealsClosedDate;
    }

    /**
     * Set canEditDealsClosedDate
     **/
    public void setCanEditDealsClosedDate(Boolean canEditDealsClosedDate) {
        this.canEditDealsClosedDate = canEditDealsClosedDate;
    }

    public GetUserPermissionsResponseAllOfData canEditDealsClosedDate(Boolean canEditDealsClosedDate) {
        this.canEditDealsClosedDate = canEditDealsClosedDate;
        return this;
    }

    /**
    * If the user can edit products
    * @return canEditProducts
    **/
    @JsonProperty("can_edit_products")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanEditProducts() {
        return canEditProducts;
    }

    /**
     * Set canEditProducts
     **/
    public void setCanEditProducts(Boolean canEditProducts) {
        this.canEditProducts = canEditProducts;
    }

    public GetUserPermissionsResponseAllOfData canEditProducts(Boolean canEditProducts) {
        this.canEditProducts = canEditProducts;
        return this;
    }

    /**
    * If the user can edit shared filters
    * @return canEditSharedFilters
    **/
    @JsonProperty("can_edit_shared_filters")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanEditSharedFilters() {
        return canEditSharedFilters;
    }

    /**
     * Set canEditSharedFilters
     **/
    public void setCanEditSharedFilters(Boolean canEditSharedFilters) {
        this.canEditSharedFilters = canEditSharedFilters;
    }

    public GetUserPermissionsResponseAllOfData canEditSharedFilters(Boolean canEditSharedFilters) {
        this.canEditSharedFilters = canEditSharedFilters;
        return this;
    }

    /**
    * If the user can export data from item lists
    * @return canExportDataFromLists
    **/
    @JsonProperty("can_export_data_from_lists")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanExportDataFromLists() {
        return canExportDataFromLists;
    }

    /**
     * Set canExportDataFromLists
     **/
    public void setCanExportDataFromLists(Boolean canExportDataFromLists) {
        this.canExportDataFromLists = canExportDataFromLists;
    }

    public GetUserPermissionsResponseAllOfData canExportDataFromLists(Boolean canExportDataFromLists) {
        this.canExportDataFromLists = canExportDataFromLists;
        return this;
    }

    /**
    * If the user can follow other users
    * @return canFollowOtherUsers
    **/
    @JsonProperty("can_follow_other_users")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanFollowOtherUsers() {
        return canFollowOtherUsers;
    }

    /**
     * Set canFollowOtherUsers
     **/
    public void setCanFollowOtherUsers(Boolean canFollowOtherUsers) {
        this.canFollowOtherUsers = canFollowOtherUsers;
    }

    public GetUserPermissionsResponseAllOfData canFollowOtherUsers(Boolean canFollowOtherUsers) {
        this.canFollowOtherUsers = canFollowOtherUsers;
        return this;
    }

    /**
    * If the user can merge deals
    * @return canMergeDeals
    **/
    @JsonProperty("can_merge_deals")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanMergeDeals() {
        return canMergeDeals;
    }

    /**
     * Set canMergeDeals
     **/
    public void setCanMergeDeals(Boolean canMergeDeals) {
        this.canMergeDeals = canMergeDeals;
    }

    public GetUserPermissionsResponseAllOfData canMergeDeals(Boolean canMergeDeals) {
        this.canMergeDeals = canMergeDeals;
        return this;
    }

    /**
    * If the user can merge organizations
    * @return canMergeOrganizations
    **/
    @JsonProperty("can_merge_organizations")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanMergeOrganizations() {
        return canMergeOrganizations;
    }

    /**
     * Set canMergeOrganizations
     **/
    public void setCanMergeOrganizations(Boolean canMergeOrganizations) {
        this.canMergeOrganizations = canMergeOrganizations;
    }

    public GetUserPermissionsResponseAllOfData canMergeOrganizations(Boolean canMergeOrganizations) {
        this.canMergeOrganizations = canMergeOrganizations;
        return this;
    }

    /**
    * If the user can merge people
    * @return canMergePeople
    **/
    @JsonProperty("can_merge_people")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanMergePeople() {
        return canMergePeople;
    }

    /**
     * Set canMergePeople
     **/
    public void setCanMergePeople(Boolean canMergePeople) {
        this.canMergePeople = canMergePeople;
    }

    public GetUserPermissionsResponseAllOfData canMergePeople(Boolean canMergePeople) {
        this.canMergePeople = canMergePeople;
        return this;
    }

    /**
    * If the user can modify labels
    * @return canModifyLabels
    **/
    @JsonProperty("can_modify_labels")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanModifyLabels() {
        return canModifyLabels;
    }

    /**
     * Set canModifyLabels
     **/
    public void setCanModifyLabels(Boolean canModifyLabels) {
        this.canModifyLabels = canModifyLabels;
    }

    public GetUserPermissionsResponseAllOfData canModifyLabels(Boolean canModifyLabels) {
        this.canModifyLabels = canModifyLabels;
        return this;
    }

    /**
    * If the user can see company-wide statistics
    * @return canSeeCompanyWideStatistics
    **/
    @JsonProperty("can_see_company_wide_statistics")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanSeeCompanyWideStatistics() {
        return canSeeCompanyWideStatistics;
    }

    /**
     * Set canSeeCompanyWideStatistics
     **/
    public void setCanSeeCompanyWideStatistics(Boolean canSeeCompanyWideStatistics) {
        this.canSeeCompanyWideStatistics = canSeeCompanyWideStatistics;
    }

    public GetUserPermissionsResponseAllOfData canSeeCompanyWideStatistics(Boolean canSeeCompanyWideStatistics) {
        this.canSeeCompanyWideStatistics = canSeeCompanyWideStatistics;
        return this;
    }

    /**
    * If the user can see the summary on the deals page
    * @return canSeeDealsListSummary
    **/
    @JsonProperty("can_see_deals_list_summary")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanSeeDealsListSummary() {
        return canSeeDealsListSummary;
    }

    /**
     * Set canSeeDealsListSummary
     **/
    public void setCanSeeDealsListSummary(Boolean canSeeDealsListSummary) {
        this.canSeeDealsListSummary = canSeeDealsListSummary;
    }

    public GetUserPermissionsResponseAllOfData canSeeDealsListSummary(Boolean canSeeDealsListSummary) {
        this.canSeeDealsListSummary = canSeeDealsListSummary;
        return this;
    }

    /**
    * If the user can see the names of hidden items
    * @return canSeeHiddenItemsNames
    **/
    @JsonProperty("can_see_hidden_items_names")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanSeeHiddenItemsNames() {
        return canSeeHiddenItemsNames;
    }

    /**
     * Set canSeeHiddenItemsNames
     **/
    public void setCanSeeHiddenItemsNames(Boolean canSeeHiddenItemsNames) {
        this.canSeeHiddenItemsNames = canSeeHiddenItemsNames;
    }

    public GetUserPermissionsResponseAllOfData canSeeHiddenItemsNames(Boolean canSeeHiddenItemsNames) {
        this.canSeeHiddenItemsNames = canSeeHiddenItemsNames;
        return this;
    }

    /**
    * If the user can see other users
    * @return canSeeOtherUsers
    **/
    @JsonProperty("can_see_other_users")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanSeeOtherUsers() {
        return canSeeOtherUsers;
    }

    /**
     * Set canSeeOtherUsers
     **/
    public void setCanSeeOtherUsers(Boolean canSeeOtherUsers) {
        this.canSeeOtherUsers = canSeeOtherUsers;
    }

    public GetUserPermissionsResponseAllOfData canSeeOtherUsers(Boolean canSeeOtherUsers) {
        this.canSeeOtherUsers = canSeeOtherUsers;
        return this;
    }

    /**
    * If the user can see other users' statistics
    * @return canSeeOtherUsersStatistics
    **/
    @JsonProperty("can_see_other_users_statistics")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanSeeOtherUsersStatistics() {
        return canSeeOtherUsersStatistics;
    }

    /**
     * Set canSeeOtherUsersStatistics
     **/
    public void setCanSeeOtherUsersStatistics(Boolean canSeeOtherUsersStatistics) {
        this.canSeeOtherUsersStatistics = canSeeOtherUsersStatistics;
    }

    public GetUserPermissionsResponseAllOfData canSeeOtherUsersStatistics(Boolean canSeeOtherUsersStatistics) {
        this.canSeeOtherUsersStatistics = canSeeOtherUsersStatistics;
        return this;
    }

    /**
    * If the user can see security dashboard
    * @return canSeeSecurityDashboard
    **/
    @JsonProperty("can_see_security_dashboard")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanSeeSecurityDashboard() {
        return canSeeSecurityDashboard;
    }

    /**
     * Set canSeeSecurityDashboard
     **/
    public void setCanSeeSecurityDashboard(Boolean canSeeSecurityDashboard) {
        this.canSeeSecurityDashboard = canSeeSecurityDashboard;
    }

    public GetUserPermissionsResponseAllOfData canSeeSecurityDashboard(Boolean canSeeSecurityDashboard) {
        this.canSeeSecurityDashboard = canSeeSecurityDashboard;
        return this;
    }

    /**
    * If the user can share filters
    * @return canShareFilters
    **/
    @JsonProperty("can_share_filters")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanShareFilters() {
        return canShareFilters;
    }

    /**
     * Set canShareFilters
     **/
    public void setCanShareFilters(Boolean canShareFilters) {
        this.canShareFilters = canShareFilters;
    }

    public GetUserPermissionsResponseAllOfData canShareFilters(Boolean canShareFilters) {
        this.canShareFilters = canShareFilters;
        return this;
    }

    /**
    * If the user can share insights
    * @return canShareInsights
    **/
    @JsonProperty("can_share_insights")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanShareInsights() {
        return canShareInsights;
    }

    /**
     * Set canShareInsights
     **/
    public void setCanShareInsights(Boolean canShareInsights) {
        this.canShareInsights = canShareInsights;
    }

    public GetUserPermissionsResponseAllOfData canShareInsights(Boolean canShareInsights) {
        this.canShareInsights = canShareInsights;
        return this;
    }

    /**
    * If the user can use API
    * @return canUseApi
    **/
    @JsonProperty("can_use_api")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanUseApi() {
        return canUseApi;
    }

    /**
     * Set canUseApi
     **/
    public void setCanUseApi(Boolean canUseApi) {
        this.canUseApi = canUseApi;
    }

    public GetUserPermissionsResponseAllOfData canUseApi(Boolean canUseApi) {
        this.canUseApi = canUseApi;
        return this;
    }

    /**
    * If the user can use email tracking
    * @return canUseEmailTracking
    **/
    @JsonProperty("can_use_email_tracking")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanUseEmailTracking() {
        return canUseEmailTracking;
    }

    /**
     * Set canUseEmailTracking
     **/
    public void setCanUseEmailTracking(Boolean canUseEmailTracking) {
        this.canUseEmailTracking = canUseEmailTracking;
    }

    public GetUserPermissionsResponseAllOfData canUseEmailTracking(Boolean canUseEmailTracking) {
        this.canUseEmailTracking = canUseEmailTracking;
        return this;
    }

    /**
    * If the user can use import
    * @return canUseImport
    **/
    @JsonProperty("can_use_import")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCanUseImport() {
        return canUseImport;
    }

    /**
     * Set canUseImport
     **/
    public void setCanUseImport(Boolean canUseImport) {
        this.canUseImport = canUseImport;
    }

    public GetUserPermissionsResponseAllOfData canUseImport(Boolean canUseImport) {
        this.canUseImport = canUseImport;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetUserPermissionsResponseAllOfData {\n");

        sb.append("    canAddCustomFields: ").append(toIndentedString(canAddCustomFields)).append("\n");
        sb.append("    canAddProducts: ").append(toIndentedString(canAddProducts)).append("\n");
        sb.append("    canAddProspectsAsLeads: ").append(toIndentedString(canAddProspectsAsLeads)).append("\n");
        sb.append("    canBulkEditItems: ").append(toIndentedString(canBulkEditItems)).append("\n");
        sb.append("    canChangeVisibilityOfItems: ").append(toIndentedString(canChangeVisibilityOfItems)).append("\n");
        sb.append("    canConvertDealsToLeads: ").append(toIndentedString(canConvertDealsToLeads)).append("\n");
        sb.append("    canCreateOwnWorkflow: ").append(toIndentedString(canCreateOwnWorkflow)).append("\n");
        sb.append("    canDeleteActivities: ").append(toIndentedString(canDeleteActivities)).append("\n");
        sb.append("    canDeleteCustomFields: ").append(toIndentedString(canDeleteCustomFields)).append("\n");
        sb.append("    canDeleteDeals: ").append(toIndentedString(canDeleteDeals)).append("\n");
        sb.append("    canEditCustomFields: ").append(toIndentedString(canEditCustomFields)).append("\n");
        sb.append("    canEditDealsClosedDate: ").append(toIndentedString(canEditDealsClosedDate)).append("\n");
        sb.append("    canEditProducts: ").append(toIndentedString(canEditProducts)).append("\n");
        sb.append("    canEditSharedFilters: ").append(toIndentedString(canEditSharedFilters)).append("\n");
        sb.append("    canExportDataFromLists: ").append(toIndentedString(canExportDataFromLists)).append("\n");
        sb.append("    canFollowOtherUsers: ").append(toIndentedString(canFollowOtherUsers)).append("\n");
        sb.append("    canMergeDeals: ").append(toIndentedString(canMergeDeals)).append("\n");
        sb.append("    canMergeOrganizations: ").append(toIndentedString(canMergeOrganizations)).append("\n");
        sb.append("    canMergePeople: ").append(toIndentedString(canMergePeople)).append("\n");
        sb.append("    canModifyLabels: ").append(toIndentedString(canModifyLabels)).append("\n");
        sb.append("    canSeeCompanyWideStatistics: ").append(toIndentedString(canSeeCompanyWideStatistics)).append("\n");
        sb.append("    canSeeDealsListSummary: ").append(toIndentedString(canSeeDealsListSummary)).append("\n");
        sb.append("    canSeeHiddenItemsNames: ").append(toIndentedString(canSeeHiddenItemsNames)).append("\n");
        sb.append("    canSeeOtherUsers: ").append(toIndentedString(canSeeOtherUsers)).append("\n");
        sb.append("    canSeeOtherUsersStatistics: ").append(toIndentedString(canSeeOtherUsersStatistics)).append("\n");
        sb.append("    canSeeSecurityDashboard: ").append(toIndentedString(canSeeSecurityDashboard)).append("\n");
        sb.append("    canShareFilters: ").append(toIndentedString(canShareFilters)).append("\n");
        sb.append("    canShareInsights: ").append(toIndentedString(canShareInsights)).append("\n");
        sb.append("    canUseApi: ").append(toIndentedString(canUseApi)).append("\n");
        sb.append("    canUseEmailTracking: ").append(toIndentedString(canUseEmailTracking)).append("\n");
        sb.append("    canUseImport: ").append(toIndentedString(canUseImport)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetUserPermissionsResponseAllOfData} object that
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

        GetUserPermissionsResponseAllOfData model = (GetUserPermissionsResponseAllOfData) obj;

        return java.util.Objects.equals(canAddCustomFields, model.canAddCustomFields) &&
        java.util.Objects.equals(canAddProducts, model.canAddProducts) &&
        java.util.Objects.equals(canAddProspectsAsLeads, model.canAddProspectsAsLeads) &&
        java.util.Objects.equals(canBulkEditItems, model.canBulkEditItems) &&
        java.util.Objects.equals(canChangeVisibilityOfItems, model.canChangeVisibilityOfItems) &&
        java.util.Objects.equals(canConvertDealsToLeads, model.canConvertDealsToLeads) &&
        java.util.Objects.equals(canCreateOwnWorkflow, model.canCreateOwnWorkflow) &&
        java.util.Objects.equals(canDeleteActivities, model.canDeleteActivities) &&
        java.util.Objects.equals(canDeleteCustomFields, model.canDeleteCustomFields) &&
        java.util.Objects.equals(canDeleteDeals, model.canDeleteDeals) &&
        java.util.Objects.equals(canEditCustomFields, model.canEditCustomFields) &&
        java.util.Objects.equals(canEditDealsClosedDate, model.canEditDealsClosedDate) &&
        java.util.Objects.equals(canEditProducts, model.canEditProducts) &&
        java.util.Objects.equals(canEditSharedFilters, model.canEditSharedFilters) &&
        java.util.Objects.equals(canExportDataFromLists, model.canExportDataFromLists) &&
        java.util.Objects.equals(canFollowOtherUsers, model.canFollowOtherUsers) &&
        java.util.Objects.equals(canMergeDeals, model.canMergeDeals) &&
        java.util.Objects.equals(canMergeOrganizations, model.canMergeOrganizations) &&
        java.util.Objects.equals(canMergePeople, model.canMergePeople) &&
        java.util.Objects.equals(canModifyLabels, model.canModifyLabels) &&
        java.util.Objects.equals(canSeeCompanyWideStatistics, model.canSeeCompanyWideStatistics) &&
        java.util.Objects.equals(canSeeDealsListSummary, model.canSeeDealsListSummary) &&
        java.util.Objects.equals(canSeeHiddenItemsNames, model.canSeeHiddenItemsNames) &&
        java.util.Objects.equals(canSeeOtherUsers, model.canSeeOtherUsers) &&
        java.util.Objects.equals(canSeeOtherUsersStatistics, model.canSeeOtherUsersStatistics) &&
        java.util.Objects.equals(canSeeSecurityDashboard, model.canSeeSecurityDashboard) &&
        java.util.Objects.equals(canShareFilters, model.canShareFilters) &&
        java.util.Objects.equals(canShareInsights, model.canShareInsights) &&
        java.util.Objects.equals(canUseApi, model.canUseApi) &&
        java.util.Objects.equals(canUseEmailTracking, model.canUseEmailTracking) &&
        java.util.Objects.equals(canUseImport, model.canUseImport);
    }

    /**
     * Returns a hash code for a {@code GetUserPermissionsResponseAllOfData}.
     *
     * @return a hash code value for a {@code GetUserPermissionsResponseAllOfData}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(canAddCustomFields,
        canAddProducts,
        canAddProspectsAsLeads,
        canBulkEditItems,
        canChangeVisibilityOfItems,
        canConvertDealsToLeads,
        canCreateOwnWorkflow,
        canDeleteActivities,
        canDeleteCustomFields,
        canDeleteDeals,
        canEditCustomFields,
        canEditDealsClosedDate,
        canEditProducts,
        canEditSharedFilters,
        canExportDataFromLists,
        canFollowOtherUsers,
        canMergeDeals,
        canMergeOrganizations,
        canMergePeople,
        canModifyLabels,
        canSeeCompanyWideStatistics,
        canSeeDealsListSummary,
        canSeeHiddenItemsNames,
        canSeeOtherUsers,
        canSeeOtherUsersStatistics,
        canSeeSecurityDashboard,
        canShareFilters,
        canShareInsights,
        canUseApi,
        canUseEmailTracking,
        canUseImport);
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
    public static class GetUserPermissionsResponseAllOfDataQueryParam  {

        @jakarta.ws.rs.QueryParam("canAddCustomFields")
        private Boolean canAddCustomFields;
        @jakarta.ws.rs.QueryParam("canAddProducts")
        private Boolean canAddProducts;
        @jakarta.ws.rs.QueryParam("canAddProspectsAsLeads")
        private Boolean canAddProspectsAsLeads;
        @jakarta.ws.rs.QueryParam("canBulkEditItems")
        private Boolean canBulkEditItems;
        @jakarta.ws.rs.QueryParam("canChangeVisibilityOfItems")
        private Boolean canChangeVisibilityOfItems;
        @jakarta.ws.rs.QueryParam("canConvertDealsToLeads")
        private Boolean canConvertDealsToLeads;
        @jakarta.ws.rs.QueryParam("canCreateOwnWorkflow")
        private Boolean canCreateOwnWorkflow;
        @jakarta.ws.rs.QueryParam("canDeleteActivities")
        private Boolean canDeleteActivities;
        @jakarta.ws.rs.QueryParam("canDeleteCustomFields")
        private Boolean canDeleteCustomFields;
        @jakarta.ws.rs.QueryParam("canDeleteDeals")
        private Boolean canDeleteDeals;
        @jakarta.ws.rs.QueryParam("canEditCustomFields")
        private Boolean canEditCustomFields;
        @jakarta.ws.rs.QueryParam("canEditDealsClosedDate")
        private Boolean canEditDealsClosedDate;
        @jakarta.ws.rs.QueryParam("canEditProducts")
        private Boolean canEditProducts;
        @jakarta.ws.rs.QueryParam("canEditSharedFilters")
        private Boolean canEditSharedFilters;
        @jakarta.ws.rs.QueryParam("canExportDataFromLists")
        private Boolean canExportDataFromLists;
        @jakarta.ws.rs.QueryParam("canFollowOtherUsers")
        private Boolean canFollowOtherUsers;
        @jakarta.ws.rs.QueryParam("canMergeDeals")
        private Boolean canMergeDeals;
        @jakarta.ws.rs.QueryParam("canMergeOrganizations")
        private Boolean canMergeOrganizations;
        @jakarta.ws.rs.QueryParam("canMergePeople")
        private Boolean canMergePeople;
        @jakarta.ws.rs.QueryParam("canModifyLabels")
        private Boolean canModifyLabels;
        @jakarta.ws.rs.QueryParam("canSeeCompanyWideStatistics")
        private Boolean canSeeCompanyWideStatistics;
        @jakarta.ws.rs.QueryParam("canSeeDealsListSummary")
        private Boolean canSeeDealsListSummary;
        @jakarta.ws.rs.QueryParam("canSeeHiddenItemsNames")
        private Boolean canSeeHiddenItemsNames;
        @jakarta.ws.rs.QueryParam("canSeeOtherUsers")
        private Boolean canSeeOtherUsers;
        @jakarta.ws.rs.QueryParam("canSeeOtherUsersStatistics")
        private Boolean canSeeOtherUsersStatistics;
        @jakarta.ws.rs.QueryParam("canSeeSecurityDashboard")
        private Boolean canSeeSecurityDashboard;
        @jakarta.ws.rs.QueryParam("canShareFilters")
        private Boolean canShareFilters;
        @jakarta.ws.rs.QueryParam("canShareInsights")
        private Boolean canShareInsights;
        @jakarta.ws.rs.QueryParam("canUseApi")
        private Boolean canUseApi;
        @jakarta.ws.rs.QueryParam("canUseEmailTracking")
        private Boolean canUseEmailTracking;
        @jakarta.ws.rs.QueryParam("canUseImport")
        private Boolean canUseImport;

        /**
        * If the user can add custom fields
        * @return canAddCustomFields
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_add_custom_fields")
        public Boolean getCanAddCustomFields() {
            return canAddCustomFields;
        }

        /**
         * Set canAddCustomFields
         **/
        public void setCanAddCustomFields(Boolean canAddCustomFields) {
            this.canAddCustomFields = canAddCustomFields;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canAddCustomFields(Boolean canAddCustomFields) {
            this.canAddCustomFields = canAddCustomFields;
            return this;
        }

        /**
        * If the user can add products
        * @return canAddProducts
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_add_products")
        public Boolean getCanAddProducts() {
            return canAddProducts;
        }

        /**
         * Set canAddProducts
         **/
        public void setCanAddProducts(Boolean canAddProducts) {
            this.canAddProducts = canAddProducts;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canAddProducts(Boolean canAddProducts) {
            this.canAddProducts = canAddProducts;
            return this;
        }

        /**
        * If the user can add prospects as leads
        * @return canAddProspectsAsLeads
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_add_prospects_as_leads")
        public Boolean getCanAddProspectsAsLeads() {
            return canAddProspectsAsLeads;
        }

        /**
         * Set canAddProspectsAsLeads
         **/
        public void setCanAddProspectsAsLeads(Boolean canAddProspectsAsLeads) {
            this.canAddProspectsAsLeads = canAddProspectsAsLeads;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canAddProspectsAsLeads(Boolean canAddProspectsAsLeads) {
            this.canAddProspectsAsLeads = canAddProspectsAsLeads;
            return this;
        }

        /**
        * If the user can bulk edit items
        * @return canBulkEditItems
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_bulk_edit_items")
        public Boolean getCanBulkEditItems() {
            return canBulkEditItems;
        }

        /**
         * Set canBulkEditItems
         **/
        public void setCanBulkEditItems(Boolean canBulkEditItems) {
            this.canBulkEditItems = canBulkEditItems;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canBulkEditItems(Boolean canBulkEditItems) {
            this.canBulkEditItems = canBulkEditItems;
            return this;
        }

        /**
        * If the user can change visibility of items
        * @return canChangeVisibilityOfItems
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_change_visibility_of_items")
        public Boolean getCanChangeVisibilityOfItems() {
            return canChangeVisibilityOfItems;
        }

        /**
         * Set canChangeVisibilityOfItems
         **/
        public void setCanChangeVisibilityOfItems(Boolean canChangeVisibilityOfItems) {
            this.canChangeVisibilityOfItems = canChangeVisibilityOfItems;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canChangeVisibilityOfItems(Boolean canChangeVisibilityOfItems) {
            this.canChangeVisibilityOfItems = canChangeVisibilityOfItems;
            return this;
        }

        /**
        * If the user can convert deals to leads
        * @return canConvertDealsToLeads
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_convert_deals_to_leads")
        public Boolean getCanConvertDealsToLeads() {
            return canConvertDealsToLeads;
        }

        /**
         * Set canConvertDealsToLeads
         **/
        public void setCanConvertDealsToLeads(Boolean canConvertDealsToLeads) {
            this.canConvertDealsToLeads = canConvertDealsToLeads;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canConvertDealsToLeads(Boolean canConvertDealsToLeads) {
            this.canConvertDealsToLeads = canConvertDealsToLeads;
            return this;
        }

        /**
        * If the user can create workflows
        * @return canCreateOwnWorkflow
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_create_own_workflow")
        public Boolean getCanCreateOwnWorkflow() {
            return canCreateOwnWorkflow;
        }

        /**
         * Set canCreateOwnWorkflow
         **/
        public void setCanCreateOwnWorkflow(Boolean canCreateOwnWorkflow) {
            this.canCreateOwnWorkflow = canCreateOwnWorkflow;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canCreateOwnWorkflow(Boolean canCreateOwnWorkflow) {
            this.canCreateOwnWorkflow = canCreateOwnWorkflow;
            return this;
        }

        /**
        * If the user can delete activities
        * @return canDeleteActivities
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_delete_activities")
        public Boolean getCanDeleteActivities() {
            return canDeleteActivities;
        }

        /**
         * Set canDeleteActivities
         **/
        public void setCanDeleteActivities(Boolean canDeleteActivities) {
            this.canDeleteActivities = canDeleteActivities;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canDeleteActivities(Boolean canDeleteActivities) {
            this.canDeleteActivities = canDeleteActivities;
            return this;
        }

        /**
        * If the user can delete custom fields
        * @return canDeleteCustomFields
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_delete_custom_fields")
        public Boolean getCanDeleteCustomFields() {
            return canDeleteCustomFields;
        }

        /**
         * Set canDeleteCustomFields
         **/
        public void setCanDeleteCustomFields(Boolean canDeleteCustomFields) {
            this.canDeleteCustomFields = canDeleteCustomFields;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canDeleteCustomFields(Boolean canDeleteCustomFields) {
            this.canDeleteCustomFields = canDeleteCustomFields;
            return this;
        }

        /**
        * If the user can delete deals
        * @return canDeleteDeals
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_delete_deals")
        public Boolean getCanDeleteDeals() {
            return canDeleteDeals;
        }

        /**
         * Set canDeleteDeals
         **/
        public void setCanDeleteDeals(Boolean canDeleteDeals) {
            this.canDeleteDeals = canDeleteDeals;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canDeleteDeals(Boolean canDeleteDeals) {
            this.canDeleteDeals = canDeleteDeals;
            return this;
        }

        /**
        * If the user can edit custom fields
        * @return canEditCustomFields
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_edit_custom_fields")
        public Boolean getCanEditCustomFields() {
            return canEditCustomFields;
        }

        /**
         * Set canEditCustomFields
         **/
        public void setCanEditCustomFields(Boolean canEditCustomFields) {
            this.canEditCustomFields = canEditCustomFields;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canEditCustomFields(Boolean canEditCustomFields) {
            this.canEditCustomFields = canEditCustomFields;
            return this;
        }

        /**
        * If the user can edit deals' closed date
        * @return canEditDealsClosedDate
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_edit_deals_closed_date")
        public Boolean getCanEditDealsClosedDate() {
            return canEditDealsClosedDate;
        }

        /**
         * Set canEditDealsClosedDate
         **/
        public void setCanEditDealsClosedDate(Boolean canEditDealsClosedDate) {
            this.canEditDealsClosedDate = canEditDealsClosedDate;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canEditDealsClosedDate(Boolean canEditDealsClosedDate) {
            this.canEditDealsClosedDate = canEditDealsClosedDate;
            return this;
        }

        /**
        * If the user can edit products
        * @return canEditProducts
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_edit_products")
        public Boolean getCanEditProducts() {
            return canEditProducts;
        }

        /**
         * Set canEditProducts
         **/
        public void setCanEditProducts(Boolean canEditProducts) {
            this.canEditProducts = canEditProducts;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canEditProducts(Boolean canEditProducts) {
            this.canEditProducts = canEditProducts;
            return this;
        }

        /**
        * If the user can edit shared filters
        * @return canEditSharedFilters
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_edit_shared_filters")
        public Boolean getCanEditSharedFilters() {
            return canEditSharedFilters;
        }

        /**
         * Set canEditSharedFilters
         **/
        public void setCanEditSharedFilters(Boolean canEditSharedFilters) {
            this.canEditSharedFilters = canEditSharedFilters;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canEditSharedFilters(Boolean canEditSharedFilters) {
            this.canEditSharedFilters = canEditSharedFilters;
            return this;
        }

        /**
        * If the user can export data from item lists
        * @return canExportDataFromLists
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_export_data_from_lists")
        public Boolean getCanExportDataFromLists() {
            return canExportDataFromLists;
        }

        /**
         * Set canExportDataFromLists
         **/
        public void setCanExportDataFromLists(Boolean canExportDataFromLists) {
            this.canExportDataFromLists = canExportDataFromLists;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canExportDataFromLists(Boolean canExportDataFromLists) {
            this.canExportDataFromLists = canExportDataFromLists;
            return this;
        }

        /**
        * If the user can follow other users
        * @return canFollowOtherUsers
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_follow_other_users")
        public Boolean getCanFollowOtherUsers() {
            return canFollowOtherUsers;
        }

        /**
         * Set canFollowOtherUsers
         **/
        public void setCanFollowOtherUsers(Boolean canFollowOtherUsers) {
            this.canFollowOtherUsers = canFollowOtherUsers;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canFollowOtherUsers(Boolean canFollowOtherUsers) {
            this.canFollowOtherUsers = canFollowOtherUsers;
            return this;
        }

        /**
        * If the user can merge deals
        * @return canMergeDeals
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_merge_deals")
        public Boolean getCanMergeDeals() {
            return canMergeDeals;
        }

        /**
         * Set canMergeDeals
         **/
        public void setCanMergeDeals(Boolean canMergeDeals) {
            this.canMergeDeals = canMergeDeals;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canMergeDeals(Boolean canMergeDeals) {
            this.canMergeDeals = canMergeDeals;
            return this;
        }

        /**
        * If the user can merge organizations
        * @return canMergeOrganizations
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_merge_organizations")
        public Boolean getCanMergeOrganizations() {
            return canMergeOrganizations;
        }

        /**
         * Set canMergeOrganizations
         **/
        public void setCanMergeOrganizations(Boolean canMergeOrganizations) {
            this.canMergeOrganizations = canMergeOrganizations;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canMergeOrganizations(Boolean canMergeOrganizations) {
            this.canMergeOrganizations = canMergeOrganizations;
            return this;
        }

        /**
        * If the user can merge people
        * @return canMergePeople
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_merge_people")
        public Boolean getCanMergePeople() {
            return canMergePeople;
        }

        /**
         * Set canMergePeople
         **/
        public void setCanMergePeople(Boolean canMergePeople) {
            this.canMergePeople = canMergePeople;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canMergePeople(Boolean canMergePeople) {
            this.canMergePeople = canMergePeople;
            return this;
        }

        /**
        * If the user can modify labels
        * @return canModifyLabels
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_modify_labels")
        public Boolean getCanModifyLabels() {
            return canModifyLabels;
        }

        /**
         * Set canModifyLabels
         **/
        public void setCanModifyLabels(Boolean canModifyLabels) {
            this.canModifyLabels = canModifyLabels;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canModifyLabels(Boolean canModifyLabels) {
            this.canModifyLabels = canModifyLabels;
            return this;
        }

        /**
        * If the user can see company-wide statistics
        * @return canSeeCompanyWideStatistics
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_see_company_wide_statistics")
        public Boolean getCanSeeCompanyWideStatistics() {
            return canSeeCompanyWideStatistics;
        }

        /**
         * Set canSeeCompanyWideStatistics
         **/
        public void setCanSeeCompanyWideStatistics(Boolean canSeeCompanyWideStatistics) {
            this.canSeeCompanyWideStatistics = canSeeCompanyWideStatistics;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canSeeCompanyWideStatistics(Boolean canSeeCompanyWideStatistics) {
            this.canSeeCompanyWideStatistics = canSeeCompanyWideStatistics;
            return this;
        }

        /**
        * If the user can see the summary on the deals page
        * @return canSeeDealsListSummary
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_see_deals_list_summary")
        public Boolean getCanSeeDealsListSummary() {
            return canSeeDealsListSummary;
        }

        /**
         * Set canSeeDealsListSummary
         **/
        public void setCanSeeDealsListSummary(Boolean canSeeDealsListSummary) {
            this.canSeeDealsListSummary = canSeeDealsListSummary;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canSeeDealsListSummary(Boolean canSeeDealsListSummary) {
            this.canSeeDealsListSummary = canSeeDealsListSummary;
            return this;
        }

        /**
        * If the user can see the names of hidden items
        * @return canSeeHiddenItemsNames
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_see_hidden_items_names")
        public Boolean getCanSeeHiddenItemsNames() {
            return canSeeHiddenItemsNames;
        }

        /**
         * Set canSeeHiddenItemsNames
         **/
        public void setCanSeeHiddenItemsNames(Boolean canSeeHiddenItemsNames) {
            this.canSeeHiddenItemsNames = canSeeHiddenItemsNames;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canSeeHiddenItemsNames(Boolean canSeeHiddenItemsNames) {
            this.canSeeHiddenItemsNames = canSeeHiddenItemsNames;
            return this;
        }

        /**
        * If the user can see other users
        * @return canSeeOtherUsers
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_see_other_users")
        public Boolean getCanSeeOtherUsers() {
            return canSeeOtherUsers;
        }

        /**
         * Set canSeeOtherUsers
         **/
        public void setCanSeeOtherUsers(Boolean canSeeOtherUsers) {
            this.canSeeOtherUsers = canSeeOtherUsers;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canSeeOtherUsers(Boolean canSeeOtherUsers) {
            this.canSeeOtherUsers = canSeeOtherUsers;
            return this;
        }

        /**
        * If the user can see other users' statistics
        * @return canSeeOtherUsersStatistics
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_see_other_users_statistics")
        public Boolean getCanSeeOtherUsersStatistics() {
            return canSeeOtherUsersStatistics;
        }

        /**
         * Set canSeeOtherUsersStatistics
         **/
        public void setCanSeeOtherUsersStatistics(Boolean canSeeOtherUsersStatistics) {
            this.canSeeOtherUsersStatistics = canSeeOtherUsersStatistics;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canSeeOtherUsersStatistics(Boolean canSeeOtherUsersStatistics) {
            this.canSeeOtherUsersStatistics = canSeeOtherUsersStatistics;
            return this;
        }

        /**
        * If the user can see security dashboard
        * @return canSeeSecurityDashboard
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_see_security_dashboard")
        public Boolean getCanSeeSecurityDashboard() {
            return canSeeSecurityDashboard;
        }

        /**
         * Set canSeeSecurityDashboard
         **/
        public void setCanSeeSecurityDashboard(Boolean canSeeSecurityDashboard) {
            this.canSeeSecurityDashboard = canSeeSecurityDashboard;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canSeeSecurityDashboard(Boolean canSeeSecurityDashboard) {
            this.canSeeSecurityDashboard = canSeeSecurityDashboard;
            return this;
        }

        /**
        * If the user can share filters
        * @return canShareFilters
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_share_filters")
        public Boolean getCanShareFilters() {
            return canShareFilters;
        }

        /**
         * Set canShareFilters
         **/
        public void setCanShareFilters(Boolean canShareFilters) {
            this.canShareFilters = canShareFilters;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canShareFilters(Boolean canShareFilters) {
            this.canShareFilters = canShareFilters;
            return this;
        }

        /**
        * If the user can share insights
        * @return canShareInsights
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_share_insights")
        public Boolean getCanShareInsights() {
            return canShareInsights;
        }

        /**
         * Set canShareInsights
         **/
        public void setCanShareInsights(Boolean canShareInsights) {
            this.canShareInsights = canShareInsights;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canShareInsights(Boolean canShareInsights) {
            this.canShareInsights = canShareInsights;
            return this;
        }

        /**
        * If the user can use API
        * @return canUseApi
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_use_api")
        public Boolean getCanUseApi() {
            return canUseApi;
        }

        /**
         * Set canUseApi
         **/
        public void setCanUseApi(Boolean canUseApi) {
            this.canUseApi = canUseApi;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canUseApi(Boolean canUseApi) {
            this.canUseApi = canUseApi;
            return this;
        }

        /**
        * If the user can use email tracking
        * @return canUseEmailTracking
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_use_email_tracking")
        public Boolean getCanUseEmailTracking() {
            return canUseEmailTracking;
        }

        /**
         * Set canUseEmailTracking
         **/
        public void setCanUseEmailTracking(Boolean canUseEmailTracking) {
            this.canUseEmailTracking = canUseEmailTracking;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canUseEmailTracking(Boolean canUseEmailTracking) {
            this.canUseEmailTracking = canUseEmailTracking;
            return this;
        }

        /**
        * If the user can use import
        * @return canUseImport
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("can_use_import")
        public Boolean getCanUseImport() {
            return canUseImport;
        }

        /**
         * Set canUseImport
         **/
        public void setCanUseImport(Boolean canUseImport) {
            this.canUseImport = canUseImport;
        }

        public GetUserPermissionsResponseAllOfDataQueryParam canUseImport(Boolean canUseImport) {
            this.canUseImport = canUseImport;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetUserPermissionsResponseAllOfDataQueryParam {\n");

            sb.append("    canAddCustomFields: ").append(toIndentedString(canAddCustomFields)).append("\n");
            sb.append("    canAddProducts: ").append(toIndentedString(canAddProducts)).append("\n");
            sb.append("    canAddProspectsAsLeads: ").append(toIndentedString(canAddProspectsAsLeads)).append("\n");
            sb.append("    canBulkEditItems: ").append(toIndentedString(canBulkEditItems)).append("\n");
            sb.append("    canChangeVisibilityOfItems: ").append(toIndentedString(canChangeVisibilityOfItems)).append("\n");
            sb.append("    canConvertDealsToLeads: ").append(toIndentedString(canConvertDealsToLeads)).append("\n");
            sb.append("    canCreateOwnWorkflow: ").append(toIndentedString(canCreateOwnWorkflow)).append("\n");
            sb.append("    canDeleteActivities: ").append(toIndentedString(canDeleteActivities)).append("\n");
            sb.append("    canDeleteCustomFields: ").append(toIndentedString(canDeleteCustomFields)).append("\n");
            sb.append("    canDeleteDeals: ").append(toIndentedString(canDeleteDeals)).append("\n");
            sb.append("    canEditCustomFields: ").append(toIndentedString(canEditCustomFields)).append("\n");
            sb.append("    canEditDealsClosedDate: ").append(toIndentedString(canEditDealsClosedDate)).append("\n");
            sb.append("    canEditProducts: ").append(toIndentedString(canEditProducts)).append("\n");
            sb.append("    canEditSharedFilters: ").append(toIndentedString(canEditSharedFilters)).append("\n");
            sb.append("    canExportDataFromLists: ").append(toIndentedString(canExportDataFromLists)).append("\n");
            sb.append("    canFollowOtherUsers: ").append(toIndentedString(canFollowOtherUsers)).append("\n");
            sb.append("    canMergeDeals: ").append(toIndentedString(canMergeDeals)).append("\n");
            sb.append("    canMergeOrganizations: ").append(toIndentedString(canMergeOrganizations)).append("\n");
            sb.append("    canMergePeople: ").append(toIndentedString(canMergePeople)).append("\n");
            sb.append("    canModifyLabels: ").append(toIndentedString(canModifyLabels)).append("\n");
            sb.append("    canSeeCompanyWideStatistics: ").append(toIndentedString(canSeeCompanyWideStatistics)).append("\n");
            sb.append("    canSeeDealsListSummary: ").append(toIndentedString(canSeeDealsListSummary)).append("\n");
            sb.append("    canSeeHiddenItemsNames: ").append(toIndentedString(canSeeHiddenItemsNames)).append("\n");
            sb.append("    canSeeOtherUsers: ").append(toIndentedString(canSeeOtherUsers)).append("\n");
            sb.append("    canSeeOtherUsersStatistics: ").append(toIndentedString(canSeeOtherUsersStatistics)).append("\n");
            sb.append("    canSeeSecurityDashboard: ").append(toIndentedString(canSeeSecurityDashboard)).append("\n");
            sb.append("    canShareFilters: ").append(toIndentedString(canShareFilters)).append("\n");
            sb.append("    canShareInsights: ").append(toIndentedString(canShareInsights)).append("\n");
            sb.append("    canUseApi: ").append(toIndentedString(canUseApi)).append("\n");
            sb.append("    canUseEmailTracking: ").append(toIndentedString(canUseEmailTracking)).append("\n");
            sb.append("    canUseImport: ").append(toIndentedString(canUseImport)).append("\n");
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
