<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<title>账号登录</title>
	<meta name="format-detection" content="telephone=no">
	<meta name="viewport"
		  content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="apple-touch-fullscreen" content="yes">
	<meta http-equiv="Access-Control-Allow-Origin" content="*">
	<meta http-equiv="Cache-Control" content="max-age=60" />
	<link rel="stylesheet" type="text/css" href="../pages/layui/css/layui.css?v=201811012"/>
	<script src="../pages/layui/layui.js?v=114" charset="UTF-8"></script>
	<script src="../pages/js/jquery-3.5.1.js?v=124"></script>




	<style type="text/css">
	body { background-color: white; }

	.pui-btn-space input{ width:100%; border: 0px;}


	.pui-header .pui-title {
		line-height: 2.88rem;
		font-size: 1.34rem;
	}
	.form-header {
		text-align: center;
		margin-bottom: 0.4rem;
	}


	.form-header img {
		/* width: 2.5rem; */
		height: 9rem;
	}

	.form-header p {
		font-size: 1.4rem;

	}
	.form-main {
		padding-top: 1.3rem;

	}
	</style>
</head>
<body ontouchstart>
	<div class="form-wrap">
		<form class="layui-form layui-form-pane"  method="post">
			<input id="fromUserName" type="hidden" name="openid" value="${sessionScope.fromUserName}" />
			<div class="form-main">
				<div class="form-header">
					<img src="../pages/view/enter/images/logo.png?v=2018"/>
				</div>
				<div class="form-header">
					<p>账号登录</p>
				</div>
				<div class="layui-form-item">
					<div class="layui-inline">
						<label class="layui-form-label">账号：</label>
						<div class="layui-input-inline">

							<input type="text" name="loginname" lay-verify="required" placeholder="*必填选项" autocomplete="off" class="layui-input">
						</div>
					</div>
					<div class="layui-form-item">
						<label class="layui-form-label">密码：</label>
						<div class="layui-input-inline">
							<input type="text" name="loginpassword" lay-verify="required"  placeholder="*必填选项" autocomplete="off" class="layui-input">
						</div>
					</div>

					<%--<input id="openid"   name="openid" type="hidden"  value="${fromUserName}">--%>


				</div>
				<div class="layui-input-inline" style="float: right;margin-right: 5%;">
				<input type="submit" class="layui-btn" lay-submit="" lay-filter="enter" value="立即提交"></input>
				</div>
			</div>
		</form>
		<div class="copyright"></div>
	</div>
	<script src="../pages/js/ajax.js?v=114"></script>
	<script src="../pages/view/enter/js/enter.js?v=111167"></script>
</body>
</html>
