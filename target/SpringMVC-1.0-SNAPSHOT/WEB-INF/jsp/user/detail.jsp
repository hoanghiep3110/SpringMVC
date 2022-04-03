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
                        <h7 class="my-4">Tình trạng: <b>${productDetail.status}</b></h7> <br> <br>
                        <h7 class="my-4">Brand: <b>${productDetail.idBrand.nameBrand}</b></h7> <br> <br>
                        <h7 class="my-4">Loại xe: <b>${productDetail.idType.nameType}</b></h7> <br> <br> <br>
                        <a href="tel:+0386632736"
                           class="btn-primary mx-3" style="padding: 15px 2px;box-shadow: 1px #c22026;">
                            GỌI NGAY
                        </a>
                        <a href="https://www.google.com/maps/place/%C4%90%E1%BA%A1i+H%E1%BB%8Dc+Hutech+Khu+E/@10.855048,106.7831843,17z/data=!3m1!4b1!4m5!3m4!1s0x317527c3debb5aad:0x5fb58956eb4194d0!8m2!3d10.8550427!4d106.785373?hl=vi-VN" class="btn-danger mx-3" style="padding: 15px; ">TÌM CỬA HÀNG</a>
                        <h4 style="color: brown;margin-top: 30px">CHIA SẺ NGAY</h4>
                        <div class="fb-share-button" style="margin-top: 30px;" data-href="${urlShare}" data-layout="button_count" data-size="small"><a target="_blank" href="https://www.facebook.com/sharer/sharer.php?u=${urlShare}" class="fb-xfbml-parse-ignore" > <i class="fab fa-facebook" style="color: blue"></i></a>
                        </div>
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

        </section>
        <div class="col-sm-12">
            <div class="heading">
                <h3>Mô tả sản phẩm</h3>
            </div>
            ${productDetail.description}

        </div>
    </div>
</div>
<script src="https://maps.googleapis.com/maps/api/js"></script>
<script>
    // This example displays a marker at the center of Australia.
    // When the user clicks the marker, an info window opens.10.85524289259457, 106.78536226833974
    function initMap() {
        const uluru = {lat: 10.85524289259457, lng: 106.78536226833974};
        const map = new google.maps.Map(document.getElementById("map"), {
            zoom: 12,
            center: uluru,
        });
        const contentString = 'Đại Học Hutech Khu E, Phường Tân Phú, Quận 9, Thành phố Hồ Chí Minh, Vietnam&amp;daddr=Đại Học Hutech Khu E, Phường Tân Phú, Quận 9, Thành phố Hồ Chí Minh, Vietnam&amp;t=&amp;z=20&amp;ie=UTF8&amp;iwloc=B&amp;output=embed';

        const infowindow = new google.maps.InfoWindow({
            content: contentString,
        });
        const marker = new google.maps.Marker({
            position: uluru,
            map,
            title: "Địa chỉ",
        });
        marker.addListener("click", () => {
            infowindow.open({
                anchor: marker,
                map,
                shouldFocus: false,
            });
        }
        );
    }
    google.maps.event.addDomListener(window, 'load', initMap);
</script>
<style>
    /* Always set the map height explicitly to define the size of the div
    * element that contains the map. */
    #map {
        text-align: right;
        width: 100%;
        height: 430px;
    }

    /* Optional: Makes the sample page fill the window. */
    html,
    body {
        height: 100%;
        margin: 0;
        padding: 0;
    }
</style>