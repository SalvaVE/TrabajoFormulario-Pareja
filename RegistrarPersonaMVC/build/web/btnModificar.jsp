<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina Modificar</title>
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
        <h2 style="text-align: center">MODIFICAR REGISTRO</h2>
       <form action="modificar.do" method="POST">
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
                    
                    <td><input type="submit" class="btn btn-success" value="MODIFICAR"></td>
                    
                    <td><a href="/RegistrarPersonaMVC/index.jsp" class="btn btn-success">INICIO</a></td>
                    
                    
                       
                     
                    
                    
                        
                    
                    

        </table> 
        </form>
    </body>
</html>
