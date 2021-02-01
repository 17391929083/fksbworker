<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>信息修改</title>
<meta charset="utf-8">
<meta name="format-detection" content="telephone=no">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-touch-fullscreen" content="yes">
	<meta http-equiv="Cache-Control" content="max-age=60" />
<meta http-equiv="Access-Control-Allow-Origin" content="*">
<%@ include file="/head.jsp"%>
<script src="<c:url value='/src/pages/login/js/updatePer.js?v=23544456'/>"></script>



</head>
<body ontouchstart>

	<header class="pui-header">
	<h1 class="pui-title">信息修改</h1>
	</header>
	<form class="layui-form layui-form-pane"  method="post" style="margin-top: 13%">
	<input id="ids"   name="id" type="hidden"  value="${id}">
		<input id="ids"   name="openid" type="hidden"  value="${openid}">
	
		<div class="layui-form-item" pane="">
			<label class="layui-form-label">发布类型</label>
			<div class="layui-input-block" onclick="fblx()">
				<input type="radio" name="fbType" value="1" title="个人" id="input1"
					> <input type="radio" name="fbType"
					value="2" title="班组" id="input2">
			</div>
		</div>
		<div class="layui-form-item" id="gznum" style="display: none">
			<label class="layui-form-label">工组人数</label>
			<div class="layui-input-block">
				<input type="number" id="perNum" name="perNum" lay-verify="title"
					autocomplete="off" placeholder="请输入工组人数" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">工种</label>
			<div class="layui-input-block" id="gsType">
				<input type="radio" name="gzType" value="钢筋工" title="钢筋工" checked="checked"> <input
					type="radio" name="gzType" value="混凝土工" title="混凝土工"> <input
					type="radio" name="gzType" value="木工" title="木工"> <input
					type="radio" name="gzType" value="电工" title="电工"> <input
					type="radio" name="gzType" value="油漆工" title="混凝土工"> <input
					type="radio" name="gzType" value="水暖工" title="水暖工"> <input
					type="radio" name="gzType" value="架子工" title="架子工"> <input
					type="radio" name="gzType" value="机械工" title="机械工"> <input
					type="radio" name="gzType" value="其他" title="其他">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">工作地区</label>
			<div class="layui-input-inline">
				<select name="PR_CD" id="proces" lay-filter="demo"  lay-verify="required" lay-reqtext="所属省份不能为空？">
		</select>
			</div>
			<div class="layui-input-inline">
				<select name="CI_CD" id="proces2" lay-verify="required" lay-reqtext="所属市区不能为空？">
								</select>
			</div>
		</div>

		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label">工作经验自我介绍</label>
			<div class="layui-input-block">
				<textarea placeholder="工作经验，尽量多说几句" name="workPro"  id="workPro"  class="layui-textarea" lay-verify="required" lay-reqtext="工作经验岂能为空？"></textarea>
			</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">真实姓名</label>
			<div class="layui-input-block">
      <input type="text" name="youName" id="youName"  lay-verify="required" lay-reqtext="联系方式是必填项，岂能为空？"  value="${youName}" placeholder="请输入" autocomplete="off" class="layui-input">

			</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">联系方式</label>
			<div class="layui-input-block">
		<input type="text" name="phone" id="phone" lay-verify="required" value="${phone}" lay-reqtext="联系方式是必填项，岂能为空？" placeholder="请输入" autocomplete="off" class="layui-input">
</div>
		</div>
		<!--  
		<div class="layui-upload">
			<button type="button" class="layui-btn" id="uploadBtn">上传身份证</button>
			<blockquote class="layui-elem-quote layui-quote-nm"
				style="margin-top: 10px;">
				正反面(选填)：
				<div class="layui-upload-list" id="previewBox"></div>
			</blockquote>
		</div>
-->
		<div class="layui-form-item ">
	
	<button class="layui-btn layui-col-xs-offset8" lay-submit lay-filter="update" >修改</button>
				
		</div>
	</form>
</body>
</html>