$(function() {
	updateSel()
})
//重新渲染表单
function renderForm(){
  layui.use('form', function(){
   var form = layui.form;//高版本建议把括号去掉，有的低版本，需要加()
   form.render();
  });
 }

layui.use(['layer', 'jquery', 'form','upload'],
 function () {
	var layer = layui.layer,
	$ = layui.jquery,
	upload = layui.upload,
	form = layui.form;
	
	//动态加载区域
	form.on('select(demo)', function(data){
		urbanArea();
	});
	
	form.on('submit(update)', function (data) {
		$.ajax({
			url: getRootPath()+"workenter/updateDate",
			method:'POST',       
            data:data.field,           
			success: function (data) {
				console.info(data)
				
				
			}

			});
		return false;
	})
	//上传图片
	var srcArr = new Array();
		
	upload.render({
	    elem: '#uploadBtn'
	    ,url: '/uploadImgs'
	    ,multiple: true
	    ,bindAction:"#save"
	    ,auto:false
	    ,choose:(obj)=>{//预览图片
	    	var files = obj.pushFile();
    		obj.preview((index, file, result)=>{
	        	$('#previewBox').append('<div class="imgBox"><em class="remove_'+index+'">删除</em><img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img" style="width:104px" ></div>')
		      	$('.remove_'+index).bind('click',function(){
		      		delete files[index];//删除指定图片
		      		$(this).parent().remove();
		      	})
    		});
	    }
	    ,done: (res)=>{
	    	if(res.code===200){
	    		var srcStr = res.data[0];
		      	srcStr = srcStr.replace("public","").substring(1,srcStr.length);
		      	srcArr.push(srcStr);
		      	for(var i in srcArr){
		      		$('#previewBox img').eq(i).attr('src',srcArr[i])
		      		$('#previewBox em').eq(i).remove();
		      	}
	    	}
	    }
	});
});


 $(document).on("mouseenter mouseleave", ".file-iteme", function(event){
            if(event.type === "mouseenter"){
                //鼠标悬浮
                $(this).children(".info").fadeIn("fast");
                $(this).children(".handle").fadeIn("fast");
            }else if(event.type === "mouseleave") {
                //鼠标离开
                $(this).children(".info").hide();
                $(this).children(".handle").hide();
            }
        });

//修改数据查询
function updateSel() {
	   var  json=AjaxAction("POST",getRootPath()+"/workenter/selOneMpr","id="+$('#ids').val());
	   console.log(json);//打印服务端返回的数据(调试用)
	   //处理发布类型
	   var jsonData=json.obj
	   var fbType=jsonData.fbType;
	   //班组类型
	   $("#input"+fbType).attr('checked','true');
	   	fblx();
		   	console.log(jsonData.perNum);//打印服务端返回的数据(调试用)
	   //班组人数
		   	if(fbType==2) $("#perNum").val(jsonData.perNum);
	   //工种加载
		 selGsType();
		//选中工种
		 $("#gsType").find("input[value="+jsonData.gzType+"]").attr('checked','true');
	   //工作地区 所属省份
		 provices();
		  $("#proces option[value='"+jsonData.PR_CD+"']").attr("selected","selected");
	  //工作地区 所属市区
		  urbanArea();
		$("#proces2 option[value='"+jsonData.CI_CD+"']").attr("selected","selected");
	 //介绍内容
		$("#workPro").val(jsonData.workPro);
		//真实姓名
		$("#youName").val(jsonData.youName);
		//联系电话
		$("#phone").val(jsonData.phone);
		//设置openid
		$("#openid").val(jsonData.openid);
}

function  fblx(){
	$('input[name=fbType]').each(function(){
		if($("input[type='radio']:checked").val()==1){
			$("#gznum").hide(1000)
		}else if($(this).val()==2){
			$("#gznum").show(1000)

	  }
		
})

}

function    selGsType(){
   var  json=AjaxAction("GET",getRootPath()+"/workenter/gzType");
	var  jsonData=json.list;
   $("#gsType").empty();
   for ( var i = 0; i < jsonData.length; i++) {
	   if(i==0){
		   $("#gsType").append("<input type='radio' name='gzType' value='"+jsonData[i].id+"' 	checked=checked title='"+jsonData[i].typeNm+"' >");
	   }else{
		   $("#gsType").append("<input type='radio' name='gzType' value='"+jsonData[i].id+"' title='"+jsonData[i].typeNm+"'>");
	   }
   }
	
}

function    provices(){
	   var  json=AjaxAction("GET",getRootPath()+"/coreContr/provice","prosign=1");
		var  jsonData=json.list;
	   $("#proces").empty();  
	   $("#proces").append(" <option value=''>请选择省份</option>");
	   for ( var i = 0; i < jsonData.length; i++) {
		   $("#proces").append(" <option value="+jsonData[i].ad_cd+">"+jsonData[i].ad_nm+"</option>");
		   renderForm();
	}
}

function    urbanArea(){
	 var  urban=$("#proces").find("option:selected").val();
	   var  json=AjaxAction("GET",getRootPath()+"/coreContr/provice","prosign="+urban.slice(0,2));
		var  jsonData=json.list;
	   $("#proces2").empty(); 
	   $("#proces2").append(" <option value=''>请选择市</option>");
	   for ( var i = 0; i < jsonData.length; i++) {
		   console.info(jsonData[i].ad_nm);
		   $("#proces2").append(" <option value="+jsonData[i].ad_cd+">"+jsonData[i].ad_nm+"</option>");
		   renderForm();
	}
}






