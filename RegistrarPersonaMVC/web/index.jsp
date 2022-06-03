<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar</title>
        
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <style>
      body{
        background:blue;
      }
    </style>
    </head>
    
    <body>
        
        <div class="mt-4 p-5 bg-primary text-white rounded">
            <h1 style="text-align: center">Registro de Personas</h1>
            <pre></pre>
            <form action="recibir.do" method="post" style="text-align: center"> 


                <table cellspacing="3" cellpadding="3" border="2" align="center">

                    <tr>
                        <td align="alight" border="2">DUI: </td>
                        <td><input type="text" name="txtDui" value="" /></td>
                    </tr>
                    <tr>
                        <td align="alight">Apellidos: </td>
                        <td><input type="text" name="txtApellidos" value="" /></td>
                    </tr>
                    <tr>
                        <td align="alight">Nombres: </td>
                        <td><input type="text" name="txtNombres" value="" /></td>
                    </tr>

                </table>
                 <br>
                
                <input type="submit" class="btn btn-success" value="REGISTRAR">          
                <a href="mostrar.do" class="btn btn-success">MOSTRAR</a>
                <a href="/RegistrarPersonaMVC/btnEliminar.jsp" class="btn btn-success">ELIMINAR</a>
                <a href="/RegistrarPersonaMVC/btnModificar.jsp" class="btn btn-success">MODIFICAR</a>
                
            </form> 
        </div>
    </body>
</html>
