<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta content="width=device-width, initial-scale=1.0" name="viewport">

<title>Dashboard</title>
<meta content="" name="description">
<meta content="" name="keywords">
<!-- CSS CDN -->

<%@ include file="../componants/cdn-top-link.jsp"%>

	<script src="https://cdnjs.cloudflare.com/ajax/libs/tinymce/6.8.3/tinymce.min.js"></script>
	
	
	
<script>

	tinymce.init({
		selector : '#mytextarea'
		
	});
</script>


</head>

<body>

	<!-- ======= Header ======= -->
	<%@ include file="../componants/header.jsp"%>
	<!-- End Header -->

	<!-- ======= Sidebar ======= -->
	<%@ include file="../componants/sidebar.jsp"%>
	<!-- End Sidebar-->

	<main id="main" class="main"> <!-- End Page Title -->
<c:if test="${saveMsg!=null }">
		<div class="alert alert-success bg-success text-white " role="alert">${saveMsg }</div>
		</c:if>
	<div class="conatiner">
		<div class="row">
			<div
				class="card rounded-0 border-start border-end border-4 border-primary">

				<div class="card-body">
					<ul class="nav nav-tabs" role="tablist">
						<li class="nav-item"><a class="nav-link active"
							data-bs-toggle="tab" href="#home">Home</a></li>
						<li class="nav-item"><a class="nav-link" data-bs-toggle="tab"
							href="#menu1">Summary</a></li>

					</ul>

					<!-- Tab panes -->
					<div class="tab-content">


						<div id="home" class="container tab-pane active">
							<br>
							<form action="${pageAction }" method="post" ${post }>
								<input type="hidden"name="postId" value="${post.postId }">
								<div class="row g-2  mb-3">
									<div class="col-md">
										<div class="form-floating">

											<select name="categoryId" class="form-select text-capitalize" id="floatingSelectGrid"
												aria-label="Floating label select example" required="required">
												
												<c:if test="${ not empty post}">
 												<option  selected value="${post.categoryId.catId}">${post.categoryId.catName}</option>
												
												</c:if>
												<c:if test="${not empty allCatgories}">
												<option selected>Select Category</option>
												<c:forEach var="val" items="${allCatgories}">
												<option value="${val.catId}">${val.catName}</option>
												</c:forEach>
												</c:if>
											</select> <label for="floatingSelectGrid"></label>
										</div>
									</div>

									<div class="col-md">
										<div class="form-floating">
											<input name="title" type="text" class="form-control" value="${post.title }"
												id="floatingInputGrid" placeholder="Title"> <label
												for="floatingInputGrid">Title</label>
										</div>
									</div>
								</div>

								<div class="row g-2  mb-3">
									<div class="col-md">
										<div class="form-floating">
											<input name="summary" type="text" class="form-control" value="${post.summary }"
												id="floatingInputGrid" placeholder="Summary"> <label
												for="floatingInputGrid">Summary</label>
										</div>
									</div>
									<div class="col-md">
										<div class="form-floating">
											<input name="url"  type="text" class="form-control" value="${post.url }"
												id="floatingInputGrid" placeholder="URL"> <label
												for="floatingInputGrid">URL</label>
										</div>
									</div>
								</div>

								<div class="form-floating">
									
									<input type="text" name="metaTag" class="form-control" value="${fn:trim(post.metaTag)}">
									
										
									<label for="floatingTextarea2">Keywords</label>
								</div>

								<div class="form-floating">
									<textarea name="contents" class="form-control"
										placeholder="Enter Content here..." id="mytextarea">${post.contents}</textarea>
									<label for="floatingTextarea2" ></label>
								</div>

								<div class="d-grid gap-2 d-md-flex justify-content-md-end mt-3">
									<button class="btn btn-danger" type="reset">Reset</button>
									<button class="btn btn-primary" type="submit">${pageBtn }</button>
								</div>
							</form>
						</div>

						<div id="menu1" class="container tab-pane fade "></div>




					</div>

				</div>
			</div>
		</div>
	</div>
	</main>
	<!-- End #main -->




	<!-- CDN JS -->
	<%@ include file="../componants/cdn-bottom-link.jsp"%>



</body>
</html>