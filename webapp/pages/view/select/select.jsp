<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>查询水表页面</title>

	<meta name="viewport" content="width=device-width,height=device-height,inital-scale=1.0,maximum-scale=1.0,user-scalable=no;">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<meta name="format-detection" content="telephone=no">
	<meta charset="utf-8">

	<link href="../pages/view/select/css/cityselect.css" rel="stylesheet" type="text/css" />
	<link href="../pages/view/select/css/frozen.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" type="text/css" href="../pages/layui/css/layui.css?v=201111211012"/>
	<script src="../pages/layui/layui.js?v=114" charset="UTF-8"></script>
	<link href="../pages/view/select/css/index.css" rel="stylesheet" type="text/css" />
	<script src="../pages/js/jquery-3.5.1.js?v=15674"></script>
	<script src="../pages/js/ajax.js?v=114"></script>
	<script src="../pages/view/select/js/select.js?v=111"></script>


	<style type="text/css">
	  .tab{
		  background: #00C12C;
		  color: #FFFFFF;
		  padding-right: 7%;
	  }
	  .layui-icon{
		  font-size: 26px;
		  color: #FFFFFF;
    }

	  .centerMain {
		  background: #FFFFFF;
	  }
	  .layui-btn{
	  margin-left: 59%;
	  }
  </style>
</head>
<body>
<div class="top">
	<div class="fl tab tabActive">
		<a href="javascript:history.back(-1)" style="float: left"  class='goback'>
			<i class="layui-icon">&#xe65c;</i>
		</a>
		水表信息</div>
	<div class="fl tab" id="updateMeter">数据信息</div>
</div>
<div class="centerMain">

	<form class="form1 layui-form layui-form-pane" method="post" name="form1">
			<div class="ui-form mt10">
			<span class="time-tag"></span>
			    <div class="ui-form-item ui-border-b">
				    <label>所属机构:</label>
				    <input type="text" placeholder="所属机构"  value="${fksbDataMprRtrVO.orgNm}"  disabled="true" >
			    </div>
				<div class="ui-form-item ui-border-b">
					<label>测点编号:</label>
					<input type="text" placeholder="测点编号" name="mpCd" value="${fksbDataMprRtrVO.mpcd}"   disabled="true">
				</div>
				<div class="ui-form-item ui-border-b">
					<label>设备编码:</label> 
					<input type="text" placeholder="设备编码" class="updateInfo"  value="${fksbInfoZncbVO.equiId}"  disabled="true" >
				</div>

				<div class="ui-form-item ui-border-b">
					<label>设备位置:</label>
					<input type="text" placeholder="设备位置" name="houseno"  class="updateInfo"  value="${fksbInfoZncbVO.equiLoc}"  disabled="true">
				</div>
				<div class="ui-form-item ui-form-item-r ui-border-b">
					<label>
						房屋面积:
					</label>
					<input type="text" placeholder="房屋面积"  name="homeAre" class="updateInfo"  style="margin-left:95px;" value="${fksbInfoZncbVO.homeAre==null?0.00:fksbInfoZncbVO.homeAre}" disabled="true" >
					<!-- 若按钮不可点击则添加 disabled 类 -->
					<button type="button" class="ui-border-l">平方米</button>
				</div>

				<div class="ui-form-item ui-border-b" id="waterdiv1">
					<label>用水类型:</label>
					<input type="text" placeholder="用水类型"  id="watertype" class="updateInfo"  value="${fksbInfoZncbVO.waterType}"  disabled="true">

				</div>
				<div class="ui-form-item ui-border-b" id="waterdiv2" style="display: none">
					<label>用水类型:</label>
					<select   id="watertypes"  name="watertype"></select>

				</div>



		</div>
		<div class="mt10 ui-form">
			<div class="ui-form-item ui-border-b">
				<label>
					户主姓名:
				</label>
				<input type="text" placeholder="联系人姓名"  name="household" class="updateInfo"  value="${fksbInfoZncbVO.householdName}"  disabled="true">
				</a>
			</div>

			<div class="ui-form-item ui-border-b">
				<label>
					手机号码:
				</label>
				<input type="tel" placeholder="请输入手机号码"  name="phone" class="updateInfo"  value="${fksbInfoZncbVO.phone}"  disabled="true">
			</div>
		</div>

		</section>
		<!-- 注册按键 -->
		<section class="register-btn">
			<input type="button" class="layui-btn" id="submit" lay-submit="" lay-filter="update" value="修改"></input>
		</section>

		<section class="register-btn">
			<input type="submit" class="layui-btn" id="save" lay-submit="" style="display: none" lay-filter="save" value="保存"></input>
		</section>
	</form>


	<form class="form2 clearfix" action="" method="post" name="form2">
		<div class="ui-form">
			<span class="time-tag"></span>
			<div class="ui-form-item ui-border-b">
				<label>所属机构:</label>

				<input type="text" placeholder="所属机构" value="${fksbDataMprRtrVO.orgNm}"  disabled="true">
			</div>

			<div class="ui-form-item ui-border-b">
				<label>测点编号:</label>
				<input type="text" placeholder="测点编号"  value="${fksbDataMprRtrVO.mpcd}"   disabled="true">
			</div>
		</div>
		<!-- end -->
		<c:choose>

			<c:when test="${fksbDataMprRtrVO.eqStates eq -1 }">
				<div class="mt10 ui-form">
					<div class="ui-form-item ui-border-b">
						<label>
							提示:

						</label>
						<input type="text" placeholder="累计水量" style="margin-left:95px;"  value="当前水表为上报数据"  disabled="true">


						</a>
					</div>
				</div>
			</c:when>


			<c:otherwise>
				<div class="mt10 ui-form">
					<div class="ui-form-item ui-border-b">
						<label>
							采集时间:

						</label>
						<input type="text" placeholder="采集时间" value="<fmt:formatDate value="${fksbDataMprRtrVO.time}" pattern="yyyy-MM-dd hh:mm" />"  disabled="true">

						</a>
					</div>

					<div class="ui-form-item ui-form-item-r ui-border-b">
						<label>
							累计水量:
						</label>
						<input type="text" placeholder="累计水量" style="margin-left:95px;"  value="${fksbDataMprRtrVO.accumuWater}"  disabled="true">
						<!-- 若按钮不可点击则添加 disabled 类 -->
						<button type="button" class="ui-border-l">立方米</button>
					</div>
					<div class="ui-form-item ui-form-item-r ui-border-b">
						<label>
							表头读数:
						</label>
						<input type="text" placeholder="表头读数" style="margin-left:95px;" value="${fksbDataMprRtrVO.totalQty}"  disabled="true">
						<!-- 若按钮不可点击则添加 disabled 类 -->
						<button type="button" class="ui-border-l">立方米</button>
					</div>
					<div class="ui-form-item ui-border-b">
						<label>
							阀门状态:
						</label>
						<input type="tel" placeholder="阀门状态"  value="${fksbDataMprRtrVO.fmStates==0?"开":"关"}"  disabled="true">
						</a>
					</div>
					<div class="ui-form-item ui-border-b">
						<label>
							信号强度:
						</label>
						<input type="tel" placeholder="信号强度" value="${fksbDataMprRtrVO.signals>5?"信号正常":"信号较弱"}"  disabled="true">
						</a>
					</div>
					<div class="ui-form-item ui-border-b">
						<label>
							电池电量:
						</label>
						<input type="tel" placeholder="电池电量" value="${fksbDataMprRtrVO.v>10?"电量正常":"电量较低"}"  disabled="true">
						</a>
					</div>
					<div class="ui-form-item ui-border-b">
						<label>
							设备状态:
						</label>
						<input type="tel" placeholder="设备状态" value="${fksbDataMprRtrVO.eqStates>7?"数据中断":"设备正常"}"  disabled="true">
						</a>
					</div>

				</div>
			</c:otherwise>
		</c:choose>

	</form>

</div>
</body>
<script language="javascript" type="text/javascript">
    $(function(){
     
        $('.tab').click(function(){
            $(this).addClass('tabActive').siblings().removeClass('tabActive');
            var index =$(this).index();
            $('.centerMain').children().eq(index).show().siblings().hide();
        })
    });
</script>
</html>