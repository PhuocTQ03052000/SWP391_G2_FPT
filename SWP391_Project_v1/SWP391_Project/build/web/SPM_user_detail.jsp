<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="vi">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>UserDetail</title>

    <!-- Custom fonts for this template -->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="assets/styles/sb-admin-2.min.css" rel="stylesheet">
    <link href="assets/styles/slider_status.css" rel="stylesheet">
    <!-- Custom styles for this page -->
    <link href="vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">
    <link href="/css/my_account.css" rel="stylesheet">
    <link href="css/fnon.min.css" rel="stylesheet">
    <link href="assets/styles/custom_box.css" rel="stylesheet">
</head>

<body id="page-top">
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
                    <div include-html="components/topnavbar_user.html" id="topnavbar" class="ml-auto"></div>
                </nav>
                <!-- End of Topbar -->

                <!-- Begin Page Content -->
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-8 col-sm-12">
                            <div class="row">
                                <div class="col-8 col-sm-8">
                                    <div class="form-group">
                                        <label for="staff-phone" class="col-form-label">Name:</label>
                                        <input type="text" class="form-control" id="staff-phone" />
                                        <div class="fail"></div>
                                    </div>
                                    <div class="form-group">
                                        <label for="staff-phone" class="col-form-label">Email:</label>
                                        <input type="text" class="form-control" id="staff-phone" />
                                        <div class="fail"></div>
                                    </div>
                                    <div class="form-group">
                                        <label for="staff-phone" class="col-form-label">Mobile:</label>
                                        <input type="text" class="form-control" id="staff-phone" />
                                        <div class="fail"></div>
                                    </div>
                                    <div class="form-group">
                                        <label for="staff-name" class="col-form-label">Giới tính:</label><br>
                                        <input type="radio" id="age1" name="age" value="30">
                                        <label for="age1" style="margin-right: 20%;">Nam</label>
                                        <input type="radio" id="age2" name="age" value="60">
                                        <label for="age1" style="margin-right: 20%;">Nữ</label>
                                        <input type="radio" id="age2" name="age" value="60">
                                        <label for="age2">Không xác định</label>
                                        <div class="fail"></div>
                                    </div>
                                </div>
                                <div class="col-8 col-sm-4">
                                    <div class="col-8 col-sm-12" style="text-align: center ;">
                                        <img src="assets/image/avatar.jpg" alt="..." class="img-thumbnail"
                                            style="height: 200px; width: 200px; border-radius: 50%;">
                                        <div><input type="file" id="staff_avatar" accept="image/png, image/jpeg">
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-8 col-sm-12">
                            <div class="row">
                                <div class="col-8 col-sm-8">
                                    <div class="form-group">
                                        <label for="provider-name" class="col-form-label">Role:</label>
                                        <select name="provider-name" id="provider-name"
                                            class="border border-secondary w-100 label_box rounded">
                                            <option value="status-1">Role 1</option>
                                            <option value="status-1">Role 2</option>
                                        </select>
                                        <div class="fail"></div>
                                    </div>
                                    <div class="form-group">
                                        <label for="staff-phone" class="col-form-label">Vị trí công việc:</label>
                                        <input type="text" class="form-control" id="staff-phone" />
                                        <div class="fail"></div>
                                    </div>
                                </div>
                                <div class="col-8 col-sm-4">
                                    <div class="form-group">
                                        <label for="provider-name" class="col-form-label">Status:</label>
                                        <select name="provider-name" id="provider-name"
                                            class="border border-secondary w-100 label_box rounded">
                                            <option value="status-1">Active</option>
                                            <option value="status-1">Deactive</option>
                                        </select>
                                        <div class="fail"></div>
                                    </div>
                                    <div class="form-group">
                                        <label for="staff-phone" class="col-form-label">Công ty:</label>
                                        <input type="text" class="form-control" id="staff-phone" />
                                        <div class="fail"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="staff-phone" class="col-form-label">Địa chỉ:</label>
                            <input type="text" class="form-control" id="staff-phone" />
                            <div class="fail"></div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <input type="submit" class="btn btn-primary" value="Add/Save"></input>
                        <!-- <button type="button" class="btn btn-secondary"
                                                            data-dismiss="modal">Cancel</button> -->
                    </div>




                </div>
                <!-- /.container-fluid -->
            </div>
            <!-- End of Main Content -->
        </div>
        <div class="modal fade" id="changePassModal" tabindex="-1" role="dialog" aria-labelledby="changePassLabel"
            aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Đổi mật khẩu</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form action="" id="form1">
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="row">
                                        <div class="col-8 col-sm-12 ">
                                            <div class="form-group">
                                                <label for="old-password">Mật khẩu cũ:</label>
                                                <input type="text" id="old-password" name="old-password"
                                                    class="form-control" />
                                                <div class="fail"></div>
                                            </div>

                                            <div class="form-group">
                                                <label for="new-password" class="col-form-label">Mặt khẩu mới:</label>
                                                <input type="text" class="form-control" id="new-password"
                                                    name="new-password" />
                                                <div class="fail"></div>
                                            </div>
                                            <div class="form-group">
                                                <label for="re-password" class="col-form-label">Xác nhận mặt khẩu
                                                    mới:</label>
                                                <input type="text" class="form-control" id="re-password"
                                                    name="re-password" />
                                                <div class="fail"></div>

                                            </div>
                                            <br>
                                            <!-- <br> -->
                                            <div class="modal-footer">
                                                <input type="submit" class="btn btn-primary" value="Nhập"></input>
                                                <button type="button" class="btn btn-secondary"
                                                    data-dismiss="modal">Hủy</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>

                </div>
            </div>
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