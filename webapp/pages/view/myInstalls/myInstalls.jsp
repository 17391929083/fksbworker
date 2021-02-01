<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>安装统计</title>

	<meta name="viewport" content="width=device-width,height=device-height,inital-scale=1.0,maximum-scale=1.0,user-scalable=no;">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta http-equiv="Cache-Control" content="max-age=60" />
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<meta name="format-detection" content="telephone=no">
	<meta charset="utf-8">

	<link href="../pages/view/maintain/css/cityselect.css" rel="stylesheet" type="text/css" />
	<link href="../pages/view/maintain/css/frozen.css" rel="stylesheet" type="text/css" />
	<link href="../pages/view/maintain/css/index.css?v=33332" rel="stylesheet" type="text/css" />
	<script src="../pages/js/jquery-3.5.1.js?v=15674"></script>
	<script src="../pages/js/saoyisao.js?v=15674"></script>
	<link rel="stylesheet" type="text/css" href="../pages/layui/css/layui.css?v=1132"/>
	<script src="http://res2.wx.qq.com/open/js/jweixin-1.6.0.js"></script>
	<script src="../pages/layui/layui.js?v=235445" charset="UTF-8"></script>
	<script src="../pages/js/ajax.js?v=64578"></script>
	<script src="../pages/view/myInstalls/js/myInstalls.js?v=187605"></script>
  <style type="text/css">
	  .tab{
		  width: 100%;
		  
	  }
	  .tabActive{
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


	  img {
		  border: none;
		  width: 100%;
	  }

	  leftp{
		 float: left;

	  }
  </style>

</head>
<body>
<div class="top">

	<div class="fl tab tabActive layui-form-item">

		<a href="javascript:history.back(-1)" style="float: left"  class='goback'>
			<i class="layui-icon">&#xe65c;</i>
		</a>
		安装统计</div>
</div>
<div class="centerMain">
	<form class="layui-form layui-form-pane">
		<div class="ui-form">
			<span class="time-tag"></span>
			<div class="leftInput mt20">
				<div class="demo fl">
					<label  class="text cf">安装总数</label>
					<input type="text" maxlength='5' class="inputCity fromCity" id="gs-rk" name="fromCity" value="0台"  readonly/>
				</div>

				<div class="demo fr">
					<label class="text dd">今日安装</label>
					<input type="text" maxlength='5' class="inputCity toCity" id="gs-ck" name="toCity" value="0台" readonly/>
				</div>
			</div>
		</div>


	 <div id="addDiv">
		<div class="mt10 ui-form">
			<div class="ui-form-item ui-border-b">
				<label>测点编号:</label>
				<input type="text" placeholder="联系人姓名"  disabled="true">

			</div>

			<div class="ui-form-item ui-border-b">
				<label>
					设备编号:
				</label>
				<input type="text" placeholder="联系人姓名" disabled="true">
			
			</div>
			<div class="ui-form-item ui-border-b">
				<label>
					安装时间:
				</label>
				<input type="tel" placeholder="请输入手机号码" disabled="true">
			</div>
		</div>

	 </div>

	</form>
</div>
</body>
</html>