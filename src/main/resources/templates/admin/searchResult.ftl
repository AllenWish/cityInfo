

<html>
<head>
    <title>后台-查看信息列表</title>
    <script type="text/javascript">
        function deleteInfo(deleteId){
            if(confirm("确认要删除这条信息吗?")){
                $.post("cityinfo/admin!deleteInfo",{delId:deleteId},
                        function(delFlag){
                            var flag=eval(delFlag);
                            if(flag){
                                alert("删除成功！");
                                document.getElementById("searchForm").submit();
                            }else{
                                alert("删除失败！");
                            }
                        }
                );
            }
        }
    </script>
    <style type="text/css">
        .oddRow{background-color: #7c7c7c
        }
        .evenRow{background-color: #cecece }
    </style>
</head>
<body>
<center>
    <table border="0" width="650" cellspacing="0"  cellpadding="0">
        <#if infoList??>
            <tr height="30">
                <td style="text-indent:8">审核</td>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <td colspan="2" align="center" style="border:1 solid">
                    <table border="0" width="100%" cellspacing="0" cellpadding="0">
                        <tr align="center" height="30" bgcolor="#F0F0F0">
                            <td width="7%"><b>序号</b></td>
                            <td width="8%"><b>信息ID</b></td>
                            <td width="35%"><b>信息标题</b></td>
                            <td width="20%"><b>发布时间</b></td>
                            <td width="8%"><b>付费</b></td>
                            <td width="8%"><b>审核</b></td>
                            <td width="14%" colspan="2"><b>操作</b></td>
                        </tr>
                        <#list infoList as info>

                            <tr height="30"class="${info?item_parity}Row"  >
                                <td align="center"><b>${info?counter }</b></td>
                                <td style="text-indent:10">${info.id }</td>
                                <td style="text-indent:5" align="center">『${info.infoTitle }』</td>
                                <td align="center">${(info.infoDate?datetime)!'' }</td>
                                <td align="center">
                                    <#if info.infoPayfor=='1'><font color="red">是</font>
                                    <#else>
                                        <font color="blue">否</font>
                                    </#if>

                                </td>
                                <td align="center">
                                    <#if info.infoState=='1'><font color="red">是</font>
                                    <#else>
                                        <font color="blue">否</font>
                                    </#if>
                                </td>
                                <td align="center"><a href="">√审核</a></td>
                                <td align="center"><a href="javascript:deleteInfo('${info.id }')">×删除</a></td>
                            </tr>
                        <#else>
                            123
                        </#list>

                    </table>
                </td>
            </tr>
            <tr height="8"><td></td></tr>


            <#else>
                <tr height="1"><td></td></tr>
                <tr height="200" bgcolor="#F9F9F9"><td colspan="8" align="center" style="border:1 solid"><font color="red"><b>★★对不起，未找到符合条件的信息！★★</b></font></td></tr>
        </#if>

    </table>
</center>
</body>
</html>