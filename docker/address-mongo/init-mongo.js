db.createUser(
	{
		user: "sysmgadm",
		pwd: "5y54Dm1",
		roles: [ 
			{ role: "userAdminAnyDatabase", db: "admin" }, "readWriteAnyDatabase" 
		]
	}
);

db.createUser(
    {
        "user" : "addressManager",
        "pwd": "@Mn6GeR#",
        "roles" : [
            {
                "role": "dbOwner", "db": "address-repo"
            }, 
            { 
                "role" : "readWrite", 
                "db" : "address-repo" 
            } 
        ] 
    } 
);
