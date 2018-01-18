<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>IAWeb</title>
<%@ include file="parts/header.jsp"%>
</head>
<body>
	<div class="container">
		<div class="view">
			<div class="pages">
				<jsp:include page="${activePage}.jsp"></jsp:include>
			</div>
		</div>
	</div>
	<%@ include file="parts/footer.jsp"%>
</body>