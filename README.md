# wlp.SleepServlet


A simple servlet to help simulate a hanging J2EE WebContainer.

When a http request is made to /SleepServlet it will one of the following: 
* Return **Hello World** in the body of the response.
* Wait a specified amount of milliSeconds and return **Hello World** in the body of the response.

The servlet should work in any Servlet-3.0 compatible WebContainer but has only been tested with WebSphere Liberty Profile 8.5 Java7.


|Parameters ||
|-----------|------------|
| sleep | sleep-time in milliseconds |