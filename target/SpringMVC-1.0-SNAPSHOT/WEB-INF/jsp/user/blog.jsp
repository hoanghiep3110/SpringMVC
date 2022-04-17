<%-- 
    Document   : Blog
    Created on : Mar 11, 2022, 5:00:43 PM
    Author     : huynh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section style="background: url('/Public/img/photogrid.jpg') center center repeat; background-size: cover;"
         class="relative-positioned">
    <!-- Carousel Start-->
    <div class="home-carousel">
        <div class="dark-mask mask-primary"></div>
        <div class="container">
            <div class="homepage owl-carousel">
                <div class="item">
                    <div class="row">
                        <div class="col-md-5 text-right">
                            <p><img src="img/logo.png" alt="" class="ml-auto"></p>
                            <h1>XE CŨ ĐI LÀM GIÁ RẺ BẤT NGỜ</h1>
                            <p>Sang tên, đổi chủ nhanh chóng<br>5 phút thủ tục</p>
                        </div>
                        <div class="col-md-7"><img src="img/bannerslider1-xemayz.png" alt="" class="img-fluid"></div>
                    </div>
                </div>
                <div class="item">
                    <div class="row">
                        <div class="col-md-7 text-center"><img src="img/bannerslider2-xemayz.png" alt="" class="img-fluid">
                        </div>
                        <div class="col-md-5">
                            <h1>XE CŨ ĐI LÀM GIÁ RẺ BẤT NGỜ</h1>
                            <p>Sang tên, đổi chủ nhanh chóng<br>5 phút thủ tục</p>
                        </div>
                    </div>
                </div>
                <div class="item">
                    <div class="row">
                        <div class="col-md-5 text-right">
                            <h1>BẢO HÀNH</h1>
                            <ul class="list-unstyled">
                                <li>Vệ sinh xe</li>
                                <li>kiểm tra định kỳ</li>
                                <li>thay nhớt miễn phí trong vòng 2000km đầu</li>
                                <li>miễn phí rửa xe</li>
                            </ul>
                        </div>
                        <div class="col-md-7"><img src="img/banner-cuoi-xemayz.png" alt="" class="img-fluid"></div>
                    </div>
                </div>
                <div class="item">
                    <div class="row">
                        <div class="col-md-7"><img src="img/xe-con-tay-tu-25-trieu-xemayz.png" alt="" class="img-fluid"></div>
                        <div class="col-md-5">
                            <h1>Xe côn tay</h1>
                            <ul class="list-unstyled">
                                <li>Giá từ 25-40 triệu</li>
                                <li>nhiều mẫu mã, giá cả phải chăng</li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Carousel End-->
</section>
<div id="content">
    <div class="container">
        <div class="row bar">
            <div id="blog-listing-medium" class="col-md-9">
                <section class="post">
                    <div class="row">
                        <c:forEach var="item" items="${listBlog}">
                            <div class="col-md-4 my-2">
                                <a href="<c:url value="/blogdetail/${item.idBlog}"/>">
                                    <img src="<c:url value="${item.linkImg}"/>" alt="" class="img-fluid shadow">
                                </a>
                            </div>

                            <div class="col-md-8 my-2">
                                <a href="<c:url value="/blogdetail/${item.idBlog}"/>">
                                        <h2 class="h3 mt-0">${item.title}</h2>
                                    </a>
                                <div class="d-flex flex-wrap justify-content-between text-xs">
                                    <p class="author-category">
                                       <span>By</span> <c:url value="${item.idUser.fullName}"/>  <span>in</span> XEMAYH2C
                                    </p>
                                    <p class="date-comments"><i class="fa fa-calendar-o"></i><c:url value="${item.dateCreate}"/></p>
                                </div>
                                <p class="card-title text-dark" style="overflow: hidden; text-overflow: ellipsis; white-space: nowrap;"></p>
                                <p class="read-more text-right">
                                    <a href="<c:url value="/blogdetail/${item.idBlog}"/>" class="btn btn-template-outlined">
                                        Đọc thêm
                                    </a>
                                </p>
                            </div>
                            
                            <ul class="pager d-flex align-items-center justify-content-between list-unstyled" style="position: absolute; width: 100%; padding-right: 15px; bottom: -80px; ">


                                <li class="pagination-container PagedList-skipToPrevious"><a href="#" class=" btn btn-template-outlined">← Older</a></li>
                                

                                <li class="PagedList-skipToNext"><a href="" class="btn btn-template-outlined">Newer →</a></li>
                            </ul>
                        </c:forEach>
                    </div>

                </section>
            </div>
            <div class="col-md-3">
                <div class="panel panel-default sidebar-menu">
                    <div class="panel-heading">
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
<style>
    .MenuPage li {
        display: inline;
        text-align: center;
        background-color: #DA251C;
    }

    .pagination a {
        color: black;
        float: right;
        padding: 8px 16px;
        text-decoration: none;
        transition: background-color .3s;
    }

    .pagination a.active {
        background-color: dodgerblue;
        color: white;
    }

    .pagination a:hover:not(.active) {
        background-color: #ddd;
        background-color: #DA251C;
        color: #fff;
    }
</style>
