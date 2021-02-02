layui.use(['carousel', 'form','upload'], function(){

    var carousel = layui.carousel
        ,form = layui.form
        ,upload = layui.upload;
    //自定义验证规则
    form.verify({
        equiid: function(value){
            if(value==null||value==""){
                return '设备编码不能为空';
            }
        }})
    //普通图片上传

    $('#loading').on('click', function () {
        var oldequiid = $("#oldEquiid").val();
        var newequiid = $("#newEquiid").val();
        if(oldequiid==null||oldequiid==""||newequiid==null||newequiid==""){

        layer.msg('请先扫码获取设备编码', {icon: 2});
        return false;
        }
        $('#picupload').click();
    });
    //图片点击放大

    $('#photo-list img').on('click', function () {
        layer.photos({
            photos: '#photo-list',
            shadeClose: true,
            closeBtn: 1,
            anim: 0
        });
    })



    var uploadInst = upload.render({
         elem: '#picupload'
        ,url: '../fksbMainTainCintroller/picuPload' //改成您自己的上传接口
        ,headers: {access_token: localStorage.access_token}
        ,type:"POST"
        ,accept: 'images'//校验上传文件类型
         ,ext: 'jpg|png|gif|bmp|jpeg'
         ,enctype:"multipart/form‐data"
        ,size: 0
        ,before: function(obj){

            loading= layer.load(2, {
                shade: false,


            });

        }
        ,done: function(res){
            $("#imgName").val(res.imgName);
            $('#imgs1').attr('src', res.imgs1); //图片链接（base64）
            layer.close(loading);
            return layer.msg('成功');
            //如果上传失败
            if(res.code > 0){
                layer.close(loading);
                return layer.msg('上传失败');
            }
            //上传成功
        }
        ,error: function(){
            layer.close(loading);
            //演示失败状态，并实现重传
            var demoText = $('#demoText');
            demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
            demoText.find('.demo-reload').on('click', function(){
                uploadInst.upload();
            });
        }
    });


    //监听提交
    form.on('submit(submit)', function(data){

        var json = AjaxAction("POST", "../fksbMainTainCintroller/changEquiid",data.field);
    
        if(json.changesign==0){


            window.location.href='../fksbMainTainCintroller/successresult';

            return false;
        }else if(json.changesign==2){
            layer.msg('旧设备不存在,请核实!');

            return false;
        }else{
            window.location.href='../fksbMainTainCintroller/errorresult';

            return false;
        }
        return false;

      
    });
 });
function  saoyisaosss(div) {

    alert(div);

}

function deleimg(e) {
$(e).parent().remove();

}