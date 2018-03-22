<%@ include file="/WEB-INF/taglib.jsp" %>
<nav  class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span> </button>
                    <a id="brand" class="navbar-brand" href="/index.html"><img class="logo img-responsive" src="${pageContext.request.contextPath}/resources/img/logo.png" alt=""></a>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a class="active" href="${pageContext.request.contextPath}/home">home</a></li>
                        <li><a href="${pageContext.request.contextPath}/news">news</a></li>
                        <li><a href="${pageContext.request.contextPath}/aboutus">about us</a></li>
                        <li><a href=""><i class="fa fa-search"></i></a></li>
                    </ul>
                </div>
            </div>
        </nav>