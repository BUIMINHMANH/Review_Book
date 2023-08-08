<%-- 
    Document   : Detail
    Created on : Mar 1, 2023, 10:29:01 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Sách:${s.getId_sach()}
        <br>Tên sách:${s.getTen_sach()}
        <br>Thể loại:${s.getThe_loai()}
        <br>Tác giả:${s.getTac_gia()}
        <br>Nhà xuất bản:${s.getNha_xuat_ban()}
        <br>Năm xuất bản:${s.getNam_xuat_ban()}
        <br>Mô tả:${s.getMo_ta()}
    </body>
</html>
