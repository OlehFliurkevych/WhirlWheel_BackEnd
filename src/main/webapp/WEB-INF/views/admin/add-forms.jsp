<%@ include file="/WEB-INF/taglib.jsp" %>

<a href="${rootUrl}/concern/form">Form for concern</a>

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
                                <li><a href="#panelView"><i class="fas fa-list-alt"></i> View</a></li>
                                <li><a href="#panelAdd"><i class="fas fa-plus-square"></i> Add</a></li>
                                <li><a href="#panelDelete"><i class="fa fa-minus-square"></i> Delete</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-9 col-md-9 col-sm-9">
                        <div id="panelHome" class="panel panel-primary">
                            <div class="panel-heading">Home</div>
                            <div class="panel-body">
                              	<div class="container-fluid">
                                    <div class="row">
                                        <p style="color: #2d2d2d;font-size: 20px;text-align: center;">Welcome to <span style="color: #f74d12;">Whirl Wheel's</span> admin page!
                                        </p>
                                    </div>
                                    <div class="row">
                                        <p style="font-size: 18px;text-align: left;margin-left: 10%;">
                                            You can:
                                        </p>
                                        <ul style="font-size: 18px;text-align: left;margin-left: 10%;">
                                            <li>add item(news, concern, model, brand, country, area);</li>
                                            <li>view items of each of objects;</li>
                                            <li>delete item(news, concern, model, brand, country, area);</li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="alert alert-danger" style="font-size: 18px;text-align: center;">
                                    <strong> Please enter verified information!</strong>    
                                </div>
                            </div>
                        </div>
                        <div id="panelView" class="panel panel-primary">
                            <div class="panel-heading"><i class="fas fa-list-alt"></i> View</div>
                            <div class="panel-body">
                                <div class="container-fluid">
                                    <div class="panel-group" id="accordion">
                                        <div class="panel panel-info">
                                            <div class="panel-heading">
                                                <h4 class="panel-title">
                                                    <a data-toggle="collapse" data-parent="#accordion" href="#tableNews">Table of news</a>
                                                </h4>
                                            </div>
                                            <div id="tableNews" class="panel-collapse collapse in">
                                                <div class="panel-body">
                                                    <table class="table table-condensed">
                                                        <thead>
                                                            <tr>
                                                                <th>Id</th>
                                                                <th>Headline</th>
                                                                <th>Description</th>
                                                                <th>Link</th>
                                                                <th>Id Image</th>
                                                            </tr>
                                                        </thead>
                                                        <tbody>
                                                        <c:forEach items="${listNews}" var="n">
                                                            <tr>
                                                                <th>${n.id}</th>
                                                                <th>${n.headline}</th>
                                                                <th>${n.description}</th>
                                                                <th>${n.link}</th>
                                                                <th>${n.imagePath}</th>
                                                            </tr>
                                                         </c:forEach>   
                                                        </tbody>
                                                    </table>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="panel panel-info">
                                            <div class="panel-heading">
                                                <h4 class="panel-title">
                                                    <a data-toggle="collapse" data-parent="#accordion" href="#tableConcerns">Table of concerns</a>
                                                </h4>
                                            </div>
                                            <div id="tableConcerns" class="panel-collapse collapse">
                                                <div class="panel-body">
                                                    <table class="table table-hover">
                                                        <thead>
                                                            <tr>
                                                                <th>Id</th>
                                                                <th>Title</th>
                                                                <th>Country</th>
                                                                <th>Description</th>
                                                                <th>Path to image</th>
                                                            </tr>
                                                        </thead>
                                                        <tbody>
                                                        <c:forEach items="${listConcerns}" var="c">
                                                            <tr>
                                                                <th>${c.id}</th>
                                                                <th>${c.titleConcern}</th>
                                                                <th>${c.country.titleCountry}</th>
                                                                <th>${c.description}</th>
                                                                <th>${c.imagePath}</th>
                                                            </tr>
                                                          </c:forEach>  
                                                        </tbody>
                                                    </table>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="panel panel-info">
                                            <div class="panel-heading">
                                                <h4 class="panel-title">
                                                    <a data-toggle="collapse" data-parent="#accordion" href="#tableBrands">Table of brands</a>
                                                </h4>
                                            </div>
                                            <div id="tableBrands" class="panel-collapse collapse">
                                                <div class="panel-body">
                                                	<table class="table table-hover">
                                                        <thead>
                                                            <tr>
                                                                <th>Id</th>
                                                                <th>Title</th>
                                                                <th>Concern</th>
                                                                <th>Country</th>
                                                                <th>Area</th>
                                                                <th>Description</th>
                                                                <th>Path to image</th>
                                                            </tr>
                                                        </thead>
                                                        <tbody>
                                                        <c:forEach items="${listBrands}" var="b">
                                                            <tr>
                                                                <th>${b.id}</th>
                                                                <th>${b.titleBrand}</th>
                                                                <th>${b.concern.titleConcern}</th>
                                                                <th>${b.country.titleCountry}</th>
                                                                <th>${b.area.titleArea}</th>
                                                                <th>${b.description}</th>
                                                                <th>${b.imagePath}</th>
                                                            </tr>
                                                          </c:forEach>  
                                                        </tbody>
                                                    </table>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="panel panel-info">
                                            <div class="panel-heading">
                                                <h4 class="panel-title">
                                                    <a data-toggle="collapse" data-parent="#accordion" href="#tableModels">Table of models</a>
                                                </h4>
                                            </div>
                                            <div id="tableModels" class="panel-collapse collapse">
                                                <div class="panel-body">
                                                	<table class="table table-hover">
                                                        <thead>
                                                            <tr>
                                                                <th>Id</th>
                                                                <th>Title</th>
                                                                <th>Brand</th>
                                                                <th>Description</th>
                                                                <th>Path to image</th>
                                                            </tr>
                                                        </thead>
                                                        <tbody>
                                                        <c:forEach items="${listModels}" var="m">
                                                            <tr>
                                                                <th>${m.id}</th>
                                                                <th>${m.titleModel}</th>
                                                                <th>${m.brand.titleBrand}</th>
                                                                <th>${m.description}</th>
                                                                <th>${m.imagePath}</th>
                                                            </tr>
                                                          </c:forEach>  
                                                        </tbody>
                                                    </table>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="panel panel-info">
                                            <div class="panel-heading">
                                                <h4 class="panel-title">
                                                    <a data-toggle="collapse" data-parent="#accordion" href="#tableAreas">Table of area's</a>
                                                </h4>
                                            </div>
                                            <div id="tableAreas" class="panel-collapse collapse">
                                                <div class="panel-body">
                                                	<table class="table table-hover">
                                                        <thead>
                                                            <tr>
                                                                <th>Id</th>
                                                                <th>Title</th>
                                                            </tr>
                                                        </thead>
                                                        <tbody>
                                                        <c:forEach items="${listAreas}" var="a">
                                                            <tr>
                                                                <th>${a.id}</th>
                                                                <th>${a.titleArea}</th>
                                                            </tr>
                                                         </c:forEach>
                                                        </tbody>
                                                    </table>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="panel panel-info">
                                            <div class="panel-heading">
                                                <h4 class="panel-title">
                                                    <a data-toggle="collapse" data-parent="#accordion" href="#tableCountries">Table of countries</a>
                                                </h4>
                                            </div>
                                            <div id="tableCountries" class="panel-collapse collapse">
                                                <div class="panel-body">
                                                	<table class="table table-hover">
                                                        <thead>
                                                            <tr>
                                                                <th>Id</th>
                                                                <th>Title</th>
                                                            </tr>
                                                        </thead>
                                                        <tbody>
                                                        <c:forEach items="${listCountries}" var="c">
                                                            <tr>
                                                                <th>${c.id}</th>
                                                                <th>${c.titleCountry}</th>
                                                            </tr>
                                                         </c:forEach>
                                                        </tbody>
                                                    </table>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div id="panelAdd" class="panel panel-primary">
                            <div class="panel-heading">
                                <h3 class="panel-title"><i class="fas fa-plus-square"></i> Add</h3>
                                <span class="pull-right">
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
                                                    <form:form action="${rootURL}/news/save" 
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
                                                            <form:label path="imagePath" class="control-label col-md-3 col-sm-3">Image</form:label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <input path="imagePath" name="image" type="file" class="form-control"></input>
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
                                    <div class="tab-pane" id="concernPanel">
                                        <div class="container-fluid">
                                            <div class="row">
                                                <h3 style="text-align:center;margin-bottom: 30px;font-size: 35px;">Form for add concern</h3>
                                            </div>
                                            <div class="row">

                                                <div class="col-md-8 col-lg-8 col-sm-10 col-sm-offset-1 col-md-offset-2 col-lg-offset-2">
                                                    <form:form action="${pageContext.request.contextPath}/concern/save" 
                                                    		class="form-horizontal"
                                                    		method="POST"
                                                    		enctype="multipart/form-data"
                                                    		modelAttribute="concernModel">
                                                        <div class="form-group">
                                                            <form:label path="titleConcern" for="title" class="control-label col-md-3 col-sm-3">Title </form:label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <form:input path="titleConcern" type="text" class="form-control" placeholder="Enter concern title" name="title"></form:input>
                                                            </div>
                                                        </div>
                                                       <div class="form-group">
                                                            <form:label path="country" for="country" class="control-label col-md-3 col-sm-3">Country</form:label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <form:select items="${listCountries}" itemLabel="titleCountry" itemValue="id"  path="country" class="form-control">
                                									<%-- <form:option value="NULL" disabled selected >Select country</form:option> --%>
                           										 </form:select>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <form:label path="description" for="description" class="control-label col-md-3 col-sm-3">Description</form:label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <form:textarea path="description" class="form-control" id="" cols="30" rows="10" placeholder="Enter description about concern"></form:textarea>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <form:label path="imagePath" for="image" class="control-label col-md-3 col-sm-3">Image
                                                        </form:label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <input path="imagePath" name="image" type="file" class="form-control"/>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-6 col-md-offset-3 col-lg-6 col-lg-offset-3 col-sm-6 col-sm-offset-3 col-xs-3">
                                                                <input type="submit" class="btn btn-success" value="Add">
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
                                                    <form:form action="${pageContext.request.contextPath}/brand/save" 
                                                    		class="form-horizontal"
                                                    		method="POST"
                                                    		enctype="multipart/form-data"
                                                    		modelAttribute="brandModel">
                                                        <div class="form-group">
                                                            <form:label path="titleBrand" for="title" class="control-label col-md-3 col-sm-3">Title </form:label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <form:input path="titleBrand" type="text" class="form-control" placeholder="Enter concern title" name="title"></form:input>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label for="" class="control-label col-md-3 col-sm-3">Concern</label>
                                                            <div class="col-md-6 col-sm-6">
                                                                <form:select items="${listConcerns}" itemLabel="titleConcern" itemValue="id" path="concern" class="form-control">
                           										</form:select>
                                                            </div>
                                                        </div>
                                                       <div class="form-group">
                                                            <form:label path="country" for="country" class="control-label col-md-3 col-sm-3">Country</form:label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <form:select items="${listCountries}" itemLabel="titleCountry" itemValue="id"  path="country" class="form-control">						 
                           										 </form:select>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <form:label path="country" for="country" class="control-label col-md-3 col-sm-3">Area</form:label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <form:select items="${listAreas}" itemLabel="titleArea" itemValue="id"  path="area" class="form-control">						 
                           										 </form:select>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <form:label path="description" for="description" class="control-label col-md-3 col-sm-3">Description</form:label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <form:textarea path="description" class="form-control" id="" cols="30" rows="10" placeholder="Enter description about concern"></form:textarea>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <form:label path="imagePath" name="image" for="image" class="control-label col-md-3 col-sm-3">Image
                                                        </form:label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <input path="imagePath" name="image" type="file" class="form-control"></input>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-6 col-md-offset-3 col-lg-6 col-lg-offset-3 col-sm-6 col-sm-offset-3 col-xs-3">
                                                                <input type="submit" class="btn btn-success" value="Add">
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
                                                   <form:form action="${rootURL}/model/save" 
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
                                                                <form:select items="${listBrands}" itemLabel="titleBrand" itemValue="id" path="brand" class="form-control">
                                									
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
                                                            <form:label path="imagePath" name="image" class="control-label col-md-3 col-sm-3">Image
                                                        </form:label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <input path="imagePath" name="image" type="file" class="form-control"></input>
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
                                                    	<form:form action="${rootURL}/country/save" 
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
                                                    	<form:form action="${rootURL}/area/save" 
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
                                <div class="container-fluid">
                                    <div class="panel-group" id="accordion2">
                                        <div class="panel panel-info">
                                            <div class="panel-heading">
                                                <h4 class="panel-title">
                                                    <a data-toggle="collapse" data-parent="#accordion2" href="#tableNewsDelete">Table of news</a>
                                                </h4>
                                            </div>
                                            <div id="tableNewsDelete" class="panel-collapse collapse in">
                                                <div class="panel-body">
                                                    <table class="table table-condensed">
                                                        <thead>
                                                            <tr>
                                                                <th>Id</th>
                                                                <th>Headline</th>
                                                                <th>Description</th>
                                                                <th>Link</th>
                                                                <th>Id Image</th>
                                                                <th>Delete</th>
                                                            </tr>
                                                        </thead>
                                                        <tbody>
                                                        <c:forEach items="${listNews}" var="n">
                                                            <tr>
                                                                <th>${n.id}</th>
                                                                <th>${n.headline}</th>
                                                                <th>${n.description}</th>
                                                                <th>${n.link}</th>
                                                                <th>${n.imagePath}</th>
                                                                <th><a href="${pageContext.request.contextPath}/news/${n.id}/delete"><i class="fa fa-minus-square"></i></a></th>
                                                            </tr>
                                                         </c:forEach>   
                                                        </tbody>
                                                    </table>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="panel panel-info">
                                            <div class="panel-heading">
                                                <h4 class="panel-title">
                                                    <a data-toggle="collapse" data-parent="#accordion2" href="#tableConcernsDelete">Table of concerns</a>
                                                </h4>
                                            </div>
                                            <div id="tableConcernsDelete" class="panel-collapse collapse">
                                                <div class="panel-body">
                                                    <table class="table table-hover">
                                                        <thead>
                                                            <tr>
                                                                <th>Id</th>
                                                                <th>Title</th>
                                                                <th>Country</th>
                                                                <th>Description</th>
                                                                <th>Path to image</th>
                                                                <th>Delete</th>
                                                            </tr>
                                                        </thead>
                                                        <tbody>
                                                        <c:forEach items="${listConcerns}" var="c">
                                                            <tr>
                                                                <th>${c.id}</th>
                                                                <th>${c.titleConcern}</th>
                                                                <th>${c.country.titleCountry}</th>
                                                                <th>${c.description}</th>
                                                                <th>${c.imagePath}</th>
                                                                <th><a href="${pageContext.request.contextPath}/concern/${c.id}/delete"><i class="fa fa-minus-square"></i></a></th>
                                                            </tr>
                                                          </c:forEach>  
                                                        </tbody>
                                                    </table>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="panel panel-info">
                                            <div class="panel-heading">
                                                <h4 class="panel-title">
                                                    <a data-toggle="collapse" data-parent="#accordion2" href="#tableBrandsDelete">Table of brands</a>
                                                </h4>
                                            </div>
                                            <div id="tableBrandsDelete" class="panel-collapse collapse">
                                                <div class="panel-body">
                                                	<table class="table table-hover">
                                                        <thead>
                                                            <tr>
                                                                <th>Id</th>
                                                                <th>Title</th>
                                                                <th>Concern</th>
                                                                <th>Country</th>
                                                                <th>Area</th>
                                                                <th>Description</th>
                                                                <th>Path to image</th>
                                                                <th>Delete</th>
                                                            </tr>
                                                        </thead>
                                                        <tbody>
                                                        <c:forEach items="${listBrands}" var="b">
                                                            <tr>
                                                                <th>${b.id}</th>
                                                                <th>${b.titleBrand}</th>
                                                                <th>${b.concern.titleConcern}</th>
                                                                <th>${b.country.titleCountry}</th>
                                                                <th>${b.area.titleArea}</th>
                                                                <th>${b.description}</th>
                                                                <th>${b.imagePath}</th>
																<th><a href="${pageContext.request.contextPath}/brand/${b.id}/delete"><i class="fa fa-minus-square"></i></a></th>
                                                                
                                                            </tr>
                                                          </c:forEach>  
                                                        </tbody>
                                                    </table>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="panel panel-info">
                                            <div class="panel-heading">
                                                <h4 class="panel-title">
                                                    <a data-toggle="collapse" data-parent="#accordion2" href="#tableModelsDelete">Table of models</a>
                                                </h4>
                                            </div>
                                            <div id="tableModelsDelete" class="panel-collapse collapse">
                                                <div class="panel-body">
                                                	<table class="table table-hover">
                                                        <thead>
                                                            <tr>
                                                                <th>Id</th>
                                                                <th>Title</th>
                                                                <th>Brand</th>
                                                                <th>Description</th>
                                                                <th>Path to image</th>
                                                                <th>Delete</th>
                                                            </tr>
                                                        </thead>
                                                        <tbody>
                                                        <c:forEach items="${listModels}" var="m">
                                                            <tr>
                                                                <th>${m.id}</th>
                                                                <th>${m.titleModel}</th>
                                                                <th>${m.brand.titleBrand}</th>
                                                                <th>${m.description}</th>
                                                                <th>${m.imagePath}</th>
                                                                <th><a href="${pageContext.request.contextPath}/model/${m.id}/delete"><i class="fa fa-minus-square"></i></a></th>
                                                            </tr>
                                                          </c:forEach>  
                                                        </tbody>
                                                    </table>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="panel panel-info">
                                            <div class="panel-heading">
                                                <h4 class="panel-title">
                                                    <a data-toggle="collapse" data-parent="#accordion2" href="#tableAreasDelete">Table of area's</a>
                                                </h4>
                                            </div>
                                            <div id="tableAreasDelete" class="panel-collapse collapse">
                                                <div class="panel-body">
                                                	<table class="table table-hover">
                                                        <thead>
                                                            <tr>
                                                                <th>Id</th>
                                                                <th>Title</th>
                                                                <th>Delete</th>
                                                            </tr>
                                                        </thead>
                                                        <tbody>
                                                        <c:forEach items="${listAreas}" var="a">
                                                            <tr>
                                                                <th>${a.id}</th>
                                                                <th>${a.titleArea}</th>
                                                                <th><a href="${pageContext.request.contextPath}/area/${a.id}/delete"><i class="fa fa-minus-square"></i></a></th>
                                                            </tr>
                                                         </c:forEach>
                                                        </tbody>
                                                    </table>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="panel panel-info">
                                            <div class="panel-heading">
                                                <h4 class="panel-title">
                                                    <a data-toggle="collapse" data-parent="#accordion2" href="#tableCountriesDelete">Table of countries</a>
                                                </h4>
                                            </div>
                                            <div id="tableCountriesDelete" class="panel-collapse collapse">
                                                <div class="panel-body">
                                                	<table class="table table-hover">
                                                        <thead>
                                                            <tr>
                                                                <th>Id</th>
                                                                <th>Title</th>
                                                                <th>Delete</th>
                                                            </tr>
                                                        </thead>
                                                        <tbody>
                                                        <c:forEach items="${listCountries}" var="c">
                                                            <tr>
                                                                <th>${c.id}</th>
                                                                <th>${c.titleCountry}</th>
                                                                <th><a href="${pageContext.request.contextPath}/country/${c.id}/delete"><i class="fa fa-minus-square"></i></a></th>
                                                            </tr>
                                                         </c:forEach>
                                                        </tbody>
                                                    </table>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
