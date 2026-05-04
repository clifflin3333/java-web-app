FROM docker.io/library/openjdk:17-jdk-slim

# 設定容器內的工作目錄
WORKDIR /app

# 將本地的 JAR 檔拷貝到容器內
COPY target/*.jar app.jar

# 對外開放 8080 port (如果是 web 應用)
EXPOSE 8080

# 啟動指令
ENTRYPOINT ["java", "-jar", "app.jar"]
