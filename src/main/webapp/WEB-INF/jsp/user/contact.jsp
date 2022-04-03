<%-- 
    Document   : contact
    Created on : Mar 10, 2022, 8:42:38 PM
    Author     : huynh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="heading-breadcrumbs" class="brder-top-0 border-bottom-0">
    <div class="container">
        <div class="row d-flex align-items-center flex-wrap">
            <div class="col-md-7">
                <h1 class="h2">Liên hệ với chúng tôi</h1>
            </div>
            <div class="col-md-5">
                <ul class="breadcrumb d-flex justify-content-end">
                    <li class="breadcrumb-item"><a href="<c:url value="/"/>">Trang chủ</a></li>
                    <li class="breadcrumb-item active">Liên hệ</li>
                </ul>
            </div>
        </div>
    </div>
</div>
<div id="content">
    <div id="contact" class="container">
        <section class="bar">
            <div class="row">
                <div class="col-md-12">
                    <div class="heading">
                        <h2>Chúng tôi ở đây để giúp bạn</h2>
                    </div>
                    <p class="lead">Nếu có điều gì thắc mắc hoặc mong muốn hợp tác kinh doanh, hãy liên lạc với chúng tôi.</p>

                </div>
            </div>
        </section>
        <section>
            <div class="row text-center">
                <div class="col-md-4">
                    <div class="box-simple">
                        <div class="icon-outlined"><i class="fa fa-map-marker"></i></div>
                        <h3 class="h4">Địa chỉ</h3>
                        <p> 21B/D1,Đồng An 2,<br>Thuận An,
                            Bình Dương<br></p>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="box-simple">
                        <div class="icon-outlined"><i class="fa fa-phone"></i></div>
                        <h3 class="h4">Gọi ngay</h3>
                        <p><strong>+84 386 632 736</strong></p>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="box-simple">
                        <div class="icon-outlined"><i class="fa fa-envelope"></i></div>
                        <h3 class="h4">Email</h3>
                        <ul class="list-unstyled text-sm">
                            <li><strong><a href="mailto:">contact@xemayh2c.com</a></strong></li>

                        </ul>
                    </div>
                </div>
            </div>
        </section>
        <section class="content">
            <div class="container mb-3 border border-1 shadow rounded rounded-3" style="width:auto">
                <div class="row">
                    <div class="col-md-6 col-12">
                        ${message}
                        <form action="<c:url value="/user/contact"/>" method="POST">  
                            <div class="container mb-3 border border-1 shadow rounded rounded-3" style="padding: 30px">
                                <input type="hidden" name="IdUser" value="${sessionScope.idUser}">
                                <div class="form-group">
                                    <div class="col-md-12">
                                        <label class="col-form-label"><b>Tiêu đề</b></label>
                                        <input type="text" class="form-control" name="Title" placeholder="Xin chào!" required>
                                    </div>
                                </div>
                               <div class="form-group">
                                    <div class="col-md-12">
                                        <label class="col-form-label"><b>Email</b></label>
                                        <input type="text" class="form-control" name="Email" placeholder="xemayh2c@gmail.com" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-md-12">
                                        <label class="col-form-label"><b>Nội dung</b></label>
                                        <textarea type="text" class="form-control" name="Content" rows="6" placeholder="Viết nội dung" required></textarea>
                                    </div>
                                </div>
                                
                                <button type="submit" class="btn btn-template-outlined" style="width:100%"><b>Gửi</b></button>
                            </div>
                        </form>
                    </div>


                    <div class="col-md-6 col-12">
                        <div id="map"></div>
                    </div>
                </div>
            </div>
        </section>

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
