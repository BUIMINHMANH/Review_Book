<%-- 
    Document   : topdanhgia
    Created on : Mar 15, 2023, 1:54:39 PM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">

    <head>

        <!-- META ============================================= -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="keywords" content="" />
        <meta name="author" content="" />
        <meta name="robots" content="" />

        <!-- DESCRIPTION -->
        <meta name="description" content="EduChamp : Education HTML Template" />

        <!-- OG -->
        <meta property="og:title" content="EduChamp : Education HTML Template" />
        <meta property="og:description" content="EduChamp : Education HTML Template" />
        <meta property="og:image" content="" />
        <meta name="format-detection" content="telephone=no">

        <!-- FAVICONS ICON ============================================= -->
        <link rel="icon" href="assets/images/favicon.ico" type="image/x-icon" />
        <link rel="shortcut icon" type="image/x-icon" href="assets/images/favicon.png" />

        <!-- PAGE TITLE HERE ============================================= -->
        <title>Thể loại</title>

        <!-- MOBILE SPECIFIC ============================================= -->
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- All PLUGINS CSS ============================================= -->
        <link rel="stylesheet" type="text/css" href="assets/css/assets.css">

        <!-- TYPOGRAPHY ============================================= -->
        <link rel="stylesheet" type="text/css" href="assets/css/typography.css">

        <!-- SHORTCODES ============================================= -->
        <link rel="stylesheet" type="text/css" href="assets/css/shortcodes/shortcodes.css">

        <!-- STYLESHEETS ============================================= -->
        <link rel="stylesheet" type="text/css" href="assets/css/style.css">
        <link class="skin" rel="stylesheet" type="text/css" href="assets/css/color/color-1.css">

    </head>
    <body id="bg">
        <div class="page-wraper">
            <div id="loading-icon-bx"></div>
            <!-- Header Top ==== -->
            <header class="header rs-nav">
                <div class="top-bar">
                    <div class="container">
                        <div class="row d-flex justify-content-between">
                            <div class="topbar-left">
                                <ul>
                                    <!--<li><a href="faq-1.html"><i class="fa fa-question-circle"></i>Ask a Question</a></li>-->
                                    <li><a href="javascript:;"><i class="fa fa-envelope-o"></i>manhbmhe163593@fpt.edu.vn</a></li>
                                </ul>
                            </div>
                            <div class="topbar-right">
                                <c:if test="${sessionScope.account_name ne null}">
                                    <ul>
                                        <li><a href="#">${sessionScope.account_name}</a></li>
                                        <li><a href="LogoutController">Đăng Xuất</a></li>
                                    </ul>
                                </c:if>
                                <c:if test="${sessionScope.account_name eq null}">
                                    <ul>
                                        <li><a href="LoginController">Đăng nhập</a></li>
                                        <li><a href="Register.jsp">Đăng ký</a></li>
                                    </ul>
                                </c:if>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="sticky-header navbar-expand-lg">
                    <div class="menu-bar clearfix">
                        <div class="container clearfix">
                            <!-- Header Logo ==== -->
                            <div class="menu-logo">
                                <!--<a href="index.html"><img src="assets/images/logo.png" alt=""></a>-->
                            </div>
                            <!-- Mobile Nav Button ==== -->
                            <button class="navbar-toggler collapsed menuicon justify-content-end" type="button" data-toggle="collapse" data-target="#menuDropdown" aria-controls="menuDropdown" aria-expanded="false" aria-label="Toggle navigation">
                                <span></span>
                                <span></span>
                                <span></span>
                            </button>
                            <!-- Author Nav ==== -->
                            <div class="secondary-menu">
                                
                            </div>
                            <!-- Search Box ==== -->
                            <div class="nav-search-bar">
                                <form action="#">
                                    <input name="search" value="" type="text" class="form-control" placeholder="Type to search">
                                    <span><i class="ti-search"></i></span>
                                </form>
                                <span id="search-remove"><i class="ti-close"></i></span>
                            </div>
                            <!-- Navigation Menu COp tu doan nay ==== -->
                            <div class="menu-links navbar-collapse collapse justify-content-start" id="menuDropdown">
                                <div class="menu-logo">
                                    <a href="index.html"><img src="assets/images/logo.png" alt=""></a>
                                </div>
                                <ul class="nav navbar-nav">	

                                    <li><a href="TheLoaiController">THỂ LOẠI <i class="fa fa-chevron-down"></i></a>
                                        <ul class="sub-menu">
                                            <c:forEach items="${sessionScope.data_list}" var="item">                                            
                                                <li><a href="TheLoaiController?the_loai=${item.getThe_loai()}">${item.getThe_loai()}</a></li>
                                                </c:forEach>


                                        </ul>
                                    </li>
                                    <li class="add-mega-menu"><a href="TopDanhGiaController">TOP ĐÁNH GIÁ </a>

                                    <li class="nav-dashboard"><a href="SachMoiPhatHanhController">SÁCH MỚI PHÁT HÀNH </a>
                                        <c:if test="${sessionScope.account.account eq 'admin'}">
                                        <li class="nav-dashboard"><a href="ListSachController">Cài đặt </a>

                                        </c:if>


                                </ul>
                            </div>
                            <!-- Navigation Menu END den doan nay ==== -->
                        </div>
                    </div>
                </div>
            </header>
            <!-- header END -->
            <!-- Content -->
            <div class="page-content bg-white">
                <!-- inner page banner -->
                <div class="page-banner ovbl-dark" style="background-image:url(assets/images/banner/banner1.jpg);">
                    <div class="container">
                        <div class="page-banner-entry">
                            <h1 class="text-white">Thể loại</h1>
                        </div>
                    </div>
                </div>
                <!-- Breadcrumb row -->
                <div class="breadcrumb-row">
                    <div class="container">
                        <ul class="list-inline">
                            <li><a href="#">Home</a></li>
                            <li>Thể loại</li>
                        </ul>
                    </div>
                </div>
                <!-- Breadcrumb row END -->
                <!-- contact area -->
                <div class="content-block">
                    <div class="section-area section-sp1">
                        <div class="container">
                            <div class="row">
                                <!-- Left part start -->
                                <div class="col-lg-8">

                                    <c:forEach items="${listByTheLoai}" var="tl">
                                        <div class="blog-post blog-md clearfix">
                                            <div class="ttr-post-media"> 
                                                <a href="#"><img src="assets/images/blog/grid/pic3.jpg" alt=""></a> 
                                            </div>
                                            <div class="ttr-post-info">
                                                <ul class="media-post">
                                                    <li><a href="#"><i class="fa fa-calendar"></i>${tl.getNam_xuat_ban()}</a></li>
                                                    <li><a href="#"><i class="fa fa-user"></i>${tl.getTac_gia()}</a></li>
                                                </ul>
                                                <h5 class="post-title"><a href="blog-details.html">${tl.getTen_sach()}</a></h5>
                                                <p>${tl.getMo_ta()}</p>
                                                <div class="post-extra">
                                                    <a href="DetailController?id_sach=${tl.getId_sach()}" class="btn-link">READ MORE</a>
                                                    <a href="#" class="comments-bx"><i class="fa fa-comments-o"></i> Comment</a>
                                                </div>
                                            </div>
                                        </div>
                                    </c:forEach>
                              
            <!-- Footer END ==== -->
            <!-- scroll top button -->
            <button class="back-to-top fa fa-chevron-up" ></button>
        </div>
        <!-- External JavaScripts -->
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/vendors/bootstrap/js/popper.min.js"></script>
        <script src="assets/vendors/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/vendors/bootstrap-select/bootstrap-select.min.js"></script>
        <script src="assets/vendors/bootstrap-touchspin/jquery.bootstrap-touchspin.js"></script>
        <script src="assets/vendors/magnific-popup/magnific-popup.js"></script>
        <script src="assets/vendors/counter/waypoints-min.js"></script>
        <script src="assets/vendors/counter/counterup.min.js"></script>
        <script src="assets/vendors/imagesloaded/imagesloaded.js"></script>
        <script src="assets/vendors/masonry/masonry.js"></script>
        <script src="assets/vendors/masonry/filter.js"></script>
        <script src="assets/vendors/owl-carousel/owl.carousel.js"></script>
        <script src="assets/js/functions.js"></script>
        <script src="assets/js/contact.js"></script>
        <script src='assets/vendors/switcher/switcher.js'></script>
    </body>

</html>