<%-- 
    Document   : base.jsp
    Created on : Mar 9, 2022, 12:09:59 PM
    Author     : ACER
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            <decorator:title default="Trang chu" />
        </title>
        <link rel="stylesheet" href="<c:url value="/vendor/bootstrap/css/bootstrap.min.css"/>">

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css" integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,700">
        <link rel="stylesheet" href="<c:url value="/vendor/bootstrap-select/css/bootstrap-select.min.css"/>">
        <link rel="stylesheet" href="<c:url value="/vendor/owl.carousel/assets/owl.carousel.css"/>">
        <link rel="stylesheet" href="<c:url value="/vendor/owl.carousel/assets/owl.theme.default.css"/>">
        <link rel="stylesheet" href="<c:url value="/css/style.css"/>">
        <script src="<c:url value="/vendor/jquery/jquery.min.js"/>"></script>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.25/css/jquery.dataTables.css">
        <script type="text/html" src="https://cdn.datatables.net/1.10.25/js/jquery.dataTables.js"></script>
        <link rel="shortcut icon" href="<c:url value="/img/tomos.png"/>">
    </head>
    <body>
        <!-- header -->
        <%@ include file="/WEB-INF/layout/header.jsp"%>

        <!-- content -->
        <decorator:body />

        <!-- footer -->
        <%@ include file="/WEB-INF/layout/footer.jsp"%>

        <script src="<c:url value="/vendor/popper.js/umd/popper.min.js"/>"></script>
        <script src="<c:url value="/vendor/bootstrap/js/bootstrap.min.js"/>"></script>
        <script src="<c:url value="/vendor/jquery.cookie/jquery.cookie.js"/>"></script>
        <script src="<c:url value="/vendor/waypoints/lib/jquery.waypoints.min.js"/>"></script>
        <script src="<c:url value="/vendor/jquery.counterup/jquery.counterup.min.js"/>"></script>
        <script src="<c:url value="/vendor/owl.carousel/owl.carousel.min.js"/>"></script>
        <script src="<c:url value="/vendor/owl.carousel2.thumbs/owl.carousel2.thumbs.min.js"/>"></script>
        <script src="<c:url value="/js/jquery.parallax-1.1.3.js"/>"></script>
        <script src="<c:url value="/vendor/bootstrap-select/js/bootstrap-select.min.js"/>"></script>
        <script src="<c:url value="/vendor/jquery.scrollto/jquery.scrollTo.min.js"/>"></script>
        <script src="<c:url value="/js/front.js"/>"></script>
    </body>
</html>
