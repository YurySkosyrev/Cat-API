./gredlew clean build
docker build . -t aviaurez/cats-api:1.0.0
#docker push aviaurez/cats-api:1.0.0
#docker pull aviaurez/cats-api:1.0.0

docker run -ti --rm -e DATASOURCE_HOST=172.24.128.1 aviaurez/cats-api:1.0.0
#-ti перехватываем сообщения консоли виртуальной машины в нашу консоль
#--rm после остановки приложения контейнер удаляется
