<!DOCTYPE html>  
<html lang="en"><head>  
<meta charset="utf-8">  
<title>User Validation Page</title> 
<link rel='stylesheet' href='assets/css/login.css' type='text/css' />
<link rel='stylesheet' href='assets/css/form-validation.css' type='text/css' />  
 
<!-- <script type="text/javascript">
function validateForm() {
    var x = document.forms["registration"]["username"].value;
    if (x == "") {
        alert("Name must be filled out");
        return false;
    }
    else
   	{
   		
   	}
}
onSubmit="return validateForm();"
</script>
 --></head>  
<body>  
<h1>New User Registration Form</h1>  
  
<form action="/MVCApp/verifyuserregistration" method="post">
	<ul>  
		<li><label for="username">User Name:</label></li>  
		<li><input type="text"  id = "username" name="username" size="12" /></li>  
		<li><label for="passid">Password:</label></li>  
		<li><input type="password" name="passid" size="12" /></li>  
		<li><label for="name">Name:</label></li>  
		<li><input type="text" name="name" size="50" /></li>  
		<li><label for="address">Address:</label></li>  
		<li><input type="text" name="address" size="50" /></li>  
		<li><label for="email">Email:</label></li>  
		<li><input type="text" name="email" size="50" /></li>  
		<li><input type="submit" name="submit" value="Submit" /></li> 
		<li><a href=" Home.jsp"><input type="button" value="Back" style="margin-top: 20px; margin-left: 10px;"></a></li>
	</ul>             
</form>
</body>  
</html>  