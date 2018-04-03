<%@ include file="/WEB-INF/taglib.jsp" %>

  <div class="container">
	<div class="row"><div class="col-sm-6 col-sm-offset-3"><p style="font-size:30px;text-align:center;">Admin Access</p></div></div>
	<div class="row">
		<div class="col-sm-6 col-sm-offset-3">
		<c:if test="${param.fail}">
						<div style="color: red;" class="text-center">
							Fail to authorize
						</div>
					</c:if>
					<%-- <sec:authorize access="isAuthenticated()">
		<sec:authentication property="principal.username" var="username"/>
		Admin authenticated:  ${username}
		<c:url var="logoutUrl" value="/logout" />
		<form:form action="${logoutUrl}" method="post">
			<li><input type="submit" value="Logout" /></li>
		</form:form>
	</sec:authorize> --%>
<form:form 
	class="form-horizontal" 
	action="/login"
	method="POST"
	>
<fieldset>
  <div class="form-group">
    <label class="control-label col-sm-2" for="name">Name:</label>
    <div class="col-sm-10">
      <input name="name" class="form-control" id="name" placeholder="Enter name">
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="pwd">Password:</label>
    <div class="col-sm-10"> 
      <input name="password" type="password" class="form-control" id="pwd" placeholder="Enter password">
    </div>
  </div>
  <div class="form-group"> 
    <div class="col-sm-offset-2 col-sm-10">
      <div class="checkbox">
        <label><input name="rememberMe" type="checkbox"> Remember me</label>
      </div>
    </div>
  </div>
  <div class="form-group"> 
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-success">Sign in</button>
      <a href="${rootUrl}/admin/profile">Profile</a>
    </div>
  </div>
  </fieldset>
</form:form>
</div>
</div>
	</div>