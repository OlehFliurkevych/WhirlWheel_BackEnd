<%@ include file="/WEB-INF/taglib.jsp" %>
	<c:url var="firstUrl" value="${pageContext.request.contextPath}/model/${brand.id}/list/pages/1?field=${sortByField}&sort=${sortDirection}&total=${totalPerPage}" />
	<c:url var="lastUrl" value="${pageContext.request.contextPath}/model/${brand.id}/list/pages/${coursesList.totalPages}?field=${sortByField}&sort=${sortDirection}&total=${totalPerPage}" />
	<c:url var="prevUrl" value="${pageContext.request.contextPath}/model/${brand.id}/list/pages/${currentIndex - 1}?field=${sortByField}&sort=${sortDirection}&total=${totalPerPage}" />
	<c:url var="nextUrl" value="${pageContext.request.contextPath}/model/${brand.id}/list/pages/${currentIndex + 1}?field=${sortByField}&sort=${sortDirection}&total=${totalPerPage}" />
<div class="container-fluid">
            <div class="row">
                <div class="image-aboutus-banner" style="margin-top:0px;margin-bottom: 20px;">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-12">
                                <h1 class="lg-text">${brand.titleBrand} models</h1>
                                <p class="image-aboutus-para" style="font-size: 18px;"><big><span style="color: #f74d12;">Whirl Wheel's</span></big> - help you to choose wheel!</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container">
        <form method="get" class="form-inline">
			<div class="form-group">
				<label class="sr-only" for="sortByField">Sort By Field</label> 
				<select class="form-control" id="sortByField" name = "field">
					<option value="${sortByField}">${sortByField}</option>
					<option value="id">Id</option>
					<option value="titleModel">Title</option>
				</select>
				
				<label class="sr-only" for="sortBy">Sort By</label> 
				<select class="form-control" id="sortBy" name = "sort">
					<option value="${sortDirection}">${sortDirection}</option>
					<option value="asc">ASC</option>
					<option value="desc">DESC</option>
				</select>
				
				<label class="sr-only" for="elementsBy">Results by page</label> 
				<select class="form-control" id="elementsBy" name = "total">
					<option value="${totalPerPage}">${totalPerPage}</option>
					<option value="6">6</option>
					<option value="12">12</option>
				</select>
				<input type="submit" value="Sort" class="btn btn-primary">
			</div>
		</form>
		</div>
<div class="container">
            <div style="margin-top: 10px;" class="newsRow row">
            <c:forEach items="${modelsListByPageSize}" var="model">
                <div class="col-sm-6 col-md-4">
                    <div class="col-md-12 feature-box">
                        <img class="img-responsive" src="${model.imagePath}" alt="">
                        <h4> ${model.titleModel}</h4>
                        <a href="${rootURL}/model/${model.id}/inf"><button type="button" class="btn btn-primary site-btn">View Right Now</button></a>
                    </div>
                </div>
                </c:forEach>
            </div>
<!--             <hr>-->
            <div style="text-align: center;" class="row">
                <ul class="pagination">
			<c:choose>
				<c:when test="${currentIndex == 1}">
					<li class="disabled"><a href="#">&lt;&lt;</a></li>
					<li class="disabled"><a href="#">&lt;</a></li>
					<li class="disabled"><a href="${firstUrl}">1</a></li>
				</c:when>
				<c:otherwise>
					<li><a href="${firstUrl}">&lt;&lt;</a></li>
					<li><a href="${prevUrl}">&lt;</a></li>
				</c:otherwise>
			</c:choose>
			<c:forEach var="i" begin="${beginIndex}" end="${endIndex}">
				<c:url var="pageUrl" value="${pageContext.request.contextPath}/model/${brand.id}/list/pages/${i+1}" />
				<c:choose>
					<c:when test="${i+1 == currentIndex}">
						<li class="disabled"><a href="${pageUrl}?field=${sortByField}&sort=${sortDirection}&total=${totalPerPage}"><c:out value="${i+1}" /></a></li>
					</c:when>
					<c:otherwise>
						<li><a href="${pageUrl}?field=${sortByField}&sort=${sortDirection}&total=${totalPerPage}"><c:out value="${i+1}" /></a></li>
					</c:otherwise>
				</c:choose>
			</c:forEach>

			<c:choose>
				<c:when test="${currentIndex == modelsList.totalPages}">
					<li class="disabled"><a href="#">&gt;</a></li>
					<li class="disabled"><a href="#">&gt;&gt;</a></li>
				</c:when>
				<c:otherwise>
					<li><a href="${nextUrl}">&gt;</a></li>
					<li><a href="${lastUrl}">&gt;&gt;</a></li>
				</c:otherwise>
			</c:choose>
		</ul> 
            </div>
        </div>
        <div style="margin-top: 30px;" class="cta-sektion padding35 bg-blue">
            <div class="container">
                <div class="row">
                    <div class="col-md-9 col-sm-12 col-xs-12">
                        <h3>Do you want to know more about ${brand.titleBrand} ?</h3>
                    </div>
                    <div class="col-md-3 col-sm-12 col-xs-12 Tpadding10">
                        <a href="${rootURL}/brand/${brand.id}/inf"><button type="button" class="btn btn-primary site-btn">View Right Now</button></a>
                    </div>
                </div>
            </div>
        </div>