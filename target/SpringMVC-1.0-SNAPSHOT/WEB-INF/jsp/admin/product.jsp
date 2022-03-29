<%-- 
    Document   : userrole.jsp
    Created on : 23 Mar 2022, 10:50:00 pm
    Author     : Hiệp Phan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<p style="text-align:right;margin:20px;">
    <a href="<c:url value="/admin/product/create"/>" class="btn btn-primary">Tạo mới</a>
</p>
<table class="table" id="myTable">
    <thead>
        <tr>
            <th>
                HÌNH ẢNH
            </th>
            <th>
                TÊN SẢN PHẨM
            </th>
            <th>
                GIÁ
            </th>
            <th>
                MÔ TẢ
            </th>
            <th>
                TRẠNG THÁI
            </th>
            <th>
                HÃNG XE
            </th>
            <th>
                LOẠI XE
            </th>
            <th>
                THAO TÁC
            </th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${listProduct}" var="item" >
            <tr>
                <td><img class="img-fluid admin_img" style="height: 100px; width: 100px " src="<c:url value ="${item.linkImg}"/>"</td>
                <td>${item.nameProduct}</td>
                <td>${item.price}</td>  
                <td>${item.description}</td>  
                <td>${item.status}</td>  
                <td>${item.idBrand.nameBrand}</td> 
                <td>${item.idType.nameType}</td>  
                <td>
                    <a data-toggle="tooltip" data-placement="bottom" title="Sửa" class="btn btn-sm btn-info" href="<c:url value="/admin/product/edit"/>">
                        <i class="fas fa-edit"></i>
                    </a>
                    <a data-toggle="tooltip" data-placement="bottom" title="Xoá" class="btn btn-sm btn-danger" href="<c:url value="/admin/product/delete"/>">
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
