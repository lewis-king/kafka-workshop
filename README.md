Start the service dependencies
```docker compose up```

Send a message using the cli
./kafka-console-producer --topic sports --bootstrap-server localhost:29092

Hit the exposed service endpoint
```curl -d '{"message":"Ronaldo scored a goal"}' -H "Content-Type: application/json" -X POST http://localhost:8080/sports```
```curl -d '{"message":"Messi misses a penalty"}' -H "Content-Type: application/json" -X POST http://localhost:8080/sports```

