    @Transactional
    public void init$ENTITY_NAME_TITLED() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "$ENTITY_NAME")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                    $PERSISTING_CODE
                }else{
                    logger.warn("$ENTITY_NAME_TITLED HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("$ENTITY_NAME_TITLED processed. Events = " + eventsCount + ", entities = " + entitiesCount);
    }