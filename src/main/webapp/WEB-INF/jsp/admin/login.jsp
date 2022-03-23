<%-- 
    Document   : login.jsp
    Created on : 18 Mar 2022, 1:09:39 pm
    Author     : Hiệp Phan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Đăng Nhập Admin</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/admincontent/vendor/bootstraplogin/css/bootstrap.min.css"/>" >
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/admincontent/fonts/Linearicons-Free-v1.0.0/icon-font.min.css"/>" >
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/admincontent/vendor/animate/animate.css"/>" >
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/admincontent/vendor/animsition/css/animsition.min.css"/> ">
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/admincontent/vendor/daterangepicker/daterangepicker.css"/>" >
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/admincontent/css/util.css"/>" >
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/admincontent/css/main.css"/>" >
        
    </head>
    <body style="background-color: #666666;">

        <div class="limiter">
            <div class="container-login100">
                <div class="wrap-login100">
                    <form class="login100-form validate-form" action="<c:url value="/admin/login" />" method="POST">
                        <span class="login100-form-title p-b-43">
                            <b>XIN CHÀO ADMIN</b>
                        </span>
                        
                        <div class="wrap-input100">
                            <input class="input100" type="text" placeholder="Tài khoản" name="userName" required>
                            <span class="focus-input100"></span>
                        </div>
                        <div class="wrap-input100">
                            <input class="input100" type="password" placeholder="Mật khẩu" name="passWord" required>
                            <span class="focus-input100"></span>
                        </div>
                        ${message}
                        <div class="container-login100-form-btn">
                            <button type="submit" class="login100-form-btn" style="background-color: #AE0201; font-weight: bold">
                                ĐĂNG NHẬP
                            </button>
                        </div>           
                    </form>
                    <div class="login100-more" style="background-image: url('<c:url value="/resource/img/bgxe.jpg"/>');">
                    </div>
                </div>
            </div>
        </div>
        <script src="<c:url value="/resource/admincontent/vendor/jquerylogin/jquery-3.2.1.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/resource/admincontent/vendor/animsition/js/animsition.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/resource/admincontent/vendor/bootstrap/js/bootstrap.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/resource/admincontent/vendor/select2/select2.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/resource/admincontent/vendor/daterangepicker/moment.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/resource/admincontent/vendor/daterangepicker/daterangepicker.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/resource/admincontent/vendor/countdowntime/countdowntime.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/resource/admincontent/js/main.js"/>" type="text/javascript"></script>

    </body>
</html>
