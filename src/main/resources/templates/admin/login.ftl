
<html>
<head>
    <title>管理员登录</title>
    <base href="${ctx.contextPath}">
    <link type="text/css" rel="stylesheet" href="${ctx.contextPath}/css/style.css">
    <script type="text/javascript">
        function resetValue(){
            document.getElementById("userName").value="";
            document.getElementById("password").value="";
        }

        function checkForm(){
            var userName=document.getElementById("userName").value;
            var password=document.getElementById("password").value;
            if(userName==null || userName==""){
                alert("请输入用户名！");
                return;
            }else if(password==null || password==""){
                alert("请输入密码！");
                return;
            }else{
                document.getElementById("loginForm").submit();
            }
        }
    </script>
</head>
<body bgcolor="#E7ECEF">
<center>
    <form id="loginForm" action="${ctx.contextPath}/dologin" method="post">
        <table border="0" cellspacing="0" cellpadding="0" style="margin-top:130">
            <tr><td><img src="${ctx.contextPath}/images/logon_top.gif"></td></tr>
            <tr height="180">
                <td background="${ctx.contextPath}/images/logon_middle.gif" align="center" valign="top">
                    <table border="0" width="90%" cellspacing="0" cellpadding="0">
                        <tr height="50"><td colspan="2" align="center"><font color="red">${error!'' }</font></td></tr>
                        <tr height="30">
                            <td align="right" width="40%">用户名：&nbsp;&nbsp;</td>
                            <td style="text-indent:5"><input type="text" name="userName" id="userName" value="${(userEntity.userName)!'' }" size="30"/></td>
                        </tr>
                        <tr height="30">
                            <td align="right">密&nbsp;&nbsp;码：&nbsp;&nbsp;</td>
                            <td style="text-indent:5"><input type="password" name="password" id="password" value="${(userEntity.password)!'' }" size="30"/></td>
                        </tr>
                        <tr height="60">
                            <td></td>
                            <td>
                                <input type="button" value="登录" onclick="checkForm()"/>
                                <input type="button" value="重置" onclick="resetValue()"/>
                                <a href="${ctx.contextPath}/index">[返回首页]</a>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr><td><img src="${ctx.contextPath}/images/logon_end.gif"></td></tr>
        </table>
    </form>
</center>
</body>
</html>