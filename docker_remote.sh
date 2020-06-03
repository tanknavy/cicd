#!/bin/bash
# remote server to host docker
# https://www.docker.com/blog/how-to-deploy-on-remote-docker-hosts-with-docker-compose/
# /sbin/ip route|awk '/default/ { print $3 }'
#maven打包
mvn clean package
echo 'package ok!'
echo 'build start!'
#cd ./infrastructure/eureka_server
cd ./
service_name="thymeleaf"
service_prot=8097
#查看镜像id

#构建, -t --tag 'name:tag'
docker build -t $service_name .
echo "build $SERVER_NAME image"

#停止
# docker stop $service_name
#删除容器
#docker rm $service_name

#启动
echo "run docker.."
docker run -d --name $service_name --net=host -p $service_prot:$service_prot $service_name
#查看启动日志
docker logs -f  $service_name