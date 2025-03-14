                    JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        $ENTITY_CLASS_NAME entity = new $ENTITY_CLASS_NAME();
                        $ID_EXTRACTOR
                        $OTHER_FIELDS_EXTRACTOR
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }
