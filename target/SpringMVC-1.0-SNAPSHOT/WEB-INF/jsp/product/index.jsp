<%-- 
    Document   : product
    Created on : Mar 10, 2022, 1:26:15 PM
    Author     : huynh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<div id="heading-breadcrumbs">
        <div class="container">
          <div class="row d-flex align-items-center flex-wrap">   
            <div class>
              <ul class="breadcrumb d-flex justify-content-end">
                <li class="breadcrumb-item"><a href="<c:url value="/"/>">Trang chủ</a></li>
                <li class="breadcrumb-item active">Cửa hàng</li>
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
                  <h2>Sản Phẩm</h2>
                </div>
              </div>
               <div class="col-md-3 py-3">
                    <div class="card mb-3" style="width: 100%;">
                        @Html.Action("Brand", "Product")
                    </div>
                    <div class="card mb-3 mt-3" style="width: 100%;">
                        @Html.Action("TypeCar", "Product")

                    </div>
                    <div class="card mb-3 mt-3" style="width: 100%;">
                        @Html.Action("StatusCar", "Product")
                    </div>
                </div>
              <div class="col-md-9">
            <div class="row portfolio text-center">
              <div class="col-md-4">
                <div class="box-image">
                  <div class="image"><img src="img/cub-125_2.png" alt="" class="img-fluid">
                    <div class="overlay d-flex align-items-center justify-content-center">
                      <div class="content">
                        <div class="name">
                          <h3><a href="<c:url value="/product-detail"/> class="color-white"></a></h3>
                        </div>
                        <div class="text">
                         
                          <p class="buttons"><a  class="btn btn-template-outlined-white" href=<c:url value="/product-detail"/>>Xem chi tiết</a></p>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            
            </div>
          </div>
          </div>
          </section>
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
                  <h4><span class="h1 counter">7567</span><br>Khách hàng</h4>
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
                  <li class="item"><img src="img/yamaha.svg" alt="" class="img-fluid"></li>
                  <li class="item"><img src="img/piaggio-vespa.svg" alt="" class="img-fluid"></li>
                  <li class="item"><img src="img/honda.svg" alt="" class="img-fluid"></li>
                  <li class="item"><img src="img/kymco.svg" alt="" class="img-fluid"></li>
                  <li class="item"><img src="img/yamaha.svg" alt="" class="img-fluid"></li>
                  <li class="item"><img src="img/honda.svg" alt="" class="img-fluid"></li>
                  <li class="item"><img src="img/honda.svg" alt="" class="img-fluid"></li>
                  <li class="item"><img src="img/kymco.svg" alt="" class="img-fluid"></li>
                  <li class="item"><img src="img/yamaha.svg" alt="" class="img-fluid"></li>
                  <li class="item"><img src="img/honda.svg" alt="" class="img-fluid"></li>
                </ul>
              </div>
            </div>
          </div>
        </section>
      </div>
