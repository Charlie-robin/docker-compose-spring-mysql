# docker-compose-spring-mysql

A sample project containerizing and connecting a Spring API and a MySql container.

You will have to have docker, a JDK and IntelliJ set up already to run this.

## Set-up

At the moment you have to build the `.jar` file for the Spring API.

_It is on my todo's to have it build the .jar in the Dockerfile_

If you open the project in IntelliJ, click on the maven tab of the right hand side, then click on the lowercase m icon you can choose to use maven package to create the `.jar`.

When that is done you can run the following from the command line:

```bash
docker-compose up
```

It should build the `springapi` image and start up both of the containers.

The api will fail to connect first of all as the db will not be ready. Don't worry it will try again until it does connect.

It should seed the db with a table and with some fictional users:

- [schema](./src/main/resources/schema.sql)
- [data](./src/main/resources/data.sql)

Once both containers are running if you go to http://localhost:8080/ you should get a random user.

Run the following:

```bash
# TO STOP THE CONTAINERS
docker-compose down

# TO LIST ALL CONTAINERS
docker ps -a

# TO REMOVE A CONTAINER
docker rm container-id
```

### Todo

- Add the mvn build as part of the Dockerfile.
  - So it builds the `.jar`
- Use environment variables for `app.properties`
- Add a react front end?

### Branches

- `main`: Current state of the project
