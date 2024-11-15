<%-- 
    Document   : changepass
    Created on : Nov 14, 2024, 6:46:47 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!--nhung noi dung header.jsp-->
<jsp:include page="shared/header.jsp" />
<!--nhung noi dung nav.jsp-->
<jsp:include page="shared/nav.jsp" />

<div class="container">
     <h2>Change pass</h2>
<form action="ChangepassServlet" method="post">
    <div>
        <label>Old Pass</label>
        <input type="password" name="oldpass" value="" required="" class="form-control" />     
    </div>
    <div>
        <label>New Pass</label>
        <input type="password" name="newpass" value="" required="" class="form-control"/>        
    </div>
     <div>
        <label>Confirm new pass</label>
        <input type="password" name="confirmpass" value="" required="" class="form-control"/>        
    </div>
    
    <div class="mt-2 mb-2">
        <button type="submit" class="btn btn-primary">change pass</button>
    </div>
</form>
<%
    if (request.getAttribute("error") != null) {
%>
<div class="text-danger mb-3">
    <%=request.getAttribute("error")%>
</div>
<%
    }
%>
</div>
<jsp:include page="shared/footer.jsp"/>
