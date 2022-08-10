<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>First JSP Program</h1>

<% out.print("Hello World"); %>

<br>
<h2>Scriplet Example</h2>
<!-- Scriptlet -->
<% String name="Amaravathy"; %>

<% 
		int a=50;
	int b=90;
	int c  =a+b;
	out.print("Result is : "+c);
%>

<br>
<h2>Expression</h2>
<!-- Expressions -->
<%="My name is: "+name %>
<br>
<!-- -java code -->
<%! int cube(int n){
	
	return n*n*n;
}
%>


<%= "cube of 5 is: "+cube(5) %>

<br>


<%= new java.util.Date() %>


<br>
<a href="implicit.jsp">Click here For Implicit demo</a>
</body>
</html>