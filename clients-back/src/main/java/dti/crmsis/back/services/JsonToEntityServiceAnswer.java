package dti.crmsis.back.services;

import java.util.List;

public class JsonToEntityServiceAnswer<E, CF, CFR> {

    List<E> entities;

    List<CF> customFieldEntities;

    List<CFR> customFieldsRefs;


    public JsonToEntityServiceAnswer(List<E> entities, List<CF> customFieldEntities, List<CFR> customFieldsRefs) {
        this.entities = entities;
        this.customFieldEntities = customFieldEntities;
        this.customFieldsRefs = customFieldsRefs;
    }

    public List<E> getEntities() {
        return entities;
    }

    public List<CF> getCustomFieldEntities() {
        return customFieldEntities;
    }

    public List<CFR> getCustomFieldsRefs() {
        return customFieldsRefs;
    }

    public static <E, CF, CFR> JsonToEntityServiceAnswer<E, CF, CFR> of(List<E> entities, List<CF> customFieldEntities, List<CFR> customFieldsRefs) {
        return new JsonToEntityServiceAnswer<>(entities, customFieldEntities, customFieldsRefs);
    }
}
