<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1>Mundo do Aspirador</h1>
<div align="center">
	
	<form action="aspirador">
	Origem:
	<select name="origem">
		<c:forEach var="estado" items="${estados}" varStatus="id">
			<option >${estado }</option>
		</c:forEach>
	</select><br>
	Destino:ELL, DLL<br>
	Tipo:
	<select name="tipo">
		<option value="1">DFS</option>
		<option value="2">BFS</option>
		<option value="3">DFSVisitados</option>
		<option value="4">DFSLimitado</option>
		<option value="5">DFSIterativo</option>
	</select><br>Limite:
	<input type="text" name="limite" size="3" value="4">	
	<button type="submit">Pesquisar solução</button> 
	</form>
</div>


