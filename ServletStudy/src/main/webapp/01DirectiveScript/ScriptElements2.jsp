<%@page import="org.apache.coyote.Request"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%! 
    public int add(int snum, int fnum){
    	return snum + fnum;
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립트 요소</title>
</head>
<body>
<%
String snum = request.getParameter("num");
String fnum = request.getParameter("num1");
int num = 1;
int num1 = 2;
if(snum != null)
	num = Integer.parseInt(snum);
if(fnum != null)
	num1 = Integer.parseInt(fnum);
int result = add(num,num1);
%>
덧셈결과 1 : <%= result  %> <br />
덧셈결과 2 : <%= add(30,40)  %>
</body>
</html>