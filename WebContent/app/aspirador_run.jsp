<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1>Mundo do Aspirador</h1>
<div align="center">
	<h2>Caminho de ${origem } para ELL, DLL usando ${agenteTipo}<c:if test="${tipo==4 }"> com limite ${limite }</c:if></h2>
	<c:choose>
	<c:when test="${sucesso}">
		<ul>

			<c:forEach var="rota" items="${rota}" varStatus="id">
				<li>${rota.estado}</li>
			</c:forEach>

		</ul>
	</c:when>
		<c:otherwise>
			Não encontrou rota.
		</c:otherwise>
	</c:choose>
</div>


