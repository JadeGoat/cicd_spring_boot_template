# cicd_spring_boot_template

# Setup
#### IDE (VSCode)
For VSCode, install extension Pack for Java

#### Prepare .env File
Create two environment file with the following field
1. .env file (outside the git repo folder) 
```
SERVER_PORT = <to_fill_in_server_port>
DB_URL = <to_fill_in_database_url>
DB_USERNAME = <to_fill_in_database_username>
DB_PASSWORD = <to_fill_in_database_password>
```
2. .env_docker file (at the root of git repo folder)
   change localhost to host.docker.internal 
```
SERVER_PORT = <to_fill_in_server_port>
DB_URL = <to_fill_in_database_url>
DB_USERNAME = <to_fill_in_database_username>
DB_PASSWORD = <to_fill_in_database_password>
```