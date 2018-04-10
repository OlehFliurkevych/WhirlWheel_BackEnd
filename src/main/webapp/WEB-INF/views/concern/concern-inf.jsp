<%@ include file="/WEB-INF/taglib.jsp" %>
<div class="container-fluid">
            <div class="row">
                <div class="image-aboutus-banner" style="margin-top:0px;margin-bottom: 20px;">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-12">
                                <h1 class="lg-text">${findedConcern.titleConcern}</h1>
                                <p class="image-aboutus-para" style="font-size: 18px;"><big><span style="color: #f74d12;">Whirl Wheel's</span></big> - help you to choose wheel!</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div style="margin-bottom: 20px;" class="container">
            <div class="row">
                <div class="col-sm-8">
                    <img style="border-radius: 10px;" src="${findedConcern.imagePath}" alt="" class="img-responsive">
                </div>
                <div style="padding-top: 20px;" class="col-sm-4">
                    <p style="text-align: center;font-size: 25px;">General motors</p>
                    <ul>
                        <li>Country : ${findedConcern.country.titleCountry}</li>
                        <li>Brands :
                            <ul>
                            	<c:forEach items="${findedConcern.brands}" var="b">
                                <li>${b.titleBrand}</li>
                                </c:forEach>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="container" style="margin-top: 40px;">
            <div class="row" style="padding: 0px 10px;">
                <p style="text-align: center;font-size: 22px;">About <span style="color:#f74d12;"><b>${findedConcern.titleConcern}</b></span></p>
                <hr style="margin-top: 10px;">
                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum</p>
            </div>
        </div>
        <div class="container" style="margin-top: 40px;">
            <div class="row">
                <p style="text-align: center;font-size: 22px;">Some brand which belong to <span style="color:#f74d12;"><b>${findedConcern.titleConcern}</b></span></p>
                <hr style="margin-top: 10px;">
            </div>
            <div style="margin-top: 10px;" class="newsRow row">
                <div class="col-sm-6 col-md-3">
                    <div class="col-md-12 feature-box">
                        <img class="img-responsive" src="${pageContext.request.contextPath}/resources/img/chrysler_group.jpg" alt="">
                        <h4>Ford</h4>
                        <a href=""><button type="button" class="btn btn-primary site-btn">View Right Now</button></a>

                    </div>
                </div>
                <!-- End Col -->
                <div class="col-sm-6 col-md-3">
                    <div class="col-md-12 feature-box">
                        <img class="img-responsive" src="${pageContext.request.contextPath}/resources/img/renault_group.jpg" alt="">
                        <h4>Renault</h4>
                        <a href=""><button type="button" class="btn btn-primary site-btn">View Right Now</button></a>
                    </div>
                </div>
                <!-- End Col -->

                <div class="col-sm-6 col-md-3">
                    <div class="feature-box">
                        <img class="img-responsive" src="${pageContext.request.contextPath}/resources/img/peugeot_group.jpg" alt="">
                        <h4>Peugout</h4>
                        <a href=""><button type="button" class="btn btn-primary site-btn">View Right Now</button></a>
                    </div>
                </div>
                <!-- End Col -->
                <div class="col-sm-6 col-md-3">
                    <div class="col-md-12 feature-box">
                        <img class="img-responsive" src="${pageContext.request.contextPath}/resources/img/fiat_group.jpg" alt="">
                        <h4>Fiat</h4>
                        <a href=""><button type="button" class="btn btn-primary site-btn">View Right Now</button></a>
                    </div>
                </div>
                <!-- End Col -->
            </div>
        </div>
        <div class="cta-sektion padding35 bg-blue">
            <div class="container">
                <div class="row">
                    <div class="col-md-9 col-sm-12 col-xs-12">
                        <h3>Do you want to see all brands, which belong to ${findedConcern.titleConcern} ?</h3>
                    </div>
                    <div class="col-md-3 col-sm-12 col-xs-12 Tpadding10">
                        <a href=""><button type="button" class="btn btn-primary site-btn">View Right Now</button></a>
                    </div>
                </div>
            </div>
        </div>