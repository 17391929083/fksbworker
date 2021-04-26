function  saoyisao(div){

    var _data = {
        url:window.location.href,
        t:Math.random()
    };
    var  json=AjaxAction("get","../fksbEnrolController/getWxArgs",_data);
    wxConfig(json.timestamp, json.nonceStr, json.signature,json.appId);

    function wxConfig(_timestamp, _nonceStr, _signature,_appId) {console.log('获取数据：' + _timestamp +'\n' + _nonceStr +'\n' + _signature);

        wx.config({

            debug:false,// 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。

            appId: _appId,// 必填，公众号的唯一标识

            timestamp: _timestamp,// 必填，生成签名的时间戳

            nonceStr: _nonceStr,// 必填，生成签名的随机串

            signature: _signature,// 必填，签名，见附录1

            jsApiList: ['checkJsApi','scanQRCode']

        });

        wx.error(function(res) {
            alert("出错了：" + res.errMsg);//这个地方的好处就是wx.config配置错误，会弹出窗口哪里错误，然后根据微信文档查询即可。
        });

        wx.scanQRCode({
            needResult: 1, // 默认为0，扫描结果由微信处理，1则直接返回扫描结果，
            scanType: ["qrCode","barCode","datamatrix","pdf417"], // 可以指定扫二维码还是一维码，默认二者都有
            success: function (res) {
                var result = res.resultStr; // 当needResult 为 1 时，扫码返回的结果
                var  json=AjaxAction("get","../fksbEnrolController/getequiidrule");

                if(json.length!=null){
                    //
                    $("#"+div).val(result.trim().substring(json.length));
                }else{
                    $("#"+div).val(result.trim().substring(9));
                }
            }
        });

    }




}