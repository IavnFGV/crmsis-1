    @Override
    public String getKey() {
        return key;
    }

    @Column(columnDefinition = "VARCHAR(100)", name = "KEY_PIPEDRIVE")
    public String key;

    @Column(columnDefinition = "VARCHAR(255)", name = "NAME_PIPEDRIVE")
    public String name;

    @Column(columnDefinition = "VARCHAR(50)", name = "FIELD_TYPE")
    public String fieldType;
