                    JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                            for (Iterator<String> it = node.fieldNames(); it.hasNext(); ) {
                                String fieldName = it.next();
                                Map<String, Set<String>> fieldMap = fields.computeIfAbsent(fieldName, k -> new HashMap<>());
                                Set<String> values = fieldMap.computeIfAbsent("$ENTITY_NAME_TITLED", k -> new HashSet<>());
                                if(node.isTextual()){
                                    values.add(node.asText().substring(0,Math.min(10,node.asText().length())));
                                }else{
                                    values.add(objectMapper.writeValueAsString(node.get(fieldName)));
                                }
                                Map<String, Set<String>> fieldMap1 = dtos.computeIfAbsent("$ENTITY_NAME_TITLED", k -> new HashMap<>());
                                Set<String> values1 = fieldMap1.computeIfAbsent(fieldName, k -> new HashSet<>());
                                if(node.isTextual()){
                                    values1.add(node.asText().substring(0,Math.min(100,node.asText().length())));
                                }else{
                                    values1.add(objectMapper.writeValueAsString(node.get(fieldName)));
                                }
                            }
                        entitiesCount++;
                        $ENTITY_CLASS_NAME entity = new $ENTITY_CLASS_NAME();
                        $ID_EXTRACTOR
                        $OTHER_FIELDS_EXTRACTOR
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }
