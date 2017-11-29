<html>
<head>
    <title>发布信息</title>
    <script type="text/javascript">
        function resetValue(){
            document.getElementById("infoTypeId").value="";
            document.getElementById("title").value="";
            document.getElementById("content").value="";
            document.getElementById("phone").value="";
            document.getElementById("linkman").value="";
            document.getElementById("email").value="";
        }
        function checkForm(){
            var typeId=document.getElementById("typeId").value;
            var title=document.getElementById("title").value;
            var content=document.getElementById("content").innerHTML;
            var phone=document.getElementById("phone").value;
            var linkman=document.getElementById("linkman").value;
            var email=document.getElementById("email").value;
            if(typeId==null || typeId==""){
                alert("请选择信息类别！");
                return;
            }else if(title==null || title==""){
                alert("请输入标题！");
                return;
            }else if(content==null || content==""){
                alert("请输入内容！");
                return;
            }else if(phone==null || phone==""){
                alert("请输入联系电话！");
                return;
            }else if(linkman==null || linkman==""){
                alert("请输入联系人！");
                return;
            }else if(email==null || email==""){
                alert("请输入Email！");
                return;
            }else{
                document.getElementById("addInfoForm").submit();
            }
        }
    </script>
</head>
<body>
<center>
    <table border="0" cellpadding="0" cellspacing="0" width="688" height="100%">
        <tr height="20"><td><img src="${ctx.contextPath}/images/default_t.jpg"></td></tr>
        <tr>
            <td background="${ctx.contextPath}/images/default_m.jpg" valign="top" align="center">
                <form id="addInfoForm" action="${ctx.contextPath}/info/addInfo" method="post">
                    <input type="hidden" name="addType" value="add"/>
                    <input type="hidden" name="infoState" value=0 />
                    <table border="0" width="650" height="300" rules="all" cellspacing="0">
                        <tr height="30"><td style="text-indent:10"><font color="#004790"><b>■发布信息</b></font></td></tr>
                        <tr>
                            <td align="center">
                                <table border="0" width="650" rules="all" cellspacing="8">
                                    <tr>
                                        <td width="20%" style="text-indent:10">信息类别：</td>
                                        <td>
                                            <select id="typeId" name="infoType">
                                                <option value="">请选择...</option>
                                                <#list infoTypeList as infoType>
                                                    <option value="${infoType.id}">${infoType.typeIntro}</option>
                                                </#list>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="text-indent:10">信息标题：</td>
                                        <td><input type="text" id="title" name="infoTitle" size="80" maxlength="40"/></td>
                                    </tr>
                                        <tr>
                                            <td style="text-indent:10" valign="top">信息内容：</td>
                                            <td align="center"><textarea id="content" name="infoContent" rows="3" cols="60" style="resize: none;"></textarea></td>
                                        </tr>
                                        <tr>
                                            <td style="text-indent:10">联系电话：</td>
                                            <td ><input type="text" id="phone" name="infoPhone"  size="55" maxlength="11"/></td>
                                        </tr>
                                        <tr>
                                            <td style="text-indent:10">联 系 人：</td>
                                            <td><input type="text" id="linkman" name="infoLinkman" size="55"/></td>
                                        </tr>
                                        <tr>
                                            <td style="text-indent:10">E - mail：</td>
                                            <td ><input type="text" id="email" name="infoEmail" size="55"></td>
                                        </tr>
                                        <tr>
                                            <td style="text-indent:10">是否付费：</td>
                                            <td >
                                                <input type="radio" id="free" name="infoPayfor" value=0 checked/>免费
                                                <input type="radio" id="payfor" value=1 name="infoPayfor"  />付费
                                            </td>
                                        </tr>
                                </table>
                            </td>
                        </tr>
                        <tr align="center" height="50">
                            <td>
                                <input type="button" onclick="checkForm()" value="发布"/>
                                <input type="button" onclick="resetValue()" value="重填"/>
                            </td>
                        </tr>
                    </table>
                </form>
                ${error!""}
            </td>
        </tr>
        <tr height="26"><td><img src="${ctx.contextPath}/images/default_e.jpg"/></td></tr>
    </table>
</center>
</body>
</html>