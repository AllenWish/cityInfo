
<html>
<head>
    <title>后台首页</title>
    <base href="${ctx.contextPath}/">
    <link type="text/css" rel="stylesheet" href="${ctx.contextPath}/css/style.css">
</head>
<body>
<center>
    <table border="0" cellpadding="0" cellspacing="0" width="688" height="100%">
        <tr height="20"><td><img src="${ctx.contextPath}/images/default_t.jpg"></td></tr>
        <tr><td background="${ctx.contextPath}/images/default_m.jpg" valign="top"><#include "${mainPage!'default.ftl'}"/></td></tr>
        <tr height="26"><td><img src="${ctx.contextPath}/images/default_e.jpg"></td></tr>
    </table>
</center>
</body>
</html>