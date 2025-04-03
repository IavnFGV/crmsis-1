public JsonToEntityServiceAnswer<$ENTITY_CLASS_NAME,PanacheEntityBase,PanacheEntityBase>  to$ENTITY_CLASS_NAME(JsonNode node){

    List<$ENTITY_CLASS_NAME> entities = new ArrayList<>();

    $ENTITY_CLASS_NAME entity = new $ENTITY_CLASS_NAME();
    $ID_EXTRACTOR
    $OTHER_FIELDS_EXTRACTOR
    entity.json = writeNodeAsString(node);
    entities.add(entity);

    List<PanacheEntityBase> additionalEntities = new ArrayList<>();
    additionalEntities.addAll(knownFieldService.addKnownField("$BASE_ENTITY_NAME",entity.key));

    return  JsonToEntityServiceAnswer.of(entities, additionalEntities, Collections.emptyList());

}




