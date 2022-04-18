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
<table class="table" id="myTable">
    <thead>
        <tr>
            <th>
                HÌNH ẢNH
            </th>
            <th>
                TÊN HÃNG
            </th>
            <th>
                THAO TÁC
            </th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${listBrand}" var="item" >
            <tr>             
                <td><img class="img-fluid admin_img" src="<c:url value ="${item.imgBrand}"/>"</td>
                <td>${item.nameBrand}</td>
                <td>
                    <a data-target="#editModal${item.idBrand}" data-toggle="modal" title="Sửa" class="btn btn-sm btn-info" >
                        <i class="fas fa-edit"></i>
                    </a>
                    <a data-target="#deleteModal${item.idBrand}" data-toggle="modal" title="Xóa" class="btn btn-sm btn-danger" >
                        <i class="fas fa-trash"></i>
                    </a>
                </td>
                <!<!-- Create Modal -->
        <div class="modal fade bd-example-modal-xl" id="createModal" role="dialog" aria-hidden="true">
            <div class="modal-dialog modal-dialog-scrollable modal-xl">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">THÊM MỚI</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <a href="<c:url value="/admin/brand"/>" style="text-decoration: none; color: black" >x</a>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form action="<c:url value="/admin/brand/create"/>" method="POST" enctype="multipart/form-data">
                            <div class="form-group">
                                <div class="col-md-10">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <div class="form-group">
                                                <div class="col-md-12">
                                                    <label class="col-form-label">Tên hãng xe</label>
                                                    <input type="text" class="form-control" name="NameBrand">
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-12">
                                            <div class="form-group">
                                                <lable class="control-label col-md-2">Hình ảnh</lable>
                                                <div class="col-md-12">
                                                    <input type="file" id="file" name="image" accept="image/png, image/jpeg">
                                                </div>
                                            </div>
                                        </div>
                                        ${message}
                                    </div>
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
        
        <!<!-- Delete Modal -->
        <div class="modal fade" id="deleteModal${item.idBrand}" role="dialog" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalCenterTitle">XÓA HÃNG XE</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">x</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        Bạn có chắc chắn muốn xoá ?
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Ðóng</button>
                        <a href="<c:url value="/admin/brand/delete/${item.idBrand}"/>" class="btn btn-danger">Xoá</a>
                    </div>
                </div>
            </div>
        </div>
        <!<!--End Delete Modal -->

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
