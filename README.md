# fyle_backend
Fyle backend assignment 
Deliverables : 

1.use PostgreSQL as a backend database
DONE!
----

jwt token generation call : 
<img src="images/authentication.jpg" height="300" width="300" >
---------------------------------------------------
Curl command to get the jwt authenticatin token :
----------------------------------------------------
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
--------------------------------------------------------------------
Curl command to get the Brach as per the IFSC code : ( does not work , as remote database not connected )

curl -X GET \
  'http://fylebacken.herokuapp.com/bankdetails?bankIfsc=ABHY0065001' \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJmeWxlIiwiZXhwIjoxNTcxNzQ4NjY1LCJpYXQiOjE1NzEzMTY2NjV9.JcKk13bXLwz_tCDFXNx5iLpBHTMpDK0sI3veDjzA5WpYFm3_Q2-grGhrft3WQTisR_4S5LiqUN7ivlcIm8aiBw' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Content-Type: application/x-www-form-urlencoded' \
  -H 'Postman-Token: 21f0f391-34ce-4640-b492-be0336b7be7a,f2023302-74ef-4b47-98d4-dd625a3f87ef' \
  -H 'Referer: http://fylebacken.herokuapp.com/bankdetails?bankIfsc=ABHY0065001' \
  -H 'User-Agent: PostmanRuntime/7.18.0' \
  -H 'cache-control: no-cache'
  
  -------------------------------------------------------------------- 
 3.GET API to fetch all details of branches, given bank name and a city. This API should also support limit and offset parameters 
  Curl command to get bank details as per the bank name and city 
  //run locally ( run locally on system using postGreSql)
  --------------------------------------------------------------------
  curl -X GET \
  'http://localhost:8080/bankdetails/bankNameAndCity?bank_name=ALLAHABAD%20BANK&city=HYDERABAD&offset=1&limit=5' \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJmeWxlIiwiZXhwIjoxNTcxNjczNzI5LCJpYXQiOjE1NzEyNDE3Mjl9.8JoipCq1JeU_gKs-FmrcHNKeh0uLTvyvRE6z_Qk22xKHOuI4aj0JahqLzE7VCj1HtQ63pKJDrOvXG3QchvqK8g' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Host: localhost:8080' \
  -H 'Postman-Token: 3499704c-4f69-4c7b-be59-3cf59b0b2127,c6c16324-0be9-4f5d-a957-5a01ab9434b2' \
  -H 'User-Agent: PostmanRuntime/7.18.0' \
  -H 'cache-control: no-cache'
  --------------------------------------------------------------------
  4.APIs should be authenticated using a JWT key, with validity = 5 days
  ------------------------------------------------
  JWT Token with 5 day validity :
 ----------------------------------------------------------------
  eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJmeWxlIiwiZXhwIjoxNTcxNjczNzI5LCJpYXQiOjE1NzEyNDE3Mjl9.8JoipCq1JeU_gKs-FmrcHNKeh0uLTvyvRE6z_Qk22xKHOuI4aj0JahqLzE7VCj1HtQ63pKJDrOvXG3QchvqK8g

