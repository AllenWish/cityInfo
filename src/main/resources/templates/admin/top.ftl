<html>
<head><title>后台-页眉</title></head>

<body>
<center>
    <table border="0" width="100%" height="93" cellspacing="0" cellpadding="0" background="${ctx.contextPath }/images/admin_top.jpg">
        <tr height="20">
            <td align="right" valign="bottom" style="color:white">${(LOGINUSER.userName)!''},您好！</td>
        </tr>
        <tr>
            <td width="100%" height="100%" align="right" valign="bottom">
                <a href="${ctx.contextPath }/index"><img src="${ctx.contextPath }/images/admin_index.gif" border="0"></a>
                <a href="${ctx.contextPath }/user/loginOut"><img src="${ctx.contextPath }/images/admin_exit.gif" border="0"></a>
            </td>
        </tr>
    </table>
</center>
</body>
</html>