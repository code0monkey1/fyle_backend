# fyle_backend
Fyle backend assignment 
Deliverables : 

1.use PostgreSQL as a backend database
DONE!
--
2.GET API to fetch a bank details, given branch IFSC code

3.GET API to fetch all details of branches, given bank name and a city. This API should also support limit and offset parameters
4.APIs should be authenticated using a JWT key, with validity = 5 days

Curl command to get the Brach as per the IFSC code : 
--------------------------------------------------------------------
curl -X GET \
  'http://localhost:8080/bankdetails/bankIfsc?ifsc=ABHY0065001' \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJmeWxlIiwiZXhwIjoxNTcxNjczNzI5LCJpYXQiOjE1NzEyNDE3Mjl9.8JoipCq1JeU_gKs-FmrcHNKeh0uLTvyvRE6z_Qk22xKHOuI4aj0JahqLzE7VCj1HtQ63pKJDrOvXG3QchvqK8g' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Host: localhost:8080' \
  -H 'Postman-Token: 742866bc-8b59-43ea-8a69-af1fe32036bf,419a66f2-4c73-4f66-a215-c052a0ffd0f7' \
  -H 'User-Agent: PostmanRuntime/7.18.0' \
  -H 'cache-control: no-cache'
  
  --------------------------------------------------------------------
  
  Curl command to get bank details as per the bank name and city 
  
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
  
  JWT Token with 5 day validity :
 ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJmeWxlIiwiZXhwIjoxNTcxNjczNzI5LCJpYXQiOjE1NzEyNDE3Mjl9.8JoipCq1JeU_gKs-FmrcHNKeh0uLTvyvRE6z_Qk22xKHOuI4aj0JahqLzE7VCj1HtQ63pKJDrOvXG3QchvqK8g
 ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
