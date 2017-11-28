<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>页眉</title>
</head>
<body>

<center>
    <table border="0" width="100%" cellspacing="0" cellpadding="0">
        <!-- 顶部菜单 -->
        <tr height="20">
            <td style="text-indent:10" valign="bottom">

                <a href="#" style="color:gray">[发布信息]</a>

                <a href="#" style="color:gray">[进入后台]</a>

            </td>

            <td align="right" valign="bottom">
                <#--<a href="#"  style="color:gray" onclick="this.style.behavior='url(http://localhost:8033/cityInfo)';this.setHomePage('http://localhost:8033/cityInfo');">设为主页 -</a>-->
                <a href="javascript:window.external.AddFavorite('都市供求信息网','http://localhost:8033/cityInfo')" style="color:gray">收藏本页 -</a>
                <a href="mailto:cuigenyou@163.com" style="color:gray">联系我们 -</a>
                <a href="http://wpa.qq.com/msgrd?v=3&amp;uin=1697501868&amp;site=qq&amp;menu=yes" style="color:gray" target="_blank">在线联系</a>
                &nbsp;
            </td>

        </tr>

        <!-- 导航菜单 -->

        <tr height="56">

            <td align="center" width="220" background="${ctx.contextPath}/images/logo.gif"></td>

            <td align="right" background="${ctx.contextPath}/images/menu.gif">

                <#if infoTypeList??>
                    <table border="0" width="600">

                        <tr align="center">

                            <td width="100"><a href="${ctx.contextPath}/" style="color:white">首&nbsp;&nbsp;&nbsp;&nbsp;页</a></font></td>

                            <#list infoTypeList as infoType>

                                <td width="100"><a href="${ctx.contextPath}/infoType/infos/${infoType.id!0}" style="color:white">${infoType.typeIntro}</a></td>

                                <#if infoType?counter==5></tr><tr align="center"></#if>

                            </#list>

                    </tr>

                    </table>

                    <#else>
                        没有信息类别可显示！
                </#if>

            </td>

        </tr>

    </table>

    <table border="0" width="100%" height="90" cellspacing="0" cellpadding="0" style="margin-top:1">

        <tr><td align="center"><a href="${ctx.contextPath}/" target="_blank"><img src="${ctx.contextPath}/images/pcard1.jpg"></a></td></tr>

    </table>

</center>

</body>

</html>