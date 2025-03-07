package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetProjectPhasesResponseDataInner  {

    /**
      * The ID of the project phase
     **/
    private Integer id;
    /**
      * Name of a project phase
     **/
    private String name;
    /**
      * The ID of the project board this phase is linked to
     **/
    private BigDecimal boardId;
    /**
      * The order of a phase
     **/
    private BigDecimal orderNr;
    /**
      * The creation date and time of the board in UTC. Format: YYYY-MM-DD HH:MM:SS.
     **/
    private String addTime;
    /**
      * The update date and time of the board in UTC. Format: YYYY-MM-DD HH:MM:SS.
     **/
    private String updateTime;

    /**
    * The ID of the project phase
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

    public GetProjectPhasesResponseDataInner id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * Name of a project phase
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

    public GetProjectPhasesResponseDataInner name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The ID of the project board this phase is linked to
    * @return boardId
    **/
    @JsonProperty("board_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getBoardId() {
        return boardId;
    }

    /**
     * Set boardId
     **/
    public void setBoardId(BigDecimal boardId) {
        this.boardId = boardId;
    }

    public GetProjectPhasesResponseDataInner boardId(BigDecimal boardId) {
        this.boardId = boardId;
        return this;
    }

    /**
    * The order of a phase
    * @return orderNr
    **/
    @JsonProperty("order_nr")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getOrderNr() {
        return orderNr;
    }

    /**
     * Set orderNr
     **/
    public void setOrderNr(BigDecimal orderNr) {
        this.orderNr = orderNr;
    }

    public GetProjectPhasesResponseDataInner orderNr(BigDecimal orderNr) {
        this.orderNr = orderNr;
        return this;
    }

    /**
    * The creation date and time of the board in UTC. Format: YYYY-MM-DD HH:MM:SS.
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

    public GetProjectPhasesResponseDataInner addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The update date and time of the board in UTC. Format: YYYY-MM-DD HH:MM:SS.
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

    public GetProjectPhasesResponseDataInner updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetProjectPhasesResponseDataInner {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
        sb.append("    orderNr: ").append(toIndentedString(orderNr)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetProjectPhasesResponseDataInner} object that
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

        GetProjectPhasesResponseDataInner model = (GetProjectPhasesResponseDataInner) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(boardId, model.boardId) &&
        java.util.Objects.equals(orderNr, model.orderNr) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(updateTime, model.updateTime);
    }

    /**
     * Returns a hash code for a {@code GetProjectPhasesResponseDataInner}.
     *
     * @return a hash code value for a {@code GetProjectPhasesResponseDataInner}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        name,
        boardId,
        orderNr,
        addTime,
        updateTime);
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
    public static class GetProjectPhasesResponseDataInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("boardId")
        private BigDecimal boardId;
        @jakarta.ws.rs.QueryParam("orderNr")
        private BigDecimal orderNr;
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;
        @jakarta.ws.rs.QueryParam("updateTime")
        private String updateTime;

        /**
        * The ID of the project phase
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

        public GetProjectPhasesResponseDataInnerQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * Name of a project phase
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

        public GetProjectPhasesResponseDataInnerQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The ID of the project board this phase is linked to
        * @return boardId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("board_id")
        public BigDecimal getBoardId() {
            return boardId;
        }

        /**
         * Set boardId
         **/
        public void setBoardId(BigDecimal boardId) {
            this.boardId = boardId;
        }

        public GetProjectPhasesResponseDataInnerQueryParam boardId(BigDecimal boardId) {
            this.boardId = boardId;
            return this;
        }

        /**
        * The order of a phase
        * @return orderNr
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("order_nr")
        public BigDecimal getOrderNr() {
            return orderNr;
        }

        /**
         * Set orderNr
         **/
        public void setOrderNr(BigDecimal orderNr) {
            this.orderNr = orderNr;
        }

        public GetProjectPhasesResponseDataInnerQueryParam orderNr(BigDecimal orderNr) {
            this.orderNr = orderNr;
            return this;
        }

        /**
        * The creation date and time of the board in UTC. Format: YYYY-MM-DD HH:MM:SS.
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

        public GetProjectPhasesResponseDataInnerQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The update date and time of the board in UTC. Format: YYYY-MM-DD HH:MM:SS.
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

        public GetProjectPhasesResponseDataInnerQueryParam updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetProjectPhasesResponseDataInnerQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
            sb.append("    orderNr: ").append(toIndentedString(orderNr)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
