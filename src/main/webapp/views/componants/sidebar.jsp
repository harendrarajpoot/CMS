
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>s
<aside id="sidebar" class="sidebar">

    <ul class="sidebar-nav" id="sidebar-nav">

      <li class="nav-item">
        <a class="nav-link " href="<%=request.getContextPath()%>/admin">
          <i class="bi bi-grid"></i>
          <span>Dashboard</span>
        </a>
      </li><!-- End Dashboard Nav -->

      <li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#categories-nav" data-bs-toggle="collapse" href="#">
          <i class="bi bi-menu-button-wide"></i><span>Categories</span><i class="bi bi-chevron-down ms-auto"></i>
        </a>
        <ul id="categories-nav" class="nav-content collapse " data-bs-parent="#sidebar-nav">
          <li>
            <a href="<%= request.getContextPath()%>/category/add-category">
              <i class="bi bi-circle"></i><span>Add categories</span>
            </a>
          </li>
          <li>
            <a href="<%= request.getContextPath()%>/category/list-categories">
              <i class="bi bi-circle"></i><span>Manage categories</span>
            </a>
          </li>
          
        
        </ul>
      </li>
      <li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#sub-categories-nav" data-bs-toggle="collapse" href="#">
          <i class="bi bi-menu-button-wide"></i><span>Sub-Categories</span><i class="bi bi-chevron-down ms-auto"></i>
        </a>
        <ul id="sub-categories-nav" class="nav-content collapse " data-bs-parent="#sidebar-nav">
          <li>
            <a href="components-alerts.html">
              <i class="bi bi-circle"></i><span>Add sub-categories</span>
            </a>
          </li>
          <li>
            <a href="components-accordion.html">
              <i class="bi bi-circle"></i><span>Manage sub-categories</span>
            </a>
          </li>
          
        
        </ul>
      </li>
      <li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#post" data-bs-toggle="collapse" href="#">
          <i class="bi bi-menu-button-wide"></i><span>Post</span><i class="bi bi-chevron-down ms-auto"></i>
        </a>
        <ul id="post" class="nav-content collapse " data-bs-parent="#sidebar-nav">
          <li>
          
            <a href="<%= request.getContextPath()%>/post/add-post">
              <i class="bi bi-circle"></i><span>Add Post</span>
            </a>
          </li>
          <li>
            <!-- <a href="list-post"> -->
              <a href="<%= request.getContextPath()%>/post/list-post">
              <i class="bi bi-circle"></i><span>Manage Post</span>
            </a>
          </li>
          
        
        </ul>
      </li>
      
      

      <li class="nav-heading">Pages</li>

      <li class="nav-item">
        <a class="nav-link collapsed" href="users-profile.html">
          <i class="bi bi-person"></i>
          <span>Profile</span>
        </a>
      </li><!-- End Profile Page Nav -->

      <li class="nav-item">
        <a class="nav-link collapsed" href="pages-faq.html">
         <i class="bi bi-arrow-90deg-right"></i>
          <span>F.A.Q</span>
        </a>
      </li><!-- End F.A.Q Page Nav -->

      <li class="nav-item">
        <a class="nav-link collapsed" href="pages-contact.html">
          <i class="bi bi-envelope"></i>
          <span>Contact</span>
        </a>
      </li><!-- End Contact Page Nav -->

      <li class="nav-item">
        <a class="nav-link collapsed" href="pages-register.html">
          <i class="bi bi-card-list"></i>
          <span>Register</span>
        </a>
      </li><!-- End Register Page Nav -->

      <li class="nav-item">
        <a class="nav-link collapsed" href="pages-login.html">
          <i class="bi bi-box-arrow-in-right"></i>
          <span>Login</span>
        </a>
      </li><!-- End Login Page Nav -->

      <li class="nav-item">
        <a class="nav-link collapsed" href="pages-error-404.html">
          <i class="bi bi-dash-circle"></i>
          <span>Error 404</span>
        </a>
      </li><!-- End Error 404 Page Nav -->

      <li class="nav-item">
        <a class="nav-link collapsed" href="pages-blank.html">
          <i class="bi bi-file-earmark"></i>
          <span>Blank</span>
        </a>
      </li><!-- End Blank Page Nav -->

    </ul>

  </aside>