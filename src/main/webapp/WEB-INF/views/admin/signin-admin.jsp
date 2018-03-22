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
<form:form 
	class="form-horizontal" 
	action="/admin/login"
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
	
<!--  <div class="row">
	<div class="col-md-4 col-md-offset-4">
		<div class="login-wrapper">
			<div class="box">
				<div class="content-wrap">
					
					<c:if test="${param.fail}">
						<div style="color: red;" class="text-center">
							Fail to authorize
						</div>
					</c:if>	
					
					<form:form action="/login" method="POST">
						<fieldset>
							<legend>Login</legend>
							
							<div class="form-group">
	  							<label class="control-label">E-mail address</label>
								<input name="email" type="email" class="form-control" title="E-mail address" />
								
								<label class="control-label">Password</label>
								<input name="password" type="password" class="form-control" title="Password" />
								
								<div class="col-sm-10">
									<div class="checkbox">
										<label><input type="checkbox" name="rememberMe"/> Remember me</label>
									</div>
								</div>
							</div>
														
							<div class="form-group">
								<span class="input-group-btn">
									<input type="submit" class="btn btn-primary btn-block">
								</span>
							</div>
						</fieldset>
					</form:form>
				</div>
			</div>

			<div class="already">
				<p>Don't have an account yet?
					<a href="${pageContext.request.contextPath}/register">Register</a>
				</p>
			</div>
		</div>
	</div>
</div>
-->