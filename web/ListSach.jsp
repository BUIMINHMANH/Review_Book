<%-- 
    Document   : theloai
    Created on : Mar 14, 2023, 6:17:55 AM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>


        <form action="SachController" method="post">
            <select name="theloai" >
                <c:forEach items="${list}" var="item">
                    <option 
                        value="${item.getThe_loai()}"
                            >${item.getThe_loai()}</option>
                </c:forEach>
            </select>
            <input type="text" name="search_sach">
            <input type="submit"value="submit">
        </form>
        <table border="1">
            <tr> 
                <td>ID sách</td>
                <td>Tên sách</td>
                <td>Thể loại</td>
                <td>Tác giả</td>
                <td>Nhà xuất bản</td>
                <td>Năm xuất bản</td>
                <td>Mô tả</td>
                <td>Review_sách</td>
            </tr>
            <c:forEach items="${data}" var="item">
                <tr> 
                    <td><a href="DetailController?id_sach=${item.getId_sach()}&mod=1">${item.getId_sach()}</a></td>
                    <td>${item.getTen_sach()}</td>
                    <td>${item.getThe_loai()}</td>
                    <td>${item.getTac_gia()}</td>
                    <td>${item.getNha_xuat_ban()}</td>
                    <td>${item.getNam_xuat_ban()}</td>
                    <td>${item.getMo_ta()}</td>
                    <td>${item.getReview_sach()}</td>
                </tr>
            </c:forEach>
       
        </table>
    </body>
</html>
