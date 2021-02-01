<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>仿妈妈网html5手机注册界面源代码模板</title>
	<meta charset="gbk">
	<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0">
	<meta content="telephone=no" name="format-detection" />
	<meta name="apple-mobile-web-app-capable" content="yes" />
	<meta content="" name="keywords">
	<meta content="" name="description">

	<link rel="stylesheet" href="../pages/view/enrol/css/register-wap.css" />

	<script src="../pages/js/jquery-3.5.1.js?v=15674"></script>
	<script src="	http://res2.wx.qq.com/open/js/jweixin-1.6.0.js"></script>

</head>
<body>
<nav>
	<a href="#" class='goback'>
		<b></b>
	</a>
	注册帐号</nav>


<form action="#" id="register_form" autocomplete="off" method="post">
	<!-- 手机注册开始 -->
	<div id="error_display" style="text-align:center;color:#ff0000;display:none;">
		<!--错误信息显示区域-->
	</div>
	<section class="phone-register">
		<div class="register-item">
			<div class="inputs ">
				<label for="phone">行政区域23423：</label>
				<input type="phone" class="form-control" id="phone" name="phone" />
			</div>
			<div class="tip">请输入手机号码</div>
		</div>


		<!-- 用户名 -->
		<div class="register-item">
			<div class="inputs ">
				<label for="username">机构名称：</label>
				<input type="text" class="form-control" name="username" id="username" />
			</div>
			<div class="tip">请输入用户名</div>
		</div>

		<!-- 用户名 -->
		<div class="register-item">
			<div class="inputs ">
				<label for="username">乡镇街道：</label>
				<input type="text" class="form-control" name="username"  />
			</div>
			<div class="tip">请输入用户名TTTT</div>
		</div>

		<!-- 用户名 -->
		<div class="register-item">
			<div class="inputs ">
				<label for="username">村名小区：</label>
				<input type="text" class="form-control" name="username"  />
			</div>
			<div class="tip">请输入用户名666</div>
		</div>


		div class="register-item">
		<div class="inputs ">
			<label for="username">扫一扫：</label>
			<input type="button" class="form-control"  onclick="x()" value="扫一扫"  />
		</div>
		<div class="tip">请输入用户名666</div>
		</div>



		</div>

	</section>
	<!-- 注册按键 -->
	<section class="register-btn">
		<button type="button" id="submit" onClick="x()">11扫一扫</button>
	</section>
	<section class='text-center'>
		请认真核对水表信息
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





<script type="text/javascript">

function x() {


    var _data = {


       url:window.location.href,


        t:Math.random()

    };

    var _getWechatSignUrl ="../fksbEnrolController/getWxArgs";

    // 获取微信签名

    $.ajax({

        url:_getWechatSignUrl,

        data:_data,

        dataType:"json",

        success:function (o) {

           alert('获取数据：timestamp:'+o.timestamp, o.nonceStr, o.signature,o.appId);

            console.log("获取微信签名:"+o);

           

                wxConfig(o.timestamp, o.nonceStr, o.signature,o.appId);

                console.log("appid:"+o.appId)


        },
		err:function (err) {

            alert("----"+err);

        }

    });

    function wxConfig(_timestamp, _nonceStr, _signature,_appId) {

        //alert('获取数据：'+_timestamp+'\n'+_nonceStr+'\n'+_signature);

        console.log('获取数据：' + _timestamp +'\n' + _nonceStr +'\n' + _signature);

        wx.config({

            debug:true,// 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。

            appId: _appId,// 必填，公众号的唯一标识

            timestamp: _timestamp,// 必填，生成签名的时间戳

            nonceStr: _nonceStr,// 必填，生成签名的随机串

            signature: _signature,// 必填，签名，见附录1

            jsApiList: ['checkJsApi','scanQRCode']

// 必填，需要使用的JS接口列表，所有JS接口列表见附录2

        });

        wx.error(function(res) {
            alert("出错了：" + res.errMsg);//这个地方的好处就是wx.config配置错误，会弹出窗口哪里错误，然后根据微信文档查询即可。
        });

        wx.scanQRCode({
            needResult: 0, // 默认为0，扫描结果由微信处理，1则直接返回扫描结果，
            scanType: ["qrCode","barCode"], // 可以指定扫二维码还是一维码，默认二者都有
            success: function (res) {
                var result = res.resultStr; // 当needResult 为 1 时，扫码返回的结果
            console.info(result);
            }
        });

    }
}




</script>
</body></html>