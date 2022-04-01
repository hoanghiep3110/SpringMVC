<%-- 
    Document   : userrole.jsp
    Created on : 23 Mar 2022, 10:50:00 pm
    Author     : Hiệp Phan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<p style="text-align:right;margin:20px;">
</p>


<table class="table" id="myTable">
    <thead>
        <tr>
            <th>
                TIÊU ĐỀ
            </th>    
            <th>
                EMAIL
            </th>
            <th>
                NỘI DUNG
            </th>

            <th>
                NGƯỜI GỬI
            </th>
            <th>
                TRẠNG THÁI
            </th>
            <th>
                THAO TÁC
            </th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${listContact}" var="item" >
            <tr>
                <td>${item.title}</td>
                <td>${item.email}</td>  
                <td>${item.content}</td>
                <td>${item.idUser.fullName}</td>  
                <td>
                    <c:choose>
                        <c:when test="${item.status == 0}">
                            <span style="color:darkorange;">Chưa xem</span>
                        </c:when>
                        <c:when test="${item.status == 1}">
                            <span style="color:cornflowerblue;">Đã xem</span>
                        </c:when>
                    </c:choose>
                </td>  
                <td>
                    <a data-target="#editModal${item.idContact}" data-toggle="modal" title="Sửa" class="btn btn-sm btn-info" >
                        <i class="fas fa-comment"></i>
                    </a>
                    <a data-target="#deleteModal${item.idContact}" data-toggle="modal" title="Xoa" class="btn btn-sm btn-danger" >
                        <i class="fas fa-trash"></i>
                    </a>
                </td>
            </tr>

            <!<!-- Edit Modal -->
        <div class="modal fade bd-example-modal-xl" id="editModal${item.idContact}" role="dialog" aria-hidden="true">
            <div class="modal-dialog modal-xl">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">GỬI PHẢN HỒI LIÊN HỆ</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <a href="<c:url value="/admin/contact"/>" style="text-decoration: none; color: black" >x</a>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form action="<c:url value="/admin/contact/edit"/>" method="POST">  
                            <input type="hidden" name="IdUser" value="${item.idContact}">
                            <div class="form-group">
                                <div class="col-md-12">
                                    <label class="col-form-label">GỬI ĐẾN:</label>
                                    <input type="text" class="form-control" name="FullName" required value="${item.email}" readonly>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-12">
                                    <label class="col-form-label">TIÊU ĐỀ</label>
                                    <input type="text" class="form-control" name="FullName" >
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="col-md-12">
                                    <label class="col-form-label">NỘI DUNG</label>
                                    <input type="text" class="form-control" name="FullName" >
                                </div>
                            </div>


                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Ðóng</button>
                                <button type="submit" class="btn btn-primary">Gửi phản hồi</button>
                            </div>

                        </form>
                    </div>

                </div>
            </div>
        </div>
        <!--End Edit Modal-->

          <!<!-- Delete Modal -->
        <div class="modal fade" id="deleteModal${item.idContact}" role="dialog" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalCenterTitle">XÓA LIÊN HỆ</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">x</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        Bạn có chắc chắn muốn xoá ?
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Ðóng</button>
                        <a href="<c:url value="/admin/contact/delete/${item.idContact}"/>" class="btn btn-danger">Xoá</a>
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
