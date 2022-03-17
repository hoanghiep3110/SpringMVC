<%-- 
    Document   : base_admin.jsp
    Created on : 17 Mar 2022, 9:09:13 pm
    Author     : Hiệp Phan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="robots" content="all,follow">
        <!-- Bootstrap CSS-->
        <link rel="stylesheet" href="/admin/vendor/bootstrap/css/bootstrap.min.css">
        <!-- Font Awesome CSS-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"
              integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <!-- Fontastic Custom icon font-->
        <link rel="stylesheet" href="/admin/css/fontastic.css">
        <!-- Google fonts - Roboto -->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700">
        <!-- jQuery Circle-->
        <link rel="stylesheet" href="/admin/css/grasp_mobile_progress_circle-1.0.0.min.css">
        <!-- Custom Scrollbar-->
        <link rel="stylesheet" href="/admin/vendor/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.css">
        <!-- theme stylesheet-->
        <link rel="stylesheet" href="/admin/css/style.default.css" id="theme-stylesheet">
        <script src="/admin/vendor/jquery/jquery.min.js"></script>
        <!-- Custom stylesheet - for your changes-->


        <link href="/admin/css/custom.css" rel="stylesheet" />
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.25/css/jquery.dataTables.css">
        <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.25/js/jquery.dataTables.js"></script>

        <title>
            <decorator:title default="Trang admin" />
        </title>

    </head>
    <body>
        <!-- Side Navbar -->
        <nav class="side-navbar">
            <div class="side-navbar-wrapper">
                <!-- Sidebar Header    -->
                <div class="sidenav-header d-flex align-items-center justify-content-center">
                    <!-- User Info-->
                    <div class="sidenav-header-inner text-center">

                        <h2 class="h5"><%= session.getAttribute("username")%></h2>
                    </div>
                    <!-- Small Brand information, appears on minimized sidebar-->
                    <div class="sidenav-header-logo"><a href="index.html" class="brand-small text-center"> <strong>B</strong><strong class="text-primary">D</strong></a></div>
                </div>
                <!-- Sidebar Navigation Menus-->
                <div class="main-menu">
                    <ul id="side-main-menu" class="side-menu list-unstyled">

                        <li><a href="@Url.Action("Index","PRODUCTs")"> <i class="icon-picture"></i>Sản phẩm</a></li>
                        <li><a href="@Url.Action("Index","ORDERs")"> <i class="icon-check"></i>Đơn hàng</a></li>
                        <li><a href="@Url.Action("Index","EMPLOYEEs")"> <i class="icon-user"></i>Người dùng</a></li>
                        <li><a href="@Url.Action("Index","CONTACTs")"> <i class="icon-grid"></i>Liên hệ</a></li>
                        <li><a href="@Url.Action("Index","BLOGs")"> <i class="icon-interface-windows"></i>Bài viết</a></li>
                        <li><a href="@Url.Action("Index","TYPECARs")"> <i class="icon-list-1"></i>Loại xe</a></li>
                        <li><a href="@Url.Action("Index","BRANDs")"> <i class="icon-list"></i>Hãng xe</a></li>
                        <li><a href="@Url.Action("Index","RENTs")"> <i class="icon-presentation"></i>Thuê xe</a></li>
                        <li><a href="@Url.Action("Index","DISCOUNTs")"> <i class="icon-line-chart"></i>Khuyến mãi</a></li>
                        <li><a href="@Url.Action("Index","CATEGORY_BLOG")"> <i class="icon-pencil-case"></i>Thể loại bài viết</a></li>

                    </ul>
                </div>
                <div class="admin-menu">
                    <h5 class="sidenav-heading">Thông tin</h5>
                    <ul id="side-admin-menu" class="side-menu list-unstyled">
                        <li> <a href="@Url.Action("Logout","Auth")"> <i class="icon-screen"> </i>Đăng xuất</a></li>
                        <li> <a href="@Url.Action("Index","Info")"> <i class="icon-flask"> </i>Thông tin cá nhân</a></li>

                    </ul>
                </div>
            </div>
        </nav>
        <div class="page">
            <!-- header -->
            <%@ include file="/WEB-INF/layout_admin/header_admin.jsp"%>

            <!-- content -->
            <decorator:body />

            <!-- footer -->
            <%@ include file="/WEB-INF/layout_admin/footer_admin.jsp"%>

        </div>
        <!-- JavaScript files-->
        <script src="/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="/admin/js/grasp_mobile_progress_circle-1.0.0.min.js"></script>
        <script src="/admin/vendor/jquery.cookie/jquery.cookie.js"></script>
        <script src="/admin/vendor/jquery-validation/jquery.validate.min.js"></script>
        <!--<script src="/Areas/Admin/Helpers/ckeditor/ckeditor.js"></script>-->
        <script src="/admin/vendor/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.concat.min.js"></script>
        <!-- Main File-->
        <script src="/admin/js/front.js"></script>
    </body>
</html>

