<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<%@include file="Header.jsp" %>
<title>Insert title here</title>
<link href="sapient.css" rel="stylesheet"/>
</head>
<body>

<section>
	<div> 
		<ul>
			<li>answer all the questions</li>
			<li>no time limit</li>
			<li>Report will be generated after clicking the finish button</li>
			<li>After clicking finish you cannot go back</li>
		</ul>
		<a href="start">Start Exam</a>
	</div>
</section>
<%@include file="Footer.jsp" %>
</body>
</html> --%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
<link href="quiz.css" rel="stylesheet" />
</head>
<body>
	<%@include file="Header.jsp"%>
	<section>
		<div>
			<ul>
				<li>no need to answer all the questions</li>
				<li>no time limit</li>
				<li>Report will be generated after clicking on finish button</li>
				<li>After clicking on finish button cannot go back to previous
					questions</li>
			</ul>
			<br/>
			<div align="center">
			<a href="start">Start Exam</a>
			</div>
		</div>
	</section>
	<%@include file="Footer.jsp"%>
</body>
</html>
