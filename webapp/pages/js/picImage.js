function  creatPic(src,img) {

    var _data = {
        url: window.location.href,
        t: Math.random()
    };
    var json = AjaxAction("get", "../fksbEnrolController/getWxArgs", _data);
    wxConfig(json.timestamp, json.nonceStr, json.signature, json.appId);

    function wxConfig(_timestamp, _nonceStr, _signature, _appId) {
        // alert('获取数据：' + _timestamp + '\n' + _nonceStr + '\n' + _signature);

        wx.config({

            debug: false,// 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。

            appId: _appId,// 必填，公众号的唯一标识

            timestamp: _timestamp,// 必填，生成签名的时间戳

            nonceStr: _nonceStr,// 必填，生成签名的随机串

            signature: _signature,// 必填，签名，见附录1

            jsApiList: ['checkJsApi', 'chooseImage','uploadImage']

        });

        wx.error(function (res) {
            alert("出错了：" + res.errMsg);//这个地方的好处就是wx.config配置错误，会弹出窗口哪里错误，然后根据微信文档查询即可。
        });

        wx.chooseImage({
            count: 1, // 默认9
            sizeType: ['original', 'compressed'], // 可以指定是原图还是压缩图，默认二者都有
            sourceType: ['camera'], // 可以指定来源是相册还是相机，默认二者都有
            success: function (res) {
                var localIds = res.localIds; // 返回选定照片的本地ID列表，localId可以作为img标签的src属性显示图片

                uploadImg(localIds[0],src,img);
            }
        });





    }




}

//具体上传图片
function uploadImg(e,src,img) {
    wx.uploadImage({
        localId: e, // 需要上传的图片的本地ID，由chooseImage接口获得
        isShowProgressTips: 1, // 默认为1，显示进度提示
        success: function (res) {
            var serverId = res.serverId;
            $.ajax({
                url: "../fksbMainTainCintroller/getwxpic",
                dataType: "json",
                async: false,
                contentType: "application/x-www-form-urlencoded; charset=UTF-8",
                data: {"serverId": serverId},
                type: "POST",
                timeout: 30000,
                success: function (data, textStatus) {

                    $('#'+src).attr('src',data.src); //图片链接（base64）
                    $('#'+img).val(data.src);
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    alert("错误==");

                }
            });
        },
        fail: function (error) {
            alert("错误");
        }
    });
}
