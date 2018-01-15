<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<form action="quiz" method="post">
			${question.qdesc}<br/><br/>
			 <c:if test ="${sessionScope.ansmap[question.qid] ne null }">
				<c:choose>
					<c:when test="${sessionScope.ansmap[question.qid].answer eq question.opta }">
						<input type="radio" name="ques" checked="checked" value="${question.opta }"/>${question.opta }<br/>
						<input type="radio" name="ques" value="${question.optb }"/>${question.optb }<br/>
						<input type="radio" name="ques" value="${question.optc }"/>${question.optc }<br/>
					</c:when>
					<c:when test="${sessionScope.ansmap[question.qid].answer eq question.optb }">
						<input type="radio" name="ques" value="${question.opta }"/>${question.opta }<br/>
						<input type="radio" name="ques" checked="checked" value="${question.optb }"/>${question.optb }<br/>
						<input type="radio" name="ques" value="${question.optc }"/>${question.optc }<br/>
					</c:when>
					<c:when test="${sessionScope.ansmap[question.qid].answer eq question.optc }">
						<input type="radio" name="ques" value="${question.opta }"/>${question.opta }<br/>
						<input type="radio" name="ques" value="${question.optb }"/>${question.optb }<br/>
						<input type="radio" name="ques" checked="checked" value="${question.optc }"/>${question.optc }<br/>
					</c:when>
					<c:otherwise>
						<input type="radio" name="ques" value="${question.opta }"/>${question.opta }<br/>
						<input type="radio" name="ques" value="${question.optb }"/>${question.optb }<br/>
						<input type="radio" name="ques" value="${question.optc }"/>${question.optc }<br/>
					</c:otherwise>
				</c:choose>
			 </c:if> 
			 <c:if test ="${sessionScope.ansmap[question.qid] eq null }">
			<input type="radio" name="ques" value="${question.opta }"/>${question.opta }<br/>
			<input type="radio" name="ques" value="${question.optb }"/>${question.optb }<br/>
			<input type="radio" name="ques" value="${question.optc }"/>${question.optc }<br/>
			</c:if> 
			<input type="hidden" name="quesid" value="${question.qid }" />
			<c:if test="${sessionScope.curridx > 0 }">
				<input type="submit" value="prev" name="btn">
			</c:if>
			
			<c:if test="${sessionScope.curridx < applicationScope.size-1}">
				<input type="submit" value="next" name="btn">	
			</c:if>
			
			<c:if test="${sessionScope.curridx eq applicationScope.size-1}">
				<input type="submit" value="finish" name="btn">	
			</c:if>
			
			 
		</form>
	</div>
</section>

<%@include file="Footer.jsp" %>
</body>
</html>