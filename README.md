docker pull mysql;
docker run -d -p 3306:3306 -e MYSQL_ALLOW_EMPTY_PASSWORD=true --name cars-database-mysql mysql; 
docker exec -i cars-database-mysql /bin/sh -c '/usr/bin/mysql -u root;
echo  "CREATE DATABASE cars" | docker exec -i cars-database-mysql /usr/bin/mysql -u root;  

---

docker kill cars-database-mysql;  docker rm cars-database-mysql;

---
docker exec -ti cars-database-mysql bash

mvn spring-boot:run 