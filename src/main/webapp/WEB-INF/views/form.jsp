<%@ include file="/WEB-INF/taglib.jsp" %>
	<h1>Spring Boot file upload example</h1>
            <form:form method="POST" 
            action="/admin/upload" 
            enctype="multipart/form-data"
            modelAttribute="imageModel">
                <input type="file" path="file"  name="file"></input><br/><br/>
                <form:input type="text" path="description" name="description"></form:input>
                <form:button type="submit" value="Submit">Add</form:button>
                
            </form:form>
           <%--  <div th:if="${message}">
                <h2 th:text="${message}"/><br/><br/>
            </div>  --%>
            <%-- <div th:if="${imageurl} != null"> --%>
                <img src="${imageurl}" />
                <hr />
            <!-- </div> -->