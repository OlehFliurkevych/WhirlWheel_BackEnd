<%@ include file="/WEB-INF/taglib.jsp" %>
	<h1>Spring Boot file upload example</h1>
            <form:form method="POST" 
            action="/admin/upload" 
            enctype="multipart/form-data"
            modelAttribute="imageModel">
                <form:input type="file" path="fileData"  name="fileData"></form:input><br/><br/>
                <form:button type="submit" value="Submit">Add</form:button>
                
            </form:form>
           <%--  <div th:if="${message}">
                <h2 th:text="${message}"/><br/><br/>
            </div>  --%>
            <%-- <div th:if="${imageurl} != null"> --%>
                <img src="${imageurl}" />
                <hr />
            <!-- </div> -->