public JsonToEntityServiceAnswer<$ENTITY_CLASS_NAME,PanacheEntityBase,PanacheEntityBase>  to$ENTITY_CLASS_NAME(JsonNode node){
    List<$ENTITY_CLASS_NAME> entities = new ArrayList<>();

    List<PanacheEntityBase> additionalEntities = knownFieldService.ensureAllFieldsAreKnown(node, "$ENTITY_TYPE_NAME");
    Map<Boolean, List<PanacheEntityBase>> partitioned = additionalEntities.stream().collect(Collectors.partitioningBy(entity -> entity instanceof RefField));
    List<PanacheEntityBase> customFieldsRefs = partitioned.get(true);
    List<PanacheEntityBase> customFields = partitioned.get(false);
    if(customFieldsRefs == null){
        customFieldsRefs = new ArrayList<>();
    }

    $ENTITY_CLASS_NAME entity = new $ENTITY_CLASS_NAME();
    $ID_EXTRACTOR
    $OTHER_FIELDS_EXTRACTOR
    entity.json = writeNodeAsString(node);
    entities.add(entity);

    return  JsonToEntityServiceAnswer.of(entities, customFields, customFieldsRefs);

}




