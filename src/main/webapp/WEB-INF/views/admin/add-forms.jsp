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
                                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like). It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).
                                </p>
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
                                                                <th>${b.area.getTitleArea}</th>
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
                                               <a href="${rootUrl}/news/form"> <h3 style="text-align:center;margin-bottom: 30px;font-size: 35px;">Form for add news</h3></a>
                                            </div>
                                            
                                        </div>
                                    </div>
                                    <div class="tab-pane" id="concernPanel">
                                        <div class="container-fluid">
                                            <div class="row">
                                                <a href="${rootUrl}/concern/form"><h3 style="text-align:center;margin-bottom: 30px;font-size: 35px;">Form for add concern</h3></a>
                                            </div>
                                           
                                        </div>
                                    </div>
                                    <div class="tab-pane" id="brandPanel">
                                        <div class="container-fluid">
                                            <div class="row">
                                                <a href="${rootUrl}/brand/form"><h3 style="text-align:center;margin-bottom: 30px;font-size: 35px;">Form for add brand</h3></a>
                                            </div>
                                            
                                        </div>
                                    </div>
                                    <div class="tab-pane" id="modelPanel">
                                        <div class="container-fluid">
                                            <div class="row">
                                                <a href="${rootUrl}/model/form"><h3 style="text-align:center;margin-bottom: 30px;font-size: 35px;">Form for add model</h3></a>
                                            </div>
                                            
                                        </div>
                                    </div>
                                    <div class="tab-pane" id="countryPanel">
                                        <div class="container-fluid">
                                            <div class="row">
                                                <a href="${rootUrl}/country/form"><h3 style="text-align:center;margin-bottom: 30px;font-size: 35px;">Form for add country</h3></a>
                                            </div>
                                           
                                        </div>
                                    </div>
                                    <div class="tab-pane" id="areaPanel">
                                        <div class="container-fluid">
                                            <div class="row">
                                                <a href="${rootUrl}/area/form"><h3 style="text-align:center;margin-bottom: 30px;font-size: 35px;">Form for add area</h3></a>
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
                                                                <th>Headlind</th>
                                                                <th>Description</th>
                                                                <th>Link</th>
                                                                <th>Id Image</th>
                                                                <th>Delete</th>
                                                            </tr>
                                                        </thead>
                                                        <tbody>
                                                            <tr>
                                                                <th>1</th>
                                                                <th>Some head</th>
                                                                <th>Some description</th>
                                                                <th>Link</th>
                                                                <th>Id Image</th>
                                                                <th><i class="fa fa-minus-square"></i></th>
                                                            </tr>
                                                            <tr>
                                                                <th>2</th>
                                                                <th>Some head2</th>
                                                                <th>Some description2</th>
                                                                <th>Link2</th>
                                                                <th>Id Image2</th>
                                                                <th><i class="fa fa-minus-square"></i></th>
                                                            </tr>
                                                            <tr>
                                                                <th>3</th>
                                                                <th>Some head3</th>
                                                                <th>Some description3</th>
                                                                <th>Link3</th>
                                                                <th>Id Image3</th>
                                                                <th><i class="fa fa-minus-square"></i></th>
                                                            </tr>
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
                                                            <tr>
                                                                <th>Id 1</th>
                                                                <th>Title1</th>
                                                                <th>Country1</th>
                                                                <th>Description1</th>
                                                                <th>Path to image1</th>
                                                                <th><i class="fa fa-minus-square"></i></th>
                                                            </tr>
                                                            <tr>
                                                                <th>Id3</th>
                                                                <th>Title3</th>
                                                                <th>Country3</th>
                                                                <th>Descriptio3</th>
                                                                <th>Path to imag3</th>
                                                                <th><i class="fa fa-minus-square"></i></th>
                                                            </tr>
                                                            <tr>
                                                                <th>Id4</th>
                                                                <th>Title4</th>
                                                                <th>Country4</th>
                                                                <th>Description4</th>
                                                                <th>Path to image4</th>
                                                                <th><i class="fa fa-minus-square"></i></th>
                                                            </tr>
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
                                                <div class="panel-body">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</div>
                                            </div>
                                        </div>
                                        <div class="panel panel-info">
                                            <div class="panel-heading">
                                                <h4 class="panel-title">
                                                    <a data-toggle="collapse" data-parent="#accordion2" href="#tableModelsDelete">Table of models</a>
                                                </h4>
                                            </div>
                                            <div id="tableModelsDelete" class="panel-collapse collapse">
                                                <div class="panel-body">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</div>
                                            </div>
                                        </div>
                                        <div class="panel panel-info">
                                            <div class="panel-heading">
                                                <h4 class="panel-title">
                                                    <a data-toggle="collapse" data-parent="#accordion2" href="#tableAreasDelete">Table of area's</a>
                                                </h4>
                                            </div>
                                            <div id="tableAreasDelete" class="panel-collapse collapse">
                                                <div class="panel-body">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</div>
                                            </div>
                                        </div>
                                        <div class="panel panel-info">
                                            <div class="panel-heading">
                                                <h4 class="panel-title">
                                                    <a data-toggle="collapse" data-parent="#accordion2" href="#tableCountriesDelete">Table of countries</a>
                                                </h4>
                                            </div>
                                            <div id="tableCountriesDelete" class="panel-collapse collapse">
                                                <div class="panel-body">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</div>
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
