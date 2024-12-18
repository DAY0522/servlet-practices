<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% // java code
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    String birthYear = request.getParameter("birthYear");
    String gender = request.getParameter("gender");
    String profile = request.getParameter("profile");
    String[] hobbies = request.getParameterValues("hobby");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%=email %>
<br>
<%=password %>
<br>
<%=birthYear %>
<br>
<%=gender %>
<br>
<%=profile %>
<br>
<%
    for (String hobby : hobbies) {
%>
<strong><%=hobby%></strong>
<%
    }
%>
<br>

</body>
</html>
