<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'emp_insert.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form action="emp_insert_do.jsp" method="post">
           ��Ա��ţ�<input type="text" name="empno"><br>
           ��Ա������<input type="text" name="ename"><br>
           ��Աְλ��<input type="text" name="job"><br>
           ��Ӷ���ڣ�<input type="text" name="hiredate"><br>
           �������ʣ�<input type="text" name="sal"><br>
           <input type="submit" value="ע��">
           <input type="reset" value="����">
    </form><br>
  </body>
</html>
