<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>

<%@ include file="../componants/cdn-top-link.jsp"%>


<style>
body {
	background: #2d365f;
	font-family: 'Roboto', sans-serif;
}
</style>


</head>
<body>
	<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
	<script type="text/javascript">
		var val = "${saveMsg}";

		if (val != 'null' && val != "") {

			Swal.fire({
				title : "Good job!",
				text : val,
				icon : "success"
			});
		}

		else {

		}
	</script>

	<!-- Registration  -->
	<section class="py-3 py-md-3 py-xl-8">
		<div class="container">
			<div class="row gy-4 align-items-center">
				<div class="col-12 col-md-6 col-xl-7">
					<div class="d-flex justify-content-center text-white ">
						<div class="col-12 col-xl-9">
							<h1>BestProgrammer</h1>
							<hr>
							<h6 class=" mb-4">Create your account. It's free and only
								takes a minute.</h6>
							<%-- <img class="img-fluid rounded mb-4" loading="lazy" src="${pageContext.request.contextPath }/vendor/img/logo.png" width="100%" height="10%" alt="BestProgrammer Logo"> --%>
							<hr class="border-primary-subtle mb-4">
							<div class="row">
								<div class="col-12">
									<p class="mt-4 mb-4">Or continue with</p>
									<div class="d-flex gap-2 gap-sm-3 justify-content-centerX">
										<a href="#!"
											class="btn btn-outline-danger bsb-btn-circle bsb-btn-circle-2xl">

										</a> <a href="#!"
											class="btn btn-outline-primary bsb-btn-circle bsb-btn-circle-2xl">

										</a> <a href="#!"
											class="btn btn-outline-dark bsb-btn-circle bsb-btn-circle-2xl">

										</a>
									</div>
								</div>
							</div>
							<div class="text-endx"></div>
						</div>
					</div>
				</div>
				<div class="col-12 col-md-6 col-xl-5">
					<div class="card border-0 rounded-0">
						<div class="card-body p-3 p-md-4 p-xl-5">
							<div class="row">
								<div class="col-12">
									<div class="mb-4">
										<h2 class="h3">Registration</h2>
										<h3 class="fs-6 fw-normal text-secondary m-0">Enter your
											details to register</h3>
									</div>
								</div>
							</div>
							<form
								action="${pageContext.request.contextPath }/auth/registration"
								method="post" ${user }>
								<div class="row gy-3 overflow-hidden">
									<div class="col-12">
										<div class="form-floating ">
											<input type="text" class="form-control" name="fname"
												id="firstName" placeholder="First Name"> <label
												for="firstName" class="form-label">Name</label>
											<p class="text-danger">${name}</p>
										</div>
									</div>
									<div class="col-12">
										<div class="form-floating ">
											<input type="text" class="form-control" name="lname"
												id="lastName" placeholder="Last Name"> <label
												for="Last Name" class="form-label">Last Name
												</label>
											<p class="text-danger"></p>
										</div>
									</div>

									<div class="col-12">
										<div class="form-floating">
											<input type="email" class="form-control" name="email"
												id="email" placeholder="name@example.com"> <label
												for="email" class="form-label">Email</label>
											<p class="text-danger">${error }</p>
										</div>
									</div>
									<div class="col-12">
										<div class="form-floating ">
											<input type="password" class="form-control" name="password"
												id="password" value="" placeholder="Password"> <label
												for="password" class="form-label">Password</label>
											<p class="text-danger">${password }</p>
										</div>
									</div>
									
									<div class="col-12">
										<div class="form-check">
											<input class="form-check-input" type="checkbox" value=""
												name="checkBox" id="checkBox"> <label
												class="form-check-label text-secondary" for="iAgree">
												I agree to the <a href="#!"
												class="link-primary text-decoration-none">terms and
													conditions</a>
											</label>
										</div>
									</div>
									<div class="col-12">
										<div class="d-grid">
											<button class="btn btn-primary btn-lg" type="submit">Sign
												up </button>
										</div>
									</div>
								</div>
							</form>
							<div class="row">
								<div class="col-12">
									<div
										class="d-flex gap-2 gap-md-4 flex-column flex-md-row justify-content-md-end mt-4">
										<p class="m-0 text-secondary text-center">
											Already have an account? <a
												href="${pageContext.request.contextPath }/auth/login"
												class="link-primary text-decoration-none">Sign in</a>
										</p>
									</div>
								</div>
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>