
    @Type(JsonType.class)
    @Column(columnDefinition = "json", name = "JSON")
    public String json;

    @Column(name = "SOURCE_REQUEST_ID")
    public Long sourceRequestId;

    @Override
    public void setSourceRequestId(Long sourceRequestId){
        this.sourceRequestId = sourceRequestId;
    }

    @Override
    public Long getSourceRequestId(){
        return this.sourceRequestId;
    }

    #BEFORE_CLASS_CLOSE


} //close class