<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page import="cn.zb.ry.factory.*,cn.zb.ry.vo.*" %>
<%@ page import="java.text.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'emp_insert_do.jsp' starting page</title>
    
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
    <% 
       request.setCharacterEncoding("gb2312"); 
       Emp emp=new Emp();
       emp.setEmpno(Integer.parseInt(request.getParameter("empno"))); 
       emp.setEname(request.getParameter("ename"));
       emp.setJob(request.getParameter("job"));
       emp.setHiredate(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("hiredate")));
       emp.setSal(Float.parseFloat(request.getParameter("sal")));
       if(DAOFactory.getIEmpDAOInstance().doCreate(emp)){
   %>
      <h1>雇员信息添加成功！</h1>
   <%    
       }else{
   %>
       <h1>雇员信息添加失败！</h1>
   <%    
       }
      
    %> <br>
  </body>
</html>
