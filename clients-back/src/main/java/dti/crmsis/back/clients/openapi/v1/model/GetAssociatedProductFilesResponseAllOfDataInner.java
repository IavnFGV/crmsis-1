package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The file data
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetAssociatedProductFilesResponseAllOfDataInner  {

    /**
      * The ID of the file
     **/
    private Integer id;
    /**
      * The ID of the product associated with the file
     **/
    private Integer productId;
    /**
      * The UTC date time when the file was uploaded. Format: YYYY-MM-DD HH:MM:SS
     **/
    private String addTime;
    /**
      * The UTC date time when the file was last updated. Format: YYYY-MM-DD HH:MM:SS
     **/
    private String updateTime;
    /**
      * The original name of the file
     **/
    private String fileName;
    /**
      * The size of the file in bytes
     **/
    private Integer fileSize;
    /**
      * Whether the user is active or not.
     **/
    private Boolean activeFlag;
    /**
      * Whether the file was uploaded as inline or not
     **/
    private Boolean inlineFlag;
    /**
      * The location type to send the file to. Only googledrive is supported at the moment.
     **/
    private String remoteLocation;
    /**
      * The ID of the remote item
     **/
    private String remoteId;
    /**
      * The location of the cloud storage
     **/
    private String s3Bucket;
    /**
      * The name of the product associated with the file
     **/
    private String productName;
    /**
      * The URL to download the file
     **/
    private String url;
    /**
      * The visible name of the file
     **/
    private String name;
    /**
      * The description of the file
     **/
    private String description;

    /**
    * The ID of the file
    * @return id
    **/
    @JsonProperty("id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(Integer id) {
        this.id = id;
    }

    public GetAssociatedProductFilesResponseAllOfDataInner id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The ID of the product associated with the file
    * @return productId
    **/
    @JsonProperty("product_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getProductId() {
        return productId;
    }

    /**
     * Set productId
     **/
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public GetAssociatedProductFilesResponseAllOfDataInner productId(Integer productId) {
        this.productId = productId;
        return this;
    }

    /**
    * The UTC date time when the file was uploaded. Format: YYYY-MM-DD HH:MM:SS
    * @return addTime
    **/
    @JsonProperty("add_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getAddTime() {
        return addTime;
    }

    /**
     * Set addTime
     **/
    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public GetAssociatedProductFilesResponseAllOfDataInner addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The UTC date time when the file was last updated. Format: YYYY-MM-DD HH:MM:SS
    * @return updateTime
    **/
    @JsonProperty("update_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Set updateTime
     **/
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public GetAssociatedProductFilesResponseAllOfDataInner updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
    * The original name of the file
    * @return fileName
    **/
    @JsonProperty("file_name")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getFileName() {
        return fileName;
    }

    /**
     * Set fileName
     **/
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public GetAssociatedProductFilesResponseAllOfDataInner fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
    * The size of the file in bytes
    * @return fileSize
    **/
    @JsonProperty("file_size")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getFileSize() {
        return fileSize;
    }

    /**
     * Set fileSize
     **/
    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public GetAssociatedProductFilesResponseAllOfDataInner fileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
    * Whether the user is active or not.
    * @return activeFlag
    **/
    @JsonProperty("active_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getActiveFlag() {
        return activeFlag;
    }

    /**
     * Set activeFlag
     **/
    public void setActiveFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
    }

    public GetAssociatedProductFilesResponseAllOfDataInner activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * Whether the file was uploaded as inline or not
    * @return inlineFlag
    **/
    @JsonProperty("inline_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getInlineFlag() {
        return inlineFlag;
    }

    /**
     * Set inlineFlag
     **/
    public void setInlineFlag(Boolean inlineFlag) {
        this.inlineFlag = inlineFlag;
    }

    public GetAssociatedProductFilesResponseAllOfDataInner inlineFlag(Boolean inlineFlag) {
        this.inlineFlag = inlineFlag;
        return this;
    }

    /**
    * The location type to send the file to. Only googledrive is supported at the moment.
    * @return remoteLocation
    **/
    @JsonProperty("remote_location")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getRemoteLocation() {
        return remoteLocation;
    }

    /**
     * Set remoteLocation
     **/
    public void setRemoteLocation(String remoteLocation) {
        this.remoteLocation = remoteLocation;
    }

    public GetAssociatedProductFilesResponseAllOfDataInner remoteLocation(String remoteLocation) {
        this.remoteLocation = remoteLocation;
        return this;
    }

    /**
    * The ID of the remote item
    * @return remoteId
    **/
    @JsonProperty("remote_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getRemoteId() {
        return remoteId;
    }

    /**
     * Set remoteId
     **/
    public void setRemoteId(String remoteId) {
        this.remoteId = remoteId;
    }

    public GetAssociatedProductFilesResponseAllOfDataInner remoteId(String remoteId) {
        this.remoteId = remoteId;
        return this;
    }

    /**
    * The location of the cloud storage
    * @return s3Bucket
    **/
    @JsonProperty("s3_bucket")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getS3Bucket() {
        return s3Bucket;
    }

    /**
     * Set s3Bucket
     **/
    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    public GetAssociatedProductFilesResponseAllOfDataInner s3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
        return this;
    }

    /**
    * The name of the product associated with the file
    * @return productName
    **/
    @JsonProperty("product_name")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getProductName() {
        return productName;
    }

    /**
     * Set productName
     **/
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public GetAssociatedProductFilesResponseAllOfDataInner productName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
    * The URL to download the file
    * @return url
    **/
    @JsonProperty("url")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getUrl() {
        return url;
    }

    /**
     * Set url
     **/
    public void setUrl(String url) {
        this.url = url;
    }

    public GetAssociatedProductFilesResponseAllOfDataInner url(String url) {
        this.url = url;
        return this;
    }

    /**
    * The visible name of the file
    * @return name
    **/
    @JsonProperty("name")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public GetAssociatedProductFilesResponseAllOfDataInner name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The description of the file
    * @return description
    **/
    @JsonProperty("description")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Set description
     **/
    public void setDescription(String description) {
        this.description = description;
    }

    public GetAssociatedProductFilesResponseAllOfDataInner description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAssociatedProductFilesResponseAllOfDataInner {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    inlineFlag: ").append(toIndentedString(inlineFlag)).append("\n");
        sb.append("    remoteLocation: ").append(toIndentedString(remoteLocation)).append("\n");
        sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
        sb.append("    s3Bucket: ").append(toIndentedString(s3Bucket)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetAssociatedProductFilesResponseAllOfDataInner} object that
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

        GetAssociatedProductFilesResponseAllOfDataInner model = (GetAssociatedProductFilesResponseAllOfDataInner) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(productId, model.productId) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(updateTime, model.updateTime) &&
        java.util.Objects.equals(fileName, model.fileName) &&
        java.util.Objects.equals(fileSize, model.fileSize) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(inlineFlag, model.inlineFlag) &&
        java.util.Objects.equals(remoteLocation, model.remoteLocation) &&
        java.util.Objects.equals(remoteId, model.remoteId) &&
        java.util.Objects.equals(s3Bucket, model.s3Bucket) &&
        java.util.Objects.equals(productName, model.productName) &&
        java.util.Objects.equals(url, model.url) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(description, model.description);
    }

    /**
     * Returns a hash code for a {@code GetAssociatedProductFilesResponseAllOfDataInner}.
     *
     * @return a hash code value for a {@code GetAssociatedProductFilesResponseAllOfDataInner}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        productId,
        addTime,
        updateTime,
        fileName,
        fileSize,
        activeFlag,
        inlineFlag,
        remoteLocation,
        remoteId,
        s3Bucket,
        productName,
        url,
        name,
        description);
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

    /**
      * The file data
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetAssociatedProductFilesResponseAllOfDataInnerQueryParam  {

        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("productId")
        private Integer productId;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("updateTime")
        private String updateTime;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("fileName")
        private String fileName;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("fileSize")
        private Integer fileSize;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("inlineFlag")
        private Boolean inlineFlag;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("remoteLocation")
        private String remoteLocation;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("remoteId")
        private String remoteId;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("s3Bucket")
        private String s3Bucket;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("productName")
        private String productName;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("url")
        private String url;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("description")
        private String description;

        /**
        * The ID of the file
        * @return id
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        public Integer getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(Integer id) {
            this.id = id;
        }

        public GetAssociatedProductFilesResponseAllOfDataInnerQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The ID of the product associated with the file
        * @return productId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("product_id")
        public Integer getProductId() {
            return productId;
        }

        /**
         * Set productId
         **/
        public void setProductId(Integer productId) {
            this.productId = productId;
        }

        public GetAssociatedProductFilesResponseAllOfDataInnerQueryParam productId(Integer productId) {
            this.productId = productId;
            return this;
        }

        /**
        * The UTC date time when the file was uploaded. Format: YYYY-MM-DD HH:MM:SS
        * @return addTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("add_time")
        public String getAddTime() {
            return addTime;
        }

        /**
         * Set addTime
         **/
        public void setAddTime(String addTime) {
            this.addTime = addTime;
        }

        public GetAssociatedProductFilesResponseAllOfDataInnerQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The UTC date time when the file was last updated. Format: YYYY-MM-DD HH:MM:SS
        * @return updateTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("update_time")
        public String getUpdateTime() {
            return updateTime;
        }

        /**
         * Set updateTime
         **/
        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public GetAssociatedProductFilesResponseAllOfDataInnerQueryParam updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
        * The original name of the file
        * @return fileName
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("file_name")
        public String getFileName() {
            return fileName;
        }

        /**
         * Set fileName
         **/
        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public GetAssociatedProductFilesResponseAllOfDataInnerQueryParam fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
        * The size of the file in bytes
        * @return fileSize
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("file_size")
        public Integer getFileSize() {
            return fileSize;
        }

        /**
         * Set fileSize
         **/
        public void setFileSize(Integer fileSize) {
            this.fileSize = fileSize;
        }

        public GetAssociatedProductFilesResponseAllOfDataInnerQueryParam fileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        /**
        * Whether the user is active or not.
        * @return activeFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("active_flag")
        public Boolean getActiveFlag() {
            return activeFlag;
        }

        /**
         * Set activeFlag
         **/
        public void setActiveFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
        }

        public GetAssociatedProductFilesResponseAllOfDataInnerQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * Whether the file was uploaded as inline or not
        * @return inlineFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("inline_flag")
        public Boolean getInlineFlag() {
            return inlineFlag;
        }

        /**
         * Set inlineFlag
         **/
        public void setInlineFlag(Boolean inlineFlag) {
            this.inlineFlag = inlineFlag;
        }

        public GetAssociatedProductFilesResponseAllOfDataInnerQueryParam inlineFlag(Boolean inlineFlag) {
            this.inlineFlag = inlineFlag;
            return this;
        }

        /**
        * The location type to send the file to. Only googledrive is supported at the moment.
        * @return remoteLocation
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("remote_location")
        public String getRemoteLocation() {
            return remoteLocation;
        }

        /**
         * Set remoteLocation
         **/
        public void setRemoteLocation(String remoteLocation) {
            this.remoteLocation = remoteLocation;
        }

        public GetAssociatedProductFilesResponseAllOfDataInnerQueryParam remoteLocation(String remoteLocation) {
            this.remoteLocation = remoteLocation;
            return this;
        }

        /**
        * The ID of the remote item
        * @return remoteId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("remote_id")
        public String getRemoteId() {
            return remoteId;
        }

        /**
         * Set remoteId
         **/
        public void setRemoteId(String remoteId) {
            this.remoteId = remoteId;
        }

        public GetAssociatedProductFilesResponseAllOfDataInnerQueryParam remoteId(String remoteId) {
            this.remoteId = remoteId;
            return this;
        }

        /**
        * The location of the cloud storage
        * @return s3Bucket
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("s3_bucket")
        public String getS3Bucket() {
            return s3Bucket;
        }

        /**
         * Set s3Bucket
         **/
        public void setS3Bucket(String s3Bucket) {
            this.s3Bucket = s3Bucket;
        }

        public GetAssociatedProductFilesResponseAllOfDataInnerQueryParam s3Bucket(String s3Bucket) {
            this.s3Bucket = s3Bucket;
            return this;
        }

        /**
        * The name of the product associated with the file
        * @return productName
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("product_name")
        public String getProductName() {
            return productName;
        }

        /**
         * Set productName
         **/
        public void setProductName(String productName) {
            this.productName = productName;
        }

        public GetAssociatedProductFilesResponseAllOfDataInnerQueryParam productName(String productName) {
            this.productName = productName;
            return this;
        }

        /**
        * The URL to download the file
        * @return url
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        public String getUrl() {
            return url;
        }

        /**
         * Set url
         **/
        public void setUrl(String url) {
            this.url = url;
        }

        public GetAssociatedProductFilesResponseAllOfDataInnerQueryParam url(String url) {
            this.url = url;
            return this;
        }

        /**
        * The visible name of the file
        * @return name
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public GetAssociatedProductFilesResponseAllOfDataInnerQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The description of the file
        * @return description
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        public String getDescription() {
            return description;
        }

        /**
         * Set description
         **/
        public void setDescription(String description) {
            this.description = description;
        }

        public GetAssociatedProductFilesResponseAllOfDataInnerQueryParam description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetAssociatedProductFilesResponseAllOfDataInnerQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
            sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
            sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
            sb.append("    inlineFlag: ").append(toIndentedString(inlineFlag)).append("\n");
            sb.append("    remoteLocation: ").append(toIndentedString(remoteLocation)).append("\n");
            sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
            sb.append("    s3Bucket: ").append(toIndentedString(s3Bucket)).append("\n");
            sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
            sb.append("    url: ").append(toIndentedString(url)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
