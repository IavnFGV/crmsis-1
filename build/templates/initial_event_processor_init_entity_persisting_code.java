                    JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        LocalDateTime updateTime = DateUtils.parseDateTime(node.path("update_time").asText());
                        LocalDateTime addTime = DateUtils.parseDateTime(node.path("add_time").asText());
                        LocalDateTime actionTime =updateTime;
                        if(actionTime==null){
                            actionTime=addTime;
                        }
                        if(actionTime != null){
                            LocalDateTime webhookRegisteredTime = getWebhookRegisteredTime();
                            if (webhookRegisteredTime != null && actionTime.isAfter(webhookRegisteredTime)) {
                            // entity shows data for the operation after webhook registration - it should be in webhooks
                                logger.warn("Skipped due to unacceptable action time. Event id = " + event.id);
                                skippedEntitiesCount++;
                                continue;
                            }
                        }
                        entitiesCount++;
                        JsonToEntityServiceAnswer<$ENTITY_CLASS_NAME,PanacheEntityBase,PanacheEntityBase> answer = jsonService.to$ENTITY_CLASS_NAME(node);
                        entities.addAll(answer.getEntities());
                        customFields.addAll(answer.getCustomFieldEntities());
                        customFieldRefs.addAll(answer.getCustomFieldsRefs());
                    }
