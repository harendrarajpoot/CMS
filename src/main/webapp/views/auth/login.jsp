<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
<%@ include file="../componants/cdn-top-link.jsp"%>

<style type="text/css">
body {
	
	background: #2d365f;
	font-family: 'Roboto', sans-serif;
	overflow: hidden;
}

html{
  scroll-behavior:
}
</style>
</head>
<body>
<%-- <%@ include file="../componants/login-header.jsp"%> --%>


<!-- Login  -->
<section class="py-3 py-md-4">
  <div class="container">
    <div class="row justify-content-center">
      <div class="col-12 col-sm-10 col-md-8 col-lg-6 col-xl-5 col-xxl-4">
        <div class="card border border-light-subtle rounded-0 shadow-sm">
          <div class="card-body p-3 p-md-4 p-xl-5">
            <div class="text-center mb-3">
              <a href="#!">
                <img src="${pageContext.request.contextPath }/vendor/img/logo.png" alt="Sign in With Best Programmer" width="175" height="57">
              </a>
            </div>
            <h2 class="fs-6 fw-normal text-center text-secondary mb-4">Sign in to your account</h2>
         <c:if test="${param.error!=null}"><h6 style="color:red"> Invalid username and password.</h6></c:if>
       <c:if test="${param.logout != null}">  <h6 class=" text-success text-center"> <b>You have been logged out.</b></h6></c:if>
            <form action="${pageContext.request.contextPath }/authentication/login" method="post">
              <div class="row gy-2 overflow-hidden">
                <div class="col-12">
                  <div class="form-floating mb-1">
                    <input type="text" class="form-control" name="username"id="email" placeholder="name@example.com" required>
                    <label for="email" class="form-label">Email</label>
                  </div>
                </div>
                <div class="col-12">
                  <div class="form-floating mb-1">
                    <input type="password" class="form-control" name="password" id="password" value="" placeholder="Password" required>
                    <label for="password" class="form-label">Password</label>
                  </div>
                </div>
                <div class="col-12">
                  <div class="d-flex gap-2 justify-content-between">
                    <div class="form-check">
                      <input class="form-check-input" type="checkbox" value="" name="rememberMe" id="rememberMe">
                      <label class="form-check-label text-secondary" for="rememberMe">
                        Keep me logged in
                      </label>
                    </div>
                    <a href="${pageContext.request.contextPath }/auth/forget-password" class="link-primary text-decoration-none">Forgot password?</a>
                  </div>
                </div>
                <div class="col-12">
                  <div class="d-grid my-3">
                    <button class="btn btn-primary btn-lg" type="submit">Log in</button>
                  </div>
                </div>
                 <div class="col-12">
                  <p class="m-0 text-secondary text-center">Don't have an account? <a href="${pageContext.request.contextPath }/auth/user/registration" class="link-primary text-decoration-none">Sign up</a></p>
                </div>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
</body>
</html>