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
<table cellpadding="10" bgcolor="wheat" style="margin: 0 auto">
	<tr>
		<td>Boldface</td>
		<td><c:out value="<b>sapient</b>" escapeXml="false"></c:out></td>
		<td><c:out value="<b>sapient</b>" escapeXml="true"></c:out></td>
	</tr>
	<tr>
		<td>Italic</td>
		<td><c:out value="<i>sapient</i>" escapeXml="false"></c:out></td>
		<td><c:out value="<i>sapient</i>" escapeXml="true"></c:out></td>
	</tr>
	<tr>
		<td>Underline</td>
		<td><c:out value="<u>sapient</u>" escapeXml="false"></c:out></td>
		<td><c:out value="<u>sapient</u>" escapeXml="true"></c:out></td>
	</tr>
	<tr>
		<td>Superscript</td>
		<td><c:out value="a<sup>2</sup>" escapeXml="false"></c:out></td>
		<td><c:out value="a<sup>2</sup>" escapeXml="true"></c:out></td>
	</tr>
	<tr>
		<td>Subscript</td>
		<td><c:out value="b<sub>3</sub>" escapeXml="false"></c:out></td>
		<td><c:out value="b<sub>3</sub>" escapeXml="true"></c:out></td>
	</tr>
	<tr>
		<td>Font tag</td>
		<td><c:out value='<font color="red" face="arial">yamaha</font>' escapeXml="false"></c:out></td>
		<td><c:out value='<font color="red" face="arial">yamaha</font>' escapeXml="true"></c:out></td>
	</tr>
	
	
</table>

</body>
</html>