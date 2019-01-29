<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="inner-page"></div>
<!-- /breadcrumb -->
<ol class="breadcrumb">
	<li class="breadcrumb-item"><a href="index.html">Home</a></li>
	<li class="breadcrumb-item active">Blog</li>
</ol>
<!-- //breadcrumb -->
<section class="banner-bottom-w3layouts py-lg-5 py-md-5 py-3">
	<div class="container">
		<div class="inner-sec-w3ls-agileits py-lg-5 py-3">
			<h4 class="sub-tittle text-uppercase text-center">Recent Talks</h4>
			<h3 class="tittle text-center mb-md-5 mb-4">Goverment Policies</h3>
			<div class="row">
				<!--left-->
				<c:forEach var="product" items="${govermentpolicesList}">
					<div class="about-in blog-grid-info text-left">
						<div class="card img">
							<div class="card-body img">


								<div class="blog-des blogger">

									<span class="entry-date">June 18, 2018</span>
									<h5 class="card-title text-uppercase mt-2">
									

										<b>policy:</b>
										<c:out value="${product[2]}"/>
										<br></br> <b>description:</b>
										<c:out value="${product[1]}"/>
										</br> </br> </br> </br>

										</h5>								
								</div>
							</div>
						</div>
					</div>
					</c:forEach>
					<div class="log-in mt-md-3 mt-2">

										<a class="hover-2 btn text-uppercase" href="single.html">Read
											More</a>
									</div>
			</div>

			<!--//left-->
		</div>

	</div>
	</div>
</section>

										