<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<html>
<body>
<h2>Loan list</h2>
	<c:forEach var="mortgageList" items="${mortgageList}">
<ul>

</ul>
</body>
</html>
