<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2023/5/11
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>加班管理</title>
  <link href="../css/style.css" rel="stylesheet" type="text/css" />
  <link href="../css/select.css" rel="stylesheet" type="text/css" />
  <script type="text/javascript" src="../js/jquery.js"></script>
  <script type="text/javascript" src="../js/jquery.idTabs.min.js"></script>
  <script type="text/javascript" src="../js/select-ui.min.js"></script>
  <script type="text/javascript" src="../js/My97DatePicker/WdatePicker.js"></script>
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
</head>

<body>

<div class="place">
  <span>位置：</span>
  <ul class="placeul">
    <li><a href="#">休假管理</a></li>
  </ul>
</div>

<!--查询条件-->
<br />
<br />
<ul class="seachform">
  <form action="${pageContext.request.contextPath}/restmanager/restSearch" method="post">
  <li>
    <label> 休假日期:</label><input name="restStartDate" type="text" class="scinput"  value="" onClick="WdatePicker({startDate:'',dateFmt:'yyyy-MM-dd'})" /></li>
  <li>  <label> 到</label><input name="restEndDate" type="text" class="scinput" value="" onClick="WdatePicker({startDate:'',dateFmt:'yyyy-MM-dd'})" /></li>
  <li>
    <label>状态：</label>
    <div class="vocation">
      <select class="select3" name="state">
        <option value="">--请选择--</option>
        <option>审批中</option>
        <option>已批准</option>
        <option>已驳回</option>
      </select>
    </div>
  </li>
  <li><label>&nbsp;</label><input name="" type="submit" class="scbtn" value="查询"/></li>
  </form>
</ul>
</div>

<div class="tools">

  <ul class="toolbar">
    <li class="click"><span><img src="../images/t01.png" /></span><a href="restInsert" target="rightFrame">添加</a></li>
    <li class="click"><img src="../images/t03.png" id="deleteButton" /></span><a href="#" target="rightFrame">删除</a></li>
  </ul>
</div>


<table class="tablelist"><tbody><tr><td><table class="tablelist"><tbody><tr><td><table class="tablelist">
  <tbody>
  <tr>
    <td><table class="tablelist">
      <thead>
      <tr>
        <th width="3%"><input name="" type="checkbox" value="" checked="checked"/></th>
        <th width="7%">工号<i class="sort"><img src="../images/px.gif" /></i></th>
<%--        <th width="11%">姓名</th>--%>
        <th width="10%">休假开始日期</th>
        <th width="9%">休假开始时间</th>
        <th width="10%">休假结束日期</th>
        <th width="11%">休假终了时间</th>
        <th width="7%">休假时间小计</th>
        <th width="8%">状态</th>
        <th width="13%">操作</th>
      </tr>
      </thead>
      <tbody>
<c:forEach var="record" items="${restRecordList}">
      <tr>
        <td><input name="restId" type="checkbox" value="${record.restId}" /></td>
        <td>${record.account}</td>
        <td>${record.restStartDate}</td>
        <td>${record.startTime}</td>
        <td>${record.restEndDate}</td>
        <td>${record.endTime} </td>
        <td>${record.restTime}</td>
        <td>${record.state}</td>
<%--        <td>${record.restId}</td>--%>
        <td><span><a href="${pageContext.request.contextPath}/restmanager/restUpdate?id=${record.restId}" class="tablelink"><img src="../images/t02.png" />修改</a> <a href="${pageContext.request.contextPath}/restmanager/restDelete?id=${record.restId}" class="tablelink" onclick="confirm('确定要删除吗？')"> <img src="../images/t03.png" />删除</a></span></td>
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

  <ul class="paginList">

    <li class="paginItem"><a href="javascript:;">1</a></li>

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
  $("#deleteButton").click(function() {
    var recordIds = [];

    // 遍历选中的复选框
    $("input[name='checkboxName']:checked").each(function() {
      // 获取复选框的值（即recordId）
      var recordId = $(this).val();
      // 将recordId添加到数组中
      recordIds.push(recordId);
    });

    // 将recordIds拼接为字符串（以逗号分隔）
    var recordIdsString = recordIds.join(",");

    // 将recordIdsString发送到后台服务器进行处理
    // 可以使用Ajax请求或其他方法将数据发送到后台
  });
</script>
</body>
</html>

