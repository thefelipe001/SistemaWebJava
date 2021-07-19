<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
       <nav class="navbar navbar-expand-lg navbar-light bg-info">
            <div class="container-fluid">

                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link active" href="#">Home</a>
                        </li>
                        <li class="nav-item">
                            <a style="margin-left:10px;border: none " class="btn btn-outline-light" href="Controlador?menu=Producto" target="myFrame">Producto</a>
                        </li>
                        <li class="nav-item">
                            <a class="btn btn-outline-light" style="margin-left:10px;border: none " href="Controlador?menu=Empleado&accion=Listar" target="myFrame">Empleado</a>
                        </li>
                        <li class="nav-item">
                            <a style="margin-left:10px;border: none " class="btn btn-outline-light" target="myFrame" href="Controlador?menu=Clientes">Cientes</a>
                        </li>
                        <li class="nav-item">
                            <a style="margin-left:10px;border: none " class="btn btn-outline-light" target="myFrame" href="Controlador?menu=Nuevaventa&accion=default">Nuevo Ventas</a>
                        </li>
                    </ul>
            </div>
<div class="dropdown">
    <button style="border: no" class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-bs-toggle="dropdown" aria-expanded="false">
 ${usuario.getNom()}
  </button>
  <ul class="dropdown-menu text-center " aria-labelledby="dropdownMenuButton2">
      <li><a class="dropdown-item " href="#">
              <img src="img/user.jpg" alt="60" width="60"/>
          </a></li>
    <li><a class="dropdown-item" href="#">Usuario</a></li>
    <li><a class="dropdown-item" href="#">Usuario@gmail.com</a></li>
    <div class="dropdown-item" href="#">
       <form action="Validar" method="POST">
           <button name="accion" value="Salir" class="dropdown-item" href="#">
               Salir
           </button>
               
       </form>
    </div>

  </ul>
   </div>

        </nav>
  
       <div class="n-4" style="height: 550px; ">
      <iframe name="myFrame" style="height: 100%;width: 100%;border: none"></iframe>
  </div>
  
  
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
 
    </body>
</html>
