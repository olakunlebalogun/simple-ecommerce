# simple-ecommerce

To access the Database on Commandline Interface use:
```mongosh

> mongo --username your_username --password your_password --authenticationDatabase admin

# After successful authentication, you can execute the listDatabases command:
> db.adminCommand({ listDatabases: 1 })

```

Using a bash file which i haven't tried: 

```bash 
#!/bin/bash

# Start MongoDB Docker container
docker run -d --name mongodb -p 27017:27017 mongo

# Wait for MongoDB to start
sleep 10

# Connect to the MongoDB Docker container using mongosh
docker exec -it mongodb mongosh

# Enable admin permissions
use admin
db.createUser({
  user: "admin",
  pwd: "adminpassword",
  roles: [{ role: "root", db: "admin" }]
})

# Exit mongosh and stop the MongoDB Docker container
exit
docker stop mongodb
docker rm mongodb

```