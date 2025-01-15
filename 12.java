### Sessionjsp.html
html
<html>
<head><title>LOGIN</title></head>
<body>
  <form action="Session1.jsp" method="get">
    Enter Name: <input type="text" name="uname"><br>
    <input type="submit" value="LOGIN">
  </form>
</body>
</html>


### Session1.jsp
jsp
<%@page import="java.util.*"%>
<%
  String uname = request.getParameter("uname");
  session.setAttribute("user", uname);
  session.setAttribute("startTime", System.currentTimeMillis());
%>
Hello <%= uname %><br>
<p style="text-align:right;">Time: <%= new Date().toString() %></p>
<form action="Session2.jsp" method="get">
  <input type="submit" value="Logout">
</form>


### Session2.jsp
jsp
<%@page import="java.util.*"%>
<%
  String uname = (String) session.getAttribute("user");
  long startTime = (long) session.getAttribute("startTime");
  long duration = (System.currentTimeMillis() - startTime) / 1000;
%>
Thank you, <%= uname %><br>
Session duration: <%= duration %> seconds
<% session.invalidate(); %>
