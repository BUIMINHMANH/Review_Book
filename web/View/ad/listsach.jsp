<%-- 
    Document   : listsach
    Created on : Mar 16, 2023, 8:23:17 PM
    Author     : ADMIN
--%>

<!--thêm thanh search dòng 104-->


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <!-- Mirrored from educhamp.themetrades.com/demo/admin/review.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 22 Feb 2019 13:11:35 GMT -->
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
        <link rel="icon" href="error-404.html" type="image/x-icon" />
        <link rel="shortcut icon" type="image/x-icon" href="admin/assets/images/favicon.png" />

        <!-- PAGE TITLE HERE ============================================= -->
        <title>List Sách </title>

        <!-- MOBILE SPECIFIC ============================================= -->
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!--[if lt IE 9]>
        <script src="assets/js/html5shiv.min.js"></script>
        <script src="assets/js/respond.min.js"></script>
        <![endif]-->

        <!-- All PLUGINS CSS ============================================= -->
        <link rel="stylesheet" type="text/css" href="admin/assets/css/assets.css">
        <link rel="stylesheet" type="text/css" href="admin/assets/vendors/calendar/fullcalendar.css">

        <!-- TYPOGRAPHY ============================================= -->
        <link rel="stylesheet" type="text/css" href="admin/assets/css/typography.css">

        <!-- SHORTCODES ============================================= -->
        <link rel="stylesheet" type="text/css" href="admin/assets/css/shortcodes/shortcodes.css">

        <!-- STYLESHEETS ============================================= -->
        <link rel="stylesheet" type="text/css" href="admin/assets/css/style.css">
        <link rel="stylesheet" type="text/css" href="admin/assets/css/dashboard.css">
        <link class="skin" rel="stylesheet" type="text/css" href="admin/assets/css/color/color-1.css">

    </head>
    <body class="ttr-opened-sidebar ttr-pinned-sidebar">

        <!-- header start -->
<!--        <header class="ttr-header">
            <div class="ttr-header-wrapper">
                sidebar menu toggler start 
                <div class="ttr-toggle-sidebar ttr-material-button">
                    <i class="ti-close ttr-open-icon"></i>
                    <i class="ti-menu ttr-close-icon"></i>-->
                </div>
                <!--sidebar menu toggler end -->
                <!--logo start -->
<!--                <div class="ttr-logo-box">
                    <div>
                        <a href="index.html" class="ttr-logo">
                            <img alt="" class="ttr-logo-mobile" src="admin/assets/images/logo-mobile.png" width="30" height="30">
                            <img alt="" class="ttr-logo-desktop" src="admin/assets/images/logo-white.png" width="160" height="27">
                        </a>
                    </div>
                </div>-->
                <!--logo end -->
<!--                <div class="ttr-header-menu">
                     header left menu start 
                    <ul class="ttr-header-navigation">
                        <li>
                            <a href="index.html" class="ttr-material-button ttr-submenu-toggle">HOME</a>
                        </li>

                    </ul>-->
                    <!-- header left menu end -->
                </div>
                <div class="ttr-header-right ttr-with-seperator">
                    <!-- header right menu start -->
                    <ul class="ttr-header-navigation">
                        <li>


<!--                            <div class="search-bx style-1">
                                <form role="search" method="get" action="ListSachController">
                                    <div class="input-group">
                                        <input name="ten_sach" class="form-control" placeholder="Enter your keywords..." type="text">
                                        <span class="input-group-btn">
                                            <input type="submit" class="fa fa-search text-primary">                                         
                                        </span> 
                                    </div>
                                </form>
                            </div>-->


                        </li>
                      
                        <li>
                            <a href="#" class="ttr-material-button ttr-search-toggle">${sessionScope.account_name}</a>

                        </li>
                        <li>
                            <a href="LogoutController" class="ttr-material-button ttr-search-toggle">Đăng xuất</a>
                        </li>



                    </ul>
                    <!-- header right menu end -->
                </div>
                <!--header search panel start -->
<!--                <div class="ttr-search-bar">
                    <form class="ttr-search-form">
                        <div class="ttr-search-input-wrapper">
                            <input type="text" name="qq" placeholder="search something..." class="ttr-search-input">
                            <button type="submit" name="search" class="ttr-search-submit"><i class="ti-arrow-right"></i></button>
                        </div>
                        <span class="ttr-search-close ttr-search-toggle">
                            <i class="ti-close"></i>
                        </span>
                    </form>
                </div>-->
                <!--header search panel end -->
            </div>
        </header>
        <!-- header end -->
        <!-- Left sidebar menu start -->
        <div class="ttr-sidebar">
            <div class="ttr-sidebar-wrapper content-scroll">
                <!-- side menu logo start -->
                <div class="ttr-sidebar-logo">
                    <!--<a href="#"><img alt="" src="admin/admin/assets/images/logo.png" width="122" height="27"></a>-->
                    <!-- <div class="ttr-sidebar-pin-button" title="Pin/Unpin Menu">
                            <i class="material-icons ttr-fixed-icon">gps_fixed</i>
                            <i class="material-icons ttr-not-fixed-icon">gps_not_fixed</i>
                    </div> -->
                    <div class="ttr-sidebar-toggle-button">
                        <i class="ti-arrow-left"></i>
                    </div>
                </div>
                <!-- side menu logo end -->
                <!-- sidebar menu start -->
                <nav class="ttr-sidebar-navi">
                    <ul>


                        <li>
                            <a href="ListSachController" class="ttr-material-button">
                                <span class="ttr-icon"><i class="ti-comments"></i></span>
                                <span class="ttr-label">List Sách</span>
                            </a>
                        </li>
                        <li>
                            <a href="ThemSachController" class="ttr-material-button">
                                <span class="ttr-icon"><i class="ti-layout-accordion-list"></i></span>
                                <span class="ttr-label">Thêm Sách</span>
                            </a>
                        </li>
                          <li>
                            <a href="XetDuyetController" class="ttr-material-button">
                                <span class="ttr-icon"><i class="ti-layout-accordion-list"></i></span>
                                <span class="ttr-label">Bình Luận</span>
                            </a>
                        </li>

                        <li class="ttr-seperate"></li>
                    </ul>
                    <!-- sidebar menu end -->
                </nav>
                <!-- sidebar menu end -->
            </div>
        </div>
        <!-- Left sidebar menu end -->
        <!--Main container start -->
        <main class="ttr-wrapper">
            <div class="container-fluid">
                <div class="db-breadcrumb">
                    <h4 class="breadcrumb-title">Review</h4>
                    <ul class="db-breadcrumb-list">
                        <li><a href="HomeController"><i class="fa fa-home"></i>Home</a></li>
                        <li>List Sách</li>
                    </ul>
                </div>	
                <div class="row">
                    <!-- Your Profile Views Chart -->

                    <div class="col-lg-12 m-b30">

                        <div class="widget-box">
                            <div class="wc-title">
                                <h4>List Sách</h4>
                            </div>
                            <c:forEach items="${data}" var="item">   
                                <div class="widget-inner">
                                    <div class="card-courses-list admin-review">
                                        <div class="card-courses-full-dec">
                                            <div class="card-courses-title">
                                                <h4>${item.getTen_sach()}</h4>
                                            </div>
                                            <div class="card-courses-list-bx">
                                                <ul class="card-courses-view">
                                                    <li class="card-courses-user">
                                                        <div class="card-courses-user-pic">
                                                            <img src="admin/assets/images/testimonials/pic1.jpg" alt=""/>
                                                        </div>
                                                        <div class="card-courses-user-info">
                                                            <h5>Tác giả</h5>
                                                            <h4>${item.getTac_gia()}</h4>
                                                        </div>
                                                    </li>

                                                    <li class="card-courses-categories">
                                                        <h5>Ngày xuất bản</h5>
                                                        <h4>${item.getNam_xuat_ban()}</h4>
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="row card-courses-dec">
                                                <div class="col-md-12">
                                                    <h6 class="m-b10"></h6>
                                                    <p> ${item.getMo_ta()} </p>	
                                                </div>
                                                <div class="col-md-12">
                                                    <a href="XoaSachController?id_sach=${item.getId_sach()}" class="btn">Delete</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>


                                </div>
                            </c:forEach>
                        </div>
                    </div>

                    <!-- Your Profile Views Chart END-->
                </div>
            </div>
        </main>
        <div class="ttr-overlay"></div>

        <!-- External JavaScripts -->


        <script src="admin/assets/vendors/bootstrap/js/popper.min.js"></script>
        <script src="admin/assets/vendors/bootstrap/js/bootstrap.min.js"></script>
        <script src="admin/assets/vendors/bootstrap-select/bootstrap-select.min.js"></script>
        <script src="admin/assets/vendors/bootstrap-touchspin/jquery.bootstrap-touchspin.js"></script>
        <script src="admin/assets/vendors/magnific-popup/magnific-popup.js"></script>
        <script src="admin/assets/vendors/counter/waypoints-min.js"></script>
        <script src="admin/assets/vendors/counter/counterup.min.js"></script>
        <script src="admin/assets/vendors/imagesloaded/imagesloaded.js"></script>
        <script src="admin/assets/vendors/masonry/masonry.js"></script>
        <script src="admin/assets/vendors/masonry/filter.js"></script>
        <script src="admin/assets/vendors/owl-carousel/owl.carousel.js"></script>
        <script src='admin/assets/vendors/scroll/scrollbar.min.js'></script>
        <script src="admin/assets/js/functions.js"></script>
        <script src="admin/assets/vendors/chart/chart.min.js"></script>
        <script src="admin/assets/js/admin.js"></script>
        <script src='admin/assets/vendors/switcher/switcher.js'></script>
    </body>

    <!-- Mirrored from educhamp.themetrades.com/demo/admin/review.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 22 Feb 2019 13:11:35 GMT -->
</html>
