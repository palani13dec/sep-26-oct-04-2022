## Develop a calculator to do the following.


* GET -> http://localhost:8081/calc/add/1/3

* GET -> http://localhost:8081/calc/square/60

* PUT -> http://localhost:8081/calc/subtract/11/3 

* POST -> http://localhost:8081/calc/product?num1=12&num2=14

#### Note:

* Do not write your Logic inside a Controller class.
* Write it as a separate component and wire it with the controller
* Modify the port in application.properties file using __server.port=8081__
* _Though some of the mappings like PUT, POST don't really make sense in this example, you'll just practice using them._