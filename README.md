# spring-boot-docker
spring-boot-docker

# Build docker image
mvn dockerfile:build

# Run docker container
docker run -p 8080:8080 -t hhovhann/spring-boot-docker:latest

NOTE: Please make sure that have installed docker desktop on your local machine

# Tips for checking containers/images
docker ps -aq -all          - List all containers (only IDs)
docker images           - show list of images
docker inspect image_id - show inside of image
docker inspect container_id - show inside of container
docker rmi image_id1 image_id2 - delete image(s)
docker rm container_id1 container_id2 - delete container(s)
### Stop all running containers
docker stop $(docker ps -aq)
### Remove all containers
docker rm $(docker ps -aq)
### Remove all images
docker rmi $(docker images -q)