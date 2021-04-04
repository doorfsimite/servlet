<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="linkEntradaServlet" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${linkEntradaServlet}" method="post">
		Nome: <input type="text" name="nome" /> Data: <input type="text"
			name="date" /> <input type="text" name="acao" value="NovaEmpresa" />
		<input type="submit" />
	</form>

</body>
</html>