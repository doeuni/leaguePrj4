<html>
<head>
  <title>Duke's Soccer League: Registration</title>
</head>
<body bgcolor='white'>
<!-- Page Heading -->
<table border='1' cellpadding='5' cellspacing='0' width='400'>
<tr bgcolor='#CCCCFF' align='center' valign='center' height='20'>
  <td><h3>Duke's Soccer League: Registration</h3></td>
</tr>
</table>
<p>
This form allows you to register for a soccer league.
</p>
<form action='../leagueProcessing?choice=register-league' method='POST'>
<h4>Select a League</h4>
Year: <input type='text' name='year' value='' /> <br/><br/>
Season: <select name='season'>
          <option value='UNKNOWN'>select...</option>
          <option value='Spring'>Spring</option>
          <option value='Summer'>Summer</option>
          <option value='Autumn'>Autumn</option>
          <option value='Winter'>Winter</option>
        </select> <br/><br/>
<h4>Enter Player Information</h4>
Name: <input type='text' name='name' value='' /> <br/><br/>
Address: <input type='text' name='address' value='' /> <br/><br/>
City: <input type='text' name='city' value='' /> <br/><br/>
Province: <input type='text' name='province' value='' /> <br/><br/>
Postal code: <input type='text' name='postalCode' value='' /> <br/><br/>
<h4>Select a Division</h4>
Division: <select name='division'>
          <option value='UNKNOWN'>select...</option>
          <option value='Coed A'>Coed A</option>
          <option value='Coed B'>Coed B</option>
          <option value='Mens'>Mens</option>
          <option value='Womens'>Womens</option>
        </select> <br/><br/>
<input type='Submit' value='Register' />
</form>
</body>
</html>