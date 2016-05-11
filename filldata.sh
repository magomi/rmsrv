#!/bin/sh 

curl -i -X POST -H "Content-Type:application/json" -d '{"email" : "hans@codefromhell.org" }' http://localhost:8080/users
 curl -i -X POST -H "Content-Type:application/json" -d '{"name" : "Jogging", "baseUnit" : 1, "baseUnitName" : "h", "points" : 100 }' http://localhost:8080/activities
curl -i -X POST -H "Content-Type:application/json" -d '{"name" : "Radfahren", "baseUnit" : 1, "baseUnitName" : "h", "points" : 50 }' http://localhost:8080/activities
curl -i -X POST -H "Content-Type:application/json" -d '{"name" : "Schwimmen", "baseUnit" : 1, "baseUnitName" : "h", "points" : 100 }' http://localhost:8080/activities
curl -i -X POST -H "Content-Type:application/json" -d '{"user" : "http://localhost:8080/users/hans@codefromhell.org", "activity" : "http://localhost:8080/activities/Radfahren", "ammount" : 3 }' http://localhost:8080/moves
curl -i -X POST -H "Content-Type:application/json" -d '{"user" : "http://localhost:8080/users/hans@codefromhell.org", "activity" : "http://localhost:8080/activities/Schwimmen", "ammount" : 1 }' http://localhost:8080/moves
