# spring-demo

### Initialize spring boot
https://start.spring.io/

### http restful api
```shell
curl --location --request POST 'localhost:8000/api/v1/user' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Hugo"
}'

# to get data of all user
curl localhost:8000/api/v1/user
```

### Find depedency
mvnrepository.com

### Set up Docker Postgres

```shell
docker run --name postgres-spring -e POSTGRES_PASSWORD=password -d -p 5432:5432 postgres:alpine  

docker port postgres-spring

docker exec -it c05485a7001c  bash

# to go to postgres
bash-5.1# psql -U postgres

# to exit bash-5.1#
bash-5.1# exit
```
In postgres
```shell
# show a list of database 
postgres=# \l  
# create a databse
postgres=# CREATE DATABASE demodb;

# connect to the database
postgres=# \c demodb 

# to check up what's in there
postgres=# \d
postgres=# \dt 
```