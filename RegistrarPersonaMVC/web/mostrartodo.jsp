<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar</title>
        <style>
      body{
        background:blue;
      }
    </style>
  </head>
    </head>
    <body>
        
        <h1>TODOS LOS REGISTROS</h1>
        <c:forEach var="listaTotal" items="${sessionScope.personas}">
    DUI:${listaTotal.dui}<br>
    Apellidos:${listaTotal.apellidos}<br>
    Nombres:${listaTotal.nombres}<br>
    <br>
    <hr>
        </c:forEach>
    <td><a href="/RegistrarPersonaMVC/index.jsp" class="btn btn-success">INICIO</a></td>
    </body>
</html>
