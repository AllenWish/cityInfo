<html>

<head>

    <title>简易万年历</title>

    <link type="text/css" rel="stylesheet" href="${ctx.contextPath}/css/style.css">

    <script type="text/javascript">

        function showTime(showWhere){

            var now=new Date();

            var hour=now.getHours();

            var minu=now.getMinutes();

            var sec=now.getSeconds();



            if(hour<10) hour="0"+hour;

            if(minu<10) minu="0"+minu;

            if(sec<10) sec="0"+sec;



            showWhere.value=hour+":"+minu+":"+sec;

            setTimeout("showTime(time)",1000)

        }

    </script>

</head>

<body onload="showTime(time)">

<table width="210" border="0" align="center" cellspacing="1" >

    <tr height="25"><td colspan="7" align="center" style="border:0 solid">${currentDay.now} <input type="text" style="border:0;background-color:#F9F9F9" disable="true" id="time" size="9"></td></tr>

    <tr height="25" bgcolor="#F0F0F0" align="center">

        <td style="border:1 solid">日</td>

        <td style="border:1 solid">一</td>

        <td style="border:1 solid">二</td>

        <td style="border:1 solid">三</td>

        <td style="border:1 solid">四</td>

        <td style="border:1 solid">五</td>

        <td style="border:1 solid">六</td>

    </tr>

    <tr height="4"><td colspan="7"></td></tr>
    <#list 0..5 as x><#-- i x -->
    <tr>
        <#list x*7..((x+1)*7-1) as y><#-- j y -->
            <#if (y-currentDay.firstIndex+1)==currentDay.today>


        <td width="30" height="23" align="center" bgcolor="gray" style="border:1 solid"><font color="#FFFFFF"><b>${(currentDay.days[y])!""}</b></font></td>

        <#else >

        <td width="30" height="23" align="center" style="border:1 solid">${(currentDay.days[y])!""}</td>

            </#if>
        </#list>

    </tr>

   </#list>

    <tr height="10"><td colspan="7"></td></tr>

</table>

</body>

</html>

