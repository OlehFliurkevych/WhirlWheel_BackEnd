<%@ include file="/WEB-INF/taglib.jsp" %>
<div class="container-fluid">
            <div class="row">
                <div class="image-aboutus-banner" style="margin-top:0px;margin-bottom: 20px;">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-12">
                                <h1 class="lg-text">${findedNews.headline}</h1>
                                <p class="image-aboutus-para" style="font-size: 18px;"><big><span style="color: #f74d12;">Whirl Wheel's</span></big> - help you to choose wheel!</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div style="margin-bottom: 20px;" class="container">
            <div class="row">
                <div class="col-sm-12">
                    <img style="border-radius: 10px;" src="img/peugout_307.jpg" alt="" class="img-responsive">
                </div>
            </div>
        </div>
        <div class="container" style="margin-top: 40px;">
            <div class="row" style="padding: 0px 10px;">
                <p style="text-align: center;font-size: 22px;"><span style="color:#f74d12;"><b>headline</b></span></p>
                <hr style="margin-top: 10px;">
                <p>${findedNews.description}</p>
            </div>
        </div>
        <div style="margin-top: 30px;" class="cta-sektion padding35 bg-blue">
            <div class="container">
                <div class="row">
                    <div class="col-md-9 col-sm-12 col-xs-12">
                        <h3>Do you want to see more news ?</h3>
                    </div>
                    <div class="col-md-3 col-sm-12 col-xs-12 Tpadding10">
                        <a href="${rootURL}/news/list/pages/1"><button type="button" class="btn btn-primary site-btn">View Right Now</button></a>
                    </div>
                </div>
            </div>
        </div>