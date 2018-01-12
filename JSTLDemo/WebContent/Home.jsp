<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	a{
		 background-color: blue;
   		color:white;
   		text-decoration: none;
   		padding: 5px;
   		border-radius: 5px;
   		box-shadow: 5px 5px 5px gray;

		
		
	}
	a:hover{
		text-shadow: aqua;
		background: yellow;
		color: black;
	}
</style>
</head>
<body>
<%-- <%@include file="Header.jsp" %> --%>
<jsp:include page="Header.jsp"/>
<h1 align="center">Home page</h1>

<table align="center" cellpadding="10" cellsapcing="20">
	<tr>
		<td><a href="TaxFrm.jsp">Tax Calculation</a></td>
	</tr>
	<tr>
		<td><a href="SkillFrm.jsp">update profile</a></td>
	</tr>
	<tr>
		<td><a href="QuizFrm.jsp">play quiz</a></td>
	</tr>
	<tr>
		<td><a href="EligibleFrm.jsp">Eligible for java developer?</a></td>
	</tr>
	<tr>
		<td><a href="downamex">Download Amex form</a></td>
	</tr>
</table>
</body>
</html>