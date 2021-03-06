<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="score" value="0" />
	<c:if test="${param.ques1 eq '4'}">
		<c:set var="score" value="${score+1 }"/>
	</c:if>
	<c:if test="${param.ques2 eq '1'}">
		<c:set var="score" value="${score+1 }"/>
	</c:if>
	<c:if test="${param.ques3 eq 'list'}">
		<c:set var="score" value="${score+1 }"/>
	</c:if>
	<c:if test="${param.ques4 eq 'set'}">
		<c:set var="score" value="${score+1 }"/>
	</c:if>
<c:set var="per" value="${score/4.0*100}"/>

<%@include file="Header.jsp" %>
<h1 align="center">Quiz Result</h1>


<table cellpadding="10" bgcolor="wheat" style="margin:0 auto">
		<tr>
			<td>no of questions answered correctly</td>
			<td>$(score)</td>
		</tr>
		<tr>
			<td>percentage</td>
			<td>$(per)
				<span style="font-weight:bold">%</span>
			</td>
		</tr>
		<tr>
			<td>Result</td>
			<td>
				<c:choose>
					<c:when test="$(per>=75)">
						<span class="pass">pass</span>
					</c:when>
					<c:when test="$(per<75)">
						<span class="fail">fail</span>
					</c:when>
				</c:choose>
			</td>
		</tr>
</table>
<%@include file="Footer.jsp" %>
</body>
</html>