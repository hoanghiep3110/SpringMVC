<%-- 
    Document   : login.jsp
    Created on : 15 Mar 2022, 1:43:53 pm
    Author     : Hiệp Phan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="heading-breadcrumbs">
    <div class="container">
        <div class="row d-flex align-items-center flex-wrap">
            <div class="col-md-7">
                <h1 class="h2">Đăng nhập</h1>
            </div>
            <div class="col-md-5">
                <ul class="breadcrumb d-flex justify-content-end">
                    <li class="breadcrumb-item"><a href="index.html">Trang chủ</a></li>
                    <li class="breadcrumb-item active">Đăng nhập</li>
                </ul>
            </div>
        </div>
    </div>
</div>
<div class="container">
    <div class="row py-5 mt-4 align-items-center">
        <!-- For Demo Purpose -->
        <div class="col-md-5 pr-lg-5 mb-5 mb-md-0">
            <h1>Đăng nhập</h1>
            <p class="font-italic text-muted mb-0">Nhanh chóng và dễ dàng</p>
        </div>
        <div class="col-md-7 col-lg-6 ml-auto">
            <div class="row">
                <div class="col-md-12">
                    @using (Html.BeginForm("Login", "Customer", new { returnURL = Request.QueryString["returnURL"] }))
                    {
                        @Html.ValidationSummary(true)
                        <h3 class="text-center mt-2"><b>Đăng nhập</b></h3>

                        if (ViewBag.Error != null)
                        {
                            <div class="alert alert-danger" role="alert">
                                @ViewBag.Error
                            </div>
                        }

                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text bg-white px-4 border-md border-right-0">
                                    <i class="fa fa-user text-muted"></i>
                                </span>
                            </div>
                            <input type="text" class="form-control" id="fullname" placeholder="Tên đăng nhập" style="width: 100%" name="userName" required>

                        </div>

                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text bg-white px-4 border-md border-right-0">
                                    <i class="fa fa-lock text-muted"></i>
                                </span>
                            </div>
                            <input type="password" class="form-control" id="fullname" placeholder="Mật khẩu" style="width: 100%" name="password" required>

                        </div>
                        <div class="mb-2 text-center">
                            <button type="submit" class="btn btn-template-outlined w-100"><b>Đăng nhập</b></button>
                            <a role="button" class="btn mt-2 w-100" style="background-color: #4267B2;color: white" href="@Url.Action("LoginFacebook", new { returnURL = Request.QueryString["returnURL"] })"><i class="fab fa-facebook-square"></i> Đăng nhập bằng facebook</a>
                        </div>
                    }
                    <div class="form-group col-lg-12 mx-auto d-flex align-items-center my-3">
                        <div class="border-bottom w-100 ml-5"></div>
                        <span class="px-2 small text-muted font-weight-bold text-muted">hoặc</span>
                        <div class="border-bottom w-100 mr-5"></div>
                    </div>
                    <div class="text-center w-100">
                        <p class="text-muted font-weight-bold">Bạn chưa có tài khoản? <a href="@Url.Action("SignUp", "Customer")" class="signup-btn">Đăng ký</a></p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>