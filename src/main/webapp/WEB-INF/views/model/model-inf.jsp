<%@ include file="/WEB-INF/taglib.jsp" %>
<div class="container-fluid">
            <div class="row">
                <div class="image-aboutus-banner" style="margin-top:0px;margin-bottom: 20px;">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-12">
                                <h1 class="lg-text">${findedModel.brand.titleBrand} ${findedModel.titleModel}</h1>
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
                    <img style="border-radius: 10px;" src="${findedModel.imagePath}" alt="" class="img-responsive">
                </div>
                <div style="padding-top: 20px;" class="col-sm-4">
                    <p style="text-align: center;font-size: 25px;">${findedModel.brand.titleBrand} ${findedModel.titleModel}</p>
                    <ul>
                        <li>Brand : ${findedModel.brand.titleBrand}</li>
                        <li>Title: ${findedModel.titleModel}</li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="container" style="margin-top: 40px;">
            <div class="row" style="padding: 0px 10px;">
                <p style="text-align: center;font-size: 22px;">About <span style="color:#f74d12;"><b>${findedModel.brand.titleBrand} ${findedModel.titleModel}</b></span></p>
                <hr style="margin-top: 10px;">
                <p>${findedModel.description} </p>
            </div>
        </div>
        <div style="margin-top: 30px;" class="cta-sektion padding35 bg-blue">
            <div class="container">
                <div class="row">
                    <div class="col-md-9 col-sm-12 col-xs-12">
                        <h3>Do you want to see all models, which belong to ${findedModel.brand.titleBrand} ?</h3>
                    </div>
                    <div class="col-md-3 col-sm-12 col-xs-12 Tpadding10">
                        <a href="${rootURL}/brand/${findedModel.id}/list/pages/1"><button type="button" class="btn btn-primary site-btn">View Right Now</button></a>
                    </div>
                </div>
            </div>
        </div>