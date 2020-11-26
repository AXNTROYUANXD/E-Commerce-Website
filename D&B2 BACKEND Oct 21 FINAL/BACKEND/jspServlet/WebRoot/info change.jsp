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
				font-size:24px
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
				font-size:24px
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
				left: 1520px;
				top: 5px;
				font-size:20px
            }
			.button010{
				background: black;
				color: white;
				position: absolute;
				height: 40px;
				width: 300px;
				border: black;
				left: 250px;
				top: 5px;
				font-size:20px
            }
			.central{
				background: black;
				color: white;
				position: absolute;
				height: 40px;
				width: 200px;
				border: black;
				left: 100px;
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
		
.backgnd1 {
    height: 700px;
    width: 100%;
    top: 150px;
	position: absolute;	
	background-color: #EEEEEE;
	border:none;
	}			
.backgnd2 {
    height: 350px;
    width: 1200px;
    top: 240px;
	left: 50%;
	margin-left: -600px;
	border-radius: 18px;
    border: none;
	position: absolute;	
	background-color: #FFFFFF;
	font-size: 25px;
	}			
			
		.button61{
			background: #EEEEEE;
			color: #606060;
			position: absolute;
			height: 42px;
			width: 200px;
			border: black;
			left: 30%;
			margin-left: -40px;
			top: 300px;
			font-size:20px;
			border-bottom-left-radius: 10px;
			border-top-left-radius: 10px;
		}			
		.button62{
			background: #EEEEEE;
			color: #606060;
			position: absolute;
			height: 42px;
			width: 200px;
			border: black;
			left: 30%;
			margin-left: -40px;
			top: 360px;
			font-size:20px;
			border-bottom-left-radius: 10px;
			border-top-left-radius: 10px;
		}	
		.button63{
			background: #EEEEEE;
			color: #606060;
			position: absolute;
			height: 42px;
			width: 200px;
			border: black;
			left: 30%;
			margin-left: -40px;
			top: 420px;
			font-size:20px;
			border-bottom-left-radius: 10px;
			border-top-left-radius: 10px;
		}
		.button64{
			background: #EEEEEE;
			color: #606060;
			position: absolute;
			height: 42px;
			width: 200px;
			border: black;
			left: 30%;
			margin-left: -40px;
			top: 480px;
			font-size:20px;
			border-bottom-left-radius: 10px;
			border-top-left-radius: 10px;
		}	
		
    .password {
    width: 500px;
    height: 40px;
	top: 300px;
	left: 50%;
	margin-left: -250px;
	border-bottom-right-radius: 10px;
	border-top-right-radius: 10px;
    outline: none;
    border: 1px solid #ccc;
    padding-left: 20px;
	position: absolute;
	font-size: 18px;
}

    .firstname {
    width: 500px;
    height: 40px;
	top: 360px;
	left: 50%;
	margin-left: -250px;
	border-bottom-right-radius: 10px;
	border-top-right-radius: 10px;
    outline: none;
    border: 1px solid #ccc;
    padding-left: 20px;
	position: absolute;
	font-size: 18px;
}

    .lastname {
    width: 500px;
    height: 40px;
	top: 420px;
	left: 50%;
	margin-left: -250px;
	border-bottom-right-radius: 10px;
	border-top-right-radius: 10px;
    outline: none;
    border: 1px solid #ccc;
    padding-left: 20px;
	position: absolute;
	font-size: 18px;
}

    .birthday {
    width: 500px;
    height: 40px;
	top: 480px;
	left: 50%;
	margin-left: -250px;
	border-bottom-right-radius: 10px;
	border-top-right-radius: 10px;
    outline: none;
    border: 1px solid #ccc;
    padding-left: 20px;
	position: absolute;
	font-size: 18px;
}
    .upload {
    height: 80px;
    width: 1200px;
    top: 650px;
	left: 50%;
	margin-left: -600px;
	border-radius: 18px;
    border: none;
    outline: none;
    cursor: pointer;
	position: absolute;	
	background-color:#FFFFFF;
	font-size: 45px;
	}
			
		</style>
	</head>
<body>

		<header id="head">
	
	<a href="product_log.jsp">
    <button class="button0">Product</button>
	</a>
	<a href="about us.jsp">
	<button class="button1">About us</button>
	</a>
    <a href="homepage.jsp">
	<button class="button3">Log out</button>
	</a>
	<a href="shopping cart.jsp">
	<button class="button5">Shopping cart</button>
	</a>	
	<a href="homepage_log.jsp">
	<button class="logo"></button>
	</a>
	<a href="central.jsp">
	<button class="central">Central</button>
	</a>		
	<% String username = (String)session.getAttribute("username"); %>
	<button class="button010">Hello! <%= username %></button>
		</header>
	
	<form>
	<button class="backgnd1"></button>
	<button class="backgnd2"></button>
	</form>			
		
	<button class="button61">Password</button>	
	<button class="button62">Firstname</button>	
	<button class="button63">Lastname</button>
	<button class="button64">Birthday</button>		
	
		<form method="get">	
	<% String password = (String)session.getAttribute("password"); %>
	<% String firstname = (String)session.getAttribute("firstname"); %>
	<% String lastname = (String)session.getAttribute("lastname"); %>
	<% String birthday = (String)session.getAttribute("birthday"); %>
	<input type="password" class="password" name="password" value=" <%= password %>" placeholder="Input new Password">
	<input type="text" class="firstname" name="firstname" value=" <%= firstname %>" placeholder="Input new Firstname">
	<input type="text" class="lastname" name="lastname" value=" <%= lastname %>" placeholder="Input new Lastname">
	<input type="text" class="birthday" name="birthday" value=" <%= birthday %>" placeholder="Input new Birthday">
    <input type="submit" class="upload" value="Upload">			
		
	</form>
	
</body>
</html>