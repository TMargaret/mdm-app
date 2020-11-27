# mdm-ui

The MDM-application is developed for test purposes. 
It is a small-scale web solution that handles a device inventory that a company may have for its employees.

## Programming languages used

* [Spring-boot]
* [EmberJs]

## Resources

* `git clone https://github.com/TMargaret/mdm-app.git`

## Set up database

At application.properties file please fill in the url and credentials:

`spring.datasource.url=jdbc:mysql://<URL>/<DATABASE_NAME>?useUnicode=true&characterEncoding=utf8&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC&createDatabaseIfNotExist=true`

`spring.datasource.username=<username>`

`spring.datasource.password=<password>`

Liquibase will take care of the schema and data.

## Running / Development

* `mvn spring-boot:run`   under folder `\mdm`
* `ember serve`           under folder `mdm\mdm-ui`
* Visit your app at [http://localhost:8082](http://localhost:8082).

### Credentials for login

* username: `admin`
* password: `admin`
