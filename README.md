./kafka-console-producer --topic sports --bootstrap-server localhost:29092

curl -d '{"message":"Ronaldo scored a goal"}' -H "Content-Type: application/json" -X POST http://localhost:8080/sports
curl -d '{"message":"Messi misses a penalty"}' -H "Content-Type: application/json" -X POST http://localhost:8080/sports

