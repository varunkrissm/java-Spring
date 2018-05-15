#  spring-boot-restapi-h2 0.0.1-SNAPSHOT

# In-Memory H2 database used

# use this url=jdbc:h2:mem:testdb; for H2 database

# execute the attached ddl.sql after the H2 console creation

# to access the H2 db console use this URL : http://localhost:8090/console

# to access the Spring Boot REST API url : http://localhost:8090/list

# the following data should be returned for above url response


[{
	"id": 1,
	"firstName": "admin",
	"lastName": "admin",
	"email": "admin@admin.com",
	"password": "admin"
}, {
	"id": 2,
	"firstName": "john",
	"lastName": "doe",
	"email": "john@gmail.com",
	"password": "johndoe"
}, {
	"id": 3,
	"firstName": "sham",
	"lastName": "tis",
	"email": "sham@yahoo.com",
	"password": "shamtis"
}]

