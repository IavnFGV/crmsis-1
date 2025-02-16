package dti.crmsis.back.clients.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class ProductResponse {

    @JsonProperty("success")
    private boolean success;

    @JsonProperty("data")
    private List<Product> data;

    @JsonProperty("additional_data")
    private AdditionalData additionalData;

    public boolean isSuccess() {
        return success;
    }

    public List<Product> getData() {
        return data;
    }

    public String getNextCursor() {
        return additionalData != null ? additionalData.nextCursor : null;
    }

    public static class AdditionalData {
        @JsonProperty("next_cursor")
        private String nextCursor;
    }

    public static class Product {
        @JsonProperty("id")
        private Long id;

        @JsonProperty("name")
        private String name;

        @JsonProperty("code")
        private String code;

        @JsonProperty("description")
        private String description;

        @JsonProperty("unit")
        private String unit;

        @JsonProperty("tax")
        private Integer tax;

        @JsonProperty("category")
        private String category;

        @JsonProperty("is_linkable")
        private Boolean isLinkable;

        @JsonProperty("is_deleted")
        private Boolean isDeleted;

        @JsonProperty("visible_to")
        private Integer visibleTo;

        @JsonProperty("owner_id")
        private Long ownerId;

        @JsonProperty("add_time")
        private String addTime;

        @JsonProperty("update_time")
        private String updateTime;

        @JsonProperty("billing_frequency")
        private String billingFrequency;

        @JsonProperty("billing_frequency_cycles")
        private Integer billingFrequencyCycles;

        @JsonProperty("prices")
        private List<Price> prices;

        @JsonProperty("custom_fields")
        private Map<String, Object> customFields;

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getCode() {
            return code;
        }

        public String getDescription() {
            return description;
        }

        public String getUnit() {
            return unit;
        }

        public Integer getTax() {
            return tax;
        }

        public String getCategory() {
            return category;
        }

        public Boolean getIsLinkable() {
            return isLinkable;
        }

        public Boolean getIsDeleted() {
            return isDeleted;
        }

        public Integer getVisibleTo() {
            return visibleTo;
        }

        public Long getOwnerId() {
            return ownerId;
        }

        public String getAddTime() {
            return addTime;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public String getBillingFrequency() {
            return billingFrequency;
        }

        public Integer getBillingFrequencyCycles() {
            return billingFrequencyCycles;
        }

        public List<Price> getPrices() {
            return prices;
        }

        public Map<String, Object> getCustomFields() {
            return customFields;
        }
    }

    public static class Price {
        @JsonProperty("product_id")
        private Long productId;

        @JsonProperty("price")
        private Double price;

        @JsonProperty("currency")
        private String currency;

        @JsonProperty("cost")
        private Double cost;

        @JsonProperty("direct_cost")
        private Double directCost;

        @JsonProperty("notes")
        private String notes;

        public Long getProductId() {
            return productId;
        }

        public Double getPrice() {
            return price;
        }

        public String getCurrency() {
            return currency;
        }

        public Double getCost() {
            return cost;
        }

        public Double getDirectCost() {
            return directCost;
        }

        public String getNotes() {
            return notes;
        }
    }
}
