layui.use(['carousel', 'form'], function(){
    var form = layui.form;
    /*转载数据，请求镇数据*/
    waterTypes();
    form.render();

    //楼号录入
    //信息框-例2

    //默认prompt
    $('#feilouhao').on('click', function () {
        layer.prompt(function(val, index){
            $('#local').val(val);
            layer.close(index);
        });


    })

    //默认prompt
    $('#localHome3').on('blur', function () {
        var localHome1 = $('#localHome1').val();
        var localHome2 = $('#localHome2').val();
        var localHome3 = $('#localHome3').val();
        if(localHome1==null||localHome1==""||localHome2==null||localHome2==""){
            layer.msg('楼号楼层不能为空!', {icon: 3});
            return false;

        }
        var localhome=localHome1+"号楼"+localHome2+"单元"+localHome3+"房间"
                $('#local').val(localhome);
        });

    //默认prompt
    $('#local').on('blur', function () {
         $('#localHome1').val(0);
        $('#localHome2').val(0);
         $('#localHome3').val(0);
        if(localHome1==null||localHome1==""||localHome2==null||localHome2==""){
            layer.msg('楼号楼层不能为空!', {icon: 3});
            return false;

        }
    });




    form.on('switch(status)', function(data){
        var checked = data.elem.checked;

        if(!checked){
            $(".hideclass").show();
            $(".hidezhuzhai").hide();

        }else{
            $(".hidezhuzhai").show();
            $(".hideclass").hide();




        }

    });



    //监听提交
    form.on('submit(submit)', function(data){
        var json = AjaxAction("POST", "../fksbUserController/userData",data.field);
        //询问框
       if(json.boole==1){
           layer.msg('注册失败', {icon: 3});

       }
        if(json.boole==-1){
            layer.msg('设备已注册，请勿重复注册', {icon: 3});

        }
        if(json.boole==0){
        layer.confirm('恭喜您!注册成功', {
            btn: ['继续注册','返回首页'] //按钮
        }, function(){
            window.location.href='../fksbEnrolController/index';
        }, function(){
            window.location.href='../workHomeController/index';

        });
        }
       return false;
    });


})



/*数据装*/
function waterTypes() {
    var json = AjaxAction("POST", "../fksbUserController/waterTypes","");

    var jsonData=json.list;


    for (var i=0;i<jsonData.length;i++){
       $("#watertype").append("<option value="+jsonData[i].id+">"+jsonData[i].wpName+"</option>");
       }

}
