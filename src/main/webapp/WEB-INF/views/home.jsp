<%@ include file="/WEB-INF/taglib.jsp" %>
<div id="headerwrap">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-8 col-md-8 col-sm-8 col-xs-8">
                        <p>Choose <br> your <span id="wheel">wheel!</span></p>
                    </div>
                    <div id="form" class="col-lg-4 col-md-4 col-sm-4">
                        <form:form 
                        	action="${rootURL}/concern/inf" 
                       		class="form-horizontal"
                       		modelAttribute="concernModel"
                       		method="GET">
                            <div class="form-group">
                                <div class="col-sm-10">
                           <form:select items="${listConcerns}" itemValue="id" itemLabel="titleConcern" path="id" class="selectConcern form-control input-sm" id="selconcern">
                                    <option value="-">Select concern</option>
                              			<%-- <c:forEach items="${listConcerns}" var="c">
                              				<option itemValue="id" itemLabel="titleConcern"></option>
                              			</c:forEach> --%>
                           </form:select>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-10">
                                    <button type="submit" class="btn btn-default btn-sm">Search concern</button>
                                </div>
                            </div>
                            </form:form>
                            <form:form 
                        		action="${rootURl}/brand/inf" 
                       			class="form-horizontal"
                       			method="GET"
                       			modelAttribute="brandModel">
                            <div class="form-group">
                                <div class="col-sm-10">
                           <form:select items="${listBrands}" itemLabel="titleBrand" itemValue="id" path="id" class="selectBrand form-control input-sm" id="selbrand">
                               				<option value="-">Select brand</option>
                           </form:select>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-10">
                                    <button type="submit" class="btn btn-default btn-sm">Search brand</button>
                                </div>
                            </div>
                            </form:form>
                           <form:form 
                        		action="${rootURL}/model/inf" 
                       			class="form-horizontal"
                       			method="GET"
                       			modelAttribute="modelModel">
                            <div class="form-group">
                                <div class="col-sm-10">
                                    <form:select items="${listModels}" itemLabel="titleModel" itemValue="id" path="id" class="selectModel form-control input-sm" id="selmodel">
                               				<option value="-">Select model</option>
                           </form:select>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-10">
                                    <button type="submit" class="btn btn-default btn-sm">Search model</button>
                                </div>
                            </div>
                        </form:form>
                    </div>
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="row">
                <div class="sl">
                <c:forEach items="${listConcerns}" var="c">
                    <div class="sl_slide"><a href="${rootURL}/concern/${c.id}/inf" class="sl_link">
                                <img src="${c.imagePath}" alt="" class="img-responsive sl_img" title="Concern ${c.titleConcern}">
                                <div class="sl_text container-fluid">
                                    <div class="row">
                                        <div class="col-lg-6 col-md-6 col-sm-8 col-xs-8 col-xs-offset-2 col-lg-offset-3 col-md-offset-3 col-sm-offset-2 text">
                                            <h3 class="sl_concern">${c.titleConcern}</h3>
                                            <p class="sl_description" style="word-wrap: break-word;">${c.description}</p>
                                        </div>
                                    </div>
                                </div>
                            </a></div>
                            </c:forEach>
                </div> 
            </div>
        </div>
        <div class="container" style="margin-top: 40px;">
        <div class="newsRow row" >
        <div class="row">
                <p style="text-align: center;font-size: 24px;">Some news</p>
                <hr style="margin-top: 10px;">
            </div>
        <c:forEach items="${listNews}" var="n">
                <div class="col-sm-6 col-md-4">
                    <div class="col-md-12 feature-box">
                        <img class="img-responsive" src="${n.imagePath}" alt="">
                        <h4>${n.headline}</h4>
                        <a href="${rootURL}/news/${n.id}/inf"><button type="button" class="btn btn-primary site-btn">View Right Now</button></a>
                    </div>
                </div>
         </c:forEach>      
            </div>
            </div>