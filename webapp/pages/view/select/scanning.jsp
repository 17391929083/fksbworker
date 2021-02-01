<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>查询水表页面</title>
	<meta http-equiv="Cache-Control" content="max-age=60" />
	<meta name="viewport" content="width=device-width,height=device-height,inital-scale=1.0,maximum-scale=1.0,user-scalable=no;">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<meta name="format-detection" content="telephone=no">
	<meta charset="utf-8">

	<link href="../pages/view/select/css/cityselect.css" rel="stylesheet" type="text/css" />
	<link href="../pages/view/select/css/frozen.css" rel="stylesheet" type="text/css" />
	<link href="../pages/view/select/css/index.css?v=33332" rel="stylesheet" type="text/css" />
	<script src="../pages/js/jquery-3.5.1.js?v=15674"></script>
	<script src="../pages/js/saoyisao.js?v=15674"></script>
	<link rel="stylesheet" type="text/css" href="../pages/layui/css/layui.css?v=201111211012"/>
	<script src="../pages/layui/layui.js?v=114" charset="UTF-8"></script>
	<script src="http://res2.wx.qq.com/open/js/jweixin-1.6.0.js"></script>
	<script src="../pages/js/ajax.js?v=114"></script>
	<script src="../pages/view/select/js/scanning.js?v=56674"></script>
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
  </style>

</head>
<body>
<div class="top">

	<div class="fl tab tabActive layui-form-item">

		<a href="javascript:history.back(-1)" style="float: left"  class='goback'>
			<i class="layui-icon">&#xe65c;</i>
		</a>
		扫码页面</div>
</div>
<div class="centerMain">
	<form class="layui-form layui-form-pane form1 clearfix" action="" method="post" name="form1">

		<div class="tab-container ui-form">
			<div class="ui-form-item ui-border-b">
				<label>设备编码:</label>
				<input type="text" id="equiid" name="equiid" lay-verify="equiid"  placeholder="设备编码">
			</div>


		</div>

			<div class="ui-btn-wrap mt1 ui-form">
			<a  href="#"  onclick="saoyisao('equiid')">	<img src="../pages/view/select/images/saosao.jpg"> </a>
			</div>
	
      <div class="ui-btn-wrap mt20 ui-form">

		  <input type="submit" class="ui-btn-lg ui-btn-success" lay-submit="" lay-filter="enter" value="查询设备"></input>

	  </div>
	

	</form>
</div>
</body>
</html>