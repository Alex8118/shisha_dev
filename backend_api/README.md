# shisha_dev
Shisha Project1
## Build

./gradlew clean build

## Run

./gradlew bootRun
- method POST http://localhost:8081/api/v1/request/my-list 
for adding picture to MyList
- method POST http://localhost:8081/api/v1/request/tobacco
for adding tobacco (only for upload period or admin)
- method GET http://localhost:8081/api/v1/request/my-list
return your list
- method GET http://localhost:8081/api/v1/request/tobacco-list
return all list of tobacco
## Run Demo Profile

./gradlew bootRun --args="--spring.profiles.active=demo"

- Use another port for your request http://localhost:3031/api/v1/request/my-list