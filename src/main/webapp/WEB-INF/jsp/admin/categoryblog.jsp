<%-- 
    Document   : categoryblog
    Created on : Apr 13, 2022, 9:26:18 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<p style="text-align:right;margin:20px;">
    <a href="<c:url value="/admin/categoryblog/create"/>" class="btn btn-primary" data-toggle="modal" data-target="#createModal" data-whatever="@getbootstrap">Tạo mới</a>
</p>
<table class="table" id="myTable">
    <thead>
        <tr>
            <th>
                THỂ LOẠI BÀI VIẾT
            </th>            
            <th>
                THAO TÁC
            </th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${listCate}" var="item" >
            <tr>                         
                <td>${item.nameCate}</td>
                <td>
                    <a data-target="#editModal${item.idCate}" data-toggle="modal" title="Sửa" class="btn btn-sm btn-info">
                        <i class="fas fa-edit"></i>
                    </a>
                    <a data-target="#deleteModal${item.idCate}" data-toggle="modal" title="Xoá" class="btn btn-sm btn-danger">
                        <i class="fas fa-trash-alt"></i>
                    </a>
                </td>
            </tr>
            <!-- Create Modal -->
        <div class="modal fade bd-example-modal-xl" id="createModal" role="dialog" aria-hidden="true">
            <div class="modal-dialog modal-xl">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">TẠO MỚI</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <a href="<c:url value="/admin/categoryblog"/>" style="text-decoration: none; color: black" >x</a>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form action="<c:url value="/admin/categoryblog/create"/>" method="POST">                                          
                            <div class="form-group">
                                <div class="col-md-12">
                                    <label class="col-form-label">THỂ LOẠI BÀI VIẾT</label>
                                    <input type="text" class="form-control" name="NameCate">
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
        <div class="modal fade bd-example-modal-xl" id="editModal${item.idCate}" role="dialog" aria-hidden="true">
            <div class="modal-dialog modal-xl">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">SỬA THÔNG TIN</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <a href="<c:url value="/admin/categoryblog"/>" style="text-decoration: none; color: black" >x</a>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form action="<c:url value="/admin/categoryblog/edit"/>" method="POST">   
                            <input type="hidden" name="IdCate" value="${item.idCate}">
                            <div class="form-group">
                                <div class="col-md-12">
                                    <label class="col-form-label">THỂ LOẠI BÀI VIẾT</label>
                                    <input type="text" class="form-control" name="NameCate" value="${item.nameCate}" >
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
        <!--End Edit Modal-->
        
        <!<!-- Delete Modal -->
        <div class="modal fade" id="deleteModal${item.idCate}" role="dialog" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalCenterTitle">XÓA</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">x</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        Bạn có chắc chắn muốn xoá ?
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Ðóng</button>
                        <a href="<c:url value="/admin/categoryblog/delete/${item.idCate}"/>" class="btn btn-danger">Xoá</a>
                    </div>
                </div>
            </div>
        </div>
        <!<!--End Delete Modal -->
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
