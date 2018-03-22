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
                                                    <form action="" class="form-horizontal">
                                                        <div class="form-group">
                                                            <label for="" class="control-label col-md-3 col-sm-3">Headlind </label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <input type="text" class="form-control" placeholder="Enter news headlings" name="title">
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label for="" class="control-label col-md-3 col-sm-3">Description</label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <textarea name="" class="form-control" id="" cols="30" rows="10" placeholder="Enter description about news"></textarea>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label for="" class="control-label col-md-3 col-sm-3">Link</label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <textarea name="" class="form-control" id="" cols="30" rows="5" placeholder="Enter link"></textarea>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label for="" class="control-label col-md-3 col-sm-3">Image
                                                        </label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <input path="file" type="file" class="form-control">
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-6 col-md-offset-3 col-lg-6 col-lg-offset-3 col-sm-6 col-sm-offset-3 col-xs-3">
                                                                <button class="btn btn-success">Add</button>
                                                            </div>
                                                        </div>

                                                    </form>
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
                                                    <form action="" class="form-horizontal">
                                                        <div class="form-group">
                                                            <label for="" class="control-label col-md-3 col-sm-3">Title </label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <input type="text" class="form-control" placeholder="Enter concern title" name="title">
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label for="" class="control-label col-md-3 col-sm-3">Country</label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <select class="form-control" name="" id="">
                                <option disabled selected>Select country</option>
                                <option value="">Germany</option>
                                <option value="">USA</option>
                            </select>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label for="" class="control-label col-md-3 col-sm-3">Description</label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <textarea name="" class="form-control" id="" cols="30" rows="10" placeholder="Enter description about concern"></textarea>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label for="" class="control-label col-md-3 col-sm-3">Image
                                                        </label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <input path="file" type="file" class="form-control">
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-6 col-md-offset-3 col-lg-6 col-lg-offset-3 col-sm-6 col-sm-offset-3 col-xs-3">
                                                                <button class="btn btn-success">Add</button>
                                                            </div>
                                                        </div>

                                                    </form>
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
                                                    <form action="" class="form-horizontal">
                                                        <div class="form-group">
                                                            <label for="" class="control-label col-md-3 col-sm-3">Title </label>
                                                            <div class="col-md-6 col-sm-6">
                                                                <input type="text" class="form-control" placeholder="Enter brand title" name="title">
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label for="" class="control-label col-md-3 col-sm-3">Concern</label>
                                                            <div class="col-md-6 col-sm-6">
                                                                <select title="" class="form-control" name="" id="">
                                <option disabled selected>Select concern</option>
                                <option value="">Toyota group</option>
                                <option value="">GM</option>
                                <option value="">Renault group</option>
                            </select>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label for="" class="control-label col-md-3 col-sm-3">Country</label>
                                                            <div class="col-md-6 col-sm-6">
                                                                <select class="form-control" name="" id="">
                                <option disabled selected>Select country</option>
                                <option value="">Germany</option>
                                <option value="">USA</option>
                            </select>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label for="" class="control-label col-md-3 col-sm-3">Area</label>
                                                            <div class="col-md-6 col-sm-6">
                                                                <select class="form-control" name="" id="">
                                <option disabled selected>Select area</option>
                                <option value="">Europa</option>
                                <option value="">Asia</option>
                                <option value="">Africa</option>
                            </select>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label for="" class="control-label col-md-3 col-sm-3">Description</label>
                                                            <div class="col-md-6 col-sm-6">
                                                                <textarea name="" class="form-control" id="" cols="30" rows="10" placeholder="Enter description about brand"></textarea>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label for="" class="control-label col-md-3 col-sm-3">Image
                                                        </label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <input path="file" type="file" class="form-control">
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-6 col-md-offset-3 col-lg-6 col-lg-offset-3 col-sm-6 col-sm-offset-3 col-xs-3">
                                                                <button class="btn btn-success">Add</button>
                                                            </div>
                                                        </div>
                                                    </form>
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
                                                    <form action="" class="form-horizontal">
                                                        <div class="form-group">
                                                            <label for="" class="control-label col-md-3 col-sm-3">Title </label>
                                                            <div class="col-md-6 col-sm-6">
                                                                <input type="text" class="form-control" placeholder="Enter model title" name="title">
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label for="" class="control-label col-md-3 col-sm-3">Brand</label>
                                                            <div class="col-md-6 col-sm-6">
                                                                <select class="form-control" name="" id="">
                                <option disabled selected>Select brand</option>
                                <option value="">Peugout</option>
                                <option value="">Volvo</option>
                                <option value="">Renault</option>
                            </select>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label for="" class="control-label col-md-3 col-sm-3">Description</label>
                                                            <div class="col-md-6 col-sm-6">
                                                                <textarea name="" class="form-control" id="" cols="30" rows="10" placeholder="Enter description about model"></textarea>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label for="" class="control-label col-md-3 col-sm-3">Image
                                                        </label>
                                                            <div class="col-lg-6 col-md-6 col-sm-6">
                                                                <input path="file" type="file" class="form-control">
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-6 col-md-offset-3 col-lg-6 col-lg-offset-3 col-sm-6 col-sm-offset-3 col-xs-3">
                                                                <button class="btn btn-success">Add</button>
                                                            </div>
                                                        </div>
                                                    </form>
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
                                                    <form action="" class="form-horizontal">
                                                        <div class="form-group">
                                                            <label for="" class="control-label col-md-3 col-sm-3">Title </label>
                                                            <div class="col-md-6 col-sm-6">
                                                                <input type="text" class="form-control" placeholder="Enter country title" name="title">
                                                            </div>
                                                        </div>
                                                        
                                                        <div class="form-group">
                                                            <div class="col-md-6 col-md-offset-3 col-lg-6 col-lg-offset-3 col-sm-6 col-sm-offset-3 col-xs-3">
                                                                <button class="btn btn-success">Add</button>
                                                            </div>
                                                        </div>
                                                    </form>
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
                                                    <form action="" class="form-horizontal">
                                                        <div class="form-group">
                                                            <label for="" class="control-label col-md-3 col-sm-3">Title </label>
                                                            <div class="col-md-6 col-sm-6">
                                                                <input type="text" class="form-control" placeholder="Enter area title" name="title">
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-6 col-md-offset-3 col-lg-6 col-lg-offset-3 col-sm-6 col-sm-offset-3 col-xs-3">
                                                                <button class="btn btn-success">Add</button>
                                                            </div>
                                                        </div>
                                                    </form>
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