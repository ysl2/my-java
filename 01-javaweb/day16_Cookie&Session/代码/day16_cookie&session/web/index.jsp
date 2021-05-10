<%--
  Created by IntelliJ IDEA.
  User: fqy
  Date: 2018/6/8
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>



      <%
        System.out.println("hello jsp");
        int i = 5;

        String contextPath = request.getContextPath();
        out.print(contextPath);
      %>

      <%!
        int i = 3;
      %>
      <%= "hello" %>


      System.out.println("hello jsp");
      <h1>hi~ jsp!</h1>

      <% response.getWriter().write("response....."); %>
  </body>
</html>
