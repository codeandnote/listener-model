
<!--导入 -->
<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!--监听 -->
<%@page import = "com.listener.*"%>


<%@page import = "com.javaweb.zcx.MyListener"%><!--监听class程序3位置--
<%@page import = "com.javaweb.zcx.MyListener4"%><!--监听class程序3位置-->

<!--页头-->

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
</head>


<!--主体-->
<body>


<!--session 存储的监听-->
<%
//给sess=Tom 且使valueBound
session.setAttribute("sess",new MyListener("Tom"));
//删除sess 且valueUnbound 调用
session.removeAttribute("sess");

%>

<!--Attribute 存储的监听-->
<%
//赋值  监听调用attributeAdded
application.setAttribute("x",1);
application.getAttribute("x");

//修改 监听调用attributeReplaced
application.setAttribute("x",2);
application.getAttribute("x");

//删除 监听调用attributeRemoved
application.removeAttribute("x");
%>



<!--RequestAndSession存储的监听-->
<%
//往session域对象中添加属性
session.setAttribute("aa", "cc");
//替换session域对象中aa属性的值
session.setAttribute("aa", "xx");
session.getAttribute("aa");
//移除session域对象中aa属性
session.removeAttribute("aa");
    
//往request域对象中添加属性
request.setAttribute("aa", "bb");
//替换request域对象中aa属性的值
request.setAttribute("aa", "xx");
request.getAttribute("aa");
//移除request域对象中aa属性
request.removeAttribute("aa"); 
%> 
 
 
 
 
</body>
</html>





