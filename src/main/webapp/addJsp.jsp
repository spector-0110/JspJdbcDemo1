<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="errorJsp.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
 	<h1> Hello World!! </h1>

	<%! 
		int k=0;
		public int square(int x){
			return (x*=x);
		}
	%>
	
	<%
		int i=Integer.parseInt(request.getParameter("num1"));
		int j=Integer.parseInt(request.getParameter("num2"));
		k=square(i+j);
	%>
	
	<%="Sum of square of number is : " +k %>
</body>
</html>