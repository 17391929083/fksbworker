
//跨域请求
function  AjaxAreaGETAction (url,date) {
	var dd;
	$.ajax({
	type:'GET',
	 dataType:'jsonp',
    jsonp:"callback",
    callback:"sign",
    url:url,
    async:false,
    data:date,
    success:function (data) {
            dd=data.sign;
            return dd;
    }
	});
	
	
}

//跨域请求
function  AjaxAreaPostAction(type,url,date) {
	$.ajax({
	type:type,
url:url,
dataType:'jsonp',  
async:false,  
jsonp:'jsonpCallback',//传递给后台程序，用来获取jsonp回调函数名的参数名 
data:date,
success:function (response) {
        alert('返回成功！');
},
error:function(data){
   console.info(data)
}
	})
}



function  AjaxAction(type,url,date) {
	var mage=null;
	$.ajax({
		type: type,
		url: url,
		data:  date,
		cache:false,
		async:false,
		success: function(data){
			mage=data;
			
		}
});
	return mage;
}

function timeStamp2String(time){
    var datetime = new Date();
    datetime.setTime(time);
    var year = datetime.getFullYear();
    var month = datetime.getMonth() + 1 < 10 ? "0" + (datetime.getMonth() + 1) : datetime.getMonth() + 1;
    var date = datetime.getDate() < 10 ? "0" + datetime.getDate() : datetime.getDate();
    var hour = datetime.getHours()< 10 ? "0" + datetime.getHours() : datetime.getHours();
    var minute = datetime.getMinutes()< 10 ? "0" + datetime.getMinutes() : datetime.getMinutes();
    var second = datetime.getSeconds()< 10 ? "0" + datetime.getSeconds() : datetime.getSeconds();
    return year + "-" + month + "-" + date+" "+hour+":"+minute+":"+second;
}

