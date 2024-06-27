<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta content="width=device-width, initial-scale=1.0" name="viewport">

<title>Dashboard</title>
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
					<li class="breadcrumb-item"><a href="index.html">Home</a></li>
					<li class="breadcrumb-item active">Sub Menu</li>
				</ol>
			</nav>
		</div>
		<!-- End Page Title -->

		<div class="conatiner">
			<div class="row">
				<div class="card rounded-0 border-start border-end border-4 border-primary">
					<div class="card-header">
						<h6>Sub Menu</h6>
					</div>
					<div class="card-body">
						<form action="">
							<div class="row ">
								<div class=" col form-floating">
									<input type="text" class="form-control" id=""
										placeholder="Sub Menu Name"> <label for="Sub Menu Name">Sub Menu
										Name</label>
								</div>
								<div class=" col form-floating">
									<input type="text" class="form-control" id=""
										placeholder="Left Icon"> <label for="Left Icon">Left
										Icon</label>
								</div>
								
							</div>
							<div class="row mt-4 ">
								<div class=" col form-floating">
									<input type="text" class="form-control" id="Href Value"
										placeholder="Href Value"> <label for="Right Icon">Href Value
										</label>
								</div>
								<div class="form-check form-switch col mt-3">
									<input class="form-check-input p5" type="checkbox"
										role="switch" checked> <label class="form-check-label"
										for="">Open New Tab </label>
								</div>
								<div class="col ">
									<button type="button" class="btn btn-primary btn-lg rounded-0">Submit
										</button>
									<button type="button" class="btn btn-danger btn-lg rounded-0">Reset
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