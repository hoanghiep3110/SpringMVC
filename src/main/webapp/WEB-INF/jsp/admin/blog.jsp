<%-- 
    Document   : blog
    Created on : Apr 12, 2022, 10:28:59 AM
    Author     : ACER
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
                TÊN BÀI VIẾT
            </th>
            <th>
                NGƯỜI TẠO
            </th>
            <th>
                TIÊU ĐỀ
            </th>
            <th>
                NỘI DUNG
            </th>
            <th>
                NGÀY TẠO
            </th>
            <th>
                THAO TÁC
            </th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${listBlog}" var="item" >
            <tr>
                <td><img src="<c:url value ="${item.linkImg}"/>" class="img-fluid admin_img" style="height: 100%; width: 100% "></td>
                <td>${item.idCate.nameCate}</td>
                <td>${item.idUser.fullName}</td>  
                <td>${item.title}</td>  
                <td>${item.content}</td>  
                <td>${item.dateCreate}</td>  
                <td>
                    <a data-target="#editModal${item.idBlog}" data-toggle="modal" title="Sửa" class="btn btn-sm btn-info" >
                        <i class="fas fa-edit"></i>
                    </a>
                    <a data-target="#deleteModal${item.idBlog}" data-toggle="modal" title="Xoá" class="btn btn-sm btn-danger" >
                        <i class="fas fa-trash-alt"></i>
                    </a>
                </td>

                <!<!-- Create Modal -->
        <div class="modal fade bd-example-modal-xl" id="createModal" role="dialog" aria-hidden="true">
            <div class="modal-dialog modal-dialog-scrollable modal-xl">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">THÊM MỚI</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <a href="<c:url value="/admin/blog"/>" style="text-decoration: none; color: black" >x</a>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form id="formSubmit" action="<c:url value="/admin/blog/create"/>" method="POST" enctype="multipart/form-data">
                            <div class="form-group">
                                <div class="col-md-10">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <input type="hidden" name="IdAdmin" value="${sessionScope.idAdmin}">
                                            <div class="form-group">
                                                <div class="col-md-12">
                                                    <label class="col-form-label">TÊN BÀI VIẾT</label>
                                                    <select class="custom-select" name="IdCate">
                                                        <c:forEach var="item" items="${listCate}">
                                                            <option value="${item.idCate}">${item.nameCate}</option>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <lable class="control-label col-md-2">HÌNH ẢNH</lable>
                                                <div class="col-md-12">
                                                    <input type="file" id="file" name="image" accept="image/png, image/jpeg, image/jpg">
                                                </div>
                                            </div>  
                                            <div class="form-group">
                                                <div class="col-md-12">
                                                    <label class="col-form-label">TIÊU ĐỀ</label>
                                                    <input type="text" class="form-control" name="Title">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <div class="col-md-12">
                                                    <label class="col-form-label">NỘI DUNG</label>
                                                    <textarea type="text" name="Content" class="form-control"  required></textarea>
                                                </div>
                                            </div>
                                        </div>
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

        <!<!-- Edit Modal -->
        <div class="modal fade bd-example-modal-xl" id="editModal${item.idProduct}" role="dialog" aria-hidden="true">
            <div class="modal-dialog modal-dialog-scrollable modal-xl">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" >SỬA THÔNG TIN</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <a href="<c:url value="/admin/product"/>" style="text-decoration: none; color: black" >x</a>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form id="formSubmit" action="<c:url value="/admin/product/edit"/>" method="POST">
                            <input type="hidden" name="IdProduct" value="${item.idProduct}">
                            <div class="form-group">
                                <div class="col-md-10">
                                    <div class="row">
                                        <div class="col-md-8">
                                            <div class="form-group">
                                                <div class="col-md-12">
                                                    <label class="col-form-label">Tên sản phẩm</label>
                                                    <input type="text" class="form-control" name="NameProduct" value="${item.nameProduct}"/>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <div class="col-md-12">
                                                    <label class="col-form-label">Giá</label>
                                                    <input type="text" class="form-control" name="Price" value="${item.price}">
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <lable class="control-label col-md-2">Hình ảnh</lable>
                                                <div class="col-md-12">
                                                    <input type="file" name="fileUpload" id="fileUpload">
                                                    <div class="image-preview" id="imagePreview">
                                                        <img src="${item.linkImg}" alt="Image Preview" class="image-preview-img ">
                                                        <span class="image-preview-text">Image Preview</span>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-12">
                                    <label class="col-form-label">Trạng thái</label>
                                    <input type="text" class="form-control" name="Status" value="${item.price}">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-12">
                                    <label class="col-form-label">Hãng xe</label>
                                    <input type="text" class="form-control" name="Brand">
                                </div>
                            </div>

                            <div class="form-group">    
                                <div class="col-md-12">
                                    <label class="col-form-label">Loại xe</label>
                                    <input type="text" class="form-control" name = "TypeCar">
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="col-md-12">
                                    <label class="col-form-label">Mô tả</label>
                                    <textarea type="text" name="Description" class="form-control" value="${item.description}" required></textarea>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Ðóng</button>
                                <a href="<c:url value="/admin/customer/edit"/>" class="btn btn-info">Sửa</a>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!--End Edit Modal-->
        <!<!-- Delete Modal -->
        <div class="modal fade" id="deleteModal${item.idBlog}" role="dialog" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalCenterTitle">XOÁ BÀI VIET</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">x</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        Bạn có chắc chắn muốn xoá ?
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Ðóng</button>
                        <a href="<c:url value="/admin/blog/delete/${item.idBlog}"/>" class="btn btn-danger">Xoá</a>
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
<script>
    var editor = '';
    $(document).ready(function () {
        editor = CKEDITOR.replace('Content');
    });
    $('#btnsubmit').click(function (e) {
        e.preventDefault();
        var data = {};
        var formData = $('#formSubmit').serializeArray();
        $.each(formData, function (i, v) {
            data["" + v.name + ""] = v.value;
        });
        data["Content"] = editor.getData();
    });
    function truncateString(str, num) {
        if (num >= str.length) {
            return str;
        } else {
            return str.substring(0, num) + "...";
        }
    }
</script>
