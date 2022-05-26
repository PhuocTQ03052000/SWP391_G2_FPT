<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Setting"%>
<!DOCTYPE html>
<html lang="vi">


<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SettingList</title>

    <!-- Custom fonts for this template -->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="assets/styles/sb-admin-2.min.css" rel="stylesheet">
    <link href="assets/styles/slider_status.css" rel="stylesheet">
    <link href="assets/styles/icon_action.css" rel="stylesheet">
    <!-- Custom styles for this page -->
    <link href="vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">
    <link href="assets/styles/custom_box.css" rel="stylesheet">
    <link href="css/fnon.min.css" rel="stylesheet">
    <link href="assets/styles/alert.css" rel="stylesheet">

</head>

<body id="page-top">
    
    <%
            ArrayList<Setting> listSetting = (ArrayList<Setting>) request.getAttribute("listSetting");
            
        %>
        <!-- Page Wrapper -->
    <div id="wrapper">
        <!-- Sidebar -->
        <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">
            <div include-html="components/sidebar.html" id="sidebar" style="display: contents;"></div>
            <div class="text-center d-none d-md-inline">
                <button class="rounded-circle border-0" id="sidebarToggle"></button>
            </div>
        </ul>
        <!-- End of Sidebar -->
        <!-- Content Wrapper -->
        <div id="content-wrapper">
            <!-- Main Content -->
            <div id="content">
                <!-- Topbar -->
                <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">
                    <!-- Sidebar Toggle (Topbar) -->
                    <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                        <i class="fa fa-bars"></i>
                    </button>
                    <!-- Topbar Navbar -->
                    <div include-html="components/topnavbar_user.jsp" id="topnavbar" class="ml-auto"></div>
                </nav>
                <!-- End of Topbar -->
                <!-- Begin Page Content -->
                <div class="container-fluid">
                    <div class="d-sm-flex align-items-center justify-content-between mb-4">
                        <h1 class="h3 mb-0 text-gray-800" style="text-align: center;">User setting</h1>
                        <!-- Add account -->
                        <a href="setting_detail.jsp" class="order-voucher">Add setting</a>
                        
                    </div>
                    <!-- Page Heading -->
                    <!-- DataTales Example -->
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">System Setting</h6>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                        <tr>
                                            <th>ID</th>
                                            <th>Setting Type</th>
                                            <th>Name</th>
                                            <th>Order</th>
                                            <th>Value</th>
                                            <th>Status</th>
                                            <th>Action</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <%for (Setting setting : listSetting) {%>
                                        <tr>
                                            <td><%=setting.getSetting_id()%></td>
                                            <td><%=setting.getType_id()%></td>
                                            <td><%=setting.getName()%></td>
                                            <td><%=setting.getOrder()%></td>
                                            <td><%=setting.getValue()%></td>
                                            <td>
                                                    <%if (setting.getStatus() ==0) {%>
                                                    <p id="status_complete">Active</p>
                                                    <%} else {%>
                                                    <p id="status_reject">Inactive</p>
                                                    <%}%>
                                                </td>
                                            <td><a style="text-decoration: underline; color: blue;" href="edit_setting?id=<%=setting.getSetting_id()%>">Edit</a>
                                                <a style="text-decoration: underline; color: blue;">Active</a>
                                            </td>
                                           
                                          
                                        </tr>
                                         <% }%>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
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
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="js/sb-admin-2.min.js"></script>

    <!-- Page level plugins -->
    <script src="vendor/datatables/jquery.dataTables.min.js"></script>
    <script src="vendor/datatables/dataTables.bootstrap4.min.js"></script>

    <!-- Page level custom scripts -->
    <script src="js/demo/datatables-demo.js"></script>
    <script src="js/include-html.min.js"></script>

</body>

</html>