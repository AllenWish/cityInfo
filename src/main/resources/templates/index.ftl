<html>
<head>
    <title>都市信息网</title>
    <base href="${ctx.contextPath}">
    <link type="text/css" rel="stylesheet" href="${ctx.contextPath}/css/style.css">
</head>
<body background="${ctx.contextPath}/images/back.gif">
<center>
    <table border="0" width="900" cellspacing="0" cellpadding="0" bgcolor="white">
        <tr><td colspan="2"><#include "base/top.ftl"/></td></tr>
        <tr>
            <td width="230" valign="top" align="center"><#include "base/left.ftl"/></td>
            <td width="690" height="400" align="center" valign="top" bgcolor="#FFFFFF"><#include "${mainPage!'default.ftl'}"/></td>
        </tr>
        <tr><td colspan="2"><#include "base/end.ftl"></td></tr>
    </table>
</center>
</body>
</html>