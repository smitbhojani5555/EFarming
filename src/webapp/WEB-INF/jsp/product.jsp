<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<section id="content">
	<div class="container_24">
		<div class="wrapper">
			<div class="grid_24 content-bg">
				<div class="wrapper">
					<article class="grid_22 suffix_1 prefix_1 alpha omega">
						<h2>Products:</h2>
						<div class="wrapper indent-bot">
							<div class="grid_7 alpha"></div>
							<div class="grid_7">
								<div class="wrapper">
									<c:forEach var="product" items="${productList}">
										<dl class="extra-wrap def-list-1">

											<dt>
												<a href="#"><b>productname:</b> <c:out
														value="${product[1]}" /></a>
											</dt>
											<dd>
												<b>description:</b>
												<c:out value="${product[2]}" />
												</br> <b>price:</b>
												<c:out value="${product[3]}" />
												</br>
												<c:set var="productname" scope="application"
													value="${product[1]}" />
												
												<img src="productimage.htm?productname=${productname}" alt=""
													height="300px" width="300px">
											</dd>
										</dl>
									</c:forEach>
								</div>
							</div>

							<div class="alignright">
								<a href="#" class="button">Read more</a>
							</div>
					</article>
				</div>
			</div>
		</div>
	</div>
</section>
