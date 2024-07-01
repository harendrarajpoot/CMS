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
		<h1>Dashboard</h1>
		<nav>
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a href="index">Home</a></li>
				<li class="breadcrumb-item active">Dashboard</li>
			</ol>
		</nav>
	</div>
	<!-- End Page Title --> <!-- Start Cards Section -->
	
	<div class="row text-center">
  <div class="col-sm-3">
    <div class="card rounded-0 shadow border-white">
      <div class="card-body">
        <h5 class="card-title">Categories</h5>
        <p class="card-text ">100.</p>
        <a href="#" class="btn btn-primary rounded-0 btn-block">See All</a>
      </div>
    </div>
  </div>
  <div class="col-sm-3 ">
    <div class="card rounded-0 shadow border-white">
      <div class="card-body">
        <h5 class="card-title">Sub Categories</h5>
        <p class="card-text">102.</p>
        <a href="#" class="btn btn-primary rounded-0">See All</a>
      </div>
    </div>
  </div>
  <div class="col-sm-3">
    <div class="card rounded-0 shadow border-white">
      <div class="card-body">
        <h5 class="card-title">Post</h5>
        <p class="card-text">5.</p>
        <a href="#" class="btn btn-primary rounded-0">See All</a>
      </div>
    </div>
  </div>
  <div class="col-sm-3">
    <div class="card rounded-0 shadow border-white">
      <div class="card-body">
        <h5 class="card-title">Comments</h5>
        <p class="card-text center">10 .</p>
        <a href="#" class="btn btn-primary rounded-0">See All</a>
      </div>
    </div>
  </div>
</div>

<div class="row text-center">
  <div class="col-sm-3">
    <div class="card rounded-0 shadow border-white">
      <div class="card-body">
        <h5 class="card-title">User</h5>
        <p class="card-text ">100.</p>
        <a href="#" class="btn btn-primary rounded-0">See All</a>
      </div>
    </div>
  </div>
  <div class="col-sm-3 ">
    <div class="card rounded-0 shadow border-white">
      <div class="card-body">
        <h5 class="card-title">FQA</h5>
        <p class="card-text">102.</p>
        <a href="#" class="btn btn-primary rounded-0">See All</a>
      </div>
    </div>
  </div>
  <div class="col-sm-3">
    <div class="card rounded-0 shadow border-white">
      <div class="card-body">
        <h5 class="card-title">Admin</h5>
        <p class="card-text">5.</p>
        <a href="#" class="btn btn-primary rounded-0">See All</a>
      </div>
    </div>
  </div>
  <div class="col-sm-3">
    <div class="card rounded-0 shadow border-white">
      <div class="card-body">
        <h5 class="card-title">Subadmin</h5>
        <p class="card-text center">10 .</p>
        <a href="#" class="btn btn-primary rounded-0">See All</a>
      </div>
    </div>
  </div>
</div>

	<!-- End Cards Section --> </main>
	<!-- End #main -->
	<%@ include file="../componants/cdn-bottom-link.jsp"%>

</body>

</html>