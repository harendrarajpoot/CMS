<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forget Password</title>
<%@ include file="../componants/cdn-top-link.jsp"%>
<style type="text/css">
body {
	
	background: #2d365f;
	font-family: 'Roboto', sans-serif;
}
</style>
</head>
<body>
<!-- Password Reset  -->
<%@ include file="../componants/login-header.jsp"%>
<section class=" py-3 py-md-5 py-xl-8">
  <div class="container">
    <div class="row justify-content-center">
      <div class="col-12 col-sm-10 col-md-8 col-lg-6 col-xl-5 col-xxl-4">
        <div class="mb-5">
          <h4 class="text-center mb-4 text-white">Password Reset</h4>
        </div>
        <div class="card border border-light-subtle rounded-0">
          <div class="card-body p-3 p-md-4 p-xl-5">
            <form action="#!">
              <p class="text-center mb-4">Provide the email address associated with your account to recover your password.</p>
              <div class="row gy-3 overflow-hidden">
                <div class="col-12">
                  <div class="form-floating mb-3">
                    <input type="email" class="form-control" name="email" id="email" placeholder="name@example.com" required>
                    <label for="email" class="form-label">Email</label>
                  </div>
                </div>
                <div class="col-12">
                  <div class="d-grid">
                    <button class="btn btn-primary btn-lg rounded-0" type="submit">Reset Password</button>
                  </div>
                </div>
              </div>
            </form>
          </div>
        </div>
        <div class="d-flex gap-2 gap-md-4 flex-column flex-md-row justify-content-md-center mt-4">
          <a href="${pageContext.request.contextPath }/auth//admin/login" class="link-secondary text-decoration-none">Login</a>
        <%--   <a href="${pageContext.request.contextPath }/auth/registration" class="link-secondary text-decoration-none">Register</a> --%>
        </div>
      </div>
    </div>
  </div>
</section>
</body>
</html>