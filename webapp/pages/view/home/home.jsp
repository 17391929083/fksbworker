<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>运维首页</title>

	<meta name="viewport" content="width=device-width,height=device-height,inital-scale=1.0,maximum-scale=1.0,user-scalable=no;">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<meta name="format-detection" content="telephone=no">
	<meta charset="utf-8">
	<meta http-equiv="Cache-Control" content="max-age=60" />
	<link href="../pages/view/home/css/style.css" rel="stylesheet" type="text/css" />
	<link href="../pages/view/home/css/iscroll.css" rel="stylesheet" type="text/css" />
	<style>
		.banner img {width: 100%;}
	</style>

	<script type="text/javascript" src="../pages/view/home/js/iscroll.js"></script>
	<script type="text/javascript">
        var myScroll;
        function loaded(){
            myScroll = new iScroll('wrapper', {
                snap: true,
                momentum: false,
                hScrollbar: false,
                onScrollEnd: function () {
                    document.querySelector('#indicator > li.active').className = '';
                    document.querySelector('#indicator > li:nth-child(' + (this.currPageX+1) + ')').className = 'active';
                }
            });
        }
        document.addEventListener('DOMContentLoaded', loaded, false);
	</script>


</head>
<body>

<!--music-->
<style>
	.btn_music{display:inline-block;width:35px;height:35px;background:url('images/play.png') no-repeat center center;background-size:100% auto;position:absolute;z-index:100;left:15px;top:20px;}
	.btn_music.on{background-image:url('/images/stop.png');}
</style>

<script src="../pages/js/jquery-3.5.1.js?v=15674"></script>
<script type="text/javascript">
    var playbox = (function(){
        //author:eric_wu
        var _playbox = function(){
            var that = this;
            that.box = null;
            that.player = null;
            that.src = null;
            that.on = false;
            //
            that.autoPlayFix = {
                on: true,
                //evtName: ("ontouchstart" in window)?"touchend":"click"
                evtName: ("ontouchstart" in window)?"touchstart":"mouseover"

            }
        }

        _playbox.prototype = {
            init: function(box_ele){
                this.box = "string" === typeof(box_ele)?document.getElementById(box_ele):box_ele;
                this.player = this.box.querySelectorAll("audio")[0];
                this.src = this.player.src;
                this.init = function(){return this;}
                this.autoPlayEvt(true);
                return this;
            },
            play: function(){
                if(this.autoPlayFix.on){
                    this.autoPlayFix.on = false;
                    this.autoPlayEvt(false);
                }
                this.on = !this.on;
                if(true == this.on){
                    this.player.src = this.src;
                    this.player.play();
                }else{
                    this.player.pause();
                    this.player.src = null;
                }
                if("function" == typeof(this.play_fn)){
                    this.play_fn.call(this);
                }
            },
            handleEvent: function(evt){
                this.play();
            },
            autoPlayEvt: function(important){
                if(important || this.autoPlayFix.on){
                    document.body.addEventListener(this.autoPlayFix.evtName, this, false);
                }else{
                    document.body.removeEventListener(this.autoPlayFix.evtName, this, false);
                }
            }
        }

        return new _playbox();

    })();

    playbox.play_fn = function(){
        this.box.className = this.on?"btn_music on":"btn_music";
    }
</script>

<script type="text/javascript">
    $(document).ready(function(){
        playbox.init("playbox");
    });
</script>

<span id="playbox" class="btn_music" onclick="playbox.init(this).play();"><audio id="audio" loop src="images/4.mp3"></audio></span>

<div class="banner">

	<div id="wrapper">
		<div id="scroller">
			<ul id="thelist">
				<li><p>幻灯片01</p><a href="javascript:void(0)"><img src="../pages/view/home/images/3.jpg" /></a></li>
				<li><p>幻灯片02</p><a href="javascript:void(0)"><img src="../pages/view/home/images/4.jpg" /></a></li>
				<li><p>幻灯片03</p><a href="javascript:void(0)"><img src="../pages/view/home/images/2.jpg" /></a></li>
				<li><p>幻灯片04</p><a href="javascript:void(0)"><img src="../pages/view/home/images/1.gif" /></a></li>
			</ul>
		</div>
	</div>

	<div id="nav">
		<ul id="indicator">
			<li class="active" ></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
	</div>

</div>

<ul class="mainmenu">
	<li><a href="../fksbEnrolController/index" ><b><img src="../pages/view/home/images/tb01.png" /></b><span>水表注册</span></a></li>
	<li><a href="../fksbSelectController/scanningCode"><b><img src="../pages/view/home/images/tb02.png" /></b><span>修改查询</span></a></li>
	<li><a href="../fksbMainTainCintroller/index" ><b><img src="../pages/view/home/images/tb03.png" /></b><span>水表维护</span></a></li>
	<li><a href="../workInstantsController/index" ><b><img src="../pages/view/home/images/tb04.png" /></b><span>我的安装</span></a></li>
	<%--<li><a href="/" ><b><img src="../pages/view/home/images/tb05.png" /></b><span>使用说明</span></a></li>--%>
	<%--<li><a href="/" ><b><img src="../pages/view/home/images/tb06.png" /></b><span>团队介绍</span></a></li>--%>
	<%--<li><a href="/" ><b><img src="../pages/view/home/images/tb06.png" /></b><span>人才招聘</span></a></li>--%>
	<%--<li><a href="/" ><b><img src="../pages/view/home/images/tb07.png" /></b><span>联系我们</span></a></li>--%>
	<%--<li><a href="/" ><b><img src="../pages/view/home/images/tb08.png" /></b><span>在线留言</span></a></li>--%>
</ul>


<script type="text/javascript">
    var count = document.getElementById("thelist").getElementsByTagName("img").length;

    var count2 = document.getElementsByClassName("menuimg").length;
    for(i=0;i<count;i++){
        document.getElementById("thelist").getElementsByTagName("img").item(i).style.cssText = " width:"+document.body.clientWidth+"px";
    }
    document.getElementById("scroller").style.cssText = " width:"+document.body.clientWidth*count+"px";

    setInterval(function(){
        myScroll.scrollToPage('next', 0,400,count);
    },3500 );

    window.onresize = function(){
        for(i=0;i<count;i++){
            document.getElementById("thelist").getElementsByTagName("img").item(i).style.cssText = " width:"+document.body.clientWidth+"px";
        }
        document.getElementById("scroller").style.cssText = " width:"+document.body.clientWidth*count+"px";
    }
</script>
</body>
</html>