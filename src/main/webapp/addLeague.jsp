<%@ page import="dao.LeagueVO, java.util.*"%>
<%@ page contentType="text/html;charset=euc-kr" %>

<% LeagueVO lVO=(LeagueVO)request.getAttribute("lVO");
%>
<html>
<head>
  <title>Duke's Soccer League: Add League Success</title>
</head>
<body bgcolor='white'>
<!-- Page Heading -->
<table border='1' cellpadding='5' cellspacing='0' width='400'>
<tr bgcolor='#CCCCFF' align='center' valign='center' height='20'>
  <td><h3>Duke's Soccer League: Add League Success</h3></td>
</tr>
</table>
<p>
Your request to add the <i><%= lVO.getTitle()%></i> league was successful.
</p>
</body>
</html>