<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.container{
		text-align: center;
		height:300px;
		width:300px;
		margin: 0 auto;
		border: 5px solid red;
		border-radius: 10%;;
		-webkit-transform-style: preserve-3d;
	  	-moz-transform-style: preserve-3d;
	  	transform-style: preserve-3d;
	}

	.form{
		position: relative;
  		top: 50%;
  		transform: translateY(-50%);
	}
	
	.form>*{
		display:block;
		padding: 1em 0;
		margin: 0.5em auto;
	}
	
	label{
		visibility: hidden;
	}
	
	input[type="password"], input[type="text"]{
		height:1.5em;
		border: 3px solid grey;
	}
</style>
</head>
<body>
	<div class="container">
		<form action="Validations" method="post" class="form">
			<label for="user">Username</label>
			<input type="text" placeholder="username" name="username">
			<label for="password">Password</label>
			<input type="password" placeholder="password" name="password">
			<input type="submit" value="send nudes">
		</form>
	</div>
</body>
</html>