<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1>Rotas na Romênia</h1>
<div align="center">
	
	<form action="romenia">
	Origem:
	<select name="origem">
		<c:forEach var="rota" items="${cidades}" varStatus="id">
			<option >${rota }</option>
		</c:forEach>
	</select><br>
	Destino:<select name="destino">
		<c:forEach var="rota" items="${cidades}" varStatus="id">
			<option >${rota }</option>
		</c:forEach>
	</select><br>
	Tipo:
	<select name="tipo">
		<option value="1">DFS</option>
		<option value="2">BFS</option>
		<option value="3">DFSVisitados</option>
		<option value="4">DFSLimitado</option>
		<option value="5">DFSIterativo</option>
		<option value="6">Bidirecional</option>
	</select><br>Limite:
	<input type="text" name="limite" size="3" value="4">	
	<button type="submit">Pesquisar rota</button> 
	</form>
</div>


