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
            <div class="col-md-7">
              <h1 class="h2">Portfolio - 3 columns</h1>
            </div>
            <div class="col-md-5">
              <ul class="breadcrumb d-flex justify-content-end">
                <li class="breadcrumb-item"><a href="<c:url value="/"/>">TRANG CHU</a></li>
                <li class="breadcrumb-item active">Portfolio - 3 columns</li>
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
                <a href="~/" >Trang chủ</a> / Sản phẩm
              </div>
              <div class="col-md-3 py-3">
                <div class="card mb-3" style="width: 100%;">
                  <div class="card-header">
                      <h3>Hãng xe</h3>
                  </div>
                  <div class="form-check">
                      <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios1" value="option1" checked>
                      <label class="form-check-label" for="exampleRadios1">
                          Honda
                      </label>
                  </div>
                  <div class="form-check">
                      <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios2" value="option2">
                      <label class="form-check-label" for="exampleRadios2">
                          Yamaha
                      </label>
                  </div>
                  <div class="form-check">
                      <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios1" value="option1" checked>
                      <label class="form-check-label" for="exampleRadios1">
                          Suzuki
                      </label>
                  </div>
              </div>
              <div class="card mb-3" style="width: 100%;">
                <div class="card-header">
                    <h3>Loại xe</h3>
                </div>
                <div class="form-check">
                  <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios1" value="option1" checked>
                  <label class="form-check-label" for="exampleRadios1">
                      Xe số
                  </label>
              </div>
              <div class="form-check">
                  <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios2" value="option2">
                  <label class="form-check-label" for="exampleRadios2">
                      Xe tay ga
                  </label>
              </div>
              </div>
              <div class="card mb-3" style="width: 100%;">
                <div class="card-header">
                    <h3>Tình trạng</h3>
                </div>
                <div class="form-check">
                  <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios1" value="option1" checked>
                  <label class="form-check-label" for="exampleRadios1">
                      Cũ
                  </label>
              </div>
              <div class="form-check">
                  <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios2" value="option2">
                  <label class="form-check-label" for="exampleRadios2">
                      Mới
                  </label>
              </div>
              </div>
              <div class="card mb-3" style="width: 100%;">
                <div class="card-header">
                    <h3>Khoảng giá</h3>
                </div>
                <div class="form-check">
                  <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios1" value="option1" checked>
                  <label class="form-check-label" for="exampleRadios1">
                      0 - 10 triệu
                  </label>
              </div>
              <div class="form-check">
                  <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios2" value="option2">
                  <label class="form-check-label" for="exampleRadios2">
                      10 triệu - 20 triệu
                  </label>
              </div>
              <div class="form-check">
                <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios2" value="option2">
                <label class="form-check-label" for="exampleRadios2">
                    20 triệu - 30 triệu
                </label>
            </div>
            <div class="form-check">
              <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios2" value="option2">
              <label class="form-check-label" for="exampleRadios2">
                  30 triệu - 50 triệu
              </label>
          </div>
          <div class="form-check">
            <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios2" value="option2">
            <label class="form-check-label" for="exampleRadios2">
                Trên 50 triệu
            </label>
        </div>
              </div>
              <div class="card mb-3" style="width: 100%;">
                <div class="card-header">
                    <h3>Dòng xe</h3>
                </div>
                <div class="form-check">
                  <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios1" value="option1" checked>
                  <label class="form-check-label" for="exampleRadios1">
                      Air Black
                  </label>
              </div>
              <div class="form-check">
                  <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios2" value="option2">
                  <label class="form-check-label" for="exampleRadios2">
                      Exciter
                  </label>
              </div>
              <div class="form-check">
                <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios2" value="option2">
                <label class="form-check-label" for="exampleRadios2">
                    Wave
                </label>
            </div>
            <div class="form-check">
              <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios2" value="option2">
              <label class="form-check-label" for="exampleRadios2">
                  Winner
              </label>
          </div>
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
                          <p class="d-none d-sm-block">Hình ảnh chỉ mang tính chất minh họa</p>
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
