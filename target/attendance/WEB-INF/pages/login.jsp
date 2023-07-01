
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<%
String path = request.getContextPath();
String bashPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort() + path+"/";
%>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>欢迎登录公司员工考勤管理平台</title>
  <link href="<%=bashPath%>css/style.css" rel="stylesheet" type="text/css" />
  <script language="JavaScript" src="js/jquery.js"></script>
  <script src="js/cloud.js" type="text/javascript"></script>

  <script language="javascript">
    $(function(){
      $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
      $(window).resize(function(){
        $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
      })
    });
  </script>

</head>

<body style="background-color:#1c77ac; background-image:url(images/light.png); background-repeat:no-repeat; background-position:center top; overflow:hidden;">



<div id="mainBody">
  <div id="cloud1" class="cloud"></div>
  <div id="cloud2" class="cloud"></div>
</div>


<div class="logintop">
  <span>欢迎登录公司员工考勤管理平台</span>

</div>

<div class="loginbody">

  <span class="systemlogo"></span>

  <div class="loginbox">
    <form action="${pageContext.request.contextPath}/login" method="post">
      <ul>
        <li><input name="account" type="text" class="loginuser" value="${cookie.account.value}" onclick="JavaScript:this.value=''"/></li>
        <li><input name="password" type="password" class="loginpwd" value="${cookie.password.value}" onclick="JavaScript:this.value=''"/></li>
        <li><input name="" type="submit" class="loginbtn" value="登录"   />
          <label><input name="isMemory" type="checkbox" value="" checked />记住密码</label>
          <label><input name="" type="checkbox" value="" />自动登录</label>
        </li>
        <% if(request.getAttribute("msg")!=null){%>
        <%=request.getAttribute("msg")%>
        <% }%>
      </ul>
    </form>

  </div>

</div>



</body>
</html>
