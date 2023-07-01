
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <script language="JavaScript" src="js/jquery.js"></script>
    <script type="text/javascript">
        $(function(){
            //顶部导航切换
            $(".nav li a").click(function(){
                $(".nav li a.selected").removeClass("selected")
                $(this).addClass("selected");
            })
        })
    </script>


</head>

<body style="background:url(images/topbg.gif) repeat-x;">

<div class="topleft">
    <a href="main.html" target="_parent"><img src="images/logo.png" title="系统首页" /></a>
</div>

<ul class="nav">
    <li><a href="${pageContext.request.contextPath}/user/userSearch" target="rightFrame" class="selected"><img src="images/icon01.png" title="用户管理" />
        <h2>用户管理</h2>
    </a></li>
    <li><a href="${pageContext.request.contextPath}/dept/deptSearch" target="rightFrame"><img src="images/icon02.png" title="部门管理" />
        <h2>部门管理</h2>
    </a></li>
    <li><a href="${pageContext.request.contextPath}/report/reportSearch"  target="rightFrame"><img src="images/icon03.png" title="日报管理" />
        <h2>日报管理</h2>
    </a></li>
    <li><a href="${pageContext.request.contextPath}/workmanager/workSearch"  target="rightFrame"><img src="images/icon04.png" title="加班管理" />
        <h2>加班管理</h2>
    </a></li>
    <li><a href="${pageContext.request.contextPath}/restmanager/restSearch" target="rightFrame"><img src="images/ico01.png" width="58" height="44" title="休假管理" />
        <h2>休假管理</h2>
    </a></li>
    <li><a href="${pageContext.request.contextPath}/worksyouninn/worksyouninnSearch"  target="rightFrame"><img src="images/icon06.png" title="审批管理" />
        <h2>审批管理</h2>
    </a></li>
</ul>

<div class="topright">
    <ul>
        <li><a href="${pageContext.request.contextPath}/logout" target="_parent">退出</a></li>
    </ul>

</div>
</body>
</html>
