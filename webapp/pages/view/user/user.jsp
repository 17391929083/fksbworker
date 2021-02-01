<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>用户注册</title>
	<meta charset="gbk">
	<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0">
	<meta content="telephone=no" name="format-detection" />
	<meta name="apple-mobile-web-app-capable" content="yes" />
	<meta content="" name="keywords">
	<meta content="" name="description">
	<meta http-equiv="Cache-Control" content="max-age=60" />
	<link rel="stylesheet" href="../pages/view/user/css/register-wap.css?v=17874" />
	<script src="../pages/js/jquery-3.5.1.js?v=15674"></script>
	<link rel="stylesheet" type="text/css" href="../pages/layui/css/layui.css?v=20112"/>
	<script src="../pages/layui/layui.js?v=114" charset="UTF-8"></script>
	<script src="http://res2.wx.qq.com/open/js/jweixin-1.6.0.js"></script>
	<script src="../pages/js/ajax.js?v=114"></script>
	<script src="../pages/view/user/js/user.js?v=119"></script>
   <style type="text/css">


	   #watertypes input{
		   height: 10%;
		   border: none;


	   }
	   #watertypes dl{
		   margin-top: -7%;
	   }




	   .form-control {
		   color: #423f3f;
	   }

	   .register-item{
		   margin-bottom: 5%;
	   }

	   .layui-form-label{
		   margin-top: -1px;
		   background: red;
	   }
	   .layui-input-block{
		   background: white;


	   }
	   .layui-icon{
		   font-size: 26px;
		   color: #FFFFFF;


	   }

	   .lefts{

		   margin-left: -8%;
	   }
	   .hidezhuzhai{
		   display: none;

	   }

   </style>

</head>
<body>


<nav>
	<a href="javascript:history.back(-1)" style="float: left"  class='goback'>
		<i class="layui-icon">&#xe65c;</i>
	</a>
	用户注册</nav>

<form class="layui-form layui-form-pane"  method="post">

	<!-- 手机注册开始 -->
	<div id="error_display" style="text-align:center;color:#ff0000;display:none;">
		<!--错误信息显示区域-->
	</div>
   <section class="phone-register">
		</div>
	   <div class="register-item">
		   <div class="inputs layui-input-item">

			   <label for="localHome1" style="margin-top: 2%;">住户位置：</label>
			   <div class="layui-input-inline hideclass">
			   <div class="layui-input-inline  " style="width: 25px;">
				   <input type="text"  id="localHome1"  placeholder="" lay-verify="required" autocomplete="off" class="layui-input" style="height: 27px;">
			   </div>
			   号楼
			   <div class="layui-input-inline " style="width: 25px;">
				   <input type="text"  id="localHome2" lay-verify="required" autocomplete="off" class="layui-input" style="height: 27px;">
			   </div>
			   单元
			   <div class="layui-input-inline " style="width: 40px;">
				   <input type="text"  id="localHome3" lay-verify="required" autocomplete="off" class="layui-input" style="height: 27px;">
			   </div>
			   房
			   </div>
			   
			   <div class="layui-input-inline">
				   <div class="layui-input-inline  hidezhuzhai">
					   <input type="text" id="local"  name="userLocal"  placeholder="" lay-verify="required" autocomplete="off" class="layui-input" style="height: 27px;">
				   </div>
				
			 </div>
		 
			   <input type="checkbox" id="checkbox"  lay-filter="status"  lay-skin="switch" lay-text="住宅|楼房">


		   </div>
	   </div>

		<div class="register-item">
			<div class="inputs ">
				<label for="3">用户姓名：</label>
				<input type="text"  name="userName"lay-verify="required"   autocomplete="off" class="form-control" id="3"  value=""/>
			</div>

		</div>
		<div class="register-item">
			<div class="inputs ">
				<label for="4">联系方式：</label>
				<input type="text"  name="userPhone" lay-verify="required|phone"   autocomplete="off" class="form-control" id="4"  value=""/>
			</div>

		</div>
		<div class="register-item">
			<div class="inputs ">
				<label for="5">房屋面积：</label>
				<input type="text"  name="userAre" lay-verify="required|number" placeholder="*注意:要填写数字"   autocomplete="off" class="form-control" id="5"  value=""/>
			</div>

		</div>



		<div class="register-item">
			<div class="inputs">
				<label for="watertypes">用水类型：</label>
				<div class="layui-input-inline" id="watertypes">
					<select path="" lay-verify="required"  name="waterType" id="watertype" lay-search="">
						<option value="">选择用水类型</option>

					</select>
				</div>
			</div>

		</div>

		<div class="register-item layui-form-item">
			<label class="layui-form-label" style="background: white;margin-top: -1px;padding-left: 0%;" for="userStates">使用状态:</label>
          <div class="layui-input-block" style="background: white" id="userStates">
				<input type="radio" name="userType" value="1" title="使用" checked="">
				<input type="radio" name="userType" value="2" title="空置">
			</div>
		</div>



	</section>
	<!-- 注册按键 -->
	<section class="register-btn">
		<input type="submit" class="layui-btn" id="submit" lay-submit="" lay-filter="submit" value="提交信息"></input>

	</section>

</form>
<footer class="text-center">

	<p><a href="" target="_blank"></a>
		</p>
</footer>
</body></html>