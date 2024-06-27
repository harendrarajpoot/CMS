<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<%@ page isELIgnored="false"%>
<head>
<meta charset="utf-8">
<meta content="width=device-width, initial-scale=1.0" name="viewport">

<title>Category</title>
<meta content="" name="description">
<meta content="" name="keywords">
<%@ include file="../componants/cdn-top-link.jsp"%>
</head>

<body>

	<!-- ======= Header ======= -->
	<%@ include file="../componants/header.jsp"%>
	<!-- End Header -->

	<!-- ======= Sidebar ======= -->
	<%@ include file="../componants/sidebar.jsp"%>
	<!-- End Sidebar-->

	<main id="main" class="main">

	<div class="pagetitle">

		<nav>
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a href="/">Home</a></li>
				<li class="breadcrumb-item active">Main Menu</li>
			</ol>
		</nav>
		<c:if test="${saveMsg!=null }">
		<div class="alert alert-success bg-success text-white " role="alert">${saveMsg }</div>
		</c:if>
	</div>
	<!-- End Page Title -->

	<div class="conatiner">
		<div class="row">
			<div class="card rounded-0 border-start border-end border-4 border-primary">
				<div class="card-header">
					<h6>Main Menu</h6>
				</div>
				<div class="card-body">
					<form action="${pageAction }" method="post" ${category } >
						<div class="row ">
						<input type="hidden"name="catId" value="${category.catId }">
							<div class=" col form-floating">
								<input value="${category.catName }" name="catName" type="text"
									class="form-control" id="" placeholder="Java,PHP"> <label>Category
									Name</label>
							</div>
							
							<div class=" col form-floating">
								<input value="${category.metaTag }" name="metaTag" type="text"
									class="form-control" id="" placeholder=" Meta Tag"> <label
									for="Left Icon">Meta Tag </label>
							</div>
							<div class=" col form-floating">
								<input value="${category.url }" name="url" type="text"
									class="form-control" id="" placeholder="Url"> <label
									for="">URL </label>
							</div>
							
						</div>
						<div class="row mt-4 ">
							<div class=" col form-floating">
								<input value="${category.discription }" name="discription"
									type="text" class="form-control" id="floatingPassword"
									placeholder="Discription"> <label for="Url">Description
								</label>
							</div>
							<div class="form-check form-switch col mt-3">
								<input name="tab" class="form-check-input p5" type="checkbox"
									role="switch" checked> <label class="form-check-label"
									for="">Open New Tab </label>
							</div>
							<div class="col ">
								<button type="submit" class="btn btn-primary rounded-0">${pageBtn }
								</button>
								<button type="reset" class="btn btn-danger rounded-0">Reset
								</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	</main>
	<!-- End #main -->

	<%@ include file="../componants/cdn-bottom-link.jsp"%>

</body>
</html>