<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>加班申请添加</title>
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
      function calculateWorkTime() {
          const startTime = $('input[name="startTime"]').val();
          const endTime = $('input[name="endTime"]').val();

          // 将时间字符串转换为日期对象
          const startDate = new Date(`2000-01-01 `+startTime);
          const endDate = new Date(`2000-01-01 `+endTime);

          // 计算时间差
          const timeDiff = endDate - startDate;

          // 将时间差转换为小时数
          const hours = Math.floor(timeDiff / (1000 * 60 * 60 ));
          console.log(hours);

          // 更新加班时间小计输入框的值
          $('input[name="workTime"]').val(hours);
      }

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
      document.forms[0].action="updateWork";
      document.forms[0].submit();
    }
  </script>
    <style type="text/css">
      li[hidden] {
        display: none;
      }
    </style>

</head>

<body>
<form action="myForm">
  <div class="place">
    <span>位置：</span>
    <ul class="placeul">
      <li><a href="#">加班管理</a></li>
      <li><a href="#">修改加班申请</a></li>
    </ul>
  </div>

  <div class="formbody">

    <div class="formtitle"><span>加班申请</span></div>

    <ul class="forminfo">
      <li hidden>
        <label>id</label>
        </label><input type="text" name = "recordId" class="dfinput" value="${record.recordId}" readonly="readonly"/>
      </li>
      <li>
        <label>工号</label>
        </label><input type="text" class="dfinput" value="${record.account}" name="account" readonly="readonly"/>
      </li>
<%--      <li>--%>
<%--        <label>姓名</label>--%>
<%--        </label><input type="text" class="dfinput" value="admin" readonly="readonly"/>--%>
<%--      </li>--%>
      <li>
        <label>加班日期 <font color="red">*</font></label>
        <input type="text" class="dfinput"  name="workDate" onClick="WdatePicker({work_date:'',dateFmt:'yyyy-MM-dd'})" value="${record.workDate}"/>
      </li>
      <li>
        <label>开始时间 <font color="red">*</font></label>
        <input type="text" class="dfinput"  name="startTime" onClick="WdatePicker({work_date:'',dateFmt:'HH:mm', onpicked: calculateWorkTime})" value="${record.startTime}"/> (HH:mm)
      </li>
      <li>
        <label>终了时间 <font color="red">*</font></label>
        <input type="text" class="dfinput"  name="endTime" onClick="WdatePicker({work_date:'',dateFmt:'HH:mm',onpicked: calculateWorkTime})" value="${record.endTime}"/> (HH:mm)
      </li>
      <li>
        <label>状态</label>
          <div class="vocation">
              <select class="select3" name="state" id="state" disabled>
                  <option value="">--请选择--</option>
                  <option ${record.state == "审批中"?"selected" :""}>审批中</option>
                  <option ${record.state == "已批准"?"selected" :""}>已批准</option>
                  <option ${record.state == "已驳回"?"selected" :""}>已驳回</option>
              </select>
          </div>
      </li>
      <li>
        <label>加班时间小计 </label>
        <input type="text" class="dfinput"  name="workTime" readonly value="${record.workTime}"/>
      </li>
      <li>
        <br />
        <label>加班原因 <font color="red">*</font></label><textarea rows="5" cols="10" id="tomorrow_plan" required="required"  name="notes" style="width: 500px; height: 30px; padding-left:5px; border: 1px solid #eaeff2; margin-top: 20px;ime-mode:disabled;" maxlength="255">${record.notes}</textarea></li>
      <li><label>&nbsp;</label><input name="" type="button" class="btn" value="确认保存" onclick="saveButton()"/></li>
    </ul>
  </div>
</form>
</body>
</html>
