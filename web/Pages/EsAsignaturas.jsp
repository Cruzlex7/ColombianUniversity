<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Asignaturas</title>



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
                                <a href="EsNotas.jsp"><i class="fa fa-edit fa-fw"></i> Examenes</a>
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
                            Asignaturas del estudiante
                        </h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
                <div class="row">
                    <div class="col-lg-12">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3> Asignaturas inscritas </h3>
                            </div>
                            <div class="panel-body">
                                <div class="dataTables_wrapper">
                                    <div id="dataTables-example_wrapper" class="dataTables_wrapper form-inline dt-bootstrap no-footer">
                                        <div class="row" style="color:#000">
                                            <div class="col-sm-6">
                                                <div class="dataTables_length" id="dataTables-example_length">
                                                    <label>Show <select name="dataTables-example_length" aria-controls="dataTables-example" class="form-control input-sm">
                                                            <option value="10">10</option>
                                                            <option value="25">25</option>
                                                            <option value="50">50</option>
                                                            <option value="100">100</option>
                                                        </select> entries
                                                    </label>
                                                </div>
                                            </div>
                                            <div class="col-sm-6">
                                                <div id="dataTables-example_filter" class="dataTables_filter">
                                                    <label>Search:
                                                        <input type="search" class="form-control input-sm" placeholder="" aria-controls="dataTables-example">
                                                    </label>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row" style="color:#000">
                                            <div class="col-sm-12">
                                                <table class="table table-striped table-bordered table-hover dataTable no-footer" id="dataTables-example" role="grid" aria-describedby="dataTables-example_info">
                                                    <thead>
                                                        <tr role="row">
                                                            <th class="sorting_desc" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Rendering engine: activate to sort column ascending" style="width: 172px;" aria-sort="descending">
                                                                Materia
                                                            </th>
                                                            <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Browser: activate to sort column ascending" style="width: 204px;">
                                                                Fecha inscripcion
                                                            </th>
                                                            <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Platform(s): activate to sort column ascending" style="width: 185px;">
                                                                Estado
                                                            </th>
                                                          <!--  <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Engine version: activate to sort column ascending" style="width: 149px;">
                                                                Examen
                                                            </th>
                                                            <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="CSS grade: activate to sort column ascending" style="width: 110px;">
                                                                Estado Examen
                                                            </th>-->
                                                        </tr>
                                                    </thead>
                                                    <tbody>                                                               
                                                        <c:forEach var="item" items="${requestScope.asignaturas}">
                                                            <tr class="gradeA odd" role="row">
                                                                <td class="sorting_1" style="color: black">
                                                                    ${item.getNombreMateria()}
                                                                </td> 
                                                                <td>
                                                                    ${item.getFechaInscripcion()}
                                                                </td>
                                                                <td>
                                                                    ${item.getEstado()}
                                                                </td>
                                                               <!-- <td class="center">
                                                                  
                                                                </td>
                                                                <td class="center">
                                                                    <a href="#"> Editar </a>
                                                                </td>-->
                                                            </tr> 
                                                        </c:forEach>  
                                                    </tbody>
                                                </table>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-sm-6">
                                                <div class="dataTables_info" id="dataTables-example_info" role="status" aria-live="polite">
                                                    Showing 1 to 10 of 57 entries
                                                </div>
                                            </div>
                                            <div class="col-sm-6">
                                                <div class="dataTables_paginate paging_simple_numbers" id="dataTables-example_paginate">
                                                    <ul class="pagination">
                                                        <li class="paginate_button previous disabled" aria-controls="dataTables-example" tabindex="0" id="dataTables-example_previous">
                                                            <a href="#">Previous</a>
                                                        </li>
                                                        <li class="paginate_button active" aria-controls="dataTables-example" tabindex="0">
                                                            <a href="#">1</a>
                                                        </li>
                                                        <li class="paginate_button " aria-controls="dataTables-example" tabindex="0">
                                                            <a href="#">2</a>
                                                        </li>
                                                        <li class="paginate_button " aria-controls="dataTables-example" tabindex="0">
                                                            <a href="#">3</a>
                                                        </li>
                                                        <li class="paginate_button " aria-controls="dataTables-example" tabindex="0">
                                                            <a href="#">4</a>
                                                        </li>
                                                        <li class="paginate_button " aria-controls="dataTables-example" tabindex="0">
                                                            <a href="#">5</a>
                                                        </li>
                                                        <li class="paginate_button " aria-controls="dataTables-example" tabindex="0">
                                                            <a href="#">6</a>
                                                        </li>
                                                        <li class="paginate_button next" aria-controls="dataTables-example" tabindex="0" id="dataTables-example_next">
                                                            <a href="#">Next</a>
                                                        </li>
                                                    </ul>
                                                </div>
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

    </body>

</html>