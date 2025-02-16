setlocal

cd ../config

docker compose --env-file environment.env -f docker-compose-webhooks.yml up -d
docker compose --env-file environment.env -f docker-compose-clients-back.yml up -d
