INSERT INTO WORK_DAYS (name, type, priority, config_json)
VALUES (
           'default',
           'COMPANY',
           1,
           '{
               "weekly": [
                   {
                       "day": "MONDAY",
                       "from": "10:00",
                       "to": "18:00",
                       "breaks": [
                           { "from": "13:00", "to": "14:00" }
                       ]
                   },
                   {
                       "day": "TUESDAY",
                       "from": "10:00",
                       "to": "18:00",
                       "breaks": [
                           { "from": "13:00", "to": "14:00" }
                       ]
                   },
                   {
                       "day": "WEDNESDAY",
                       "from": "10:00",
                       "to": "18:00",
                       "breaks": [
                           { "from": "13:00", "to": "14:00" }
                       ]
                   },
                   {
                       "day": "THURSDAY",
                       "from": "10:00",
                       "to": "18:00",
                       "breaks": [
                           { "from": "13:00", "to": "14:00" }
                       ]
                   },
                   {
                       "day": "FRIDAY",
                       "from": "10:00",
                       "to": "18:00",
                       "breaks": [
                           { "from": "13:00", "to": "14:00" }
                       ]
                   },
                   {
                       "day": "SATURDAY",
                       "from": null,
                       "to": null,
                       "breaks": [],
                       "off": true
                   },
                   {
                       "day": "SUNDAY",
                       "from": null,
                       "to": null,
                       "breaks": [],
                       "off": true
                   }
               ],
               "exceptions": []
           }'
       );



INSERT INTO WORK_DAYS (name, type, priority, config_json)
VALUES (
           'ivan.drozda',
           'INDIVIDUAL',
           10,
           '{
               "weekly": [
                   {
                       "day": "MONDAY",
                       "from": "11:00",
                       "to": "19:00",
                       "breaks": [
                           { "from": "15:00", "to": "15:30" }
                       ]
                   },
                   {
                       "day": "TUESDAY",
                       "from": "11:00",
                       "to": "19:00",
                       "breaks": [
                           { "from": "15:00", "to": "15:30" }
                       ]
                   },
                   {
                       "day": "WEDNESDAY",
                       "from": "11:00",
                       "to": "19:00",
                       "breaks": [
                           { "from": "15:00", "to": "15:30" }
                       ]
                   },
                   {
                       "day": "THURSDAY",
                       "from": "11:00",
                       "to": "19:00",
                       "breaks": [
                           { "from": "15:00", "to": "15:30" }
                       ]
                   },
                   {
                       "day": "FRIDAY",
                       "from": "11:00",
                       "to": "19:00",
                       "breaks": [
                           { "from": "15:00", "to": "15:30" }
                       ]
                   },
                   {
                       "day": "SATURDAY",
                       "off": true,
                       "breaks": []
                   },
                   {
                       "day": "SUNDAY",
                       "off": true,
                       "breaks": []
                   }
               ],
               "exceptions": [
                   {
                       "date": "2025-07-01",
                       "off": true
                   }
               ]
           }'
       );


INSERT INTO WORK_DAYS (name, type, priority, config_json)
VALUES (
           'mufik.petro',
           'INDIVIDUAL',
           10,
           '{
               "weekly": [
                   {
                       "day": "MONDAY",
                       "from": "08:00",
                       "to": "16:00",
                       "breaks": [
                           { "from": "12:00", "to": "12:30" }
                       ]
                   },
                   {
                       "day": "TUESDAY",
                       "from": "08:00",
                       "to": "16:00",
                       "breaks": [
                           { "from": "12:00", "to": "12:30" }
                       ]
                   },
                   {
                       "day": "WEDNESDAY",
                       "from": "08:00",
                       "to": "16:00",
                       "breaks": [
                           { "from": "12:00", "to": "12:30" }
                       ]
                   },
                   {
                       "day": "THURSDAY",
                       "from": "08:00",
                       "to": "16:00",
                       "breaks": [
                           { "from": "12:00", "to": "12:30" }
                       ]
                   },
                   {
                       "day": "FRIDAY",
                       "from": "08:00",
                       "to": "16:00",
                       "breaks": [
                           { "from": "12:00", "to": "12:30" }
                       ]
                   },
                   {
                       "day": "SATURDAY",
                       "from": "08:00",
                       "to": "16:00",
                       "breaks": [
                           { "from": "12:00", "to": "12:30" }
                       ]
                   },
                   {
                       "day": "SUNDAY",
                       "off": true,
                       "breaks": []
                   }
               ],
               "exceptions": [
                   {
                       "date": "2025-07-02",
                       "from": "10:00",
                       "to": "14:00",
                       "breaks": []
                   }
               ]
           }'
       );

