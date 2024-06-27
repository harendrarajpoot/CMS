<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<%@ page isELIgnored="false"%>
<head>
<meta charset="utf-8">
<meta content="width=device-width, initial-scale=1.0" name="viewport">

<title>${msg}</title>
<meta content="" name="description">
<meta content="" name="keywords">
<!-- CSS CDN Link  -->
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

		<c:if test="${updateMsg!=null }">
		<div class="alert alert-success bg-success text-white " role="alert">${updateMsg }</div>
		</c:if>
		
		<c:if test="${deleteMsg!=null }">
		<div class="alert alert-success bg-success text-white " role="alert">${deleteMsg }</div>
		</c:if>
	</div>
	
	<!-- End Page Title -->

	<div class="conatiner mt-0">
		<div
			class="card rounded-0 border-start border-end border-4 border-primary">

			<div class="card-body">
				<div class="table table-responsive">
					<table id="example" class="table table-striped table-hover mr-1">
						<thead class="table-success">
							<tr>
								<th> ID</th>
								<th class="text-nowrap">Category Name</th>
								<th>Titile</th>
								<th>URL</th>
								<th>Description</th>
								<th>IsPublish</th>
								<th>Content</th>
							
								<th>Action</th>
							</tr>
						</thead>

						<tbody>
							<c:forEach items="${posts}" var="post">
								<tr>
									<td><c:out value="${post.postId}"></c:out></td>
									<td><c:out value="${post.categoryId.catName} "></c:out></td>
									<td class="text-nowrap"><c:out value="${post.title}"></c:out></td>
									<td class="text-nowrap"><c:out value="${post.url}"></c:out></td>
									<td class="text-nowrap"><c:out value="${post.summary}"></c:out></td>
									<td><c:choose>
											<c:when test="${cat.status=='active' }">
												<span class="badge rounded-pill bg-success">  <a href="update-status-category?catId=${cat.catId }" class="text-decoration-none text-white" ><c:out
														value="${cat.status}"></c:out></a></span>
											</c:when>
											<c:otherwise>
												<span class="badge rounded-pill bg-danger "  > <a href="update-status-category/${cat.catId }" class="text-decoration-none text-white" ><c:out
														value="${cat.status}"></c:out></a></span>
											</c:otherwise>
										</c:choose></td>
										<td class="text-nowrap"><c:out value="${fn:substring(post.contents,0,50)}"></c:out></td>
									<td><span>  
											<a href="update-post?postId=${post.postId}"><i
												class="bi bi-pencil-square"></i></a>
												
												<a href="#" class=" delete me-2"
											data-bs-toggle="modal" data-bs-target="#staticBackdrop">
												<i class="bi bi-trash3 text-danger"></i>

										</a> <input type="hidden" value="${post.postId}" id="deleteId">
										</span></td> 
								</tr>
							</c:forEach>
							<c:if test="${posts==null }">
								<tr>
									<td class="text-center"><span>No data:</span></td>
								</tr>
							</c:if>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>

	<!-- Delete Confirm Box Modal Start --> <!-- Modal -->
	<div class="modal fade " id="staticBackdrop" data-bs-backdrop="static"
		data-bs-keyboard="false" tabindex="-1"
		aria-labelledby="staticBackdropLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content rounded-0">
				<form
					action="${pageContext.request.contextPath }/post/delete-post"
					method="post">
					<div class="modal-header">
						<h1 class="modal-title fs-5" id="staticBackdropLabel">Delete
							Category</h1>
						<button type="button " class="btn-close " data-bs-dismiss="modal"
							aria-label="Close"></button>
					</div>
					<div class="modal-body ">
						<p>Are you sure you want to delete these Records?</p>
						<p class="text-warning">This action cannot be undone</p>
					</div>
					<input type="hidden" id="deleteId" name="postId">
					<div class="modal-footer">
						<button type="button" class="btn btn-danger rounded-0"
							data-bs-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary rounded-0">Delete</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- Delete Confirm Box Modal End --> <!-- Pagination start --> <%-- <nav aria-label="Page navigation example">
			<ul class="pagination">
			<c:if test="${currentPage!=0 }">
				<li class="page-item"><a class="page-link" href="${currentPage-1 }">Previous</a></li>
				</c:if>
				
				<c:forEach var="i" begin="1" end="${totalPage }">
				<li class="${currentPage==i-1 ? ' page-item active':'page-item' } ">
				<a class="page-link" href="${i-1 }">${i}</a>
				</li>
				</c:forEach>
				
				<c:if test="${currentPage+1 !=totalPage }">
				<li class="page-item"><a class="page-link" href="${currentPage+1 }">Next</a></li>
				</c:if>
			</ul>
		</nav>  --%> <!-- Pagination End --> </main>
	<!-- End #main -->


	<!--Data table-->
	<script type="text/javascript"
		src="https://code.jquery.com/jquery-3.5.1.js"></script>
	<script type="text/javascript"
		src="https://cdn.datatables.net/1.13.1/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript"
		src="https://cdn.datatables.net/1.13.1/js/dataTables.bootstrap5.min.js"></script>
	<script>
		$(document).ready(function() {

			$('table .delete').on('click', function() {
				var deleteId = $(this).parent().find('#deleteId').val();
				$('#staticBackdrop #deleteId ').val(deleteId);
			});

			$('#example').DataTable();

		});
	</script>
	<!-- JS CDN Link  -->
	<%@ include file="../componants/cdn-bottom-link.jsp"%>
</body>
</html>