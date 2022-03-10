<%-- 
    Document   : header
    Created on : Mar 9, 2022, 12:15:22 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
 <div class="top-bar">
      <div class="container">
        <div class="row d-flex align-items-center">
          <div class=" text-light col-md-6 d-md-block d-none">
            <p class="h4">Mua bán xe cũ Gọi ngay: <a href="#"> </a>0123456789</p>
          </div>
          <div class="col-md-6">
            <div class="d-flex justify-content-md-end justify-content-between">
              <ul class="list-inline contact-info d-block d-md-none">
                <li class="list-inline-item"><a href="#"><i class="fa fa-phone"></i></a></li>
                <li class="list-inline-item"><a href="#"><i class="fa fa-envelope"></i></a></li>
              </ul>
              <div class="login"><a href="#" data-toggle="modal" data-target="#login-modal" class="login-btn"><i
                    class="fa fa-sign-in"></i><span class="d-none d-md-inline-block">Đăng nhập</span></a><a
                  href="customer-register.html" class="signup-btn"><i class="fa fa-user"></i><span
                    class="d-none d-md-inline-block">Đăng ký</span></a></div>
              <ul class="social-custom list-inline">
                <li class="list-inline-item"><a href="#"><i class="fab fa-facebook"></i></a></li>
                <li class="list-inline-item"><a href="#"><i class="fab fa-google"></i></a></li>
                <li class="list-inline-item"><a href="#"><i class="fab fa-youtube"></i></a></li>
                <li class="list-inline-item"><a href="#"><i class="fab fa-instagram"></i></a></li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- Top bar end-->
    <!-- Login Modal-->
    <div id="login-modal" tabindex="-1" role="dialog" aria-labelledby="login-modalLabel" aria-hidden="true"
      class="modal fade">
      <div role="document" class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <h4 id="login-modalLabel" class="modal-title">Xin chào</h4>
            <button type="button" data-dismiss="modal" aria-label="Close" class="close"><span
                aria-hidden="true">×</span></button>
          </div>
          <div class="modal-body">
            <form action="customer-orders.html" method="get">
              <div class="form-group">
                <input id="email_modal" type="text" placeholder="email" class="form-control">
              </div>
              <div class="form-group">
                <input id="password_modal" type="password" placeholder="password" class="form-control">
              </div>
              <p class="text-center">
                <button class="btn btn-template-outlined"><i class="fa fa-sign-in"></i> Đăng nhập</button>
              </p>
            </form>
            <p class="text-center text-muted">Bạn chưa có tài khoản?</p>
            <p class="text-center text-muted"><a href="customer-register.html"><strong>Đăng ký ngay</strong></a>!</p>
          </div>
        </div>
      </div>
    </div>
    <!-- Login modal end-->
    <!-- Navbar Start-->
    <header class="nav-holder make-sticky">
      <div id="navbar" role="navigation" class="navbar navbar-expand-lg">
        <div class="container"><a href="#" class="navbar-brand home">
               <img src="<c:url value="/img/logoDHCV.png"/>" class="d-none d-md-inline-block"/><span class="sr-only">Xemay DHCV</span></a>
          <button type="button" data-toggle="collapse" data-target="#navigation"
            class="navbar-toggler btn-template-outlined"><span class="sr-only">Toggle navigation</span><i
              class="fa fa-align-justify"></i></button>
          <div id="navigation" class="navbar-collapse collapse">
            <ul class="nav navbar-nav ml-auto">
              <li class="nav-item dropdown "><a href="javascript: void(0)" data-toggle="dropdown">Trang chủ <b
                    class="caret"></b></a>
              </li>
              <li class="nav-item dropdown"><a href="" data-toggle="dropdown">Giới thiệu<b
                class="caret"></b></a>
                <!-- <ul class="dropdown-menu megamenu">
                  <li>
                    <div class="row">
                      <div class="col-lg-6"><img src="img/template-easy-customize.png" alt=""
                          class="img-fluid d-none d-lg-block"></div>
                      <div class="col-lg-3 col-md-6">
                        <h5>Shortcodes</h5>
                        <ul class="list-unstyled mb-3">
                          <li class="nav-item"><a href="#" class="nav-link">Accordions</a></li>
                          <li class="nav-item"><a href="#" class="nav-link">Alerts</a></li>
                          <li class="nav-item"><a href="#" class="nav-link">Buttons</a></li>
                          <li class="nav-item"><a href="#" class="nav-link">Content boxes</a></li>
                          <li class="nav-item"><a href="#" class="nav-link">Horizontal blocks</a></li>
                          <li class="nav-item"><a href="#" class="nav-link">Pagination</a></li>
                          <li class="nav-item"><a href="#" class="nav-link">Tabs</a></li>
                          <li class="nav-item"><a href="#" class="nav-link">Typography</a></li>
                        </ul>
                      </div>
                      <div class="col-lg-3 col-md-6">
                        <h5>Header variations</h5>
                        <ul class="list-unstyled mb-3">
                          <li class="nav-item"><a href="template-header-default.html" class="nav-link">Default sticky
                              header</a></li>
                          <li class="nav-item"><a href="template-header-nosticky.html" class="nav-link">No sticky
                              header</a></li>
                          <li class="nav-item"><a href="template-header-light.html" class="nav-link">Light header</a>
                          </li>
                        </ul>
                      </div>
                    </div>
                  </li>
                </ul> -->
              </li>
              <li class="nav-item dropdown menu-large"><a href="javascript: void(0)" data-toggle="dropdown" class="dropdown-toggle">Tạp
                  chí xe<b class="caret"></b></a>
                <ul class="dropdown-menu megamenu">
                  <li>
                    <div class="row">
                      <div class="col-lg-6"><img src="img/Ducati.jpg" alt="" class="img-fluid d-none d-lg-block"></div>
                      <div class="col-lg-3 col-md-6">
                        <h5>Bài viết mới nhất</h5>
                        <ul class="list-unstyled mb-3">
                          <li class="nav-item"><a href="portfolio-2.html" class="nav-link">2 columns</a></li>
                          <li class="nav-item"><a href="portfolio-no-space-2.html" class="nav-link">2 columns with
                              negative space</a></li>
                          <li class="nav-item"><a href="portfolio-3.html" class="nav-link">3 columns</a></li>
                          <li class="nav-item"><a href="portfolio-no-space-3.html" class="nav-link">3 columns with
                              negative space</a></li>
                          <li class="nav-item"><a href="portfolio-4.html" class="nav-link">4 columns</a></li>
                          <li class="nav-item"><a href="portfolio-no-space-4.html" class="nav-link">4 columns with
                              negative space</a></li>
                          <li class="nav-item"><a href="portfolio-detail.html" class="nav-link">Portfolio - detail</a>
                          </li>
                          <li class="nav-item"><a href="portfolio-detail-2.html" class="nav-link">Portfolio - detail
                              2</a></li>
                        </ul>
                      </div>
                      <div class="col-lg-3 col-md-6">
                        <h5>About</h5>
                        <ul class="list-unstyled mb-3">
                          <li class="nav-item"><a href="about.html" class="nav-link">About us</a></li>
                          <li class="nav-item"><a href="team.html" class="nav-link">Our team</a></li>
                          <li class="nav-item"><a href="team-member.html" class="nav-link">Team member</a></li>
                          <li class="nav-item"><a href="services.html" class="nav-link">Services</a></li>
                        </ul>
                        <h5>Marketing</h5>
                        <ul class="list-unstyled">
                          <li class="nav-item"><a href="packages.html" class="nav-link">Packages</a></li>
                        </ul>
                      </div>
                    </div>
                  </li>
                </ul>
              </li>
              <!-- ========== FULL WIDTH MEGAMENU ==================-->
              <li class="nav-item dropdown menu-large"><a href="javascript: void(0)" data-toggle="dropdown"
                  data-delay="200" class="dropdown-toggle">Cửa hàng<b class="caret"></b></a>
                <ul class="dropdown-menu megamenu">
                  <li>
                    <div class="row">
                      <div class="col-md-6 col-lg-4">
                        <h5>Hãng xe</h5>
                        <ul class="list-unstyled mb-3">
                          <li class="nav-item"><a href="index.html" class="nav-link">Honda</a></li>
                          <li class="nav-item"><a href="index2.html" class="nav-link">Kawasaki</a></li>
                          <li class="nav-item"><a href="index3.html" class="nav-link">Kymco</a></li>
                          <li class="nav-item"><a href="index4.html" class="nav-link">Yamaha</a></li>
                          <li class="nav-item"><a href="index5.html" class="nav-link">Suzuki</a></li>
                          <li class="nav-item"><a href="index5.html" class="nav-link">SYM</a></li>
                          <li class="nav-item"><a href="index5.html" class="nav-link">Piaggio</a></li>
                        </ul>
                        <h5>Loại xe</h5>
                        <ul class="list-unstyled mb-3">
                          <li class="nav-item"><a href="about.html" class="nav-link">Xe số</a></li>
                          <li class="nav-item"><a href="team.html" class="nav-link">Xe tay ga</a></li>
                          <li class="nav-item"><a href="team-member.html" class="nav-link">Xe côn tay</a></li>
                          <li class="nav-item"><a href="services.html" class="nav-link">Xe máy điện</a></li>
                        </ul>
                      </div>
                      <div class="col-md-6 col-lg-4">
                        <h5>Khoảng giá</h5>
                        <ul class="list-unstyled mb-3">
                          <li class="nav-item"><a href="portfolio-2.html" class="nav-link">0 - 10 triệu</a></li>
                          <li class="nav-item"><a href="portfolio-no-space-2.html" class="nav-link">10 triệu - 20 triệu
                            </a></li>
                          <li class="nav-item"><a href="portfolio-3.html" class="nav-link">20 triệu - 30 triệu</a></li>
                          <li class="nav-item"><a href="portfolio-no-space-3.html" class="nav-link">30 triệu - 50 triệu
                            </a></li>
                          <li class="nav-item"><a href="portfolio-4.html" class="nav-link">trên 50 triệu</a></li>

                        </ul>
                        <h5>Dòng xe</h5>
                        <ul class="list-unstyled mb-4">
                          <li class="nav-item"><a href="customer-register.html" class="nav-link">Air Black</a>
                          </li>
                          <li class="nav-item"><a href="customer-orders.html" class="nav-link">Exciter</a></li>
                          <li class="nav-item"><a href="customer-order.html" class="nav-link">Wave</a>
                          </li>
                          <li class="nav-item"><a href="customer-wishlist.html" class="nav-link">Winner</a></li>
                          <li class="nav-item"><a href="customer-account.html" class="nav-link">Loại khác</a></li>
                        </ul>
                      </div>
                      <div class="col-md-6 col-lg-4">
                        <h5>Phân khối</h5>
                        <ul class="list-unstyled mb-3">
                          <li class="nav-item"><a href="packages.html" class="nav-link">110 cc</a></li>
                          <li class="nav-item"><a href="packages.html" class="nav-link">150 cc</a></li>
                          <li class="nav-item"><a href="packages.html" class="nav-link">175 cc</a></li>
                        </ul>
                        <h5>Phụ kiện</h5>
                        <ul class="list-unstyled mb-3">
                          <li class="nav-item"><a href="shop-category.html" class="nav-link">Mũ bảo hiểm
                            </a></li>
                          <li class="nav-item"><a href="shop-category-left.html" class="nav-link">Phụ kiện xe
                            </a></li>
                          <li class="nav-item"><a href="shop-category-full.html" class="nav-link">Bảo hiểm xe máy
                            </a></li>
                        </ul>
                        <h5>Dịch vụ sau bán hàng</h5>
                        <ul class="list-unstyled mb-3">
                          <li class="nav-item"><a href="shop-basket.html" class="nav-link">Hướng dẫn sử dụng xe</a></li>
                          <li class="nav-item"><a href="shop-checkout1.html" class="nav-link">Chính sách bảo hàng</a>
                          </li>
                        </ul>
                      </div>
                    </div>
                  </li>
                </ul>
              </li>
              <!-- ========== FULL WIDTH MEGAMENU END ==================-->
              <li class="nav-item dropdown"><a href="javascript: void(0)" data-toggle="dropdown"
                  class="dropdown-toggle">Thuê xe<b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li class="dropdown-item"><a href="index.html" class="nav-link"> xe máy điện</a></li>
                  <li class="dropdown-item"><a href="index2.html" class="nav-link">xe tay ga</a></li>
                  <li class="dropdown-item"><a href="index3.html" class="nav-link">xe số</a></li>
                  <li class="dropdown-item"><a href="index4.html" class="nav-link">xe côn tay</a></li>
                  <!-- <li class="dropdown-item dropdown-submenu"><a id="navbarDropdownMenuLink2" href="#"
                      data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"
                      class="nav-link dropdown-toggle">Dropdown link</a> -->
                  <!-- <ul aria-labelledby="navbarDropdownMenuLink2" class="dropdown-menu">
                      <li class="dropdown-item"><a href="#" class="nav-link">Action</a></li>
                      <li class="dropdown-item"><a href="#" class="nav-link">Another action</a></li>
                      <li class="dropdown-item"><a href="#" class="nav-link">Something else here</a></li>
                    </ul> -->
                </ul>
              </li>
              <!-- ========== Liên hệ dropdown ==================-->
              <li class="nav-item dropdown"><a href="contact.html" data-toggle="dropdown">Liên hệ<b
                    class="caret"></b></a>

                <!-- ========== Thuê xe dropdown ==================-->
              </li>

              <!-- ========== Contact dropdown end ==================-->
            </ul>
          </div>
          <div id="search" class="collapse clearfix">
            <form role="search" class="navbar-form">
              <div class="input-group">
                <input type="text" placeholder="Search" class="form-control"><span class="input-group-btn">
                  <button type="submit" class="btn btn-template-main"><i class="fa fa-search"></i></button></span>
              </div>
            </form>
          </div>
        </div>
      </div>
      </header>