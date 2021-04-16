# Reactive Web Sample

Server Side
---
1. Create a WebFlux Handler
2. Create a Router to handle the route
   
Client Side
---
1. Create a WebClient (Spring MVC RestTemplate is blocking by nature, WebClient is non-blocking)


Application
---

@SpringBootApplication is a convenience annotation that adds all of the following:

    - @Configuration: Tags the class as a source of bean definitions for the application context.

    - @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings. For example, if spring-webmvc is on the classpath, this annotation flags the application as a web application and activates key behaviors, such as setting up a DispatcherServlet.

    - @ComponentScan: Tells Spring to look for other components, configurations, and services in the hello package, letting it find the controllers.

Build
---

```aidl
./mvnw clean package

./mvnw spring-boot:run
```
