<%-- 
    Document   : index
    Created on : 01-jun-2015, 15:36:46
    Author     : Alexander
--%>

<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Universidad</title>

        <!-- Bootstrap Core CSS -->
        <link href="dist/css/bootstrap.min.css" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="dist/css/metisMenu.min.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="dist/css/jformer.css" ></link>

        <!-- Custom CSS -->
        <link href="dist/css/sb-admin-2.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    </head>

  <body>

        <div class="container">
            <div class="row">
                <div class="col-md-5 col-md-offset-5"> 
                    <br>
                    <br>
                    <img src="Media/Imagenes/mit.gif" alt="MIT" width="200" height="200"/>                                     
                </div>
                <div class="col-md-4 col-md-offset-4">    
                    <div class="login-panel panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">Bienvenido</h3>
                            <p class="text-danger">${requestScope.msj != null ? requestScope.msj : ""}</p>
                        </div>
                        <div class="panel-body">
                            
                            <form role="form" method="POST" action="LoginUsuario.do">
                                <fieldset>
                                    <div class="form-group">
                                        <input class="form-control" placeholder="Usuario" name="usuario" autofocus >
                                    </div>
                                    <div class="form-group">
                                        <input class="form-control" placeholder="Contraseña" name="pass" type="password" value="">
                                    </div>
                                    <div class="checkbox">
                                        <label>
                                            <input name="recordar" type="checkbox" value="Remember Me">Recordar
                                        </label>
                                    </div>
                                    <!-- Change this to a button or input when using this as a form -->
                                    <input type="submit" value="Ingresar" class="btn btn-lg btn-default btn-block">

                                </fieldset>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- jQuery -->
        <script src="dist/js/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="dist/js/bootstrap.min.js"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="dist/js/metisMenu.min.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="dist/js/sb-admin-2.js"></script> 

        <script type="text/javascript" src="dist/js/jformer.js" ></script>

    </body>

</html>