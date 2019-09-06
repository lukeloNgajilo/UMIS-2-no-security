<!DOCTYPE html>
<html>
<head>
	<title>Login</title>
	<link rel="stylesheet" type="text/css" href="tools/css/login.css">
</head>
<body>
	
	<div class="signin">

		<form method="post" action="/savelogin">
			<h2 style="color: white">UMIS</h2><br><br>
			<input type="text" name="email" placeholder="email"><br><br>
			<input type="password" name="password" placeholder="Password"><br><br><br>
			<button type="submit" >login</button><br>
			           ${msg }
			<div class="container"><br>
				<a href="#" style="margin-right: 0px; font-size: 13px; font-family: Tahoma,Geneva, sans-serif;">Forgot password?</a>
			</div>
			
		</form>
	</div>
</body>
</html>