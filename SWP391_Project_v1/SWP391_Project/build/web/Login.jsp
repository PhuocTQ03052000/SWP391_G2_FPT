<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">

<head>
    <title>Login</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="../css/lgin_reg_fgpw.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://code.iconify.design/2/2.1.2/iconify.min.js"></script>
    <link href="assets/styles/custom_box.css" rel="stylesheet">
    <link href="css/fnon.min.css" rel="stylesheet">
</head>
 <% String failMessage = (String) request.getAttribute("failMessage");
      
    %>
<body class="img js-fullHeight" style="background-image: url(/assets/image/bg4.webp); background-attachment: fixed;">
    <section class="ftco-section">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-md-6 text-center mb-5">
                    <a href="">
                        <span class="iconify" data-icon="ic:twotone-gas-meter" style="color: white;" data-width="80" data-height="80"></span>
                        <h2 class="heading-section">LGSMS</h2>
                    </a>
                </div>
            </div>
            <div class="row justify-content-center">
                <div class="col-md-6 col-lg-4" style="background-color: rgba(28, 100, 168, 0.521); border: 5px solid rgb(117, 105, 105);">
                    <div class="login-wrap p-0">
                        <h3 class="mb-4 text-center">Đăng Nhập</h3>
                        <!-- Form đăng nhập -->
                        <form id="form" action="login" method="post">
                            <!-- Nhập email -->
                            <div class="form-group">
                                <input id="username" name="username" type="text" class="form-control" placeholder="Tên tài khoản"  />
                                <div class="fail"></div>
                                <!-- <br> -->
                            </div>
                            <!-- Nhập mật khẩu -->
                            <div class="form-group">
                                <input id="password" name="password" type="password" class="form-control" placeholder="Mật khẩu"/>
                                <!-- <i class="fa fa-eye field-icon" id="togglePassword" style="margin-top: 6%;"></i> -->
                                
                                <div class="fail"></div>
                                
                            </div>
                            <% if(failMessage != null){%>
                                    <div class="fail"  style="color:#ff3860;" >  &emsp;  <%=request.getAttribute("failMessage")%> </div>
                                    <%}%>
                            <!-- Đăng nhập btn -->
                            <div class="form-group">
                                <input type="submit" class="form-control btn btn-primary submit px-3" value="Đăng nhập"></input>
                            </div>
                            <!-- <br> -->
                            <div class="form-group w-100 text-center">
                                <a href="<%=request.getContextPath()%>/ResetPassword" style="color: #fff; text-decoration: underline;">Reset Password</a>
                            </div>
                            <br>
                        </form>

                    </div>
                </div>
            </div>
        </div>
    </section>
    <script src="js/jquery.min.js"></script>
    <script src="js/popper.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/main.js"></script>
    <script src="js/fnon.min.js"></script>
    <script src="js/valdation/login_validate.js"></script>
    
</body>