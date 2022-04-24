## Description

### Dependencies
* Java OpenJDK 17
* Postgres 12.9+

Legiz API uses environment variables for local development, same for staging and deployment phase

**This must be configured before running the app**

| Name                  | Description                                   |
|-----------------------|-----------------------------------------------|
| **SPRING_ENV**        | This sets the current environment `dev, prod` |
| **DATABASE_URL**      | Database URL for connection                   |
| **DATABASE_USERNAME** | Database user eg. `postgres`                  |
| **DATABASE_PASSWORD** | Secret for database access                    |