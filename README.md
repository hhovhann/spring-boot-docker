# spring-boot-docker
spring-boot-docker

# Build docker image
mvn docker-compose:build

# Run docker container
mvn docker-compose:up

NOTE: Please make sure that have installed docker desktop on your local machine

# Short commands list for containers/images/volumes

### List all containers (only IDs)
docker ps -aq   
### List all images 
docker images ls
### List all volumes
docker volume ls        
### Stop all running containers
docker stop $(docker ps -aq)
### Remove all containers
docker rm $(docker ps -aq)
### Remove all container(s) by id(s)
docker rm container_id1 container_id2
### Remove all images
docker rmi $(docker images -q)
### Removing All Unused Objects
docker system prune
### Remove image(s) by id(s)
docker rmi image_id1 image_id2 - delete image(s)
### Inspect the image
docker inspect image_id
### Inspect the container
docker inspect container_id

### verify records in Mongo
docker exec -i -t hhovhann-mongo /bin/bash 
root@ff55937c3772:/# mongo
root@ff55937c3772:/# show dbs
root@ff55937c3772:/# use local
root@ff55937c3772:/# db.users.find()

