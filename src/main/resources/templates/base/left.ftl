<html>
<head>
    <title>侧栏</title>
<script type="text/javascript">
    function check(){
        var keyword = document.getElementById("keyword").value;
        var content = document.getElementById("content").value;
        if(keyword==null||keyword==''){
            alert("填写关键字");
            return false;
        }else if(content==null||content==''){
            alert("请选择条件");
            return false;
        }else{
            document.getElementById("searchForm").submit();
        }
    }
</script>
</head>
<body>
<center>
    <table border="0" width="225" height="100%" cellspacing="0" cellpadding="0">
        <tr height="30"><td style="text-indent:5" valign="bottom"><font color="#004790"><b>■日历</b></font></td></tr>
        <tr height="1"><td></td></tr>
        <tr height="215">
            <td valign="top" background="${ctx.contextPath}/images/leftD.jpg">
                <#include "calendar.ftl">
            <#--<jsp:include page="/pages/calendar.jsp"/>-->
            </td>
        </tr>

        <tr height="1"><td></td></tr>

        <tr height="30"><td style="text-indent:5" valign="bottom"><font color="#004790"><b>■信息快速搜索</b></font></td></tr>

        <tr height="1"><td></td></tr>

        <tr height="103">

            <td align="center" valign="top" background="${ctx.contextPath}/images/leftS.jpg">

                <table border="0" width="99%" height="100%" cellspacing="0">

                    <form id="searchForm" action="${ctx.contextPath}/search" method="post">

                        <tr height="10"><td colspan="3"></td></tr>

                        <tr>

                            <td align="right" width="70">关键字：</td>

                            <td colspan="2" width="200"><input id="keyword" name="keyword" maxlength="20" type="text" value="${keyword!""}"></td>

                        </tr>

                        <tr>

                            <td align="right">条&nbsp;&nbsp;件：</td>

                            <td>
                                <select id="content" name="content">
                                    <option value="">请选择…</option>
                                    <option value="info_email" <#if (content!'')=='info_email'>selected</#if> >Email邮箱</option>
                                    <option value="info_phone"<#if (content!'')=='info_phone'>selected</#if> >联系电话</option>
                                    <option value="info_linkman"<#if (content!'')=='info_linkman'>selected</#if> >联系人</option>
                                    <option value="info_title"<#if (content!'')=='info_title'>selected</#if> >信息标题</option>
                                    <option value="info_intro" <#if (content!'')=='info_intro'>selected</#if> >信息类型</option>
                                    <option value="info_content"<#if (content!'')=='info_content'>selected</#if> >信息内容</option>
                                </select>
                            </td>

                            <td align="center" width="30"><input type="button" value="搜索" onclick="check()"/></td>

                        </tr>

                        <tr>

                            <td align="right">搜索类型：</td>

                            <td colspan="2">
                                <label><input id="equals" name="searchType" type="radio" value="equals" <#if (searchType!'like')=='equals'>checked="checked"</#if>/>全字匹配</label>
                                <label><input id="like" name="searchType" type="radio" <#if (searchType!'like')=='like'>checked="checked"</#if> value="like" />模糊搜索</label>
                            </td>

                        </tr>

                        <tr height="10"><td colspan="3"></td></tr>

                    </form>

                </table>

            </td>

        </tr>

        <tr><td></td></tr>

    </table>

</center>
<script type="text/javascript">
</script>
</body>

</html>