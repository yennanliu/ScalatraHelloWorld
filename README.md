# ScalatraHelloWorld
//build scala web app via `scalatra` framework


## Build & Run ##

```bash
cd ~ && cd ScalatraHelloWorld/app
sbt 
# inside sbt
#> jetty:start
> ~;jetty:stop;jetty:start # reload code automatically
```
If `browse` doesn't launch your browser, manually open [http://localhost:8080/](http://localhost:8080/) in your browser.

## File Structure ##
```
build.sbt               <= dependencies and project config are set in here

project
|_build.properties      <= specifies what version of sbt to use
|_plugins.sbt           <= sbt plugins can be added here

src
|_ main
|  |_ resources
|     |_ logback.xml
|  |_ scala
|  |  |   |_ScalatraBootstrap.scala     <= mount servlets in here
|  |  |_org
|  |      |_ yourdomain
|  |         |_ projectname
|  |            |_ MyScalatraServlet.scala
|  |_ twirl
|  |  |_layouts
|  |    |_default.scala.html
|  |  |_views
|  |    |_hello.scala.html
|  |_ webapp
|     |_ WEB-INF
|        |_ web.xml
|_ test
   |_ scala
      |_ org
         |_ yourdomain
            |_ projectname
               |_ MyScalatraServletTests.scala
```

## Ref ## 
- https://scalatra.org/
- Get started 
	- https://scalatra.org/getting-started/first-project.html
- project setting 
	- https://scalatra.org/getting-started/project-structure.html