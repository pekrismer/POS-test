# Build
mvn clean package && docker build -t POS/test .

# RUN

docker rm -f test || true && docker run -d -p 8080:8080 -p 4848:4848 --name test POS/test 