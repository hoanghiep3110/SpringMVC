<%-- 
    Document   : productdetail
    Created on : Mar 10, 2022, 10:33:03 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="heading-breadcrumbs">
    <div class="container">
        <div class="row d-flex align-items-center flex-wrap">
            <div class="col-md-7">
                <h1 class="h2"> Chi tiết sản phẩm</h1>
            </div>
            <div class="col-md-5">
                <ul class="breadcrumb d-flex justify-content-end">
                    <li class="breadcrumb-item"><a href="@Url.Action("Index", "Home")">Trang chủ</a></li>
                    <li class="breadcrumb-item active"> Chi tiết sản phẩm</li>
                </ul>
            </div>
        </div>
    </div>
</div>
<div id="content">
    <div class="container">
        <section class="bar">
            <div class="row portfolio-product">
                <div class="col-sm-5 card">
                    <div class=" owl-carouse mb-4">
                        <div class="item ">                                    
                                <img src=<c:url value="${productDetail.linkImg}"/> alt="" class="img-fluid">
                        </div>
                    </div>
                </div>
                <div class="col-sm-4 card">
                    <div class="product-more">

                        <h1 class="my-4 text-center card-footer"> ${productDetail.nameProduct}</h1>
                        <h2 class="my-4">Giá tiền: ${productDetail.price} đ</h2>
                        <h7 class="my-4">Tình trạng: <b>Còn hàng</b></h7>
                        <h4 class="my-4">
                            Số lượng: <input name="sl" value="1" min="0" step="1" type="number"
                                             class="form-control" style="width: 250px; ">
                        </h4>
                        <a href="tel:+0386632736"
                           class="btn-primary mx-3" style="padding: 15px 2px;box-shadow: 1px #c22026;">
                            GỌI NGAY
                        </a>
                        <button class="btn-danger mx-3" style="height: 50px;">TÌM CỬA HÀNG</button>
                        
                        <h4 style="color: brown;margin-top: 30px">CHIA SẺ NGAY</h4>
                        <div class="fb-share-button" data-href="@Facebook.com data-layout="button_count" data-size="small"><a target="_blank" href="https://www.facebook.com/sharer/sharer.php?u=@Facebook.com" class="fb-xfbml-parse-ignore" > <i class="fab fa-facebook" style="color: blue"></i></a></div>


                    </div>
                </div>
                <div class="col-sm-3 card">
                    <h4 class="my-4 text-center card-footer" style="color:springgreen"> CHÚNG TÔI CAM KẾT</h4>
                    <i class="fas fa-tools" style="color:sandybrown"> <b>SỬA CHỮA TẬN NƠI</b></i>
                    <br />
                    <br />
                    <i class="fas fa-first-aid" style="color:brown"> <b>CỨU HỘ KHẨN CẤP</b></i>
                    <br />
                    <br />
                    <i class="fas fa-shipping-fast" style="color:dodgerblue"> <b>GIAO HÀNG MIỄN PHÍ</b></i>
                    <br />
                    <br />
                    <i class="fas fa-sync-alt" style="color:red"> <b>CHẤT LƯỢNG CHÍNH HÃNG</b></i>
                    <br />
                    <br />
                    <i class="fas fa-medal" style="color:palevioletred"> <b>THỦ TỤC ĐƠN GIẢN</b></i>
                </div>
            </div>
            <div class="fb-comments" data-href="@ViewBag.Url" data-width="1100" data-numposts="5"></div>
        </section>
        <div class="col-sm-12">
            <div class="heading">
                <h3>Mô tả sản phẩm</h3>
            </div>
            ${productDetail.description}
         
        </div>
    </div>
</div>
