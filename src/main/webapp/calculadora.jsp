<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int valor1 = 10;
		int valor2 = 15;
		int resultado = valor1 + valor2;
		out.println("O resultado é: " + resultado);
		out.println("O resultado 2 é: " + resultado);
	%>
	<br/>
	<%= "TESTE: O resultado é: " + resultado %>
	
</body>
</html>