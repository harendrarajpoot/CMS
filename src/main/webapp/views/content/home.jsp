
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${title}</title>
<%@ include file="../componants/cdn-top-link.jsp"%>
<style type="text/css">
body
{background: #2d365f;
color:#fff;
}
</style>
</head>
<body>
	<!--  Navbar start-->
	<div class="d-flex" id="wrapper">
		<!-- Sidebar -->
		<div class="bg-light border-right vh-100  " id="sidebar-wrapper">
			<div class="sidebar-heading">Start Bootstrap</div>
			<div class="list-group list-group-flush overflow-auto h-100">
				<a href="#" class="list-group-item list-group-item-action bg-light">Dashboard</a>
				<c:forEach items="${ postByCategory}" var="menus">
					<a href="<%=request.getContextPath()%>/${category}/${menus.slug}"
						class="list-group-item list-group-item-action bg-light">
						${menus.title} </a>
				</c:forEach>

			<form action="<%=request.getContextPath()%>/${category}">
				<c:forEach items="${ postByCategoryAndPostId}" var="menus">
			<%-- 	<input type="hidden" value="<%=request.getContextPath()%>/${category}/${menus.postId}"> --%>
					<a href="<%=request.getContextPath()%>/${category}/${menus.slug}"
						class="list-group-item list-group-item-action bg-light">
						${menus.title} </a>
				</c:forEach>
			</form>
			
			
			</div>
		</div>
		<!-- /#sidebar-wrapper -->

		<!-- Page Content -->
		<div id="page-content-wrapper">
			<nav
				class="navbar navbar-expand-lg navbar-light bg-light shadow fixed-top">
			<div class="container-fluid">
				<a class="navbar-brand" href="#" title="BestProgrammer"> <img
					src="${pageContext.request.contextPath }/vendor/img/logo.png" alt=""
					width="100%" height="40px">
				</a> <span><a href="<%=request.getContextPath()%>/"
					class="text-decoration-none">BestProgrammer</a></span>
				<button class="btn btn-light" id="menu-toggle">
					<i class="bi bi-menu-down"></i>
				</button>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarNav"
					aria-controls="navbarNav" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarNav">

					<c:forEach items="${categories}" var="category">
						<ul class="navbar-nav ">
							<li class="nav-item"><a class="nav-link active"
								aria-current="page"
								href="<%=request.getContextPath()%>/${fn:replace(category.catName,' ','-')}"><c:out
										value="${category.catName}"></c:out></a></li>

						</ul>
					</c:forEach>

					<ul class="navbar-nav ms-auto" style="float: right">
						<li class="nav-item ml-auto "><a
							href="<%=request.getContextPath()%>"
							class="nav-link active">About</a></li>
						<li class="nav-item ml-auto "><a
							href="<%=request.getContextPath()%>" class="nav-link active">Contact</a></li>
						<li class="nav-item ml-auto "><a
							href="<%=request.getContextPath()%>/auth/login" class="nav-link active">Login</a></li>

					</ul>


				</div>
			</div>
			</nav>
			<div class="container-fluid " style="margin-top: 80px; margin-left:20px;">
				<div class="row ">
					<!--  All post Start -->




					<c:forEach items="${allPost}" var="allpost">
						<div class="col-md-4 col-lg-4 col-sm-6 mt-3 ">
							<div class="card shadow rounded-0 border-0 h-100">
								<div class="card-body">
									<i class="fa fa-quote-left text-dark"></i>
									<!-- <span class="mx-auto"><i class="fa fa-quote-left text-dark"></i></span> -->
									<h6 class="card-title mb-2 text-capitalize ">${allpost.title }</h6>
									<%-- ${fn:substring(allpost.contents,0,50)} --%>
									<%-- <span>${allpost.contents}</span> --%>
									<a
										href="<%=request.getContextPath()%>/${category}"
										class="text-decoration-none"> <i
										class="bi bi-arrow-90deg-right"></i> Read More ...
									</a> <span><a href="" class="text-decoration-none ms-5"><i
											class="bi bi-tag"></i>${allpost.categoryId.catName}</a></span>

								</div>
								<div class="card-footer text-muted">
									<p class="text-muted">
										<i class="bi bi-calendar3"></i> Last Update:
										<fmt:formatDate type="date" value="${allpost.createdAt}" />
									</p>
								</div>
							</div>
						</div>
					</c:forEach>

					<!-- Start Post By Category  -->


					<c:forEach items="${postByCategory}" var="postByCategory">
						<div class="col-md-4 col-lg-4 col-sm-6 mt-3 ">
							<div class="card shadow rounded-0 border-0 h-100">
								<div class="card-body">
									<i class="fa fa-quote-left text-dark"></i>
									<!-- <span class="mx-auto"><i class="fa fa-quote-left text-dark"></i></span> -->
									<h6 class="card-title mb-2 text-capitalize ">${postByCategory.title}</h6>
									<%-- ${fn:substring(allpost.contents,0,50)} --%>
									<%-- <span>${allpost.contents}</span> --%>
									<a href="<%=request.getContextPath()%>/${category}/${postByCategory.slug}" class="text-decoration-none"> <i
										class="bi bi-arrow-90deg-right"></i> Read More ...
									</a> <span><a href="#" class="text-decoration-none ms-5"><i
											class="bi bi-tag"></i>${category}</a></span>

								</div>
								<div class="card-footer text-muted">
									<p class="text-muted">
										<i class="bi bi-calendar3"></i> Last Update:
										<fmt:formatDate type="date"
											value="${postByCategory.createdAt}" />
									</p>
								</div>
							</div>
						</div>
					</c:forEach>



					
					<p>${content}</p>
					<span>${updateDate} </span>
					
					
					<c:if test="${not empty postNotFoundByCategory}">
						<h1>${postNotFoundByCategory}</h1>
					</c:if>

					<!-- ENd Post By Category  -->







				</div>

			</div>
		</div>
		<!-- /#page-content-wrapper -->


	</div>
	<script type="text/javascript"
		src="https://code.jquery.com/jquery-3.5.1.js"></script>

	<script type="text/javascript">
		$("#menu-toggle").click(function(e) {
			e.preventDefault();
			$("#wrapper").toggleClass("toggled");
		});
	</script>
	<%@ include file="../componants/cdn-bottom-link.jsp"%>
</body>
</html>