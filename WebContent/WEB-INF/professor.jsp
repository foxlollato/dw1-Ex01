<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
import = "dw1s5.modelo.entidades.Usuario"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-BR">
	<head>
		<meta charset="UTF-8" />
		<title>Professor</title>
	</head>
	<body>
		<p>Professor</p>
		<c:out value="${usuario.email}"></c:out>
		<br/>		
		<a href="logout">Sair da aplicação</a>		
	</body>
</html>