<%-- 
    Document   : header
    Created on : Mar 9, 2022, 12:15:22 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="top-bar">
    <div class="container">
        <div class="row d-flex align-items-center">
            <div class=" text-light col-md-6 d-md-block d-none">
                <p class="h4">Mua bán xe máy cũ <br /> Gọi ngay: <a href="tel:+0386632736" style="color: #fff;">0386632736</a></p>
            </div>
            <div class="col-md-6">
                <div class="d-flex justify-content-md-end justify-content-between">
                    <ul class="list-inline contact-info d-block d-md-none">
                        <li class="list-inline-item"><a href="#"><i class="fa fa-phone"></i></a></li>
                        <li class="list-inline-item"><a href="#"><i class="fa fa-envelope"></i></a></li>
                    </ul>
                    <c:choose>
                        <c:when test="${sessionScope.userName == null}">
                            <div class="login">
                                <a href="<c:url value="/login"/>" class="login-btn">
                                    <i class="fa-solid fa-arrow-right-to-bracket"></i>
                                    <span class="d-none d-md-inline-block">Đăng nhập</span></a>
                                <a href="<c:url value="/register"/>" class="signup-btn">
                                    <i class="fa-solid fa-user"></i>
                                    <span class="d-none d-md-inline-block">Đăng ký</span></a>
                            </div>  
                        </c:when>
                        <c:when test="${sessionScope.userName != null}">
                            <div class="login">
                                <a class="signup-btn">
                                <span class="d-none d-md-inline-block">${sessionScope.userName}</span></a>
                                <a href="<c:url value="/logout"/>" class="signup-btn">
                                    <i class="fa-solid fa-right-from-bracket"></i>
                                    <span class="d-none d-md-inline-block">Đăng xuất</span></a>
                            </div>  
                        </c:when>
                    </c:choose>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Top bar end-->
<!-- Navbar Start-->
<header class="nav-holder make-sticky">
    <div id="navbar" role="navigation" class="navbar navbar-expand-lg">
        <div class="container"><a href=<c:url value="/"/> class="navbar-brand home">
                <img src="<c:url value="/img/XEMAYH2C.png"/>" class="d-none d-md-inline-block"/><span class="sr-only">Xemay H2C</span></a>
            <div id="navigation" class="navbar-collapse collapse">
                <ul class="nav navbar-nav ml-auto">
                    <li class="nav-item dropdown"><a href="<c:url value="/"/>">Trang chủ<b class="caret"></b></a>
                    </li>
                    <li class="nav-item dropdown"><a href="<c:url value="/about"/>">Giới thiệu<b class="caret"></b></a>
                    </li>
                    <li class="nav-item dropdown"><a href="<c:url value="/blog"/>">Tạp chí xe<b class="caret"></b></a>
                        <!-- ========== FULL WIDTH MEGAMENU ==================-->
                    <li class="nav-item dropdown"><a href="<c:url value="/product"/>">Cửa hàng<b class="caret"></b></a>
                    </li>
                    <!-- ========== Liên hệ dropdown ==================-->
                    <li class="nav-item dropdown"><a href="<c:url value="/contact"/>">Liên hệ<b class="caret"></b></a>
                    </li>

                    <!-- ========== Contact dropdown end ==================-->
                </ul>
            </div>
            <div id="search" class="collapse clearfix">
                <form role="search" class="navbar-form">
                    <div class="input-group">
                        <input type="text" placeholder="Search" class="form-control"><span class="input-group-btn">
                            <button type="submit" class="btn btn-template-main"><i class="fa fa-search"></i></button></span>
                    </div>
                </form>
            </div>
        </div>
    </div>
</header>