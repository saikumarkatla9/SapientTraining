<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	.pass{
		color:blue;
		
	}
	.fail{
		color:red;
	}
</style>
</head>
<body>

<c:if test="${ param.txtage>=20 && param.txtage<=23 && (param.txtqual=='be' || param.txtqual=='btech')}">
	<c:set var="result" value="<span class='pass'>Eligible</span>"/>
</c:if>

<c:if test="${ param.txtage<20 || param.txtage>23 || (param.txtqual!='be' && param.txtqual!='btech')}">
	<c:set var="result" value="<span class='fail'>Not Eligible</span>"/>
</c:if>

<%@include file="Header.jsp" %>

<h1 align="center">Eligible Result</h1>

<form action="eligible">
	<table cellpadding="10" bgcolor="wheat" style="margin:0 auto">
		<tr>
			<td>Employee Name</td>
			<td>${param.txtname}</td>
		</tr>
		<tr>
			<td>Age</td>
			<td>${param.txtage}</td>
		</tr>
		<tr>
			<td>Qual</td>
			<td>${param.txtqual}</td>
		</tr>
		
		<tr>
			<td>Eligible/NotEligible</td>
			<td>${result}</td>
		</tr>
	</table>
</form>
</body>
</html>