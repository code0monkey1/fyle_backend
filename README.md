# fyle_backend
Fyle backend assignment 
Deliverables : 
--------------
Heroku URL : https://fylebacken.herokuapp.com/
--------------
1.use PostgreSQL as a backend database
DONE!
----

jwt token generation call : 
  

<img src="images/authentication.jpg" height="600" width="1000" >

Curl command to get the jwt authenticatin token :

curl -X POST \
  http://fylebacken.herokuapp.com/bankdetails/authenticate \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Content-Length: 40' \
  -H 'Content-Type: application/json' \
  -H 'Host: fylebacken.herokuapp.com' \
  -H 'Postman-Token: 733d7e81-26ce-4c02-a880-108497f8c625,00610e56-ab04-46cf-ab2e-33a0d51b61d8' \
  -H 'User-Agent: PostmanRuntime/7.18.0' \
  -H 'cache-control: no-cache' \
  -d '{
"username":"fyle",
"password":"fyle"
}'

2.GET API to fetch a bank details, given branch IFSC code

Curl command to get the Brach as per the IFSC code : 


curl -X GET \
  'https://fylebacken.herokuapp.com/bankdetails/bankIfsc?ifsc=ABHY0065001' \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJmeWxlIiwiZXhwIjoxNTczMzk3Njc0LCJpYXQiOjE1NzI5NjU2NzR9.VjTcPtqt7MvhzojREyRO0LysrxRmoRLnfeJMIqr3ek811fFjb0-HWffCvyIMGMmH1dVZ8f5ELudLbfbcTwYM9Q' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Content-Length: 40' \
  -H 'Content-Type: application/json' \
  -H 'Host: fylebacken.herokuapp.com' \
  -H 'Postman-Token: dc238209-607d-4461-97e3-74842fa8d0b7,ce92f2c7-4d39-4f10-a7e9-78d45e00f4a5' \
  -H 'User-Agent: PostmanRuntime/7.19.0' \
  -H 'cache-control: no-cache' \
  -d '{
"username":"fyle",
"password":"fyle"
}'
  

 3.GET API to fetch all details of branches, given bank name and a city. This API should also support limit and offset parameters 
  Curl command to get bank details as per the bank name and city 
  
  
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
  -H 'Postman-Token: f202684a-10a1-4088-8831-73b172c3262f,085dfaa8-d53c-4d90-999b-a3c06fef3bf8' \
  -H 'User-Agent: PostmanRuntime/7.19.0' \
  -H 'cache-control: no-cache' \
  -d '{
"username":"fyle",
"password":"fyle"
}'
  4.APIs should be authenticated using a JWT key, with validity = 5 days

  JWT Token with 5 day validity :

 eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJmeWxlIiwiZXhwIjoxNTczMzk3Njc0LCJpYXQiOjE1NzI5NjU2NzR9.VjTcPtqt7MvhzojREyRO0LysrxRmoRLnfeJMIqr3ek811fFjb0-HWffCvyIMGMmH1dVZ8f5ELudLbfbcTwYM9Q
