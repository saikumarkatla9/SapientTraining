<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="quiz.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
<%@include file="Header.jsp" %>
<section>
	<div>
		<h2>You have scored ${score} answers right</h2>
		<h3>percentage : ${score/applicationScope.size * 100 }%</h3>
		<table>
			<tr>
				<th>Q.no</th>
				<th>Question</th>
				<th>Correct answer</th>
				<th>Your answer</th>
			</tr>
			<tbody>
				<c:forEach items="${requestScope.queslist }" var="q" varStatus="{">
					<tr>
						<td>${i.count }</td>
						<td>${q.qdesc }</td>
						<td>${q.answer }</td>
						<td>
							<c:if test="${requestScope.ansmap[q.qid].answer eq q.answer }">
							<span style="color:blue">${requestScope.ansmap[q.qid].answer }</span>
							</c:if>
							<c:if test="${requestScope.ansmap[q.qid].answer ne q.answer }">
							<span style="color:red">${requestScope.ansmap[q.qid].answer }</span>
							</c:if>
						<%-- ${requestScope.ansmap[q.qid].answer} --%></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</section>
<%@include file="Footer.jsp" %>
</body>
</html>