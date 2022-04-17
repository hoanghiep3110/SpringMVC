<%-- 
    Document   : product
    Created on : Mar 10, 2022, 1:26:15 PM
    Author     : huynh
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.hutech.model.Product"%>
<%@page import="com.hutech.dao.ProductDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    ProductDAO productDAO = new ProductDAO();
    List<Product> arr = productDAO.getList();
    int start = 0, end = 6;
    if (arr.size() < 6) {
        end = arr.size();
    }
    if (request.getParameter("start") != null) {
        start = Integer.parseInt(request.getParameter("start"));
    }
    if (request.getParameter("end") != null) {
        end = Integer.parseInt(request.getParameter("end"));
    }
    List<Product> list = productDAO.getListByPage(arr, start, end);
%>
<div id="heading-breadcrumbs">
    <div class="container">
        <div class="row d-flex align-items-center flex-wrap">
            <div class="col-md-7">
                <h1 class="h2">CỬA HÀNG</h1>
            </div>
            <div class="col-md-5">
                <ul class="breadcrumb d-flex justify-content-end">
                    <li class="breadcrumb-item"><a href="<c:url value="/"/>">TRANG CHỦ</a></li>
                    <li class="breadcrumb-item active">CỬA HÀNG</li>
                </ul>

            </div>
        </div>
    </div>
</div>
<div id="content">
    <div class="container">
        <section class="bar">
            <div class="row">
                <div class="col-md-12">
                    <div class="heading">
                        <h2><a href="<c:url value="/product"/>">SẢN PHẨM</a></h2>
                    </div>
                </div>
                <div class="col-md-3 py-3">                             
                    <div class="card" style="width: 100%;">
                        <div class="card-header">
                            Hãng xe
                        </div>                   
                        <a href="<c:url value="/product"/>" class="list-group list-group-flush">                        
                            <c:forEach items="${listBrand}" var="item">
                                <a href="<c:url value="/product?idBrand=${item.idBrand}"/>" class="list-group-item list-group-item-action">${item.nameBrand}</a>
                            </c:forEach>
                        </a>
                    </div>                
                    <div class="card" style="width: 100%;">
                        <div class="card-header">
                            Loại xe
                        </div>                   
                        <a href="<c:url value="/product"/>" class="list-group list-group-flush">                        
                            <c:forEach items="${listType}" var="item">
                                <a href="<c:url value="/product?idType=${item.idType}"/>" class="list-group-item list-group-item-action">${item.nameType}</a>
                            </c:forEach>
                        </a>
                    </div>                     
                </div>
                <div class="col-md-9">
                    <div class="row portfolio text-center">
                        <%
                            for (Product p : list) {
                        %>                   
                        <div class="col-md-4">
                            <div class="box-image card">
                                <div class="image">
                                    <a href="/SpringMVC/detail/<%=p.getIdProduct()%>">

                                        <img src="/SpringMVC/<%=p.getLinkImg()%>" alt="" class="img-fluid">

                                        <div style="text-align:center;"><%=p.getNameProduct()%></div>
                                        <div style="text-align:center;">Giá : <%=p.getPrice()%>đ</div>
                                        <div class="overlay d-flex align-items-center justify-content-center">
                                            <div class="content">
                                                <div class="text">
                                                    <p class="buttons">
                                                    <h6 class="btn btn-template-outlined-white">
                                                        Xem chi tiết
                                                    </h6>
                                                    </p>
                                                </div>
                                            </div>
                                        </div>
                                    </a>
                                </div>
                            </div>

                        </div>

                    <%
                        }
                    %>
                </div>
                <ul class="pagination" id="pagination">
                    <%
                        int a, b;
                        int limit = arr.size() / 6;
                        if (limit * 6 < arr.size()) {
                            limit += 1;
                        }
                        for (int i = 1; i <= limit; i++) {
                            a = (i - 1) * 6;
                            b = i * 6;
                            if (b > arr.size()) {
                                b = arr.size();
                            }
                    %>
                    <li><a href="product?start=<%=a%>&end=<%=b%>"><%=i%></a></li>
                        <%
                            }
                        %>
                </ul>
                <ul class="pager d-flex align-items-center justify-content-between list-unstyled" style="position: absolute; width: 100%; padding-right: 15px; bottom: -80px; ">
                    <li>
                    </li>
                </ul>
            </div>
        </div>
    </section>
</div>
</div>
<section class="bar background-pentagon no-mb">
    <div class="container">
        <div class="row showcase text-center">
            <div class="col-md-3 col-sm-6">
                <div class="item">
                    <div class="icon-outlined icon-sm icon-thin"><i class="fa fa-align-justify"></i></div>
                    <h4><span class="h1 counter">3</span><br> Kinh nghiệm</h4>
                </div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="item">
                    <div class="icon-outlined icon-sm icon-thin"><i class="fa fa-align-justify"></i></div>
                    <h4><span class="h1 counter">90</span><Span class="h1">%</Span><br>Khách hàng hài lòng</h4>
                </div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="item">
                    <div class="icon-outlined icon-sm icon-thin"><i class="fa fa-users"></i></div>
                    <h4><span class="h1 counter">7321</span><br>Khách hàng</h4>
                </div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="item">
                    <div class="icon-outlined icon-sm icon-thin"><i class="fa fa-copy"></i></div>
                    <h4><span class="h1 counter">10232</span><br>Đơn hàng</h4>
                </div>
            </div>
        </div>
    </div>




</section>
<section class="bar bg-gray no-mb">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="heading text-center">
                    <h3>Các hãng xe</h3>
                </div>
                <ul class="list-unstyled owl-carousel brand no-mb">
                    <c:forEach  var = "item" items="${listBrand}">
                        <li class="item"><img src=<c:url value="${item.imgBrand}"/> alt="" class="img-fluid"></li>
                        </c:forEach>                  
                </ul>
            </div>
        </div>
    </div>
</section>
<style>
    .MenuPage li {
        display: inline;
        text-align: center;

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
        color:#fff;
    }
</style>
