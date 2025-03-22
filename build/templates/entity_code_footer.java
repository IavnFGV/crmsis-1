
    @Type(JsonType.class)
    @Column(columnDefinition = "json", name = "JSON")
    public String json;

    @Column(name = "CORRELATION_ID")
    public UUID correlationId;

    #BEFORE_CLASS_CLOSE


} //close class