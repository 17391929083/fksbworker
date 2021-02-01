layui.use(['layer'], function(){
    var layer = layui.layer;
    layer.ready(function(){
        var json = AjaxAction("POST", "../workInstantsController/instantsNumber","");
        var newcount=json.newcount;
        var list = json.list;
        $("#gs-ck").val(newcount);
        $("#gs-rk").val(list.length);
        $("#addDiv").empty();
        for (i=0;i<list.length;i++){
            var mt10 = $("#addDiv").append("<div class=\"mt10 ui-form\" style=\"background:#eee\" id='div"+i+"'></div>");
            $("#div"+i).append("<div class=\"ui-form-item ui-border-b\" id='cpcd"+i+"'></div>");
             $("#cpcd"+i).append("<label>测点编号:</label><input type=\"text\" placeholder=\"联系人姓名\" value="+list[i].mpCd+"  disabled=\"true\">");

            $("#div"+i).append("<div class=\"ui-form-item ui-border-b\" id='equiid"+i+"'></div>");
            $("#equiid"+i).append("<label>设备编号:</label><input type=\"text\" placeholder=\"联系人姓名\" value="+list[i].equiCd+"  disabled=\"true\">");

            $("#div"+i).append("<div class=\"ui-form-item ui-border-b\" id='time"+i+"'></div>");
            $("#time"+i).append("<label>安装时间:</label><input type=\"text\" placeholder=\"联系人姓名\" value= "+timeStamp2String(list[i].mpDate)+"  disabled=\"true\">");
        }

    });






})