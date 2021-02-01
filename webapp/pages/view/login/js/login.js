layui.use(['carousel', 'form'], function(){

    var carousel = layui.carousel
        ,form = layui.form;
    //改变下时间间隔、动画类型、高度
    carousel.render({
        elem: '#test3'
        ,height: '190px'
        ,width:'100%'
    });

    $(document).on('click','#code',function () {
        var fromUserName=$("#openid").val();
        var phone=$("#phone").val();
    var  json=AjaxAction("get","../wxbdController/getMessages","fromUserName="+fromUserName+"&phone="+phone);
    var jsonData=json.code;
     console.info(jsonData);

        var code = $("#code");
        code.attr("disabled","disabled");
        setTimeout(function(){
              code.css("opacity","0.8");
        },1000)
        var time = 60;
        var set=setInterval(function(){
            code.val("("+--time+")秒后重新获取");
        }, 1000);
        setTimeout(function(){
            code.attr("disabled",false).val("重新获取验证码");
            clearInterval(set);
        }, 60000);
    })

    //监听提交
    form.on('submit(login)', function(data){
        var fromUserName=$("#openid").val();
        var newCode=data.field.newCode;
        console.log(newCode);
        var json = AjaxAction("POST", "../wxbdController/checkMessages", "fromUserName=" + fromUserName + "&newCode="+newCode);
        console.info(json.info);
        switch(json.info) {
            case "1":
               layer.alert('验证码超时', {icon: 5});
                return false;
            case "-1":
                layer.alert('验证码错误', {icon: 5});
                return false;

        }
        var index = layer.load(1, {
            shade: [0.1,'#fff'] //0.1透明度的白色背景
        });
        $.ajax({
            url:'../wxbdController/insertWorks',
            method:'post',
            data:data.field,
            dataType:'JSON',
            success:function(res){
            
                if(res.signInsert='1'){
                    layer.close(index);
                    //墨绿深蓝风

                    layer.alert('信息注册成功,点击确定跳转登录界面', {
                        skin: 'layui-layer-molv' //样式类名
                        ,closeBtn: 0
                    }, function(){
                        var fromUserName=$("#openid").val();
                        
                        window.location.href='../workerEnterController/index?fromUserName='+fromUserName;
                    });
                }
                else{
                    layer.alert('失败', {icon: 6});
                    layer.close(index);
                }

            }
        }) ;

        return false;
    });








});
