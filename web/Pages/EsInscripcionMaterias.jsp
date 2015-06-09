<%-- 
    Document   : EsInscripcionMaterias
    Created on : 07-jun-2015, 13:52:05
    Author     : Alexander
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Inscripcion de materias</title>


        <!-- Bootstrap Core CSS -->
        <link href="dist/css/bootstrap.min.css" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="dist/css/metisMenu.min.css" rel="stylesheet">

        <!-- Timeline CSS -->
        <link href="dist/css/timeline.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="dist/css/sb-admin-2.css" rel="stylesheet">

        <!-- Morris Charts CSS -->
        <link href="dist/css/morris.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">


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
                    <img src="  Media/Imagenes/mit.gif" alt="MIT" width="40" height="40"/>
                    <a class="navbar-brand" href="index.jsp"> Colombian University </a>
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
                            <li><a href="#"><i class="fa fa-user fa-fw"></i> <%= (String) (request.getSession().getAttribute("Nombre"))%></a>
                            <li class="divider"></li>
                            <li><a href="../index.jsp"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
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
                                <a href="EsInicio.do"><i class="fa fa-dashboard fa-fw"></i> Inicio</a>
                            </li>

                            <li>
                                <a href="EsAsignaturas.do"><i class="fa fa-table fa-fw"></i> Asignaturas</a>
                            </li>
                            <li>
                                <a href="EsInscripcionMaterias.do"><i class="fa fa-edit fa-fw"></i> Resgistro de materia</a>
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
                            <img src="Media/Imagenes/mit.gif" alt="MIT" width="70" height="70"/>
                            Asignaturas a registrar
                        </h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
                <div class="row">
                    <div class="col-lg-12">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3> Formulario de incripción de materias </h3>
                            </div>
                            <div class="panel-body">
                                <div class="dataTables_wrapper">
                                    <div id="dataTables-example_wrapper" class="dataTables_wrapper form-inline dt-bootstrap no-footer">
                                        <div class="row" style="color:#000">
                                            <div class="col-sm-6">
                                                <form role="form" method="post" action="ESInsMateriaRegistrar">
                                                    <fieldset>
                                                        <div class="form-group">
                                                            <input type="hidden" name="hMaterias" value="<%= request.getAttribute("materiasCarrera")%>">
                                                            <h4>Carrera</h4>
                                                            <select name="Carrera" class="form-control" style="color:#000">                                                                
                                                                <c:forEach var="item" items="${requestScope.carreras}">
                                                                    <option value="${item.getIdCarrera()}">${item.getCarrera()}</option>
                                                                </c:forEach>
                                                            </select>                                                             
                                                        </div> 
                                                        <div class="form-group">
                                                            <h4>Materia</h4>
                                                            <select name="AlumnoCarrera" class="form-control" style="color:#000" >
                                                            </select>
                                                        </div>
                                                        <br>
                                                        <div class="form-group">
                                                            <input type="hidden" name="hMaterias" value="<%= request.getAttribute("materiasCarrera")%>">
                                                            <h4>Alumno carrera</h4>
                                                            <select name="AlumnoCarrera2" class="form-control" disabled="true">                                                                
                                                                <c:forEach var="item" items="${requestScope.carreras}">
                                                                    <option value=${item.getIdAlumnoCarrera()}>${item.getIdAlumnoCarrera()}</option>
                                                                </c:forEach>
                                                            </select>                                                             
                                                        </div>
                                                        <br>
                                                        <br>
                                                        <button type="submit" class="btn btn-primary btn-lg btn-block" onclick="enable()">Registrar</button>                                                           
                                                    </fieldset>                                                    
                                                </form>
                                            </div>
                                            <div class="col-sm-6">
                                                <img src="Media/Imagenes/lapizPapel.jpg" alt="" height="250" width="300"/>
                                            </div>
                                        </div> 
                                    </div>
                                </div>                                
                            </div> 
                        </div>
                    </div>
                    <!-- /.col-lg-12 -->                    
                </div>
                <!-- /.row -->
            </div>
            <!-- /#page-wrapper -->

        </div>
        <!-- /#wrapper -->

        <!-- jQuery -->
        <script src="dist/js/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="dist/js/bootstrap.min.js"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="dist/js/metisMenu.min.js"></script>

        <!-- Morris Charts JavaScript -->
        <script src="dist/js/raphael-min.js"></script>
        <script src="dist/js/morris.min.js"></script>
        <script src="dist/js/morris-data.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="dist/js/sb-admin-2.js"></script>


        <script type="text/javascript">

            $('[name = "Carrera"]').change(function cargarMaterias() {
                $('[name = "AlumnoCarrera"]').find('option').remove();
                var selected = $('[name = "Carrera"]').val();
                var todas = $('[name = "hMaterias"]').val();
                var separadas = todas.split(';');
                for (i = 0; i < separadas.length; i++) {
                    var datos = separadas[i].split(',');

                    if (datos[0] === selected) {
                        var cadena = "<option value='" + datos[1] + "'>" + datos[2] + "</option>";
                        $('[name = "AlumnoCarrera"]').append(cadena);
                    }
                }
                var index = $('[name = "Carrera"] option:selected').index();
                $('[name = "AlumnoCarrera2"] option:eq(' + index + ')').prop("selected", true);

            }).change();
            
            function enable(){ 
                $('[name="AlumnoCarrera2"]').prop('disabled',false);
            }

        </script>
    </body>

</html>
