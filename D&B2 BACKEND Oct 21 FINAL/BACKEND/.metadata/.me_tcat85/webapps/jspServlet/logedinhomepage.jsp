
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
				left: 1530px;
				top: 5px;
				font-size:20px
            }
			.button010{
				background: black;
				color: white;
				position: absolute;
				height: 40px;
				width: 200px;
				border: black;
				left: 1330px;
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
			
		</style>
	</head>


<body>

		<header id="head">
	
	<a href="logedinproduct.jsp">
	<button class="button0">Product</button>
	</a>
	<a href="aboutus.jsp">
	<button class="button1">About us</button>
	</a>
	<a href="homepage.jsp">
	<button class="button3">Logout</button>
	</a>
	<a href="shoppingcart.jsp">
	<button class="button5">Shopping cart</button>
	</a>
	<a href="logedinhomepage.jsp">
	<button class="logo"></button>
	</a>
	
	<% String username = (String)session.getAttribute("username"); %>
	<button class="button010">Welcome <%= username %></button>	
		</header>
		
</body>
</html>