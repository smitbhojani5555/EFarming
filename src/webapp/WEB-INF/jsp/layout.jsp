<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"    
"http://www.w3.org/TR/html4/loose.dtd">

<!--
	Author: W3layouts
	Author URL: http://w3layouts.com
	License: Creative Commons Attribution 3.0 Unported
	License URL: http://creativecommons.org/licenses/by/3.0/
-->

<html lang="zxx">

<head>
<title>Arable Agriculture Category Bootstrap responsive Web
	Template | Home :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
<meta name="keywords"
	content="Arable a Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script>
        addEventListener("load", function() {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }
    </script>
    <link href="./resources/theme/web/css/bootstrap.css" rel='stylesheet' type='text/css' />
    <link rel="stylesheet" href="./resources/theme/web/css/component.css" type="text/css" media="all">
    <link href="./resources/theme/web/css/style.css" rel='stylesheet' type='text/css' />
    <link rel="stylesheet" href="./resources/theme/web/css/owl.theme.css" type="text/css" media="all">
    <link rel="stylesheet" href="./resources/theme/web/css/owl.carousel.css" type="text/css" media="screen" property="" />
    <link href="./resources/theme/web/css/minimal-slider.css" rel='stylesheet' type='text/css' />
    <link href="./resources/theme/web/css/fontawesome-all.css" rel="stylesheet">
    <link href="//fonts.googleapis.com/css?family=Josefin+Sans:100,100i,300,300i,400,400i,600,600i,700,700i" rel="stylesheet">
    <link href="//fonts.googleapis.com/css?family=BenchNine:300,400,700" rel="stylesheet">
</head>
<body>



	<tiles:insertAttribute name="header" />
	<tiles:insertAttribute name="body" />
	<tiles:insertAttribute name="footer" />

<!-- js -->
    <script src="./resources/theme/web/js/jquery-2.2.3.min.js"></script>
    <script src="./resources/theme/web/js/minimal-slider.js"></script>
    <script src="./resources/theme/web/js/toucheffects.js"></script>
    <script src="./resources/theme/web/js/modernizr.custom.js"></script>
    <!-- carousel -->
    <script src="./resources/theme/web/js/owl.carousel.js"></script>
    <script>
        $(document).ready(function() {
            $('.owl-carousel').owlCarousel({
                loop: true,
                margin: 10,
                responsiveClass: true,
                responsive: {
                    0: {
                        items: 1,
                        nav: true
                    },
                    600: {
                        items: 1,
                        nav: false
                    },
                    900: {
                        items: 1,
                        nav: false
                    },
                    1000: {
                        items: 2,
                        nav: true,
                        loop: false,
                        margin: 20
                    }
                }
            })
        })
    </script>
    <!-- //carousel -->
    <script>
        $(document).ready(function() {
            $(".dropdown").hover(
                function() {
                    $('.dropdown-menu', this).stop(true, true).slideDown("fast");
                    $(this).toggleClass('open');
                },
                function() {
                    $('.dropdown-menu', this).stop(true, true).slideUp("fast");
                    $(this).toggleClass('open');
                }
            );
        });
    </script>
    <!-- //dropdown nav -->
    <!-- stats -->
    <script src="./resources/theme/web/js/jquery.waypoints.min.js"></script>
    <script src="./resources/theme/web/js/jquery.countup.js"></script>
    <script>
        $('.counter').countUp();
    </script>
    <!-- //stats -->
    <!-- password-script -->
    <script>
        window.onload = function() {
            document.getElementById("password1").onchange = validatePassword;
            document.getElementById("password2").onchange = validatePassword;
        }

        function validatePassword() {
            var pass2 = document.getElementById("password2").value;
            var pass1 = document.getElementById("password1").value;
            if (pass1 != pass2)
                document.getElementById("password2").setCustomValidity("Passwords Don't Match");
            else
                document.getElementById("password2").setCustomValidity('');
            //empty string means no validation error
        }
    </script>
    <!-- //password-script -->

    <!--/ start-smoth-scrolling -->
    <script src="./resources/theme/web/js/move-top.js"></script>
    <script src="./resources/theme/web/js/easing.js"></script>
    <script>
        jQuery(document).ready(function($) {
            $(".scroll").click(function(event) {
                event.preventDefault();
                $('html,body').animate({
                    scrollTop: $(this.hash).offset().top
                }, 900);
            });
        });
    </script>
    <script>
        $(document).ready(function() {
            /*
            						var defaults = {
            							  containerID: 'toTop', // fading element id
            							containerHoverID: 'toTopHover', // fading element hover id
            							scrollSpeed: 1200,
            							easingType: 'linear' 
            						 };
            						*/

            $().UItoTop({
                easingType: 'easeOutQuart'
            });

        });
    </script>
    <!--// end-smoth-scrolling -->
    <!-- /js -->
    <script src="./resources/theme/web/js/bootstrap.js"></script>
    <!-- //js -->
     <!--/Login-->
    <div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered" role="document">
            <div class="modal-content">
                <div class="modal-header text-center">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">

                    <div class="login px-4 mx-auto mw-100">
                        <h5 class="text-center mb-4">Login Now</h5>
                        <form action="#" method="post">
                            <div class="form-group">
                                <label class="mb-2">Email address</label>
                                <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="" required="">
                                <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                            </div>
                            <div class="form-group">
                                <label class="mb-2">Password</label>
                                <input type="password" class="form-control" id="exampleInputPassword1" placeholder="" required="">
                            </div>
                            <div class="form-check mb-2">
                                <input type="checkbox" class="form-check-input" id="exampleCheck1">
                                <label class="form-check-label" for="exampleCheck1">Check me out</label>
                            </div>
                            <button type="submit" class="btn btn-primary submit mb-4">Sign In</button>
                            <p class="text-center pb-4">
                                <a href="#" data-toggle="modal" data-target="#exampleModalCenter2"> Don't have an account?</a>
                            </p>
                        </form>
                    </div>
                </div>

            </div>
        </div>
    </div>
    <!--//Login-->
    <!--/Register-->
    <div class="modal fade" id="exampleModalCenter2" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered" role="document">
            <div class="modal-content">
                <div class="modal-header text-center">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <div class="login px-4 mx-auto mw-100">
                        <h5 class="text-center mb-4">Register Now</h5>
                        <form action="register.htm" method="post">
                        <div class="form-group">
								<label>select Registration type</label> </br>
								<input type="radio" name="usertype" value="1"> Farmer<br>
								<input type="radio" name="usertype" value="2"
									onclick="document.getElementById('type').removeAttribute('disabled')">Agronomist<br>
								<input type="radio" name="usertype" value="3">Company</br>
                            <div class="form-group">
                                <label>First name</label>

                                <input type="text" class="form-control" id="firstname" name="firstname" placeholder="" required="">
                            </div>
                            <div class="form-group">
                                <label>Last name</label>
                                <input type="text" class="form-control" id="lastname" name="lastname" placeholder="" required="">
                            </div>
                            <div class="form-group">
								<label>Username</label> <input type="text" class="form-control"
									id="name" name="name" placeholder="" required="">
							</div>
							<div class="form-group">
								<label>Email</label> <input type="text" class="form-control"
									id="email" name="email" placeholder="" required="">
							</div>
							<div class="form-group">
								<label>Mobile No</label> <input type="text" class="form-control"
									id="mobileno" name="mobileno" placeholder="" required="">
							</div>
                            

                            <div class="form-group">
                                <label class="mb-2">Password</label>
                                <input type="password" class="form-control" id="password1" name="password1" placeholder="" required="">
                            </div>
                            <div class="form-group">
                                <label>Confirm Password</label>
                                <input type="password" class="form-control" id="password2" name="password2" placeholder="" required="">
                            </div>
                            </div>
							<div class="form-group">
								<label>Upload Document:</label> <input type="file"
									class="form-control" id="fileupload" size="50" placeholder="" required="">
							</div>
							
							<div class="form-group">
								<label>Select Agronomist type</label> <select id="type"
									name="charstype" disabled>
									<option>Agronomy</option>
									<option>Horticulture</option>
									<option>live stock</option>
									<option>soil science</option>
									<option>Plantbreeding</option>
									<option>antmology</option>
									<option>mmeterology</option>
									<option>equipments experts</option>
								</select>

                            <button type="submit" class="btn btn-primary submit mb-4">Register</button>
                            <p class="text-center pb-4">
                                <a href="#">By clicking Register, I agree to your terms</a>
                            </p>
                        </form>

                    </div>
                </div>

            </div>
        </div>
    </div>
    <!--//Register-->
    
</body>

</html>