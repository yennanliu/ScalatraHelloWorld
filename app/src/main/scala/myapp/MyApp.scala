package myapp

import org.scalatra._

class MyApp extends ScalatraServlet {

  get("/") {
    //views.html.hello()
    "Hi there!"
  }

   get("/helloworld") {
    //views.html.hello()
    "helloworld !"
  }

}
