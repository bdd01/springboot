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
    $("#sysloginButton").click(function () {
        $.ajax({
            "url":"/checkSysLogin",
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
                    location.href="cretaProvUser"
                }
            }
        })

    })
    $("#provloginButton").click(function () {
        $.ajax({
            "url":"/checkProvLogin",
            "data":$("#provloginForm").serialize(),
            "type":"post",
            "dataType":"json",
            "success":function (returnData) {
                if(returnData.result == 0){
                    alert("用户名或密码不能为空")
                }else if(returnData.result == 1){
                    alert("用户名或密码错误")
                }else{
                    alert("登录成功")
                    location.href="dobusi"
                }
            }
        })

    })
    $("#sysloginname").blur(function () {
        $("#passspan").text("请输入密码")
        alert("请输入密码")
    })

})