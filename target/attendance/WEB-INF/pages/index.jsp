<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="js/jquery.js"></script>

</head>


<body>

<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">首页</a></li>
    </ul>
</div>

<div class="mainindex">


    <div class="welinfo">
        <span><img src="images/sun.png" alt="天气" /></span>
        <b>Admin早上好，欢迎使用考勤信息管理系统</b>
    </div>
    <%
       java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       java.util.Date currentTime = new java.util.Date();
       String str_date1 = format.format(currentTime);


        %>
    <div class="welinfo">
        <span><img src="images/time.png" alt="时间" /></span>
        <i>您本次次登录的时间：<%=str_date1%></i></div>


</body>
</html>

