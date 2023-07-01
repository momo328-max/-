
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <li><a href="#">日报管理</a></li>
    </ul>
</div>

<!--查询条件-->
<br />
<br />
<ul class="seachform">
    <form action="${pageContext.request.contextPath}/report/reportSearch" method="post">
    <li>
        <label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;工号</label><input name="account" type="text" class="scinput" /></li>
    <li>
        <label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;开始日期</label><input name="startDate" type="text" class="scinput" onClick="WdatePicker({work_date:'',dateFmt:'yyyy-MM-dd'})" /></li>
    <li>
        <label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;结束日期</label><input name="endDate" type="text" class="scinput" onClick="WdatePicker({work_date:'',dateFmt:'yyyy-MM-dd'})"/></li>

    <li><label>&nbsp;</label><input name="" type="submit" class="scbtn" value="查询"/></li>
    </form>
</ul>
</div>

<div class="tools">

    <ul class="toolbar">
        <li class="click"><span><img src="../images/t01.png" /></span><a href="${pageContext.request.contextPath}/report/reportInsert" target="rightFrame">添加</a></li>
        <li class="click"><img src="../images/t03.png" /></span><a href="#" target="rightFrame">删除</a></li>
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
<%--                <th width="11%">姓名</th>--%>
                <th width="10%">日期</th>
                <th width="9%">作业进度</th>
                <th width="11%">作业内容</th>
                <th width="7%">问题点</th>
<%--                <th width="8%">联络事项</th>--%>
                <th width="13%">操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="record" items="${reportRecordList}">
            <tr>
                <td><input name="" type="checkbox" value=${record.recordId}" /></td>
                <td>${record.account}</td>
<%--                <td>admin</td>--%>
                <td>${record.reportDate}</td>
                <td>${record.workProcess}</td>
                <td>${record.workContent}</td>
                <td>${record.problem}</td>
<%--                <td>&nbsp;</td>--%>
                <td><span><a href="${pageContext.request.contextPath}/report/reportUpdate?id=${record.recordId}" class="tablelink"><img src="../images/t02.png" />修改</a> <a href="${pageContext.request.contextPath}/report/reportDelete?id=${record.recordId}" class="tablelink" onclick="confirm('确定要删除吗？')"> <img src="../images/t03.png" />删除</a></span></td>
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

