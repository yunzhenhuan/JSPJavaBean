<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page import="test.TestBean" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'javabean1.jsp' starting page</title>
    
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
     
     <jsp:useBean id="test1" class="test.TestBean" scope="page"/>
    
     <%
        //TestBean test1=new TestBean();
        //test1.setName("zhangsan1");
        //test1.setPass("1234");
     %>
     <jsp:setProperty name="test1" property="name" value="lisi"/>
     <jsp:setProperty name="test1" property="pass" value="12345"/>
     <h1>
        <%=test1.getName()%><br>
        <%=test1.getPass()%><br>
        <hr>
       <jsp:getProperty property="name" name="test1"/><br>
       <jsp:getProperty property="pass" name="test1"/>
     </h1>
  </body>
</html>
