										<%@ include file="/WEB-INF/taglib.jsp" %>
										<form:form action="${rootUrl}/concern/save" 
                                                    		class="form-horizontal"
                                                    		method="POST"
                                                    		enctype="multipart/form-data"
                                                    		modelAttribute="concernModelRequest">
                                                        <div class="form-group">
                                                            <form:label path="title" for="title" class="control-label col-md-3 col-sm-3">Title </form:label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <form:input path="title" type="text" class="form-control" placeholder="Enter concern title" name="title"></form:input>
                                                            </div>
                                                        </div>
                                                       <%--  <div class="form-group">
                                                            <form:label path="country" for="country" class="control-label col-md-3 col-sm-3">Country</form:label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <form:select  path="country" class="form-control" items="${listCountries}" itemLabel="titleCountry">
                                									<form:option value="NULL" disabled selected >Select country</form:option>
                                									<c:forEach items="" var="country">
                                										<form:option path="country" value="${country.titleCountry}"></form:option>
                                									</c:forEach>							 
                           										 </form:select>
                                                            </div>
                                                        </div> --%>
                                                        <div class="form-group">
                                                            <form:label path="description" for="description" class="control-label col-md-3 col-sm-3">Description</form:label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <form:textarea path="description" class="form-control" id="" cols="30" rows="10" placeholder="Enter description about concern"></form:textarea>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <form:label path="image" for="image" class="control-label col-md-3 col-sm-3">Image
                                                        </form:label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <input path="image" name="image" type="file" class="form-control">
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-6 col-md-offset-3 col-lg-6 col-lg-offset-3 col-sm-6 col-sm-offset-3 col-xs-3">
                                                                <input type="submit" class="btn btn-success" value="Add">
                                                            </div>
                                                        </div>

                                                    </form:form>