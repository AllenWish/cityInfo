<table border="0" width="670" cellspacing="0" cellpadding="5">
    <tr height="35"><td style="text-indent:5" valign="bottom"><font color="#004790"><b>■查询结果</b></font></td></tr>
    <tr bgcolor="#FAFCF5">
        <td style="border:1 solid">
            <table border="0" width="100%" cellspacing="0" cellpadding="0">
            <#list infoList as info>
            <tr height="23">
                <td width="50%">『<b>${info.typeIntro}</b>』<a href="${ctx.contextPath}/info/${info.id!0}">${info.infoTitle}</a></td>
            </tr>
            <#else>
                <tr height="30"><td align="center" style="border:1 solid">★★★目前没有找到你想要的信息！★★★</td></tr>
            </#list>
            </table>
        </td>
    </tr>
</table>