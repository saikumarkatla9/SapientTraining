<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="Header.jsp" %>
<h1>Your updated profile</h1>

<%! int count=0; %>
	<table cellpadding="10" bgcolor="wheat" style="margin:0 auto">
		<tr>
			<td>name</td>
			<td>${param.txtname}</td>
		</tr>
		<tr>
			<td>team</td>
			<td>${param.team}</td>
		</tr>

		<tr>
			<td>skills</td>
			<td>
				<ul>
					<c:forEach items="${paramValues.chkskills}" var="str">
						<li>$(str)</li>
					</c:forEach>
				</ul>
			</td>
		</tr>
		<tr>
			<td>Images</td>
			<td>
				<c:forEach begin="1" end="5">
					<img src="images/computer${idx}.jpg" width="50" height="50"/>
				</c:forEach>
			</td>
		</tr>
	</table>
</body>
</html>