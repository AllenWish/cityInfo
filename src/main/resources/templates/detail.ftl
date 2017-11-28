<html>
<head>
    <title>都市信息网-查看详细内容</title>
    <base href="${ctx.contextPath}/">
    <link type="text/css" rel="stylesheet" href="${ctx.contextPath}/css/style.css">
</head>
<body>
<center>

    <table width="670" border="0" cellspacing="0" cellpadding="0" style="margin-top:5">

        <tr height="30"><td style="text-indent:5" valign="bottom"><font color="#004790"><b>■查看详细信息</b></font></td></tr>

        <tr height="1"><td></td></tr>

        <tr bgcolor="#FAFCF5">

            <td style="border:1 solid">

                <table border="0" width="100%" cellspacing="0" cellpadding="2">
                    <#if info??>

                    <tr height="40">

                        <td width="20%" style="text-indent:20">信息类别：</td>

                        <td>${info.typeIntro}</td>

                    </tr>

                    <tr height="40">

                        <td style="text-indent:20">发布时间：</td>

                        <td>${info.infoDate}</td>

                    </tr>

                    <tr height="40">

                        <td style="text-indent:20">信息标题：</td>

                        <td>${info.infoTitle}</td>

                    </tr>

                    <tr height="40"><td colspan="2" style="text-indent:20">信息内容：</td></tr>

                    <tr>

                        <td colspan="2" align="center">

                            <table border="1" width="630" cellspacing="0" cellpadding="10" rules="none" frame="below" style="word-break:break-all" bordercolor="lightgrey" bordercolorlight="lightgrey" bordercolordark="white">

                                <tr height="200" bgcolor="white"><td colspan="3" valign="top" style="border:1 solid">${info.infoContent}</td></tr>

                                <tr height="20" align="center">

                                    <td>联系电话：${info.infoPhone}</td>

                                    <td>联系人：${info.infoLinkman}</td>

                                    <td>E-mial：${info.infoEmail}</td>

                                </tr>

                            </table>

                        </td>

                    </tr>
                    <#else >
                        <tr height="100"><td align="center" colspan="2" style="border:1 solid">★★★ 查看信息详细内容出错！★★★</td></tr>

                    </#if>
                        <tr height="63"><td align="center" colspan="2"><a href="javascript:window.history.back(-1)">返回</a></td></tr>
                </table>

            </td>

        </tr>

    </table>

    <br>

</center>

</body>

</html>