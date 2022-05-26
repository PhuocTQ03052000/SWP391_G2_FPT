<%-- 
    Document   : setting_details
    Created on : May 22, 2022, 1:51:23 PM
    Author     : phant
--%>

<%@page import="model.Setting"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>SettingDetail</title>

        <!-- Custom fonts for this template -->
        <link href="../vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="assets/styles/sb-admin-2.min.css" rel="stylesheet">
        <link href="assets/styles/slider_status.css" rel="stylesheet">
        <!-- Custom styles for this page -->
        <link href="vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">
        <link href="css/my_account.css" rel="stylesheet">
        <link href="css/fnon.min.css" rel="stylesheet">
        <link href="assets/styles/custom_box.css" rel="stylesheet">
    </head>
    <body id="page-top">
        <!-- Page Wrapper -->
        <div id="wrapper">
            <!-- Sidebar -->
            <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">
                <div include-html="../components/sidebar.html" id="sidebar" style="display: contents;"></div>
                <div class="text-center d-none d-md-inline">
                    <button class="rounded-circle border-0" id="sidebarToggle"></button>
                </div>
            </ul>
            <!-- End of Sidebar -->
            <!-- Content Wrapper -->
            <div id="content-wrapper" class="d-flex flex-column">
                <!-- Main Content -->
                <div id="content">
                    <!-- Topbar -->
                    <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">
                        <!-- Sidebar Toggle (Topbar) -->
                        <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                            <i class="fa fa-bars"></i>
                        </button>
                        <!-- Topbar Navbar -->
                        <div include-html="../components/topnavbar_admin.html" id="topnavbar" class="ml-auto"></div>
                    </nav>
                    <!-- End of Topbar -->

                    <!-- Begin Page Content -->
                    <div class="container-fluid">
                        <%
                            if (request.getAttribute("setting") != null) {
                                Setting s = (Setting) request.getAttribute("setting");
                        %>
                        <form id="form" action="edit_setting" method="post">
                            <input type="hidden" name="sid" id="sid" value="<%=request.getAttribute("sid")%>"/>
                            <div class="row">
                                <div class="col-8 col-sm-12">
                                    <div class="row">
                                        <div class="col-8 col-sm-8">
                                            <div class="form-group">
                                                <label for="provider-name" class="col-form-label">Groups*:</label>
                                                <select name="type" id="type" class="border border-secondary w-100 label_box rounded">
                                                    <option value="1">1</option>
                                                    <option value="3">2</option>
                                                    <option value="3">3</option>
                                                    <option value="4">4</option>
                                                </select>
                                                <div class="fail"></div>
                                            </div>
                                        </div>
                                        <div class="col-8 col-sm-4">
                                            <div class="form-group">
                                                <label for="staff-phone" class="col-form-label">Order*:</label>
                                                <input type="number" class="form-control" name="order" id="order" value="<%=s.getOrder()%>" required/>
                                                <div class="fail"></div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="staff-phone" class="col-form-label">Name*:</label>
                                    <input type="text" class="form-control" name="name" id="title" value="<%=s.getName()%>" required/>
                                    <div class="fail"></div>
                                </div>
                                <div class="col-8 col-sm-12">
                                    <div class="row">
                                        <div class="col-8 col-sm-8">
                                            <div class="form-group">
                                                <label for="provider-name" class="col-form-label">Value:</label>
                                                <input type="number" class="form-control" name="value" id="value" value="<%=s.getValue()%>" required/>
                                                <div class="fail"></div>
                                            </div>
                                        </div>
                                        <div class="col-8 col-sm-4">
                                            <div class="form-group">
                                                
                                                <label for="staff-name" class="col-form-label">Status:</label><br>                                                                                              
                                                <input type="radio" id="status" name="status" value="active" <%if (s.getStatus()==0) {%> checked="true"<%}%>>                                              
                                                <label for="age1" style="margin-right: 30%;">Active</label>
                                                <input type="radio" id="status" name="status" value="deactive"<%if (s.getStatus()==1) {%> checked="true"<%}%>>
                                                <label for="age1" style="margin-right: 10%;">Deactive</label>
                                                <div class="fail"></div>                                             
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="order-note" class="col-form-label">Description:</label>
                                    <textarea class="border border-secondary w-100 p-2 rounded" name="note"
                                              id="order-note" style="resize: none; overflow: auto;"></textarea>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <input type="submit" class="btn btn-primary" value="Save"></input>
                                <!-- <button type="button" class="btn btn-secondary"
                                                                    data-dismiss="modal">Cancel</button> -->
                            </div>
                        </form>
                        <%
                        } else {
                        %>
                        <form id="form" action="add_setting" method="post">
                            <div class="row">
                                <div class="col-8 col-sm-12">
                                    <div class="row">
                                        <div class="col-8 col-sm-8">
                                            <div class="form-group">
                                                <label for="provider-name" class="col-form-label">Group*:</label>
                                                <select name="type" id="type"
                                                        class="border border-secondary w-100 label_box rounded">
                                                    <option value="1">1</option>
                                                    <option value="2">2</option>
                                                    <option value="3">3</option>
                                                    <option value="4">4</option>
                                                </select>
                                                <div class="fail"></div>
                                            </div>
                                        </div>
                                        <div class="col-8 col-sm-4">
                                            <div class="form-group">
                                                <label for="staff-phone" class="col-form-label">Order*:</label>
                                                <input type="number" class="form-control" name="order" id="order" required/>
                                                <div class="fail"></div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="staff-phone" class="col-form-label">Name*:</label>
                                    <input type="text" class="form-control" name="name" id="title" required/>
                                    <div class="fail"></div>
                                </div>
                                <div class="col-8 col-sm-12">
                                    <div class="row">
                                        <div class="col-8 col-sm-8">
                                            <div class="form-group">
                                                <label for="provider-name" class="col-form-label">Value:</label>
                                                <input type="number" class="form-control" name="value" id="value" required/>
                                                <div class="fail"></div>
                                            </div>
                                        </div>
                                        <div class="col-8 col-sm-4">
                                            <div class="form-group">
                                                <label for="staff-name" class="col-form-label">Status:</label><br>
                                                <input type="radio" id="status" name="status" value="active" checked="true">
                                                <label for="age1" style="margin-right: 30%;">Active</label>
                                                <input type="radio" id="status" name="status" value="deactive">
                                                <label for="age1" style="margin-right: 10%;">Deactive</label>
                                                <div class="fail"></div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="order-note" class="col-form-label">Description:</label>
                                    <textarea class="border border-secondary w-100 p-2 rounded" 
                                              id="order-note" style="resize: none; overflow: auto;"></textarea>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <input type="submit" class="btn btn-primary" value="Add"></input>
                                <!-- <button type="button" class="btn btn-secondary"
                                                                    data-dismiss="modal">Cancel</button> -->
                            </div>
                        </form>
                        <%
                            }
                        %>
                    </div>
                    <!-- /.container-fluid -->
                </div>
                <!-- End of Main Content -->
            </div>        
            <!-- End of Content Wrapper -->
        </div>
        <!-- End of Page Wrapper -->

        <!-- Scroll to Top Button-->
        <a class="scroll-to-top rounded" href="#page-top">
            <i class="fas fa-angle-up"></i>
        </a>



        <!-- Bootstrap core JavaScript-->
        <script src="vendor/jquery/jquery.min.js "></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js "></script>



        <!-- Custom scripts for all pages-->
        <script src="js/sb-admin-2.min.js "></script>

        <!-- Page level plugins -->
        <script src="vendor/datatables/jquery.dataTables.min.js "></script>
        <script src="vendor/datatables/dataTables.bootstrap4.min.js "></script>

        <!-- Page level custom scripts -->
        <script src="js/demo/datatables-demo.js "></script>
        <script src="js/include-html.min.js "></script>
        <script src="js/fnon.min.js"></script>
    </body>
</html>
