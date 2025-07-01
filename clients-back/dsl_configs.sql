INSERT INTO DSL_CONFIGS (VERSION, NAME, TYPE, DEFINITION)
VALUES (
           1,  -- версия, если у тебя по умолчанию 1
           'assignmentPolicy1',
           'GLOBAL',  -- если это глобальная конфигурация, иначе поменяй на свой тип
           '{
             "assignmentPolicy1": {
               "type": "oneByOneAssignmentPolicy",
               "retryCount": "4",
               "waitMinutes": 15,
               "failAction": {
                 "type": "refAction",
                 "ref": "notifyTelegramAction1"
               },
               "members": {
                 "zabolotniy.evgeniy@gmail.com": {
                   "availability": "default"
                 },
                 "mufik.petro@gmail.com": {
                   "availability": "default"
                 },
                 "ivan.drozda@gmail.com": {
                   "availability": "default"
                 }
               }
             }
           }')
;


INSERT INTO DSL_CONFIGS (VERSION, NAME, TYPE, DEFINITION)
VALUES (
           1,
           'notifyTelegramAction1',
           'GLOBAL',
           '{
                      "notifyTelegramAction1": {
                        "type": "notifyTelegramAction",
                        "token": "8102241829:AAEy_ZbU0aZhHZ-YLy5Yt9i6CLHkSNDY21g"
                      }
                    }')
;
INSERT INTO DSL_CONFIGS (VERSION, NAME, TYPE, DEFINITION)
VALUES (
           1,
           'flow1',
           'FOR_FLOW',
           '{
             "flow1": {
               "version": 1,
               "type": "flow",
               "initialBlock": "srcWebhook",
               "successOnTopic": "deal.claimed",
               "blocks": {
                 "srcWebhook": {
                   "type": "source",
                   "subscribe": [
                     "deal.received.api",
                     "deal.received.api.retry"
                   ],
                   "passTo": "assignment",
                   "delaySecs":0
                 },
                 "assignment": {
                   "type": "refAssignmentPolicy",
                   "ref": "assignmentPolicy1"
                 }
               }
             }
           }')
;

