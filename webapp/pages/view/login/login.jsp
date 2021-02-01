<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>实名认证</title>
<meta name="format-detection" content="telephone=no">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-touch-fullscreen" content="yes">
<meta http-equiv="Access-Control-Allow-Origin" content="*">
	<meta http-equiv="Cache-Control" content="max-age=60" />
	<link rel="stylesheet" type="text/css" href="../pages/layui/css/layui.css?v=201811012"/>
	<link rel="stylesheet" type="text/css" href="../pages/css/style.css?v=3434?v=201811012"/>
	<script src="../pages/layui/layui.js?v=114" charset="UTF-8"></script>
	<script src="../pages/js/jquery-3.5.1.js?v=15674"></script>



	<style type="text/css">
	  .pui-header {
		  height: 2.88rem;
	
	  }

	  .pui-header .pui-title {
		  line-height: 2.88rem;
		  font-size: 1.34rem;
	  }

	  .layui-carousel{

		  margin-top: 13%;

	  }
	  .layui-row{

	  margin-top: 10px;
	  }

	  .divmargin{
		  margin-left: 5%;
	  }
	  .margins{
		  margin-left: 30% !important;
	  }
    </style>

</head>
<body ontouchstart>

<header class="pui-header">
	<h1 class="pui-title">实名认证</h1>
</header>
<div class="layui-carousel" id="test3" lay-filter="test4">
	<div carousel-item="">
		<div><img src="../pages/view/login/images/workers5.png"></div>
		<div><img src="../pages/view/login/images/workers5.png"></div>
		<div><img src="http://pic30.photophoto.cn/20140115/0040039504628208_b.jpg"></div>
		<div><img src="../pages/view/login/images/workers5.png"></div>
		<div><img src="../pages/view/login/images/workers5.png"></div>
	</div>
</div>
  <div class="layui-row">
	<form class="layui-form layui-form-pane"  method="post">
		<div class="layui-form-item">
			<div class="layui-inline">
				<label class="layui-form-label">手机号码：</label>
				<div class="layui-input-inline">
					<input type="tel" id="phone"  name="phone" lay-verify="required|phone" placeholder="*必填选项" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">姓名：</label>
				<div class="layui-input-inline">
					<input type="text" name="workername" lay-verify="required" placeholder="*必填选项" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-inline">
				<label class="layui-form-label">验证码：</label>
				<div class="layui-input-inline">
					<input type="text" name="newCode" lay-verify="required" placeholder="*必填选项" autocomplete="off" class="layui-input">
				</div>

			</div>
			<input id="openid"   name="openid" type="hidden"  value="${sessionScope.fromUserName}">


		</div>
       		<div class="layui-input-inline" style="float: right;margin-right: 5%;">
				<input  type="button" id="code"   class="layui-btn"  value="获取验证码"></input>
				<input type="submit" class="layui-btn" lay-submit="" lay-filter="login" value="提交信息"></input>
		</div>
     
    </form>

</div>

</body>
<script src="../pages/js/ajax.js?v=114"></script>
<script src="../pages/view/login/js/login.js?v=5567"></script>

</html>