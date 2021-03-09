<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
	<meta http-equiv="Cache-Control" content="max-age=60" />
	<link href="../pages/view/maintain/css/cityselect.css" rel="stylesheet" type="text/css" />
	<link href="../pages/view/maintain/css/frozen.css" rel="stylesheet" type="text/css" />
	<link href="../pages/view/maintain/css/index.css?v=33332" rel="stylesheet" type="text/css" />
	<script src="../pages/js/jquery-3.5.1.js?v=15674"></script>
	<script src="../pages/js/saoyisao.js?v=15674"></script>
	<script src="../pages/js/picImage.js?v=15674"></script>
	<link rel="stylesheet" type="text/css" href="../pages/layui/css/layui.css?v=1132"/>
	<script src="http://res2.wx.qq.com/open/js/jweixin-1.6.0.js"></script>
	<script src="../pages/layui/layui.js?v=235445" charset="UTF-8"></script>
	<script src="../pages/js/ajax.js?v=7868"></script>
	<script src="../pages/view/maintain/js/maintain.js?v=111"></script>
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
		  width: 38%;
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
		水表维护</div>
</div>
<div class="centerMain">
	<form class="layui-form layui-form-pane">
		<div class="ui-form">
			<span class="time-tag"></span>
			<div class="ui-form-item ui-form-item-r ui-border-b">
				<label>
					旧表编号:
				</label>
				<input type="text"  id="oldEquiid" name="oldEquiid" placeholder="旧表编号" style="margin-left:95px;" >
				<!-- 若按钮不可点击则添加 disabled 类 -->
				<button type="button" onclick="saoyisao('oldEquiid')" class="ui-border-l">扫一扫</button>
			</div>

			<div class="ui-form-item ui-form-item-r ui-border-b">
				<label>
					基表读数:
				</label>
				<input type="text"  name="waterNum" placeholder="基表读数" style="margin-left:95px;" >
				<!-- 若按钮不可点击则添加 disabled 类 -->
				<button type="button" class="ui-border-l">立方米</button>
			</div>
	

			<div class="ui-form-item ui-form-item-r ui-border-b">
				<label>
					新表编号:
				</label>
				<input type="text"  id="newEquiid"  name="newEquiid" placeholder="新表编号" style="margin-left:95px;" >
				<!-- 若按钮不可点击则添加 disabled 类 -->
				<button type="button" onclick="saoyisao('newEquiid')" classs="ui-border-l">扫一扫</button>
			</div>

			<div class="ui-form-item ui-form-item-r ui-border-b">
				<label>
					图片名称:
				</label>
				<input type="text" id="imgName" placeholder="请拍摄旧表读数"  name="pciLine" style="margin-left:95px;" >
				<!-- 若按钮不可点击则添加 disabled 类 -->
                <button type="button" class="layui-btn layui-bg-green" onclick="creatPic('imgs1','imgName')">拍照上传</button>

            </div>

		

			<button type="button" style="display: none"   class="layui-btn layui-bg-green"  onclick="creatPic('imgs1','imgName')">拍照上传</button>

            <div class="ui-form-item ui-form-item-r ui-border-b">

			<div class="layui-upload-list" id="photo-list">预览图(点击放大):<br/>
                <img class="layui-upload-img img"    id="imgs1">
            

                <p id="demoText"></p>
			</div>
           
			</div>





		</div>


		<div class="ui-btn-wrap mt50 ui-form" style="margin-top:50%">

			<input type="submit" class="ui-btn-lg ui-btn-success" lay-submit="" lay-filter="submit" value="更换"></input>

		</div>

	</form>
</div>
</body>
</html>