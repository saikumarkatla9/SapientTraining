<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="Header.jsp" %>
<h1 align="center">play java quiz</h1>

<form action="quiz" method="post">
	<div style="width:40%;background-color:aqua;margin:0 auto">
		1.size of int type<br/>
		<input type="radio" name="ques1" value="">1</br>
		<input type="radio" name="ques1" value="">2</br>
		<input type="radio" name="ques1" value="">4</br>
		</hr>
		
		2.size of byte type<br/>
		<input type="radio" name="ques1" value="">1</br>
		<input type="radio" name="ques1" value="">2</br>
		<input type="radio" name="ques1" value="">4</br>
		</hr>
		
		3.Which collection allowa duplicates</br>
		<input type="radio" name="ques3" value="list">list</br>
		<input type="radio" name="ques3" value="set">set</br>
		<input type="radio" name="ques3" value="map">map</br>
		</hr>
		
		4.Which collection allowa duplicates</br>
		<input type="radio" name="ques4" value="list">list</br>
		<input type="radio" name="ques4" value="set">set</br>
		<input type="radio" name="ques4" value="map">array</br>
		</hr>
		<input type="submit" value="finish"/>
	</div>
</form>
</body>
</html>