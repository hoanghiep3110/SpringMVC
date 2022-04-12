<%-- 
    Document   : blogdetail
    Created on : Apr 12, 2022, 9:29:51 AM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="heading-breadcrumbs" class="border-top-0 border-bottom-0">
    <div class="container">
        <div class="row d-flex align-items-center flex-wrap">
            <div class="col-md-7">
                <h1 class="h2">Tạp chí xe</h1>
            </div>
            <div class="col-md-5">
                <ul class="breadcrumb d-flex justify-content-end">
                    <li class="breadcrumb-item"><a href="<c:url value="/"/>">Trang chủ</a></li>
                    <li class="breadcrumb-item"><a href="<c:url value="/blog"/>">Tạp chí xe</a></li>
                    <li class="breadcrumb-item active"></li>
                </ul>
            </div>
        </div>
    </div>
</div>
<div id="content">
    <div class="container">
        <div class="row bar">
            <!-- LEFT COLUMN _________________________________________________________-->
            <div id="blog-post" class="col-md-9">
                ${blogDetail.content}
            </div>
            <style>
                img {
                    width: 100%;
                }
            </style>
            <div class="col-md-3">
                <div class="panel panel-default sidebar-menu">
                    <div class="heading">
                        <h2><a href="<c:url value="/blog"/>">THỂ LOẠI</a></h2>
                    </div>
                    <div class="panel-body">
                        <a href="<c:url value="/blog"/>" class="list-group list-group-flush">                        
                            <c:forEach items="${listCate}" var="item">
                                <a href="<c:url value="/blog?idCate=${item.idCate}"/>" class="list-group-item list-group-item-action">${item.nameCate}</a>
                            </c:forEach>
                        </a>
                    </div>
                </div>               
            </div>
        </div>
    </div>
</div>
