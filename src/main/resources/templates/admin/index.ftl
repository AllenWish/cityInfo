<html>
<head>
    <title>都市信息网-后台管理</title>
    <script type="text/javascript" src="${ctx.contextPath }/js/jquery-3.2.1.min.js"></script>
    <base href="${ctx.contextPath }">
    <link type="text/css" rel="stylesheet" href="${ctx.contextPath }/css/style.css">
</head>
<body>
<center>
    <table border="0" width="920" cellspacing="0" bgcolor="white">
        <tr><td colspan="2"><#include "top.ftl"></td></tr>
        <tr height="10" bgcolor="lightgrey"><td colspan="2"></td></tr>
        <tr>
            <td width="700" align="center" valign="top"><#include "main.ftl"></td>
            <td width="200" align="center" valign="top"><#include "right.ftl"></td>
        </tr>
        <tr height="7" bgcolor="lightgrey"><td colspan="2"></td></tr>
        <tr><td colspan="2"><#include "end.ftl"></td></tr>
    </table>
</center>
</body>
</html>