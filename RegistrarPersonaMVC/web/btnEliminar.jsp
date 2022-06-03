<%-- 
    Document   : btnEliminar
    Created on : 05-29-2022, 11:20:17 AM
    Author     : acer1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar</title>
        <style>
      body{
        background:blue;
      }
    </style>
    </head>
    <body>
       <div class="mt-4 p-5 bg-primary text-white rounded">
        <h2 style="text-align: center">ELIMINAR REGISTRO</h2>
         <table cellspacing="3" cellpadding="3" border="2" align="center">
         <form action= "eliminar.do" method="POST">
          <tr>
                        <td align="alight" border="2">DUI : </td>
                        <td><input type="text" name="txtDui" value="" /></td>
                    </tr>
        <td><input type="submit" class="btn btn-success" value="ELIMINAR"></td>
        <td><a href="/RegistrarPersonaMVC/index.jsp" class="btn btn-success">INICIO</a></td>
         </table> 
        </form>
    </body>
</html>
