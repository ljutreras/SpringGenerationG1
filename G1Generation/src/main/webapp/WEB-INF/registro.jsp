<%--
  Created by IntelliJ IDEA.
  User: hob
  Date: 13-06-22
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <div>
        <c:if test="${msgError != null }">
            <c:out value="${msgError }"></c:out>
        </c:if>
        <%--@elvariable id="usuario" type="com.generation.models.Usuario"--%>
        <form:form action="/registro/usuario" method="post" modelAttribute="usuario">
            <form:label path="nombre">Nombre:</form:label>
            <form:input path="nombre"/>                             <!--Nombre del atributo del registro -->
            <br>
            <form:label path="apellido">Apellido:</form:label>
            <form:input path="apellido"/>                           <!--Nombre del atributo del registro -->
            <br>
            <form:label path="edad">Edad:</form:label>
            <form:input type="number" path="edad"/>                 <!--Nombre del atributo del registro -->
            <br>
            <input type="submit" value="Registrar">
        </form:form>

    </div>
</body>
</html>
