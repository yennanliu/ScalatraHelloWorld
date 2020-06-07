package com.example.app

import org.scalatra._

class MyScalatraServlet extends ScalatraServlet {

  get("/") {
    //views.html.hello()
    "Hi there!"
  }

   get("/helloworld") {
    //views.html.hello()
    "helloworld !"
  }

}
