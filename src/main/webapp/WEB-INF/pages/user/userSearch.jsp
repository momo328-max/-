<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>用户管理</title>
  <link href="../css/style.css" rel="stylesheet" type="text/css" />
  <link href="../css/select.css" rel="stylesheet" type="text/css" />
  <script type="text/javascript" src="../js/jquery.js"></script>
  <script type="text/javascript" src="../js/jquery.idTabs.min.js"></script>
  <script type="text/javascript" src="../js/select-ui.min.js"></script>
  <script type="text/javascript">
    KE.show({
      id : 'content7',
      cssPath : './index.css'
    });
  </script>

  <script type="text/javascript">
    $(document).ready(function(e) {
      $(".select1").uedSelect({
        width : 345
      });
      $(".select2").uedSelect({
        width : 167
      });
      $(".select3").uedSelect({
        width : 100
      });
    });
    function getArray(nameVal,sort)
    {
      //要ajax的json数据
      var jsonData = new Array;

      switch(sort)
      {
        case "checkbox":
          $('input:checkbox[name="'+nameVal+'"]:checked').each(
                  function(i)
                  {
                    jsonData[i] = $(this).val();
                  }
          );
          break;
      }
      return jsonData;
    }
  /* function deleteUser(id){
     if (confirm("确定要删除吗？")){
       //删除
       var ids = getArray('id[]','checkbox');
       if(ids.length>0){
         var id= ids;
       }
       alert(id)
       $.ajax({
         url:"${pageContext.request.contextPath}/user/userDelete",
         data:{"ids":id},
         type:"post",
         success: function(msg){
         alert(msg)
          // window.location.href="${pageContext.request.contextPath}/user/userSearch"
         }


       });

     }else{
      //不删除
     }
   }*/
  </script>
</head>

<body>

<div class="place">
  <span>位置：</span>
  <ul class="placeul">
    <li><a href="#">用户管理</a></li>
  </ul>
</div>

<!--查询条件-->
<br />
<br />
<ul class="seachform">
<form action="${pageContext.request.contextPath}/user/userSearch" method="post">
  <li><label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;姓名</label><input name="name" type="text" class="scinput" value="${name}" /></li>
  <li><label>部门</label>
    <div class="vocation">
      <select class="select3" name="departmentId" id="departmentId">
        <option value=""}>--请选择--</option>
        <c:forEach var="department" items="${departmentList}">
          <option value="${department.departmentId}" ${departmentId == department.departmentId?"selected" :""}>${department.departmentName}</option>
        </c:forEach>

      </select>
    </div>
  </li>

  <li><label>&nbsp;</label><input name="" type="submit" class="scbtn"  value="查询"/></li>
</form>
</ul>
</div>

<div class="tools">

  <ul class="toolbar">
    <li class="click"><span><img src="../images/t01.png" /></span><a href="${pageContext.request.contextPath}/user/userInsert" target="rightFrame">添加</a></li>
    <li class="click"><img src="../images/t03.png" /></span><a href="#" onclick="deleteUser()" target="rightFrame">删除</a></li>
  </ul>
</div>


<table class="tablelist"><tbody><tr><td><table class="tablelist"><tbody><tr><td><table class="tablelist">
  <tbody>
  <tr>
    <td><table class="tablelist">
      <thead>
      <tr>
        <th><input name="" type="checkbox" value="" checked="checked"/></th>
        <th width="7%">工号</th>
        <th width="11%">姓名</th>
        <th width="10%">部门</th>
        <th width="9%">职务</th>
        <th width="11%">注册时间</th>
        <th width="5%">性别</th>
        <th width="10%">手机</th>
        <th width="9%">出生日期</th>
        <th width="12%">邮箱</th>
        <th width="13%">操作</th>
      </tr>
      </thead>
      <tbody>
      <c:forEach var="user" items="${userList.list}">
      <tr>
        <td><input name="id[]" type="checkbox" value="${user.id}" /></td>
        <td>${user.account}</td>
        <td>${user.name}</td>
        <td>${user.department.departmentName}</td>
        <td>${user.userType}</td>
        <td>${user.createTime}</td>
        <td>${user.sex==1?"男":"女"}</td>
        <td>${user.mobile}</td>
        <td>${user.birthday}</td>
        <td>${user.email}</td>
        <td><span><a href="${pageContext.request.contextPath}/user/userUpdate?id=${user.id}" class="tablelink"><img src="../images/t02.png" />修改</a> <a href="${pageContext.request.contextPath}/user/userDelete?id=${user.id}" class="tablelink" > <img src="../images/t03.png" />删除</a></span></td>
      </tr>
      </c:forEach>
      </tbody>
    </table></td>
  </tr>
  </tbody>
</table>
</td>
</tr>
</tbody>
</table></td>
</tr>
</tbody>
</table>


<div class="pagin">
  <div class="message">共<i class="blue">${userList.total}</i>条记录，当前显示第&nbsp;<i class="blue">${userList.pageNum}&nbsp;</i>页</div>
  <ul class="paginList">
    <c:if test="${userList.hasNextPage}">

    <li class="paginItem"><a href="${pageContext.request.contextPath}/user/userSearch?pageNum=${userList.nextPage}">下一页</a></li>
    <li class="paginItem current"><a href="${pageContext.request.contextPath}/user/userSearch?pageNum=${userList.pages}">末页</a></li>
    </c:if>
    <c:forEach items="${userList.navigatepageNums}" var="p">
      <c:if test="${userList.pageNum==p}">
        <li class="paginItem"><a href="${pageContext.request.contextPath}/user/userSearch?pageNum=${p}">${p}</a></li>
      </c:if>
      <c:if test="${userList.pageNum!=p}">
        <li class="paginItem"><a href="${pageContext.request.contextPath}/user/userSearch?pageNum=${p}">${p}</a></li>
      </c:if>
    </c:forEach>
    <c:if test="${userList.hasPreviousPage}">
      <li class="paginItem"><a href="${pageContext.request.contextPath}/user/userSearch?pageNum=${userList.pageNum-1}">上一页</a></li>
      <li class="paginItem current"><a href="${pageContext.request.contextPath}/user/userSearch?pageNum=1">首页</a></li>
    </c:if>


  </ul>
</div>


<div class="tip">
  <div class="tiptop"><span>提示信息</span><a></a></div>

  <div class="tipinfo">
    <span><img src="images/ticon.png" /></span>
    <div class="tipright">
      <p>是否确认对信息的修改 ？</p>
      <cite>如果是请点击确定按钮 ，否则请点取消。</cite>
    </div>
  </div>

  <div class="tipbtn">
    <input name="" type="button"  class="sure" value="确定" />&nbsp;
    <input name="" type="button"  class="cancel" value="取消" />
  </div>

</div>




</div>

<script type="text/javascript">
  $('.tablelist tbody tr:odd').addClass('odd');
</script>
</body>
</html>

