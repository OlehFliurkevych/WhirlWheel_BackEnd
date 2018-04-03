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
                                                                <form:input path="imagePath" name="image" type="file" class="form-control"></form:input>
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
                                                 </div>
                                                 </div>
                                                