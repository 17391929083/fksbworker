layui.use(['carousel', 'form','upload'], function(){
    var form = layui.form
        ,upload = layui.upload;
    /*转载数据，请求镇数据*/
    dataTown();
    form.render();
    /*转载数据，请求村数据*/
    form.on("select(selectTown)", function(data){
        datavillage(data);
        form.render();
    });

    var uploadInst = upload.render({
        elem: '#picupload'
        ,url: '../fksbMainTainCintroller/picuPload' //改成您自己的上传接口
        ,headers: {access_token: localStorage.access_token}
        ,type:"POST"
        ,accept: 'images'//校验上传文件类型
        ,ext: 'jpg|png|gif|bmp|jpeg'
        ,enctype:"multipart/form‐data"
        ,size: 0
        // ,before: function(obj){
        //     obj.preview(function(index, file, result) {
        //         var size = file.size;
        //         alert(size);
        //         if (size > 3) {
        //             layer.msg('文件大小不能超过3M');
        //
        //         }else{
        //             obj.upload(index, file);
        //         }
        //     })
        //     layer.close(index);
        //
        // }
        ,done: function(res){
            $("#picName").val(res.imgName);
            $('#imgs1').attr('src', res.imgs1); //图片链接（base64）
            return layer.msg('成功');
            //如果上传失败
            if(res.code > 0){
                return layer.msg('上传失败');
            }
            //上传成功
        }
        ,error: function(){
            //演示失败状态，并实现重传
            var demoText = $('#demoText');
            demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
            demoText.find('.demo-reload').on('click', function(){
                uploadInst.upload();
            });
        }
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

    //监听提交
    form.on('submit(submit)', function(data){
        var json = AjaxAction("POST", "../fksbEnrolController/insertFksbData",data.field);
    if(json.iniseSign==0){
        window.location.href="../fksbUserController/index";
   }else if(json.iniseSign==-1){
        layer.alert("设备已存在", {icon: 6});
    }



        return false;
    });

})

function datavillage(data){
    var json = AjaxAction("POST", "../fksbEnrolController/selectVillageNm","townId="+data.value);
    var villList = json.villList;
    $("#villList").empty();
    $("#villList").append("<option value=''>请选择村或小区</option>");
    for (var i=0;i<villList.length;i++){
        $("#villList").append("<option value="+villList[i].id+">"+villList[i].name+"</option>");
    }

    /*调用加载村 小区*/
    console.info(data.value);


    
}


/*数据装*/
function dataTown() {
    var json = AjaxAction("POST", "../fksbEnrolController/seleFksbEntron","");

    var jsonData=json.fksbenrolVO;
   /*行政区域*/
    $("#adNm").val(jsonData.adNm);
    /*所属机构*/
    $("#orgNm").val(jsonData.orgNm);
    /*乡镇*/
    var townList= jsonData.list;

    for (var i=0;i<townList.length;i++){
       $("#townList").append("<option value="+townList[i].id+">"+townList[i].name+"</option>");
       }

}
