<%-- 
    Document   : reviewsach
    Created on : Mar 15, 2023, 2:40:14 PM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <title>Review Sách</title>

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

        <style>
            /* Style for the comment section */
            .comment-section {
                background-color: #f8f8f8;
                padding: 20px;
                border: 1px solid #ddd;
            }

            /* Style for the comment form */
            .comment-form {
                margin-top: 20px;
            }

            .comment-form label {
                display: block;
                font-weight: bold;
                margin-bottom: 10px;
            }

            .comment-form input[type="text"],
            .comment-form textarea {
                width: 100%;
                padding: 5px;
                border: 1px solid #ddd;
                margin-bottom: 10px;
            }

            .comment-form input[type="submit"] {
                background-color: #4CAF50;
                color: white;
                padding: 10px 20px;
                border: none;
                cursor: pointer;
                border-radius: 5px;
            }
        </style>
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
            <!-- Inner Content Box ==== -->
            <div class="page-content bg-white">
                <!-- Page Heading Box ==== -->
                <div class="page-banner ovbl-dark" style="background-image:url(assets/images/banner/banner1.jpg);">
                    <div class="container">
                        <div class="page-banner-entry">
                            <h1 class="text-white">Review Sách</h1>
                        </div>
                    </div>
                </div>
                <div class="breadcrumb-row">
                    <div class="container">
                        <ul class="list-inline">
                            <li><a href="#">Home</a></li>
                            <li>Review Sách</li>
                        </ul>
                    </div>
                </div>
                <!-- Breadcrumb row END -->
                <!-- inner page banner END -->
                <div class="content-block">
                    <!-- About Us -->
                    <div class="section-area section-sp1">
                        <div class="container">
                            <div class="row">
                                <div class="col-lg-8 col-md-7 col-sm-12">
                                    <div class="courses-post">
                                        <div class="ttr-post-media media-effect">
                                            <a href="#"><img src="assets/images/blog/default/thum1.jpg" alt=""></a>
                                        </div>
                                        <div class="ttr-post-info">
                                            <div class="ttr-post-title ">
                                                <h2 class="post-title">${s.getTen_sach()}</h2>
                                            </div>
                                            <div class="ttr-post-text">Mô tả:
                                                <p>${s.getMo_ta()}</p>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="courese-overview" id="overview">
                                        <div class="row">
                                            <div class="col-md-12 col-lg-5">
                                                <ul class="course-features">
                                                    <li><i class=""></i> <span class="label">Thể loại</span> <span class="value">${s.getThe_loai()}</span></li>
                                                    <li><i class=""></i> <span class="label">Tác giả</span> <span class="value">${s.getTac_gia()}</span></li>
                                                    <li><i class=""></i> <span class="label">Nhà xuất bản</span> <span class="value">${s.getNha_xuat_ban()}</span></li>
                                                    <li><i class=""></i> <span class="label">Năm xuất bản</span> <span class="value">${s.getNam_xuat_ban()}</span></li>
                                                    <!--                                                    <li><i class=""></i> <span class="label">Đánh giá</span> <span class="value"></span></li>
                                                                                                        <li><i class=""></i> <span class="label">Students</span> <span class="value">32</span></li>
                                                                                                        <li><i class=""></i> <span class="label">Assessments</span> <span class="value">Yes</span></li>-->
                                                </ul>
                                            </div>
                                            <div class="col-md-12 col-lg-7">
                                                <h5 class="m-b5">Review Sách</h5>
                                                <p> ${s.getReview_sach()}</p>
                                                <!--                                                    <li>Over 37 lectures and 55.5 hours of content!</li>
                                                                                                    <li>LIVE PROJECT End to End Software Testing Training Included.</li>
                                                                                                    <li>Learn Software Testing and Automation basics from a professional trainer from your own desk.</li>
                                                                                                    <li>Information packed practical training starting from basics to advanced testing techniques.</li>
                                                                                                    <li>Best suitable for beginners to advanced level users and who learn faster when demonstrated.</li>
                                                                                                    <li>Course content designed by considering current software testing technology and the job market.</li>
                                                                                                    <li>Practical assignments at the end of every session.</li>
                                                                                                    <li>Practical learning experience with live project work and examples.cv</li>-->
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-4 col-md-5 col-sm-12 m-b30">
                                    <div class="bg-primary text-white contact-info-bx m-b30">
                                        <!--<h2 class="m-b10 title-head">Contact <span>Information</span></h2>-->
                                        <!--<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry.</p>-->
                                        <div class="widget widget_getintuch">	
                                            <ul>
                                                <li><i class="ti-location-pin"></i>FPT University</li>
                                                <li><i class="ti-mobile"></i>0123456789 (24/7 Support Line)</li>
                                                <li><i class="ti-email"></i>manhbmhe163593@fpt.edu.vn</li>
                                            </ul>
                                        </div>
                                        </ul>
                                    </div>
                                    <!--<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3448.1298878182047!2d-81.38369578541523!3d30.204840081824198!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x88e437ac927a996b%3A0x799695b1a2b970ab!2sNona+Blue+Modern+Tavern!5e0!3m2!1sen!2sin!4v1548177305546" class="align-self-stretch d-flex" style="width:100%; min-width:100%; min-height:400px;" allowfullscreen></iframe>-->
                                </div>


                                <c:if test="${sessionScope.account.account!=null}">
                                    <div class="col-lg-12 col-md-12 col-sm-12 m-b30">
                                        <div class="comment-section">
                                            <h2>Phần bình luận</h2>

                                            <form class="comment-form" action="DanhGiaController" method="post">
                                                <input type="hidden" name="sach_danh_gia" value="${sessionScope.id_sach_danh_gia}">
                                                <input type="hidden" name="nguoi_danh_gia" value="${sessionScope.account_name}">
                                                <label for="comment">Bình luận: </label>
                                                <textarea id="comment" name="nhan_xet_cua_user"></textarea>
                                                <label for="comment">Đánh giá(?/5):</label>
                                                <select name="danh_gia" class="form-control">
                                                    <option value="1">1</option>
                                                    <option value="2">2</option>
                                                    <option value="3">3</option>
                                                    <option value="4">4</option>
                                                    <option value="5">5</option>
                                                </select>
                                                <br/>
                                                <br/>
                                                <input type="submit" value="Gửi">
                                            </form>
                                        </div>
                                    </div>





                                    <div class="col-lg-12 col-md-12 col-sm-12 m-b30">

                                        <c:forEach items="${list_danh_gia}" var="items">
                                            <li style="box-shadow: 0 4px 2px -2px rgba(0, 0, 0, 0.3);padding: 10px 0">
                                                ${items.name} ${items.ngay} ${items.gio}<br/>
                                                Đánh giá: ${items.danh_gia}/5 <br/>
                                                Bình luận: ${items.nhan_xet_cua_user} <br/>
                                            </c:forEach>


                                    </div>
                                </c:if>    

                            </div>
                        </div>
                    </div>
                </div>
                <!-- contact area END -->
                <c:if test="${sessionScope.account.account==null}">
                    <p style="text-align: center">Đăng nhập để bình luận và xem bình luận <a href="LoginController"><br>Đăng nhập tại đây</a></p>
                        </c:if> 
            </div>
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

