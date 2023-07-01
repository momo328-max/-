<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>加班审批</title>
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
    <li><a href="#">审批</a></li>
    <li><a href="#">加班审批</a></li>
  </ul>
</div>

<!--查询条件-->
<br />
<br />
<ul class="seachform">
    <form action="${pageContext.request.contextPath}/worksyouninn/worksyouninnSearch" method="post">
  <li>
    <label> 加班日期:</label><input name="startTime" type="text" class="scinput"  value="" onClick="WdatePicker({startDate:'',dateFmt:'yyyy-MM-dd'})" /></li>
  <li>  <label> 到</label><input name="endTime" type="text" class="scinput" value="" onClick="WdatePicker({startDate:'',dateFmt:'yyyy-MM-dd'})" /></li>
  <li>
    <label>工号：</label>
    <input name="account" type="text" class="scinput" />
  </li>
  <li><label>&nbsp;</label><input name="" type="submit" class="scbtn" value="查询"/></li>
    </form>
</ul>
</div>
<table class="tablelist"><tbody><tr><td><table class="tablelist"><tbody><tr><td><table class="tablelist"><tbody><tr><td><table class="tablelist">
  <tbody>
  <tr>
    <td><table class="tablelist">
      <tbody>
      <tr>
        <td><table class="tablelist">
          <tbody>
          <tr>
            <td><table class="tablelist">
              <thead>
              <tr>
                <th width="3%" height="45"><input name="input" type="checkbox" value="" checked="checked"/></th>
                <th width="7%">工号<i class="sort"><img src="../images/px.gif" /></i></th>
<%--                <th width="11%">姓名</th>--%>
                <th width="10%">加班日期</th>
                <th width="9%">开始时间</th>
                <th width="11%">终了时间</th>
                  <th width="7%">加班时间小计</th>
                <th width="7%">加班原因</th>
                  <th width="7%">审批状态</th>
                <th width="13%">操作</th>
              </tr>
              </thead>
              <tbody>
              <c:forEach var="record" items="${workRecordList}">
              <tr>
                <td><input name="" type="checkbox" value="" value="${record.recordId}"/></td>
                <td>${record.account}</td>
                <td>${record.workDate}</td>
                <td>${record.startTime} </td>
                <td>${record.endTime}</td>
                <td>${record.workTime}</td>
                  <td>${record.workCourse}</td>
                <td>${record.state}</td>
                <td><span><a href="#" class="tablelink"><img src="../images/t02.png" /> </a><a href="${pageContext.request.contextPath}/workmanager/accepted?id=${record.recordId}" class="tablelink"  onclick="confirm('确定通过当前消息？')" />通过 <a href="${pageContext.request.contextPath}/workmanager/rejected?id=${record.recordId}" class="tablelink" onclick="confirm('确定要驳回当前消息？')"> <img src="../images/t03.png" />驳回</a></span></td>
              </tr>
              </c:forEach>
              </tbody>
            </table></td>
          </tr>
          </tbody>
        </table></td>
      </tr>
      </tbody>
    </table></td>
  </tr>
  </tbody>
</table>
</td>
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
  <div class="message">共<i class="blue">1256</i>条记录，当前显示第&nbsp;<i class="blue">2&nbsp;</i>页</div>
  <ul class="paginList">
    <li class="paginItem"><a href="javascript:;"><span class="pagepre"></span></a></li>
    <li class="paginItem"><a href="javascript:;">1</a></li>
    <li class="paginItem current"><a href="javascript:;">2</a></li>
    <li class="paginItem"><a href="javascript:;">3</a></li>
    <li class="paginItem"><a href="javascript:;">4</a></li>
    <li class="paginItem"><a href="javascript:;">5</a></li>
    <li class="paginItem more"><a href="javascript:;">...</a></li>
    <li class="paginItem"><a href="javascript:;">10</a></li>
    <li class="paginItem"><a href="javascript:;"><span class="pagenxt"></span></a></li>
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
