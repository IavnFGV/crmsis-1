from db_connection import Session, Session2
from models import Event,RawRequest
from sqlalchemy import text
from type_selector import analise_data


def process_events(entity_name):
    session = Session()
    session2 = Session2()

    try:
        # Получение всех событий
        # events = session.query(Event).all()
        #
        print(entity_name)
        events = session.query(Event).filter(text(f"COMMENTS->>'$.type' = '{entity_name}'") ).all()


        # Итерация по событиям
        global field_values
        field_values = {}
        for event in events:
            analyse_rest_response(entity_name,event.processed_data)
            # print(f"Event ID: {event.id}")
            # print(f"Customer: {event.customer_name}")
            # print(f"Processed data: {event.processed_data}")

        type_in_webhook_table = {"ACTIVITIES": "activity",
                           "DEALS": "deal",
                           "LEADS": "lead",
                           "NOTES": "note",
                           "ORGANIZATIONS": "organization",
                           "PERSONS": "person",
                           "PIPELINES": "pipeline",
                           "PRODUCTS": "product",
                           "STAGES": "stage",
                           "USERS": "user"}

        type_in_webhook = type_in_webhook_table.get(entity_name, None)
        if type_in_webhook:
            rows = session2.query(RawRequest).filter(text(f"REQUEST_DATA->>'$.meta.entity' = '{type_in_webhook}'")).all()
            for row in rows:
                analyse_rest_response(entity_name,row.request_data,skip_fields=["custom_fields"],from_webhook=True)


        field_types = analise_data(field_values)
        print("---")
    finally:
        session.close()

    return dict(sorted(field_types.items(), key=lambda item: item[0][1]))



# field_values = {
#     ("entity1", "field1"): [1, 2, 3

field_values = {}
def analyse_rest_response(entity_name,rest_response,skip_fields=[], from_webhook = False):

    data = rest_response.get("data")

    if not data:
        print (f"No data for {entity_name}")
        return
    if from_webhook :
        parse_dto(data,entity_name,skip_fields)
    else:
        for dto in data:
            parse_dto(dto, entity_name,skip_fields)


def parse_dto(dto, entity_name,skip_fields):
    for field_name, field_value in dto.items():
        if field_name in skip_fields:
            continue
        list = field_values.get((entity_name, field_name), [])
        list.append(field_value)
        field_values[(entity_name, field_name)] = list

# process_events("START_SYNC", analyse_rest_response)

# process_events("ACTIVITIES", analyse_rest_response)
# process_events("ACTIVITY_FIELDS", analyse_rest_response)
# process_events("ACTIVITY_TYPES", analyse_rest_response)
# process_events("CURRENCIES", analyse_rest_response)
# process_events("DEAL_FIELDS", analyse_rest_response)
# process_events("DEALS", analyse_rest_response)
# process_events("LEAD_LABELS", analyse_rest_response)
# process_events("LEADS", analyse_rest_response)
# process_events("ORGANIZATION_FIELDS", analyse_rest_response)
# process_events("ORGANIZATIONS", analyse_rest_response)
# process_events("PERSON_FIELDS", analyse_rest_response)
# process_events("PERSONS", analyse_rest_response)
# process_events("PIPELINES", analyse_rest_response)
# process_events("PRODUCT_FIELDS", analyse_rest_response)
# process_events("PRODUCTS", analyse_rest_response)
# process_events("PROJECTS", analyse_rest_response)
# process_events("ROLES", analyse_rest_response)
# process_events("STAGES", analyse_rest_response)
# process_events("TASKS", analyse_rest_response)
# process_events("USERS", analyse_rest_response)
# process_events("WEBHOOKS", analyse_rest_response)

# process_events("STOP_SYNC", analyse_rest_response)
