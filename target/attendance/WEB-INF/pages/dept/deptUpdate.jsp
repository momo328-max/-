<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2023/5/11
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>部门修改</title>
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
  </script>
  <script language="javascript">
    function saveButton(){
      document.forms[0].action="${pageContext.request.contextPath}/dept/updateDept";
      document.forms[0].submit();
    }
  </script>


</head>

<body>
<form action="userFrom">
  <div class="place">
    <span>位置：</span>
    <ul class="placeul">
      <li><a href="#">部门管理</a></li>
      <li><a href="#">修改部门</a></li>
    </ul>
  </div>

  <div class="formbody">

    <div class="formtitle"><span>基本信息</span></div>

    <ul class="forminfo">
      <li>
        <label>部门编号</label>
        </label><input name="departmentId" type="text" class="dfinput" readonly="readonly" value="${department.departmentId}"/></li>
      <li>
        <label>部门名称</label>
        <input name="departmentName" type="text" class="dfinput" value="${department.departmentName}"/>
      </li>
      <li>
        <label>负责人 </label>
        <div class="vocation">
          <select class="select3" name="manager">
            <option>--请选择--</option>
            <c:forEach var="user" items="${userList}">
              <option value="${user.name}" ${department.manager == user.name?"selected" :""}>${user.name}</option>
            </c:forEach>
          </select>
        </div>
      </li>
      <li><label>&nbsp;</label><input name="" type="button" class="btn" value="确认保存" onclick="saveButton()"/></li>
    </ul>
  </div>
</form>
</body>
</html>

