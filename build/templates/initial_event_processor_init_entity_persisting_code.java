                    JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        JsonToEntityServiceAnswer<$ENTITY_CLASS_NAME,PanacheEntityBase,PanacheEntityBase> answer = jsonService.to$ENTITY_CLASS_NAME(node);
                        entities.addAll(answer.getEntities());
                        customFields.addAll(answer.getCustomFieldEntities());
                        customFieldRefs.addAll(answer.getCustomFieldsRefs());
                    }
