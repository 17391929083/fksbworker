layui.use(['carousel', 'form'], function(){

    var carousel = layui.carousel
        ,form = layui.form;

    //弹出登录页面
    $(document).on('click','#submit',function() {
        $("#updateMeter").html("修改信息");
        $(".updateInfo").attr("disabled",false);
        $("#waterdiv1").hide();
        $("#waterdiv2").show();
        $("#submit").hide();
        $("#save").show();

        waterTypes($("#watertype").val());
       form.render();
    });


    //监听提交
    form.on('submit(save)', function(data) {
            //提交修改数据
        var json = AjaxAction("POST", "../fksbSelectController/update", data.field);
       if(json.updateSign==0){
           //信息框-例2
            layer.msg('恭喜你修改成功', {
               time: 0 //不自动关闭
               ,btn: ['返回主页', '留在本页']
               ,yes: function(index){
                    window.location.href='../workHomeController/index';

                }
                ,btn2:function () {
                    window.location.reload();

                }
           });
       }



       return false;
    })

 });


/*数据装*/
function waterTypes(watertype) {
    var json = AjaxAction("POST", "../fksbUserController/waterTypes","");

    var jsonData=json.list;


    for (var i=0;i<jsonData.length;i++){
        $("#watertypes").append("<option value="+jsonData[i].id+">"+jsonData[i].wpName+"</option>");
        if(watertype==jsonData[i].wpName){
        
            $("#watertypes").append("<option value="+jsonData[i].id+" selected=\"true\" >"+jsonData[i].wpName+"</option> ");


        }
    }

    return false;
}