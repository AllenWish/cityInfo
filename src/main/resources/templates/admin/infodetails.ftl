<html>
<head>
    <title>后台-审核信息</title>
    <base href="${ctx.contextPath}/">

</head>
<script type="text/javascript">
    function checkInfo(id){
        $.post("${ctx.contextPath}/user/checkInfo",{id:id},
                function(data){
                    console.info(data)
                    var flag=data.flag;
                    console.info(flag)
                    if(flag){
                        alert("审核成功！");
                        window.location.href="${ctx.contextPath}/user/infodetails/"+id;
                    }else{
                        alert("审核失败！");
                    }
                },"json"
        );
    }
</script>
<body>
<center>
    <br>
    <table border="0" width="645" cellpadding="10" cellspacing="0" style="word-break:break-all">

        <tr height="30">
            <td style="text-indent:5"><b>审核信息 [ID值：${info.id }]</b></td>
            <td colspan="2" align="right">
            </td>
        </tr>
        <tr height="30" bgcolor="#F9F9F9"><td colspan="3" align="center" style="text-indent:5">信息详细内容</td></tr>
        <tr height="30">
            <td width="25%" style="text-indent:10">信息类别：</td>
            <td>【${info.typeIntro }】</td>
            <td>付费状态：&nbsp;&nbsp;
                <#if info.infoPayfor=='1' >
                        ★ 已付费
                   <#else >
                        ● 未付费
                </#if>
        </tr>
        <tr height="30">
            <td style="text-indent:10">发布时间：</td>
            <td>${info.infoDate?datetime }</td>
            <td>审核状态：&nbsp;&nbsp;
                <#if info.infoState=='1' >
                    ★ 已审核
                <#else >
                    ● 未审核
                </#if>

        </tr>
        <tr height="30">
            <td style="text-indent:10">信息标题：</td>
            <td colspan="2">${info.infoTitle }</td>
        </tr>
        <tr height="40" bgcolor="#F9F9F9">
            <td style="text-indent:10">信息内容：</td>
            <td align="center">
                <input type="button" onclick="checkInfo('${info.id}')" value="√通过审核" <#if info.infoState=='1'> hidden="hidden"</#if>/>
            </td>
            <td align="center"></td>
        </tr>
        <tr height="5"><td></td></tr>
        <tr>
            <td colspan="3" style="border:1 solid">
                <table border="0" width="630" cellspacing="0" cellpadding="10" style="word-break:break-all">
                    <tr height="130"><td colspan="3" valign="top">${info.infoContent }</td></tr>
                    <tr height="30" align="center">
                        <td>联系电话：${info.infoPhone }</td>
                        <td>联系人：${info.infoLinkman }</td>
                        <td>Email：${info.infoEmail }</td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr><td align="center" colspan="3"><a href="javascript:window.history.back(-1)">返回</a></td></tr>
    </table>
</center>
</body>
</html>