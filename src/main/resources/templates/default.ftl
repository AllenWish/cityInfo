<html>
<head><title>首页</title></head>
<body>
<center>
    <!-- 缴费专区 -->
    <table border="0" width="670" cellspacing="0" cellpadding="5">
        <tr height="35"><td style="text-indent:5" valign="bottom"><font color="#004790"><b>■推荐信息</b>『缴费专区』</font></td></tr>
        <tr bgcolor="#FAFCF5">
            <td style="border:1 solid">
                <table border="0" width="100%" cellspacing="0" cellpadding="0">
                <#list infoList as info>
                    <#if !info?is_even_item><tr height="23"></#if>
                        <td width="50%">『<b>${info.typeIntro}</b>』<a href="${ctx.contextPath}/info/${info.id!0}">${info.infoTitle}</a></td>
                    <#if info?is_even_item> </tr></#if>
                <#else>
                    <tr height="30"><td align="center" style="border:1 solid">★★★ 缴费后，您发布信息就可在这里显示！★★★</td></tr>
                </#list>
                </table>
            </td>
        </tr>
    </table>

    <!-- 广告 -->

    <table border="0" width="670"cellspacing="0" cellpadding="0" style="margin-top:1">

        <tr><td align="center"><img src="${ctx.contextPath}/images/pcard2.jpg"></td></tr>

    </table>

    <!-- 免费专区 -->
    <table border="0" width="670" cellspacing="2" cellpadding="0">
        <tr height="35"><td colspan="2" style="text-indent:5" valign="bottom"><font color="#004790"><b>■最新信息</b>『免费专区』</font></td></tr>

        <#list freeInfoList as freeInfo>
            <#if !freeInfo?is_even_item><tr></#if>
            <td align="center">
                <#list freeInfo as info>
                    <table border="1" cellspacing="0" cellpadding="0" width="332" height="160" rules="none" bordercolor="lightgrey" bordercolorlight="lightgrey" bordercolordark="white">
                        <#if info?is_first>
                            <tr bgcolor="#00B48F" height="30">
                                <td style="text-indent:10"><b><font color="white">▲${info.typeIntro}</font></b></td>
                            </tr>
                        </#if>
                        <tr bgcolor="#FAFCF5"><td style="text-indent:3">★ <a href="${ctx.contextPath}/info/${info.id!0}">${info.infoTitle}</a></td></tr>

                        <#if info?is_last>

                            <tr height="20" bgcolor="#FAFCF5"><td align="right"><a href="">更多...</a>&nbsp;&nbsp;</td></tr>

                        </#if>
                    </table>

                    <#else>
                        ★★★ 在这里显示免费发布的信息！★★★
                </#list>

            </td>
            <#if freeInfo?is_even_item></tr></#if>
        <#else >
            <tr height="30"><td align="center" style="border:1 solid">★★★ 在这里显示免费发布的信息！★★★</td></tr>
        </#list>
    </table>

    <br>

</center>

</body>

</html>