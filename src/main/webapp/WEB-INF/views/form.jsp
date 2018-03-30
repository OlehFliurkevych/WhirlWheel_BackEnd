<%@ include file="/WEB-INF/taglib.jsp" %>
	<h1>Spring Boot file upload example</h1>
            <form:form method="POST" 
            action="/upload" 
            enctype="multipart/form-data">
                <input type="file" name="file" /><br/><br/>
                <input type="submit" value="Submit" />
            </form:form>
            <%-- <div th:if="${message}">
                <h2 th:text="${message}"/><br/><br/>
            </div> --%>
            <%-- <div th:if="${imageurl} != null"> --%>
                <img src="${imageurl}" />
                <hr />
            <!-- </div> -->