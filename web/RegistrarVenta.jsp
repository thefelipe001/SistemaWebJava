

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Ventas</title>
    </head>
    <body>
        <br>
        <div class="d-flex">
            <div class="col-sm-4">
                <div class="card">
                    <form action="Controlador?menu=Nuevaventa" method="POST">
                    <div class="card-body">

                        <div class="form-group">
                            <label>Datos de Cliente</label>
                        </div> 

                        <div class="form-group d-flex"> 
                            <div class="col-sm-6 d-flex">

                                <input type="text" name="codigocliente" placeholder="codigo" class="form-control " value="${c.getDni()}" >
                          <input type="submit" name="accion" value="BuscarCliente" class="btn btn-outline-info " >
                            </div>  
                           
                            <div class="col-sm-6">

                                <input type="text" name="nombrescliente" class="form-control " placeholder="Datos Cliente" value="${c.getNom()}" >
                            </div>  



                        </div> 

                        <div class="form-group">
                            <label>Datos Producto</label>


                        </div>

                        <div class="form-group d-flex"> 
                             <div class="col-sm-6 d-flex">

                                <input type="text" name="codigoproducto" placeholder="codigo" class="form-control " >
                          <input type="submit" name="accion" value="Buscar" class="btn btn-outline-info " >
                            </div>  
                           
                            <div class="col-sm-6">

                                <input type="text" name="nombrescliente" class="form-control " placeholder="Datos Producto" >
                            </div>  


                        </div> 

                        <div class="form-group d-flex">
                              <div class="col-sm-6 d-flex">

                                <input type="text" name="precio" placeholder="$/.0.00" class="form-control " >
                        
                            </div>  
                           
                            <div class="col-sm-3">

                                <input type="number" name="cant" class="form-control " placeholder=" " >
                            </div>    
                            <div class="col-sm-3">

                                <input type="text" name="stock" class="form-control " placeholder="Stock" >
                            </div>  
                            
                        </div> 
                        <div class="form-group">
                            <input type="submit" name="accion" value="Agregar" class="btn btn-outline-info">
                                
                        </div>
                    


                    </div>
                        
                            </form>
                </div>
            </div>
            <div class="col-sm-7">
                <div class="card">
                    <div class="card-body">
                         <div class="d-flex col-sm-5 ml-auto">
                             <label>NumeroSerie</label>
                    <input type="text" name="NroSerie" class="form-control">
                </div>
                        <br>
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>Nro</th>
                                    <th>Codigo</th>
                                    <th>Descripcion</th>
                                    <th>Precio</th>
                                    <th>Cantidad</th>
                                    <th>SubTotal</th>
                                    <th>Acciones</th>
                                     
                                </tr>
                            </thead>
                            
                        </table>
                    </div>
                    <div class="card-footer">
                        <div>
                            <input type="submit" name="accion" value="Generar Venta" class="btn btn-success">
                             <input type="submit" name="accion" value="Cancelar" class="btn btn-danger">
                        </div>
                    </div>
                </div>
               

            </div>
        </div>






        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
