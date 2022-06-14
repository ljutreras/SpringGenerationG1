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

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <div>
        <!--pasar informacion desde la vista a una url(action)-->
        <!--method "get" es por default, es decir, si no se encuentra en el tag, es un get
        Los parametros estan en la ruta-->
        <!--method "post" Los parametros no se ven, van ocultos-->
        <form action="" method="post">
            <label for ="nombre"> Nombre: </label>
            <input type="text" id="nombre" name="nombre">
            <br><!--Salto de linea -->
            <label for ="apellido"> Apellido: </label><!--El FOR es para vincular el INPUT con el LABEL -->
            <input type="text" id="apellido" name="apellido">
            <br>
            <label for ="edad"> Edad: </label>
            <input type="number" id="edad" name="edad">
            <br>
            <input type="submit" value="Registrar">
            <input type="button" value="Enviar">
        </form>

    </div>
</body>
</html>
