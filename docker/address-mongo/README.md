# docker-mongodb
Docker file for mongodb

## Update docker-compose.yml

```
MONGO_INITDB_ROOT_USERNAME: "<your-root-username>"
MONGO_INITDB_ROOT_PASSWORD: "<your-root-password>"
MONGO_INITDB_DATABASE: "<your-database>"
````

## Create a MongoDB image

`docker build -t mongo32:0.1 .`


## Edit init-mongo.js

```
db.createUser(
	{
		user: "<root-username>",
		pwd: "<root-user-password",
		roles: [ 
			{ role: "userAdminAnyDatabase", db: "admin" }, "readWriteAnyDatabase" 
		]
	}
);

db.createUser(
    {
        "user" : "<specific-user>",
        "pwd": "<specific-user-password>",
        "roles" : [
            {
                "role": "dbOwner", "db": "<database-name>"
            }, 
            { 
                "role" : "readWrite", 
                "db" : "<database-name>" 
            } 
        ] 
    } 
);
```

## Run the container

`docker compose up -d`
