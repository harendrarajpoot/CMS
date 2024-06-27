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
				<li class="breadcrumb-item active">Profile</li>
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
					
				</div>
				
			</div>
		</div>
	</div>
	</main>
	<!-- End #main -->

	<%@ include file="../componants/cdn-bottom-link.jsp"%>

</body>
</html>