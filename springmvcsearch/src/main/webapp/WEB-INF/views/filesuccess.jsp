<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
      <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>File uploaded result..</title>
</head>
<body>
<h1>${msg }</h1>
<img alt="Profile image" src="<c:url value="/resources/img/${filename }" />"/>
</body>
</html>