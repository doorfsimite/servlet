
<%
	// JSP - java server page //scriplet
	
	String nomeEmpresa = (String)request.getAttribute("empresa");
%>

<html>
<body>
	Empresa: <% out.println(nomeEmpresa); %>, registrada com sucesso
</body>
</html>