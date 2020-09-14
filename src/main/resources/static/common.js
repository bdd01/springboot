$(document).ready(function () {
    $("#createUserButton").click(function () {
        $.ajax({
            "url":"/createProv",
            "data":$("#createUserForm").serialize(),
            "type":"post",
            "dataType":"json",
            "success":function (returnData) {
                if(returnData.result == 0 ){
                    alert("省分工号已存在，无法创建")
                    location.href="cretaProvUser"
                }else{
                    alert("省分工号创建成功")
                    location.href="login"
                }
            }
        })

    })
    layui.use(['form','layer'],function(){
        var form = layui.form;
        form.on('submit(myForm)',function (data){
        $.ajax({
            "url":"/checkLogin",
            "data":$("#sysloginForm").serialize(),
            "type":"post",
            "dataType":"json",
            "success":function (returnData) {
                if(returnData.result == 0){
                    alert("用户名或密码不能为空")
                }else if(returnData.result == 1){
                    alert("用户名或密码错误")
                }else if(returnData.result == 9){
                    alert("请使用系统工号登录")
                }else{
                    alert("登录成功")
                    location.href="main"
                }
            }
        })

            return false;
        })

    })
})