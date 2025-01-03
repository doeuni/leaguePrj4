<%@ page import="dao.LeagueVO, java.util.*"%>
<%@ page contentType="text/html;charset=euc-kr" %>

<% ArrayList leagueList=(ArrayList)request.getAttribute("leagueList");
%>

<html>
<head>
  <title>Duke's Soccer League: List Leagues</title>
</head>
<body bgcolor='white'>
<!-- Page Heading -->
<table border='1' cellpadding='5' cellspacing='0' width='400'>
<tr bgcolor='#CCCCFF' align='center' valign='center' height='20'>
  <td><h3>Duke's Soccer League: List Leagues</h3></td>
</tr>
</table>
<p>
The set of soccer leagues are:
</p>
<%if(leagueList != null) {%>
	<ul>
	<%for(int i = 0 ; i < leagueList.size() ; i++) {
		 LeagueVO lVO=(LeagueVO)leagueList.get(i);%>
        <li><%= lVO.getTitle() %></li>
	<%}%>
	</ul>
<%}%>  
End of list...
</body>
</html>