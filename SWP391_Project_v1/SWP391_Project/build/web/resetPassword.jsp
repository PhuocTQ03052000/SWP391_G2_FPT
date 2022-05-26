<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">

<head>

    <title>Forgot Password</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="css/lgin_reg_fgpw.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://code.iconify.design/2/2.1.2/iconify.min.js"></script>
</head>
<% 
    String emailMessage =  (String)request.getAttribute("emailMessage"); 
%>
   
<body class="img js-fullheight" style="background-image: url(/assets/image/bg4.webp); background-attachment: fixed;">
    <section class="ftco-section">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-md-6 text-center mb-5">
                    <a href="home.html">
                        <span class="iconify" data-icon="ic:twotone-gas-meter" style="color: white;" data-width="80" data-height="80"></span>
                        <h2 class="heading-section">LGSMS</h2>
                    </a>
                </div>
            </div>
            <div class="row justify-content-center">
                <div class="col-md-6 col-lg-4" style="background-color: rgba(28, 100, 168, 0.521); border: 5px solid rgb(117, 105, 105);">
                    <div class="text-center">
                        <h3 class="mb-4 text-center">Quên mật khẩu?</h3>
                        <p class="mb-4">Bạn hãy nhập địa chỉ email đã đăng ký, chúng tôi sẽ gửi cho bạn một mã xác nhận qua email.</p>
                    </div>
                    <form action="<%=request.getContextPath()%>/ResetPassword" method="post" id="form">
                        <div class="input-control">
                            <input id="email" name="email" type="text" class="form-control" placeholder="Nhập địa chỉ email...">
                             <% if(emailMessage!=null){%>
                                <div class="error"  style="color:#ff3860;" > &emsp;<%=request.getAttribute("emailMessage")%> </div>
                               <%}%>
                                <div class="error"></div>
                        </div>
                        <input type="submit"  class="btn btn-primary btn-user btn-block" value="Gửi mã xác nhận"></input>
                    </form>

                </div>

            </div>
        </div>
    </section>

    <script src="js/jquery.min.js"></script>
    <script src="js/popper.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/main.js"></script>


</body>

</html>