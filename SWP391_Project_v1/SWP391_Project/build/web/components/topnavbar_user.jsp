 <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
    

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <!--Title-->
    <title>top nav bar</title>

    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="assets/styles/sb-admin-2.min.css" rel="stylesheet">
    <link href="assets/styles/slider_status.css" rel="stylesheet">
    <!-- Custom styles for this page -->
    <link href="vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">
    <link href="assets/styles/custom_box.css" rel="stylesheet">
    <link href="css/fnon.min.css" rel="stylesheet">
    <link href="assets/styles/alert.css" rel="stylesheet">

</head>

<body id="page-top">
    <ul class="navbar-nav ml-auto">
        <!-- Nav Item - Search Dropdown (Visible Only XS) -->
        <!-- <li><p style="margin-right: 20vw; font-size: 20px;margin-top: 20px;">LOGO</p></li>
        <li style="margin-right: 25vw; width:400px;margin-top: 20px;">
            <a style="margin-right: 20%; width: 100px;">Trang ch?</a>
            <a style="margin-right: 20%; width: 100px;">S?n ph?m</a>
            <a style="width: 100px;">Chia s?</a>
        </li>
        <li class="nav-item dropdown no-arrow d-sm-none">
            <a class="nav-link dropdown-toggle" href="#" id="searchDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <i class="fas fa-search fa-fw"></i>
            </a>
        </li>
        <li><button class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm" style="margin-right: 20px; width: 100px;margin-top: 20px;">Log in</button></li>
        <li><button class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm" style="width: 100px;margin-top: 20px;" data-toggle="modal"
            data-target="#exampleModal" data-whatever="@getbootstrap">Register</button></li> -->

        <!-- Nav Item - User Information -->
        <li class="nav-item dropdown no-arrow">
            <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown"
                aria-haspopup="true" aria-expanded="false">
                <span class="mr-2 d-none d-lg-inline text-gray-600 small">Vanh Sibun

                </span>
                <img class="img-profile rounded-circle" alt src="assets/image/img/undraw_profile.svg">
            </a>
            <!-- Dropdown - User Information -->
            <ul class="dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="userDropdown">
                <li>
                    <a class="dropdown-item" href="#">
                        <i class="fas fa-file fa-sm fa-fw mr-2 text-gray-400"></i> Dashboard
                    </a>
                </li>
                <li>
                    <a class="dropdown-item" href="#">
                        <i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i> H? s? c?a t??i
                    </a>
                </li>
                <li>
                    <a class="dropdown-item" href="#" data-toggle="modal" data-target="#changePassModal">
                        <i class="fas fa-lock fa-sm fa-fw mr-2 text-gray-400"></i> ??i m?t kh?u
                    </a>
                </li>
                <li>
                    <div class="dropdown-divider"></div>
                </li>
                <li>
                    <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">
                        <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i> ??ng xu?t
                    </a>
                </li>

            </ul>
        </li>
    </ul>
    </nav>
    <!-- Logout Modal-->
    <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
        aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">B?n c?? mu?n ??ng xu?t?</h5>
                    <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">??</span>
                    </button>
                </div>
                <div class="modal-body">Ch?n "??ng xu?t" n?u b?n mu?n tho??t kh?i h? th?ng.</div>
                <div class="modal-footer">
                    <button class="btn btn-secondary" type="button" data-dismiss="modal">H?y</button>
                    <a class="btn btn-primary" href="login.html">??ng xu?t</a>
                </div>
            </div>
        </div>
    </div>
    <div class="modal fade" id="changePassModal" tabindex="-1" role="dialog" aria-labelledby="changePassLabel"
        aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Change Password</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <form action="<%=request.getContextPath()%>/ChangePassword" method="POST" id="form>
                        <div class="row">
                            <div class="col-sm-12">
                                <div class="row">
                                    <div class="col-8 col-sm-12 ">
                                        <div class="form-group">
                                            <label for="old-password">Old Password:</label>
                                            <input type="text" id="old-password" name="old-password"
                                                class="form-control" />
                                            <div class="fail"></div>
                                        </div>

                                        <div class="form-group">
                                            <label for="new-password" class="col-form-label">New Password:</label>
                                            <input type="text" class="form-control" id="new-password"
                                                name="new-password" />
                                            <div class="fail"></div>
                                        </div>
                                        <div class="form-group">
                                            <label for="re-password" class="col-form-label">Confirm Password:</label>
                                            <input type="text" class="form-control" id="re-password"
                                                name="re-password" />
                                            <div class="fail"></div>

                                        </div>
                                        <br>
                                        <!-- <br> -->
                                        <div class="modal-footer">
                                            <input type="submit" class="btn btn-primary" value="Change"></input>
                                            <button type="button" class="btn btn-secondary"
                                                data-dismiss="modal">Cancel</button>
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
    <!-- Bootstrap core JavaScript-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="vendor/Noneed(maybe)/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="js/sb-admin-2.min.js"></script>

    <!-- Page level plugins -->
    <script src="vendor/chart.js/Chart.min.js"></script>

    <!-- Page level custom scripts -->
    <script src="js/jquery-3.6.0.min.js"></script>
</body>

</html>