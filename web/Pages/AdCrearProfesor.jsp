<%@page import="co.umb.ColombianUniversity.DAO.ProfesorDAO"%>
<%@page import="co.umb.ColombianUniversity.Model.ProfesorModel"%>
<%@page import="co.umb.ColombianUniversity.DAO.MateriaDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="co.umb.ColombianUniversity.Model.MateriaModel"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Colombian University</title>

        <!-- Bootstrap Core CSS -->
        <link href="../dist/css/bootstrap.min.css" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="../dist/css/metisMenu.min.css" rel="stylesheet">

        <!-- Timeline CSS -->
        <link href="../dist/css/timeline.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="../dist/css/sb-admin-2.css" rel="stylesheet">

        <!-- Morris Charts CSS -->
        <link href="../dist/css/morris.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="../font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    </head>

    <body>

        <div id="wrapper">

            <!-- Navigation -->
            <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">               
                <div class="navbar-header">                 
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>    
                    <img src="../Media/Imagenes/mit.gif" alt="MIT" width="40" height="40"/>
                    <a class="navbar-brand" href="AdInicio.jsp"> Colombian University </a>
                </div>
                <!-- /.navbar-header -->

                <ul class="nav navbar-top-links navbar-right">
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i class="fa fa-envelope fa-fw"></i>  <i class="fa fa-caret-down"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-messages">
                            <li>
                                <a href="#">
                                    <div>
                                        <strong>John Smith</strong>
                                        <span class="pull-right text-muted">
                                            <em>Yesterday</em>
                                        </span>
                                    </div>
                                    <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <strong>John Smith</strong>
                                        <span class="pull-right text-muted">
                                            <em>Yesterday</em>
                                        </span>
                                    </div>
                                    <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <strong>John Smith</strong>
                                        <span class="pull-right text-muted">
                                            <em>Yesterday</em>
                                        </span>
                                    </div>
                                    <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a class="text-center" href="#">
                                    <strong>Read All Messages</strong>
                                    <i class="fa fa-angle-right"></i>
                                </a>
                            </li>
                        </ul>
                        <!-- /.dropdown-messages -->
                    </li>
                    <!-- /.dropdown -->
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i class="fa fa-bell fa-fw"></i>  <i class="fa fa-caret-down"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-alerts">
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-comment fa-fw"></i> New Comment
                                        <span class="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-twitter fa-fw"></i> 3 New Followers
                                        <span class="pull-right text-muted small">12 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-envelope fa-fw"></i> Message Sent
                                        <span class="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-tasks fa-fw"></i> New Task
                                        <span class="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-upload fa-fw"></i> Server Rebooted
                                        <span class="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a class="text-center" href="#">
                                    <strong>See All Alerts</strong>
                                    <i class="fa fa-angle-right"></i>
                                </a>
                            </li>
                        </ul>
                        <!-- /.dropdown-alerts -->
                    </li>
                    <!-- /.dropdown -->
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-user">
                            <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
                            <li class="divider"></li>
                            <li><a href="Pages/index.jsp"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                            </li>
                        </ul>
                        <!-- /.dropdown-user -->
                    </li>
                    <!-- /.dropdown -->
                </ul>
                <!-- /.navbar-top-links -->

                <div class="navbar-default sidebar" role="navigation">
                    <div class="sidebar-nav navbar-collapse">
                        <ul class="nav" id="side-menu">
                            <li class="sidebar-search">
                                <div class="input-group custom-search-form">
                                    <input type="text" class="form-control" placeholder="Search...">
                                    <span class="input-group-btn">
                                        <button class="btn btn-default" type="button">
                                            <i class="fa fa-search"></i>
                                        </button>
                                    </span>
                                </div>
                                <!-- /input-group -->
                            </li>
                            <li>
                                <a href="AdInicio.jsp"><i class="fa fa-dashboard fa-fw"></i> Inicio</a>
                            </li>

                            <li>
                                <a href="AdCrearMateria.jsp"><i class="fa fa-table fa-fw"></i> Crear Materia</a>
                            </li>
                            <li>
                                <a href="AdCrearCarrera.jsp"><i class="fa fa-table fa-fw"></i> Crear Carrera</a>
                            </li>
                            <li>
                                <a href="AdCrearProfesor.jsp"><i class="fa fa-edit fa-fw"></i> Crear Profesor</a>
                            </li>
                            <li>
                                <a href="AdCrearEstudiante.jsp"><i class="fa fa-edit fa-fw"></i> Crear Estudiante</a>
                            </li>
                        </ul>
                    </div>
                    <!-- /.sidebar-collapse -->
                </div>
                <!-- /.navbar-static-side -->
            </nav>

            <div id="page-wrapper">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header"> 
                            <img src="../Media/Imagenes/mit.gif" alt="MIT" width="70" height="70"/>
                            Colombian University
                        </h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
                <div class="row">
                    <form role="form" method="POST" action="../AgregarProfesor">
                        <label for="exampleInputName2">Cedula del profesor</label>
                        <input type="text" class="form-control" name="txtCedulaProfesor" placeholder="Cedula">
                        <br>
                        <label for="exampleInputName2">Primer Nombre y Segundo Nombre</label>
                        <input type="text" class="form-control" name="txtPrimerNombreProfesor" placeholder="Primer Nombre">  <input type="text" class="form-control" name="txtSegundoNombreProfesor" placeholder="Segundo Nombre">
                        <br>
                        <label for="exampleInputName2">Primer Apellido y Segundo Apellido</label>
                        <input type="text" class="form-control" name="txtPrimerApellidoProfesor" placeholder="Primer Apellido">  <input type="text" class="form-control" name="txtSegundoApellidoProfesor" placeholder="Segundo Apellido">
                        <br>
                        <input type="submit" value="Agregar" class="btn btn-success"> <input type="reset" value="Limpiar" class="btn btn-danger">
                    </form>
                </div>

                <div>
                    <br>
                    <br>
                    <h3 class="panel-title">Profesores registrados</h3>
                    <br>
                    <table class="table table-bordered">
                        <tr>
                            <td class="success text-center text-muted">ID Profesor</td>
                            <td class="success text-center text-muted">Primer Nombre</td>
                            <td class="success text-center text-muted">Segundo Nombre</td>
                            <td class="success text-center text-muted">Primer Apellido</td>
                            <td class="success text-center text-muted">Segundo Apellido</td>
                        </tr>
                        <%
                            ArrayList<ProfesorModel> profesores = new ProfesorDAO().buscarProfesores();
                            for (ProfesorModel pro : profesores) {
                        %>
                        <tr>
                            <td class="danger text-center text-muted"><%=pro.getId()%></td>
                            <td class="danger text-center text-muted"><%=pro.getNombre()%></td>
                            <td class="danger text-center text-muted"><%=pro.getSegundoNombre()%></td>
                            <td class="danger text-center text-muted"><%=pro.getApellido()%></td>
                            <td class="danger text-center text-muted"><%=pro.getSegundoApellido()%></td>
                        </tr>
                        <% } %>
                    </table>
                </div>
                    
                <div class="row">
                    <form role="form" method="POST" action="../EliminarProfesor">
                        <br>
                        <label for="exampleInputName2">Codigo del profesor</label>
                        <input type="text" class="form-control" name="txtCodigoProfesor" placeholder="Codigo">
                        <br>
                        <input type="submit" value="Eliminar" class="btn btn-danger">
                    </form>
                </div>
                    
                <div class="row">
                    <form role="form" method="POST" action="../AsignarEstudiante">
                        <br>
                        <label for="exampleInputName2">Asignar estudiante</label>
                        <input type="text" class="form-control" name="txtCodigoProfesorAsg" placeholder="Codigo Profesor">
                        <input type="text" class="form-control" name="txtCodigoEstudianteAsg" placeholder="Codigo Estudiante">
                        <br>
                        <input type="submit" value="Asignar" class="btn btn-success">
                    </form>
                </div>
                    
                <div>
                    <br>
                    <br>
                    <h3 class="panel-title">Profesores y estudiantes</h3>
                    <br>
                    <table class="table table-bordered">
                        <tr>
                            <td class="success text-center text-muted">ID Profesor</td>
                            <td class="success text-center text-muted">Primer Nombre</td>
                            <td class="success text-center text-muted">ID Estudiante</td>
                            <td class="success text-center text-muted">Primer Nombre</td>
                        </tr>
                        <%
                            ArrayList<Object[]> profesoresyAlumnos = new ProfesorDAO().buscarProfesoresyAlumnos();
                            for (Object[] proyAlum : profesoresyAlumnos) {
                        %>
                        <tr>
                            <td class="danger text-center text-muted"><%=proyAlum[0]%></td>
                            <td class="danger text-center text-muted"><%=proyAlum[1]%></td>
                            <td class="danger text-center text-muted"><%=proyAlum[2]%></td>
                            <td class="danger text-center text-muted"><%=proyAlum[3]%></td>
                        </tr>
                        <% } %>
                    </table>
                </div>
                <!-- /#page-wrapper -->


            </div>
            <!-- /#wrapper -->

            <!-- jQuery -->
            <script src="../dist/js/jquery.min.js"></script>

            <!-- Bootstrap Core JavaScript -->
            <script src="../dist/js/bootstrap.min.js"></script>

            <!-- Metis Menu Plugin JavaScript -->
            <script src="../dist/js/metisMenu.min.js"></script>

            <!-- Morris Charts JavaScript -->
            <script src="../dist/js/raphael-min.js"></script>
            <script src="../dist/js/morris.min.js"></script>
            <script src="../dist/js/morris-data.js"></script>

            <!-- Custom Theme JavaScript -->
            <script src="../dist/js/sb-admin-2.js"></script>

    </body>

</html>