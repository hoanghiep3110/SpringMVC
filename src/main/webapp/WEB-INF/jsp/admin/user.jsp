<%-- 
    Document   : userrole.jsp
    Created on : 23 Mar 2022, 10:50:00 pm
    Author     : Hiệp Phan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<p style="text-align:right;margin:20px;">
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#createModal" data-whatever="@getbootstrap">Tạo mới</button>
</p>
<!<!-- Create Modal -->
<div class="modal fade bd-example-modal-xl" id="createModal" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-xl">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">TẠO MỚI</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <a href="<c:url value="/admin/user"/>" style="text-decoration: none; color: black" >x</a>
                </button>
            </div>
            <div class="modal-body">
                <form action="<c:url value="/admin/user/create"/>" method="POST">               
                    <div class="form-group">
                        <div class="col-md-12">
                            <label class="col-form-label">VAI TRÒ</label>
                            <select class="custom-select" name="IdRole">
                                <c:forEach var="item" items="${listUserRole}">
                                    <option value="${item.idRole}">${item.roleName}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-12">
                            <label class="col-form-label">HỌ VÀ TÊN</label>
                            <input type="text" class="form-control" name="FullName">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-12">
                            <label class="col-form-label">EMAIL</label>
                            <input type="text" class="form-control" name="Email">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-12">
                            <label class="col-form-label">TÊN ĐĂNG NHẬP</label>
                            <input type="text" class="form-control" name="Username">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-12">
                            <label class="col-form-label">MẬT KHẨU</label>
                            <input type="text" class="form-control" name="Password">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-12">
                            <label class="col-form-label">ĐỊA CHỈ </label>
                            <input type="text" class="form-control" name="Address">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-12">
                            <label class="col-form-label">SỐ ĐIỆN THOẠI</label>
                            <input type="text" class="form-control" name="Phone">
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Ðóng</button>
                        <button type="submit" class="btn btn-primary">Cập nhật</button>
                    </div>
                </form>
            </div>

        </div>
    </div>
</div>
<!--End Create Modal-->
<!<!-- Edit Modal -->
 <c:forEach var="i" items="${listUser}" >
<div class="modal fade bd-example-modal-xl" id="editModal${i.idUser}" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-xl">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">SỬA THÔNG TIN</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <a href="<c:url value="/admin/user"/>" style="text-decoration: none; color: black" >x</a>
                </button>
            </div>
            <div class="modal-body">
                <form action="<c:url value="/admin/user/edit"/>" method="POST">  
                     <input type="hidden" name="idUser" value="${i.idUser}">
                    <div class="form-group">
                        <div class="col-md-12">
                            <label class="col-form-label">VAI TRÒ</label>
                            <select class="custom-select" name="idRole">
                                <c:forEach var="item" items="${listUserRole}">
                                    <option value="${item.idRole}">${item.roleName}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-12">
                            <label class="col-form-label">HỌ VÀ TÊN</label>
                            <input type="text" class="form-control" name="fullName" value="${i.fullName}">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-12">
                            <label class="col-form-label">EMAIL</label>
                            <input type="text" class="form-control" name="email" value="${i.email}">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-12">
                            <label class="col-form-label">TÊN ĐĂNG NHẬP</label>
                            <input type="text" class="form-control" name="username" value="${i.username}">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-12">
                            <label class="col-form-label">MẬT KHẨU</label>
                            <input type="text" class="form-control" name="password" value="${i.password}">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-12">
                            <label class="col-form-label">ĐỊA CHỈ </label>
                            <input type="text" class="form-control" name="address" value="${i.address}">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-12">
                            <label class="col-form-label">SỐ ĐIỆN THOẠI</label>
                            <input type="text" class="form-control" name="phone" value="${i.phone}">
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Ðóng</button>
                        <button type="submit" class="btn btn-primary">Cập nhật</button>
                    </div>
                    
                </form>
            </div>
           
        </div>
    </div>
</div>
 </c:forEach>
<!--End Edit Modal-->
<!<!-- Delete Modal -->
<div class="modal fade" id="deleteModal" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalCenterTitle">XOÁ SẢN PHẨM</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">x</span>
                </button>
            </div>
            <div class="modal-body">
                Bạn có chắc chắn muốn xoá ?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Ðóng</button>
                <a href="<c:url value="/admin/customer/delete"/>" class="btn btn-danger">Xoá</a>
            </div>
        </div>
    </div>
</div>
<!<!--End Delete Modal -->
<table class="table" id="myTable">
    <thead>
        <tr>
            <th>
                VAI TRÒ
            </th>
            <th>
                HỌ VÀ TÊN
            </th>
            <th>
                EMAIL
            </th>
            <th>
                TÊN ĐĂNG NHẬP
            </th>

            <th>
                ĐỊA CHỈ 
            </th>
            <th>
                SỐ ĐIỆN THOẠI
            </th>
            <th>
                THAO TÁC
            </th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${listUser}" var="item" >
            <tr>
                <td>${item.idRole.roleName}</td>
                <td>${item.fullName}</td>  
                <td>${item.email}</td>  
                <td>${item.username}</td>
                <td>${item.address}</td>  
                <td>${item.phone}</td>  
                <td>
                    <a data-target="#editModal${item.idUser}" data-toggle="modal" title="Sửa" class="btn btn-sm btn-info" >
                        <i class="fas fa-edit"></i>
                    </a>
                    <a data-target="#deleteModal" data-toggle="modal" title="Xoá" class="btn btn-sm btn-danger">
                        <i class="fas fa-trash-alt"></i>
                    </a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<script>
    jQuery(document).ready(function () {
        $('#myTable').DataTable({
            "language": {
                "url": "//cdn.datatables.net/plug-ins/1.10.22/i18n/Vietnamese.json"
            }
        });
    });
</script>
