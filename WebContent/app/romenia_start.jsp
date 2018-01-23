<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1>Rotas na Romênia</h1>
<div class="container">
	
	<form action="romenia">
	<div class="form-group">
	Origem:
	<select name="origem" class="form-control">
		<c:forEach var="rota" items="${cidades}" varStatus="id">
			<option >${rota }</option>
		</c:forEach>
	</select><br>
	Destino:<select name="destino" class="form-control">
		<c:forEach var="rota" items="${cidades}" varStatus="id">
			<option >${rota }</option>
		</c:forEach>
	</select><br>
	Tipo:
	<select name="tipo" class="form-control">
		<option value="1">DFS</option>
		<option value="2">BFS</option>
		<option value="3">DFSVisitados</option>
		<option value="4">DFSLimitado</option>
		<option value="5">DFSIterativo</option>
		<option value="6">Bidirecional</option>
		<option value="7">Custo Uniforme</option>
		<option value="8">Guloso Heuristico</option>
		<option value="9">A*</option>
	</select><br>Limite:
	<input type="text" name="limite" size="3" value="4" class="form-control">
	</div>
	<div class="form-group">
	<button type="submit" class="btn btn-primary">Pesquisar rota</button>
	</div>
	</form>
</div>


