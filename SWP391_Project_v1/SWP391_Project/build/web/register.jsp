<%-- 
    Document   : register
    Created on : May 21, 2022, 11:50:23 PM
    Author     : phant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <title>Register</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="css/lgin_reg_fgpw.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://code.iconify.design/2/2.1.2/iconify.min.js"></script>
</head>

    <body class="img js-fullHeight" style="background-image: url(/assets/image/bg4.webp);background-attachment: fixed;">
    <section class="ftco-section">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-md-6 text-center">
                    <a href="home.html">
                       <img src="assets/image/logophuoc-01.PNG" width="170" height="200" style="padding-bottom: 5%;">
                    </a>
                </div>
            </div>
            <div class="row justify-content-center">
                <div class="col-md-6 col-lg-4" style="background-color: rgba(28, 100, 168, 0.521); border: 5px solid rgb(117, 105, 105);">
                    <div class="login-wrap p-0">
                        <h3 class="mb-4 text-center">Đăng Ký</h3>
                        <form id="form" action="register" method="post">
                            <!-- Nhập username -->
                            <div class="input-control">
                                <input id="account" name="username" type="text" class="form-control" placeholder="Tên tài khoản" required>
                                <div class="error"></div>
                            </div>
                            <!-- Nhập email -->
                            <div class="input-control">
                                <input id="email" name="email" type="text" class="form-control" placeholder="Tài khoản email" required>
                                <div class="error"></div>
                            </div>
                            
                            <div class="input-control">
                                <input id="number" name="phone" type="text" class="form-control" placeholder="Số điện thoại" required>
                                <div class="error"></div>
                            </div>

                            <div class="input-control">
                                <label for="staff-name" class="col-form-label" style="margin-left: 5%;">Gender:</label><br>
                                <input type="radio" id="age1" name="gender" value="Male" style="margin-left: 10%;" checked="true">
                                <label for="age1" style="margin-right: 20%;">Nam</label>
                                <input type="radio" id="age2" name="gender" value="Female">
                                <label for="age1" style="margin-right: 10%;">Nữ</label>
                                <div class="fail"></div>
                            </div>
                            <!-- Đăng nhập btn -->
                            <div class="form-group">
                                <input type="submit" class="form-control btn btn-primary submit px-3" value="Đăng ký">
                            </div>
                        </form>
                        <!-- URL tạo tài khoản -->
                        <div class="w-100 text-center">
                            <p>Bạn đã có tài khoản? <a href="login.jsp" style="color: #fff; text-decoration: underline;"><b>Đăng nhập ngay!</b></a>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>



    </body>
        <script src="js/jquery.min.js"></script>
    <script src="js/popper.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/main.js"></script>
    <script src="js/valdation/register_validate.js"></script>
</html>
