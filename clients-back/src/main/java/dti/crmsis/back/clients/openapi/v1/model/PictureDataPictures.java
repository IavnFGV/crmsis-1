package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class PictureDataPictures  {

    /**
      * The URL of the 128*128 picture
     **/
    private String _128;
    /**
      * The URL of the 512*512 picture
     **/
    private String _512;

    /**
    * The URL of the 128*128 picture
    * @return _128
    **/
    @JsonProperty("128")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String get128() {
        return _128;
    }

    /**
     * Set _128
     **/
    public void set128(String _128) {
        this._128 = _128;
    }

    public PictureDataPictures _128(String _128) {
        this._128 = _128;
        return this;
    }

    /**
    * The URL of the 512*512 picture
    * @return _512
    **/
    @JsonProperty("512")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String get512() {
        return _512;
    }

    /**
     * Set _512
     **/
    public void set512(String _512) {
        this._512 = _512;
    }

    public PictureDataPictures _512(String _512) {
        this._512 = _512;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PictureDataPictures {\n");

        sb.append("    _128: ").append(toIndentedString(_128)).append("\n");
        sb.append("    _512: ").append(toIndentedString(_512)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code PictureDataPictures} object that
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

        PictureDataPictures model = (PictureDataPictures) obj;

        return java.util.Objects.equals(_128, model._128) &&
        java.util.Objects.equals(_512, model._512);
    }

    /**
     * Returns a hash code for a {@code PictureDataPictures}.
     *
     * @return a hash code value for a {@code PictureDataPictures}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(_128,
        _512);
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
    public static class PictureDataPicturesQueryParam  {

        @jakarta.ws.rs.QueryParam("_128")
        private String _128;
        @jakarta.ws.rs.QueryParam("_512")
        private String _512;

        /**
        * The URL of the 128*128 picture
        * @return _128
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("128")
        public String get128() {
            return _128;
        }

        /**
         * Set _128
         **/
        public void set128(String _128) {
            this._128 = _128;
        }

        public PictureDataPicturesQueryParam _128(String _128) {
            this._128 = _128;
            return this;
        }

        /**
        * The URL of the 512*512 picture
        * @return _512
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("512")
        public String get512() {
            return _512;
        }

        /**
         * Set _512
         **/
        public void set512(String _512) {
            this._512 = _512;
        }

        public PictureDataPicturesQueryParam _512(String _512) {
            this._512 = _512;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PictureDataPicturesQueryParam {\n");

            sb.append("    _128: ").append(toIndentedString(_128)).append("\n");
            sb.append("    _512: ").append(toIndentedString(_512)).append("\n");
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
