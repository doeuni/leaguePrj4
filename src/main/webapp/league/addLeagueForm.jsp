<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>    

<html>
<head>
  <title>Duke's Soccer League: Add a New League</title>
</head>
<body bgcolor='white'>
<!-- Page Heading -->
<table border='1' cellpadding='5' cellspacing='0' width='400'>
<tr bgcolor='#CCCCFF' align='center' valign='center' height='20'>
  <td><h3>Duke's Soccer League: Add a New League</h3></td>
</tr>
</table>
<p>
This form allows you to create a new soccer league.
</p>
<form action='../leagueProcessing?choice=add-league' method='Post'>
Year: <input type='text' name='year' value='' /> <br/><br/>
Season: <select name='season'>
          <option value='UNKNOWN'>select...</option>
          <option value='Spring'>Spring</option>
          <option value='Summer'>Summer</option>
          <option value='Autumn'>Autumn</option>
          <option value='Winter'>Winter</option>
        </select> <br/><br/>
Title: <input type='text' name='title' value='' /> <br/><br/>
<input type='Submit' value='Add League' />
</form>
</body>
</html>