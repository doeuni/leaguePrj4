<%@ page import="dao.*, java.util.*"%>
<%@ page contentType="text/html;charset=euc-kr" %>

<%  PlayerVO vo=(PlayerVO)request.getAttribute("vo");%>
<html>
<head>
  <title>Duke's Soccer League: Registration: Thank You</title>
</head>
<body bgcolor='white'>
<!-- Page Heading -->
<table border='1' cellpadding='5' cellspacing='0' width='400'>
<tr bgcolor='#CCCCFF' align='center' valign='center' height='20'>
  <td><h3>Duke's Soccer League: Registration: Thank You</h3></td>
</tr>
</table>
<p>
Thank you, <%= vo.getName()%>, for register for the <i><%= vo.getSeason()%></i> league.
</p>
</body>
</html>