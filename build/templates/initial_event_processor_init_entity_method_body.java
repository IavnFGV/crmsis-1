    @Transactional
    public void init$ENTITY_NAME_TITLED() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "$ENTITY_NAME");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase>  entities = new ArrayList<>();
                List<PanacheEntityBase>  customFields = new ArrayList<>();
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                    $PERSISTING_CODE
                    persistEntities(entities,"$ENTITY_NAME_TITLED");
                    persistEntitiesAsync(customFields,"$ENTITY_NAME_TITLEDCustomField");
                }else{
                    logger.warn("$ENTITY_NAME_TITLED HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " $ENTITY_NAME_TITLED DONE");
            pageIndex++; // Переход к следующей странице
        }
        logger.info("$ENTITY_NAME_TITLED processed. Events = " + eventsCount + ", entities = " + entitiesCount);
    }