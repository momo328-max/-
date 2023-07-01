<%@ page import="com.inspur.pojo.User" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
  // 获取保存在会话中的用户信息
  User user = (User) session.getAttribute("user");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>无标题文档</title>
  <link href="css/style.css" rel="stylesheet" type="text/css" />
  <script language="JavaScript" src="js/jquery.js"></script>

  <script type="text/javascript">
    $(function(){
      //导航切换
      $(".menuson li").click(function(){
        $(".menuson li.active").removeClass("active")
        $(this).addClass("active");
      });

      $('.title').click(function(){
        var $ul = $(this).next('ul');
        $('dd').find('ul').slideUp();
        if($ul.is(':visible')){
          $(this).next('ul').slideUp();
        }else{
          $(this).next('ul').slideDown();
        }
      });
    })
  </script>


</head>

<body style="background:#f0f9fd;">
<div class="lefttop"><span></span>用户管理</div>

<dl class="leftmenu">

  <dd>
    <div class="title">
      <span><img src="images/leftico01.png" /></span>用户管理
    </div>
    <ul class="menuson">
      <li class="active"><cite></cite><a href="${pageContext.request.contextPath}/index" target="rightFrame">首页</a><i></i></li>
      <li><cite></cite><a href="${pageContext.request.contextPath}/user/userSearch" target="rightFrame">用户管理</a><i></i></li>
    </ul>
  </dd>

  <dd><div class="title"><span><img src="images/leftico03.png" /></span>部门管理</div>
    <ul class="menuson">
      <li><cite></cite><a href="${pageContext.request.contextPath}/dept/deptSearch" target="rightFrame">部门管理</a><i></i></li>
    </ul>
  </dd>
  <dd><div class="title">
      <span><img src="images/leftico02.png" /></span>个人信息修改</a> </div>
      <ul class="menuson">
        <li><cite></cite><a href="${pageContext.request.contextPath}/user/userPasswordUpdate" target="rightFrame">个人信息修改</a><i></i></li>
      </ul>


  <dd><div class="title"><span><img src="images/leftico03.png" /></span>日报管理</div>
    <ul class="menuson">
      <li><cite></cite><a href="${pageContext.request.contextPath}/report/reportSearch" target="rightFrame">日报管理</a><i></i></li>
    </ul>
  </dd>

  <dd><div class="title"><span><img src="images/leftico01.png" /></span>加班管理</div>
    <ul class="menuson">
      <li><cite></cite><a href="${pageContext.request.contextPath}/workmanager/workSearch" target="rightFrame">加班管理</a><i></i></li>
    </ul>
  </dd>
  <dd><div class="title"><span><img src="images/leftico01.png" /></span>休假管理</div>
    <ul class="menuson">
      <li><cite></cite><a href="${pageContext.request.contextPath}/restmanager/restSearch" target="rightFrame">休假管理</a><i></i></li>
    </ul>
  </dd>
<c:if test="${user.userType == 1}">
  <dd><div class="title"><span><img src="images/leftico04.png" /></span>审批</div>
    <ul class="menuson">
      <li><cite></cite><a href="${pageContext.request.contextPath}/restsyouninn/restsyouninnSearch" target="rightFrame">休假审批</a><i></i></li>
      <li><cite></cite><a href="${pageContext.request.contextPath}/worksyouninn/worksyouninnSearch" target="rightFrame">加班审批</a><i></i></li>
    </ul>
  </dd>
</c:if>
  <dd><div class="title"><span><img src="images/leftico04.png" /></span>我的桌面</div>
    <ul class="menuson">
      <li><cite></cite><a href="${pageContext.request.contextPath}/mydesktop/mydesktop" target="rightFrame">我的桌面</a><i></i></li>
    </ul>
  </dd>
</dl>
</body>
</html>
