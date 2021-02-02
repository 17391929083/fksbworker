<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>水表注册</title>
	<meta charset="gbk">
	<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0">
	<meta content="telephone=no" name="format-detection" />
	<meta name="apple-mobile-web-app-capable" content="yes" />
	<meta content="" name="keywords">
	<meta content="" name="description">
	<meta http-equiv="Cache-Control" content="max-age=60" />
	<link rel="stylesheet" href="../pages/view/enrol/css/register-wap.css?v=345464" />
	<script src="../pages/js/jquery-3.5.1.js?v=15674"></script>
	<script src="../pages/js/saoyisao.js?v=56465464"></script>
	<link rel="stylesheet" type="text/css" href="../pages/layui/css/layui.css?v=201811012"/>
	<script src="../pages/layui/layui.js?v=114" charset="UTF-8"></script>
	<script src="http://res2.wx.qq.com/open/js/jweixin-1.6.0.js"></script>
	<script src="../pages/js/ajax.js?v=114"></script>
	<script src="../pages/view/enrol/js/enrol.js?v=266"></script>
   <style type="text/css">
	   #selectTown input{
		   height: 10%;
		   border: none;


	   }
	   #selectTown dl{
		   margin-top: -7%;
      }

	   #village input{
		   height: 10%;
		   border: none;


	   }
	   #village dl{
		   margin-top: -7%;
	   }

	   .form-control {
		   color: #423f3f;
	   }

	   .layui-icon{
		   font-size: 26px;
		   color: #FFFFFF;


	   }


	   img {
		   border: none;
		   width: 38%;
	   }




   </style>

</head>
<body>
<nav>
	<a href="javascript:history.back(-1)" style="float: left"  class='goback'>
		<i class="layui-icon">&#xe65c;</i>
	</a>

	水表注册</nav>

<form class="layui-form layui-form-pane"  method="post">

	<!-- 手机注册开始 -->
	<div id="error_display" style="text-align:center;color:#ff0000;display:none;">
		<!--错误信息显示区域-->
	</div>




	<section class="phone-register">
		<div class="register-item">
			<div class="inputs ">
				<label for="adNm">行政区域：</label>
				<input type="text"  name="adCd"   autocomplete="off" class="form-control" id="adNm"  value=""/>
			</div>
			<div class="tip">请输入手机号码</div>
		</div>


		<!-- 用户名 -->
		<div class="register-item">
			<div class="inputs ">
				<label for="orgNm">机构名称：</label>
				<input type="text" lay-verify="required" name="orgCd" autocomplete="off" class="form-control" value="" id="orgNm"/>
			</div>
			<div class="tip">请输入用户名</div>
		</div>

		<!-- 用户名-->
		<div class="register-item">
			<div class="inputs ">
				<label for="selectTown">乡镇街道：</label>
				<div class="layui-input-inline" id="selectTown">
					<select  lay-verify="required" name="townid"  lay-filter="selectTown" id="townList" lay-search="">
						<option value="">选择或搜索镇街道</option>

				</select>
				</div>
			</div>
			<div class="tip">请输入用户名</div>
		</div>


		<div class="register-item">
			<div class="inputs ">
				<label for="village">村名小区：</label>
				<div class="layui-input-inline" id="village">
					<select path="" lay-verify="required"  name="villiid" lay-search="" id="villList">
						<option value="">选择或搜索村小区</option>
				
					</select>
				</div>
			</div>
			<div class="tip">请输入用户名</div>
		</div>


		<div class="register-item ">
			<div class="inputs verifycode-inputs">
				<label for="equiid">设备编码：</label>
				<input type="text"  lay-verify="required" name="equicd" class="form-control" id="equiid"/>
				<span id="getcode"><a href="javascript:void(0);"  onclick="saoyisao('equiid')" class="getcode">扫一扫 </a></span>
			</div>
			<div class="tip">请输验证码</div>
		</div>


		<div class="register-item ">
			<div class="inputs verifycode-inputs">
				<label for="picName">图片名称：</label>
				<input type="text"  lay-verify="required"  placeholder="请拍摄基表二维码"   name="equiPic" class="form-control" id="picName" readonly="readonly"/>
				<%--<button type="button" class="layui-btn layui-bg-green" name="file" id="picupload">图片上传</button>--%>
				<span id="getcode"><a href="javascript:void(0);" id="picupload" class="getcode">上传图片</a></span>

			</div>
			<div class="tip">请输验证码</div>
		</div>


		<div class="ui-form-item ui-form-item-r ui-border-b">

			<div class="register-item " id="photo-list">预览图(点击放大):<br/>
				<img class="layui-upload-img img"   id="imgs1">


				<p id="demoText"></p>
			</div>

		</div>

		</div>

	</section>
	<!-- 注册按键 -->
	<section class="register-btn">
		<input type="submit" class="layui-btn" id="submit" lay-submit="" lay-filter="submit" value="下一步"></input>

	</section>

</form>
<script type="text/javascript">
    jQuery('#password').focus(function(){
        document.getElementById('password_tip_div').style.visibility = 'visible';//显示
        jQuery("#password_tip_div").html('请输入密码,密码为数字、字母(区分大小写)、标点组合,长度6-20位');

    });
</script>
<footer class="text-center">

	<p><a href="" target="_blank"></a>
		</p>
</footer>
</body></html>