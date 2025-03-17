from db_connection import Session
from models import Event
from sqlalchemy import text
from type_selector import analise_data

def process_events(entity_name):
    session = Session()
    try:
        # Получение всех событий
        # events = session.query(Event).all()
        #
        events = session.query(Event).filter(text(f"COMMENTS->>'$.type' = '{entity_name}'") ).all()


        # Итерация по событиям
        global field_values
        field_values = {}
        for event in events:
            analyse_rest_response(entity_name,event.processed_data)
            # print(f"Event ID: {event.id}")
            # print(f"Customer: {event.customer_name}")
            # print(f"Processed data: {event.processed_data}")

        field_types = analise_data(field_values)
        print("---")
    finally:
        session.close()

    return field_types



# field_values = {
#     ("entity1", "field1"): [1, 2, 3

field_values = {}
def analyse_rest_response(entity_name,rest_response):

    data = rest_response.get("data")

    if not data:
        print (f"No data for {entity_name}")
        return
    for dto in data:
        for field_name, field_value in dto.items():
            list = field_values.get((entity_name, field_name), [])
            list.append(field_value)
            field_values[(entity_name, field_name)]= list


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
