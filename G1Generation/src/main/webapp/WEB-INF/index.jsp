<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<h1>Hola <c:out value="${apellidos}"></c:out><c:out value=" ${nombres}"></c:out></h1>
    <h3><c:out value="${edad}"></c:out></h3>
    <h4><c:out value="${usuario.nombre} ${usuario.apellido} ${usuario.edad}"></c:out></h4>

</body>
</html>