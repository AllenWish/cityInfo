<html>
<head><title>后台-右侧栏</title></head>
<script type="text/javascript">
    function checkForm(){
        var typeId=document.getElementById("typeId").value;
        if(typeId==null || typeId==""){
            alert("请选择信息类别！");
            return;
        }else{
            document.getElementById("searchForm").submit();
        }

    }
</script>
<body background="${ctx.contextPath}/images/back.gif">
<center>
    <table border="0" width="220" height="100%" cellspacing="0" cellpadding="0" style="margin-top:7">
        <tr height="30" bgcolor="#F0F0F0"><td style="text-indent:5;border:1 solid"><font color="#004790"><b>■显示方式</b></font></td></tr>
        <hr>
        <form id="searchForm" action="${ctx.contextPath}/user/searchInfo" method="post">
        <tr>
            <td align="center" colspan="2">
                <fieldset style="height:60;width:210">
                    <legend>★付费状态</legend>
                    <br>
                    <input id="payfor1" value="1" type="radio"  name="infoPayfor" />已付费
                    <input id="payfor2" value="0" type="radio"  name="infoPayfor" />未付费
                    <input id="payfor3" value="all" type="radio"  name="infoPayfor" checked="checked"/>全部
                </fieldset>
                <fieldset style="height:60;width:210">
                    <legend>★审核状态</legend>
                    <br>
                    <input id="state1" value="1" type="radio"  name="infoState" />已审核
                    <input id="state2" value="0" type="radio"  name="infoState" />未审核
                    <input id="state3" value="all" type="radio"  name="infoState" checked="checked"/>全部
                </fieldset>
            </td>
        </tr>
        <tr>
            <td>
                信息类别：
                <select id="typeId" name="infoType">
                    <option value="">请选择...</option>
                    <option value="0">全部</option>
                    <#-- 遍历infoTypeList -->
                    <#list infoTypeList as infoType>
                        <option value="${infoType.id}">${infoType.typeIntro}</option>
                    </#list>
                </select>
                <input type="button" onclick="checkForm()" value="查询"/>
            </td>
        </tr>
        </form>
        <tr height="5"><td></td></tr>

        <tr height="5"><td></td></tr>
        <tr height="30" bgcolor="#F0F0F0"><td style="text-indent:5;border:1 solid"><font color="#004790"><b>■日历</b></font></td></tr>
        <tr height="1"><td></td></tr>
        <!-- 日历 -->
        <tr height="130">
            <td valign="top" style="border:1 solid"><#include "../base/calendar.ftl"></td>
        </tr>
    </table>
</center>
</body>
</html>