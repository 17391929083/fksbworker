layui.use(['carousel', 'form'], function(){

    var carousel = layui.carousel
        ,form = layui.form;

    //监听提交
    form.on('submit(enter)', function(data){
            var index = layer.load(1, {
            shade: [0.1,'#fff'] //0.1透明度的白色背景
        });
            console.info(data);
        $.ajax({
            url:'../workerEnterController/entering',
            method:'post',
            data:data.field,
            dataType:'JSON',
            success:function(res){
                console.info(res+"===="+res.result);
                if(res.result==0){
                    layer.close(index);
                    //墨绿深蓝风

                    layer.alert('登录成功,点击确定开始注册水表', {
                        skin: 'layui-layer-molv' //样式类名
                        ,closeBtn: 0
                    }, function(){

                        window.location.href='../workHomeController/index';

                    });
                }
                else{
                    layer.alert('失败!账号密码错误', {icon: 6});
                    layer.close(index);
                }

            }
        }) ;

        return false;
    });








});
