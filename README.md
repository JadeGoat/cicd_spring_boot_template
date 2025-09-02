# cicd_spring_boot_template

# Setup
#### Repo
Clone repo using command
```
git clone <url>
```
#### IDE (VSCode)
For VSCode, install extension Pack for Java

#### Prepare .env File
Create two environment files with the following field
1. '.env' file (outside the git repo folder) 
```
SERVER_PORT = <to_fill_in_server_port>
DB_URL = <to_fill_in_database_url>
DB_USERNAME = <to_fill_in_database_username>
DB_PASSWORD = <to_fill_in_database_password>
```
2. '.env_docker' file (at the root of git repo folder)
   
   Change localhost to host.docker.internal for DB_URL 
```
SERVER_PORT = <to_fill_in_server_port>
DB_URL = <to_fill_in_database_url>
DB_USERNAME = <to_fill_in_database_username>
DB_PASSWORD = <to_fill_in_database_password>
```

# Usage
#### To Run code
Right click on DemoApplication.java and "run Java".
#### Build docker image and run
eg. Access http://localhost:8080/swagger-ui/index.html