<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
//HttpSession sess = request.getSession();
 String name = request.getParameter("txtname");
 String role = request.getParameter("txtrole");
 session.setAttribute("sname", name);
 session.setAttribute("srole", role);
 
%>

<h1><%=session.getAttribute("sname") %></h1>
<h2><%=session.getAttribute("srole") %></</h2>

<a href='<%=response.encodeURL("Second.jsp")%>'>second</a>
<a href='<%=response.encodeURL("Third.jsp")%>'>third</a>
</body>
</html>

