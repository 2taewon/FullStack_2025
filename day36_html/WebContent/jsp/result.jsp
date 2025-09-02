<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	결과 출력합니다. <p>
	<%
	
		String name = request.getParameter("name");
		String Pwd = request.getParameter("pwd");
		String email = request.getParameter("mail");
	
		out.print(name + "님 반갑습니다. 비번은 : " + Pwd + "<br> 이메일 : "+ email);
	%>
	<hr> 
	<h2><%= name + "님 반갑습니다. 비번은 : " + Pwd + "<br> 이메일 : "+ email%></h2>
</body>
</html>