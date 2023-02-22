# fyle_backend
Fyle backend assignment 
Deliverables : 
<img src="images/Fyle.jpg" height="300" width="500" >
--------------
Heroku Hosting : https://fylebacken.herokuapp.com/
--------------
1.use PostgreSQL as a backend database
DONE!
----

jwt token generation call : 
  

<img src="images/authentication.jpg" height="600" width="1000" >

Curl command to get the jwt authenticatin token :
----------------------------------
```
curl -X POST \
  https://fylebacken.herokuapp.com/bankdetails/authenticate \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJmeWxlIiwiZXhwIjoxNTczMzk3Njc0LCJpYXQiOjE1NzI5NjU2NzR9.VjTcPtqt7MvhzojREyRO0LysrxRmoRLnfeJMIqr3ek811fFjb0-HWffCvyIMGMmH1dVZ8f5ELudLbfbcTwYM9Q' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Content-Length: 40' \
  -H 'Content-Type: application/json' \
  -H 'Host: fylebacken.herokuapp.com' \
  -H 'Postman-Token: b478df13-9902-4b7b-902f-cf4ba03644e1,2f97e842-5fb7-49f3-8a0a-acaac8c187ef' \
  -H 'User-Agent: PostmanRuntime/7.19.0' \
  -H 'cache-control: no-cache' \
  -d '{
"username":"fyle",
"password":"fyle"
}'
```
--------------------------

2.GET API to fetch a bank details, given branch IFSC code

Curl command to get the Brach as per the IFSC code : 

--------------------------
```
curl -X GET \
  'https://fylebacken.herokuapp.com/bankdetails/bankIfsc?ifsc=ABHY0065002' \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJmeWxlIiwiZXhwIjoxNTczMzk3Njc0LCJpYXQiOjE1NzI5NjU2NzR9.VjTcPtqt7MvhzojREyRO0LysrxRmoRLnfeJMIqr3ek811fFjb0-HWffCvyIMGMmH1dVZ8f5ELudLbfbcTwYM9Q' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Content-Length: 40' \
  -H 'Content-Type: application/json' \
  -H 'Host: fylebacken.herokuapp.com' \
  -H 'Postman-Token: 33f551b7-4eee-4fc2-a911-baba7f2de51d,806a102c-f755-4666-9c60-8dca40771e2c' \
  -H 'User-Agent: PostmanRuntime/7.19.0' \
  -H 'cache-control: no-cache' \
  -d '{
"username":"fyle",
"password":"fyle"
}'

```
--------------------------  

 3.GET API to fetch all details of branches, given bank name and a city. This API should also support limit and offset parameters 
  Curl command to get bank details as per the bank name and city 
  
 -------------------------- 
 ```
curl -X GET \
  'https://fylebacken.herokuapp.com/bankdetails/bankNameAndCity?bank_name=ALLAHABAD%20BANK&city=HYDERABAD&offset=1&limit=5' \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJmeWxlIiwiZXhwIjoxNTczMzk3Njc0LCJpYXQiOjE1NzI5NjU2NzR9.VjTcPtqt7MvhzojREyRO0LysrxRmoRLnfeJMIqr3ek811fFjb0-HWffCvyIMGMmH1dVZ8f5ELudLbfbcTwYM9Q' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Content-Length: 40' \
  -H 'Content-Type: application/json' \
  -H 'Host: fylebacken.herokuapp.com' \
  -H 'Postman-Token: 29ab2dd5-5a4d-4829-8393-e9261698290b,cdb0f046-7aa1-41cd-aa9d-428570502703' \
  -H 'User-Agent: PostmanRuntime/7.19.0' \
  -H 'cache-control: no-cache' \
  -d '{
"username":"fyle",
"password":"fyle"
}'
```
--------------------------
  4.APIs should be authenticated using a JWT key, with validity = 5 days

  JWT Token with 5 day validity :
```
 eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJmeWxlIiwiZXhwIjoxNTczMzk3Njc0LCJpYXQiOjE1NzI5NjU2NzR9.VjTcPtqt7MvhzojREyRO0LysrxRmoRLnfeJMIqr3ek811fFjb0-HWffCvyIMGMmH1dVZ8f5ELudLbfbcTwYM9Q
 
 ```
