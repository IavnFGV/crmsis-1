                    JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        $ENTITY_CLASS_NAME entity = new $ENTITY_CLASS_NAME();
                        $ID_EXTRACTOR
                        $OTHER_FIELDS_EXTRACTOR
                        customFields = customFields.stream().filter(Objects::nonNull).collect(Collectors.toList());
                        entity.json = objectMapper.writeValueAsString(node);
                        entities.add(entity);
                    }
