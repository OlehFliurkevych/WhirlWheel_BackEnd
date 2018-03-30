<%@ include file="/WEB-INF/taglib.jsp" %>

<div class="container-fluid">
            <div data-spy="scroll" style="position: relative;" data-target="#MyScrollspy" data-offset="20" class="container-fluid">
                <div class="row">
                    <div id="myScrollspy" class="col-lg-3 col-md-3 col-sm-3">
                        <!-- It can be fixed with bootstrap affix http://getbootstrap.com/javascript/#affix-->
                        <div style="position: relative;" id="sidebar" class="well sidebar-nav">
                            <h5><i class="glyphicon glyphicon-home"></i> <i class="glyphicons glyphicons-delete"></i> MANAGEMENT
                            </h5>
                            <ul  class="nav nav-pills nav-stacked">
                                <li class="active"><a href="#panelHome">Home <i class="glyphicons glyphicons-delete"></i></a></li>
                                <li><a href="#panelView"><i class="fas fa-list-alt"></i> View  </a></li>
                                <li><a href="#panelAdd"><i class="fas fa-plus-square"></i> Add     </a></li>
                                <li><a href="#panelDelete"><i class="fa fa-minus-square"></i> Delete     </a></li>
                            </ul>
                            <!--
                        <h5><i class="glyphicon glyphicon-user"></i>
                            <small><b>USERS</b></small>
                        </h5>
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="#">List</a></li>
                            <li><a href="#">Manage</a></li>
                        </ul>
-->
                        </div>
                    </div>
                    <div class="col-lg-9 col-md-9 col-sm-9">
                        <div id="panelHome" class="panel panel-primary">
                            <div class="panel-heading">Home</div>
                            <div class="panel-body">
                                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like). It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).
                                </p>
                            </div>
                        </div>
                        <div id="panelView" class="panel panel-primary">
                            <div class="panel-heading"><i class="fas fa-list-alt"></i> View</div>
                            <div class="panel-body">
                                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like). It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).
                                </p>
                            </div>
                        </div>
                        <div id="panelAdd" class="panel panel-primary">
                            <div class="panel-heading">
                                <h3 class="panel-title"><i class="fas fa-plus-square"></i> Add</h3>
                                <span class="pull-right">
                        <!-- Tabs -->
                        <ul class="nav panel-tabs">
                            <li class="active"><a href="#newsPanel" data-toggle="tab">News</a></li>
                            <li><a href="#concernPanel" data-toggle="tab">Concern</a></li>
                            <li><a href="#brandPanel" data-toggle="tab">Brand</a></li>
                            <li><a href="#modelPanel" data-toggle="tab">Model</a></li>
                            <li><a href="#countryPanel" data-toggle="tab">Country</a></li>
                            <li><a href="#areaPanel" data-toggle="tab">Area</a></li>
                        </ul>
                    </span>
                            </div>
                            <div class="panel-body">
                                <div class="tab-content">
                                    <div class="tab-pane active" id="newsPanel">
                                        <div class="container-fluid">
                                            <div class="row">
                                                <h3 style="text-align:center;margin-bottom: 30px;font-size: 35px;">Form for add news</h3>
                                            </div>
                                            <div class="row">

                                                <div class="col-md-8 col-lg-8 col-sm-10 col-sm-offset-1 col-md-offset-2 col-lg-offset-2">
                                                    <form:form action="${rootURL}/admin/saveNews" 
                                                    		class="form-horizontal"
                                                    		method="POST"
                                                    		enctype="multipart/form-data"
                                                    		modelAttribute="newsModel">
                                                        <div class="form-group">
                                                            <form:label path="headline" for="" class="control-label col-md-3 col-sm-3">Headlind </form:label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <form:input type="text" path="headline" class="form-control" placeholder="Enter news headlings"></form:input>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <form:label path="description" class="control-label col-md-3 col-sm-3">Description</form:label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <form:textarea path="description" name="" class="form-control" cols="30" rows="10" placeholder="Enter description about news"></form:textarea>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <form:label path="link" class="control-label col-md-3 col-sm-3">Link</form:label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <form:textarea path="link" class="form-control" cols="30" rows="5" placeholder="Enter link"></form:textarea>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <form:label path="imageForNews" class="control-label col-md-3 col-sm-3">Image</form:label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <form:input modelAttribute="imageForNewsModel" path="imageForNews" multiple="multiple" type="file" class="form-control"></form:input>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-6 col-md-offset-3 col-lg-6 col-lg-offset-3 col-sm-6 col-sm-offset-3 col-xs-3">
                                                                <button ttpe="submit" class="btn btn-success">Add</button>
                                                            </div> 
                                                        </div>

                                                    </form:form>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="tab-pane" id="concernPanel">
                                        <div class="container-fluid">
                                            <div class="row">
                                                <h3 style="text-align:center;margin-bottom: 30px;font-size: 35px;">Form for add concern</h3>
                                            </div>
                                            <div class="row">

                                                <div class="col-md-8 col-lg-8 col-sm-10 col-sm-offset-1 col-md-offset-2 col-lg-offset-2">
                                                    <form:form action="${rootURL}/admin/saveConcern" 
                                                    		class="form-horizontal"
                                                    		method="POST"
                                                    		enctype="multipart/form-data"
                                                    		modelAttribute="concernModel">
                                                        <div class="form-group">
                                                            <form:label path="titleConcern" for="" class="control-label col-md-3 col-sm-3">Title </form:label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <form:input path="titleConcern" type="text" class="form-control" placeholder="Enter concern title" name="title"></form:input>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <form:label path="country" for="" class="control-label col-md-3 col-sm-3">Country</form:label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <form:select   path="country" class="form-control">
                                									<%-- <form:option value="NULL" disabled selected >Select country</form:option> --%>
                                									<c:forEach items="${listCountries}" var="country">
                                										<form:option path="country" value="${country.titleCountry}"></form:option>
                                									</c:forEach>							 
                           										 </form:select>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <form:label path="description" for="" class="control-label col-md-3 col-sm-3">Description</form:label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <form:textarea path="description" class="form-control" id="" cols="30" rows="10" placeholder="Enter description about concern"></form:textarea>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <form:label path="imageForConcern" class="control-label col-md-3 col-sm-3">Image
                                                        </form:label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <form:input path="imageForConcern" multiple="multiple" type="file" class="form-control"></form:input>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-6 col-md-offset-3 col-lg-6 col-lg-offset-3 col-sm-6 col-sm-offset-3 col-xs-3">
                                                                <button type="submit" class="btn btn-success">Add</button>
                                                            </div>
                                                        </div>

                                                    </form:form>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="tab-pane" id="brandPanel">
                                        <div class="container-fluid">
                                            <div class="row">
                                                <h3 style="text-align:center;margin-bottom: 30px;font-size: 35px;">Form for add brand</h3>
                                            </div>
                                            <div class="row">

                                                <div class="col-md-8 col-lg-8 col-sm-10 col-sm-offset-1 col-md-offset-2 col-lg-offset-2">
                                                    <form:form action="${rootURL}/admin/saveBrand" 
                                                    		class="form-horizontal"
                                                    		method="POST"
                                                    		enctype="multipart/form-data"
                                                    		modelAttribute="brandModel">
                                                        <div class="form-group">
                                                            <form:label path="titleBrand" class="control-label col-md-3 col-sm-3">Title </form:label>
                                                            <div class="col-md-6 col-sm-6">
                                                                <form:input path="titleBrand" type="text" class="form-control" placeholder="Enter brand title"></form:input>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <form:label path="concern" for="" class="control-label col-md-3 col-sm-3">Concern</form:label>
                                                            <div class="col-md-6 col-sm-6">
                                                                <form:select path="concern" class="form-control">
                                									<%-- <form:option value="undefined" disabled selected>Select concern</form:option> --%>
                                									<c:forEach items="${listConcerns}" var="concern">
                                										<form:option path="concern" value="${concern.titleConcern}"></form:option>
                                									</c:forEach>
                           										 </form:select>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <form:label path="" for="" class="control-label col-md-3 col-sm-3">Country</form:label>
                                                            <div class="col-md-6 col-sm-6">
                                                               <form:select   path="country" class="form-control">
                                									<%-- <form:option value="NULL" disabled selected >Select country</form:option> --%>
                                									<c:forEach items="${listCountries}" var="country">
                                										<form:option path="country" value="${country.titleCountry}"></form:option>
                                									</c:forEach>							 
                           										 </form:select>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <form:label path="area" class="control-label col-md-3 col-sm-3">Area</form:label>
                                                            <div class="col-md-6 col-sm-6">
                                                                <form:select path="area" class="form-control" name="" id="">
                                									<%-- <form:option value="undefined" disabled selected>Select area</form:option> --%>
                               										<c:forEach items="${listAreas}" var="a">
                               											<form:option value="${a.titleArea}"></form:option>
                               										</c:forEach>
                            									</form:select>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <form:label path="description" class="control-label col-md-3 col-sm-3">Description</form:label>
                                                            <div class="col-md-6 col-sm-6">
                                                                <form:textarea path="description" class="form-control" id="" cols="30" rows="10" placeholder="Enter description about brand"></form:textarea>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <form:label path="imageForBrand" class="control-label col-md-3 col-sm-3">Image
                                                        </form:label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <form:input path="imageForBrand" multiple="multiple" type="file" class="form-control"></form:input>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-6 col-md-offset-3 col-lg-6 col-lg-offset-3 col-sm-6 col-sm-offset-3 col-xs-3">
                                                                <button type="submit" class="btn btn-success">Add</button>
                                                            </div>
                                                        </div>
                                                    </form:form>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="tab-pane" id="modelPanel">
                                        <div class="container-fluid">
                                            <div class="row">
                                                <h3 style="text-align:center;margin-bottom: 30px;font-size: 35px;">Form for add model</h3>
                                            </div>
                                            <div class="row">

                                                <div class="col-md-8 col-lg-8 col-sm-10 col-sm-offset-1 col-md-offset-2 col-lg-offset-2">
                                                    <form:form action="${rootURL}/admin/saveModel" 
                                                    		class="form-horizontal"
                                                    		method="POST"
                                                    		enctype="multipart/form-data"
                                                    		modelAttribute="modelModel">
                                                        <div class="form-group">
                                                            <form:label path="titleModel" class="control-label col-md-3 col-sm-3">Title </form:label>
                                                            <div class="col-md-6 col-sm-6">
                                                                <form:input path="titleModel" type="text" class="form-control" placeholder="Enter model title"></form:input>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <form:label path="brand" class="control-label col-md-3 col-sm-3">Brand</form:label>
                                                            <div class="col-md-6 col-sm-6">
                                                                <form:select path="brand" class="form-control" name="" id="">
                                									<%-- <form:option value="undefined"  disabled selected>Select brand</form:option> --%>
                                									<c:forEach items="${listBrands}" var="b">
                                										<form:option path="brand" value="${b.titleBrand}"></form:option>
                                									</c:forEach>
                            									</form:select>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <form:label path="description" class="control-label col-md-3 col-sm-3">Description</form:label>
                                                            <div class="col-md-6 col-sm-6">
                                                                <form:textarea path="description" class="form-control" cols="30" rows="10" placeholder="Enter description about model"></form:textarea>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <form:label path="imageForModel" class="control-label col-md-3 col-sm-3">Image
                                                        </form:label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <form:input path="imageForModel" multiple="multiple" type="file" class="form-control"></form:input>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-6 col-md-offset-3 col-lg-6 col-lg-offset-3 col-sm-6 col-sm-offset-3 col-xs-3">
                                                                <button type="submit" class="btn btn-success">Add</button>
                                                            </div>
                                                        </div>
                                                    </form:form>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="tab-pane" id="countryPanel">
                                        <div class="container-fluid">
                                            <div class="row">
                                                <h3 style="text-align:center;margin-bottom: 30px;font-size: 35px;">Form for add country</h3>
                                            </div>
                                            <div class="row">

                                                <div class="col-md-8 col-lg-8 col-sm-10 col-sm-offset-1 col-md-offset-2 col-lg-offset-2">
                                                    <form:form action="${rootURL}/admin/saveCountry" 
                                                    		class="form-horizontal"
                                                    		method="POST"
                                                    		modelAttribute="countryModel">
                                                        <div class="form-group">
                                                            <form:label path="titleCountry" class="control-label col-md-3 col-sm-3">Title </form:label>
                                                            <div class="col-md-6 col-sm-6">
                                                                <form:input class="form-control" placeholder="Enter country title" path="titleCountry"></form:input>
                                                            </div>
                                                        </div>
                                                        
                                                        <div class="form-group">
                                                            <div class="col-md-6 col-md-offset-3 col-lg-6 col-lg-offset-3 col-sm-6 col-sm-offset-3 col-xs-3">
                                                                <button type="submit"  class="btn btn-success">Add</button>
                                                            </div>
                                                        </div>
                                                    </form:form>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="tab-pane" id="areaPanel">
                                        <div class="container-fluid">
                                            <div class="row">
                                                <h3 style="text-align:center;margin-bottom: 30px;font-size: 35px;">Form for add area</h3>
                                            </div>
                                            <div class="row">

                                                <div class="col-md-8 col-lg-8 col-sm-10 col-sm-offset-1 col-md-offset-2 col-lg-offset-2">
                                                    <form:form action="${rootURL}/admin/saveArea" 
                                                    		class="form-horizontal"
                                                    		method="POST"
                                                    		modelAttribute="areaModel">
                                                        <div class="form-group">
                                                            <form:label path="titleArea" class="control-label col-md-3 col-sm-3">Title </form:label>
                                                            <div class="col-md-6 col-sm-6">
                                                                <form:input type="text" class="form-control" placeholder="Enter area title" path="titleArea"/>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-6 col-md-offset-3 col-lg-6 col-lg-offset-3 col-sm-6 col-sm-offset-3 col-xs-3">
                                                                <button type="submit" class="btn btn-success">Add</button>
                                                            </div>
                                                        </div>
                                                    </form:form>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div id="panelDelete" class="panel panel-primary">
                            <div class="panel-heading"> <i class="fa fa-minus-square"></i> Delete</div>
                            <div class="panel-body">
                                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like). It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
