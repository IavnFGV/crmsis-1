                    JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        List<List<PanacheEntityBase>> entitiesAndCustomFields= jsonService.to$ENTITY_CLASS_NAME(node);
                        entities.addAll(entitiesAndCustomFields.get(0));
                        customFields.addAll(entitiesAndCustomFields.get(1));
                        customFieldRefs.addAll(entitiesAndCustomFields.get(2));
                    }
