
<div class="container">

	<div class="row">

		<!-- would be to display sidebar -->
		<div class="col-md-3">

			<%@include file="./shared/sidebar.jsp"%>

		</div>

		<!--  To display the actual products -->
		<div class="col-md-9">
			<!--  added breadcrumb component(so we use an ol tag)-->
			<div class="row">
				<div class="col-lg-12"></div>

				<c:if test="${userClickAllProducts == true}">

					<ol class="breadcrumb">
					<!-- we display this breadcrumb with 
					       Home clickable and all Product active -->

						<li><a href="${contextRoot}/home">Home</a></li>
						<li class="active">All Products</li>


					</ol>
				</c:if>


				<c:if test="${userClickCategoryProducts == true}">

					<ol class="breadcrumb">
			  <!-- if a specific category is clicked we display this breadcrumb with 
					       Home clickable and the category and name active  active -->

						<li><a href="${contextRoot}/home">Home</a></li>
						<li class="active">Category</li>
						<li class="active">${category.name}</li>


					</ol>
				</c:if>


			</div>


		</div>


	</div>




</div>
