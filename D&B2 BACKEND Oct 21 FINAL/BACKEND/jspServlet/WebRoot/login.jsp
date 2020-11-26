


<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<style type="text/css">
			*{
				padding: 0;
				margin: 0;
			}
			#head{
				height: 50px;
				background-color: black;
				margin: 0 auto;
			}

			.button0{
				background: black;
				color: white;
				position: absolute;
				height: 40px;
				width: 100px;
				border: black;
				left: 50%;
				margin-left: -200px;
				top: 5px;
				font-size:20px
            }
			.button1{
				background: black;
				color: white;
				position: absolute;
				height: 40px;
				width: 100px;
				border: black;
				left: 50%;
				margin-left: 100px;
				top: 5px;
				font-size:20px
            }
			.button3{
				background: black;
				color: white;
				position: absolute;
				height: 40px;
				width: 100px;
				border: black;
				left: 1820px;
				top: 5px;
				font-size:20px
            }
			.button4{
				background: black;
				color: white;
				position: absolute;
				height: 40px;
				width: 100px;
				border: black;
				left: 1720px;
				top: 5px;
				font-size:20px
            }
			.button5{
				background: black;
				color: white;
				position: absolute;
				height: 40px;
				width: 200px;
				border: black;
				left: 1500px;
				top: 5px;
				font-size:20px
            }
			.logo{
				position: absolute;
				height: 40px;
				width: 40px;
				border: black;
				left: 50%;
				margin-left: -20px;
				top: 5px;
				background: #FFFFFF;
				background-image: url("logo.png");
        		background-size:40px 40px;
				border-radius: 20px;
            }
			
		.button51{
			background:#EEEEEE;
			color:#606060;
			position: absolute;
			height: 40px;
			width: 200px;
			border: black;
			left: 30%;
			margin-left: -50px;
			top: 360px;
			font-size:30px;
			border-radius: 10px;
		}
		.button52{
			background: #EEEEEE;
			color: #606060;
			position: absolute;
			height: 40px;
			width: 200px;
			border: black;
			left: 30%;
			margin-left: -50px;
			top: 420px;
			font-size:30px;
			border-radius: 10px;
		}
	.username {
    width: 500px;
    height: 40px;
	top: 360px;
	left: 50%;
	margin-left: -250px;
    border-radius: 10px;
    outline: none;
    border: 1px solid #ccc;
    padding-left: 20px;
	position: absolute;
	font-size: 18px;
}

    .password {
    width: 500px;
    height: 40px;
	top: 420px;
	left: 50%;
	margin-left: -250px;
    border-radius: 10px;
    outline: none;
    border: 1px solid #ccc;
    padding-left: 20px;
	position: absolute;
	font-size: 18px;
}
	.btn51 {
    height: 80px;
    width: 300px;
    top: 550px;
	left: 50%;
	margin-left: -150px;
	border-radius: 18px;
    border: none;
    outline: none;
    cursor: pointer;
	position: absolute;	
	background-color: #EEEEEE;
	font-size: 45px;
	}
	.btn52 {
    height: 80px;
    width: 300px;
    top: 650px;
	left: 50%;
	margin-left: -150px;
	border-radius: 18px;
    border: none;
    outline: none;
    cursor: pointer;
	position: absolute;	
	background-color: #EEEEEE;
	font-size: 25px;
	}
	.signup {
    height: 100px;
    width: 1200px;
    top: 650px;
	left: 50%;
	margin-left: -600px;
	border-radius: 18px;
    border: none;
    cursor: pointer;
	position: absolute;	
	background-color: #EEEEEE;
	font-size: 36px;
	color: #606060;
	}
		</style>
	</head>

<body>

		<header id="head">
	
		<a href="product.jsp">
		<button class="button0">Product</button>
		</a>
		<a href="aboutus.jsp">
		<button class="button1">About us</button>
		</a>
		<a href="product.jsp">
		<button class="button5">Shopping cart</button>	
		</a>
		<a href="signup.jsp">
		<button class="button4">Sign up</button>
		</a>
		<a href="homepage.jsp">
		<button class="logo"></button>
		</a>
		</header>
	
	<form method="post" action="./login">
	<button class="button51">User name</button>	
	<button class="button52">Password</button>	
	<input type="text" class="username" name="username" value="" placeholder="Username">
	<input type="password" class="password" name="password" value="" placeholder="Password">
	<input type="SUBMIT" name="login" class="btn51" value="Login in">
	</form>
	<a href="signup.jsp">
	<button class="signup">No account? SIGN UP NOW!</button>
	</a>


</body>
</html>