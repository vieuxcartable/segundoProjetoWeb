<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alunos cadastrados</title>
</head>

<body>

	<table border="1">
		<tr>
			<th>Nome</th>
			<th>RM</th>
			<th>Turma</th>
		</tr>

		<c:forEach items="${listaAlunos}" var="aluno">
			<tr>
				<td>${aluno.nome}</td>
				<td>${aluno.rm}</td>
				<td>${aluno.turma}</td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>