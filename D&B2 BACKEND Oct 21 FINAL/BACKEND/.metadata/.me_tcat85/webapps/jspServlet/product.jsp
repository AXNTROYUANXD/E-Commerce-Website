
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
				left: 1620px;
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
				left: 1430px;
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
			
    .parent11 {
    position: relative;
}
    .search11 {
    width: 500px;
    height: 50px;
	top: 150px;
	left: 50%;
	margin-left: -250px;
    border-radius: 18px;
    outline: none;
    border: 1px solid #ccc;
    padding-left: 20px;
	position: absolute;
	font-size: 18px;
}
    .btn11 {
    height: 50px;
    width: 50px;
    top: 151px;
	left: 50%;
	margin-left: 280px;
	border-radius: 18px;
    border: none;
    outline: none;
    cursor: pointer;
	position: absolute;	
	background-image: url("search.png");
	background-size:48px 48px;
	border-radius: 20px;
	}
			.button20{
				background: white;
				color: #606060;
				position: absolute;
				height: 40px;
				width: 200px;
				border: black;
				left: 100px;
				top: 600px;
				font-size:20px;
				border: 2px solid #000000;
				border-radius: 3px;
			}
			.Latest{
				background: white;
				color: #606060;
				position: absolute;
				height: 40px;
				width: 200px;
				border: black;
				left: 100px;
				top: 637px;
				font-size:20px;
				border: 2px solid #000000;
				border-radius: 3px;
            }
			.button23{
				background: white;
				color: #606060;
				position: absolute;
				height: 40px;
				width: 200px;
				border: black;
				left: 100px;
				top: 400px;
				font-size:20px;
				border: 2px solid #000000;
				border-radius: 3px;
			}
			.type{
				background: white;
				color: #606060;
				position: absolute;
				height: 40px;
				width: 200px;
				border: black;
				left: 100px;
				top: 437px;
				font-size:20px;
				border: 2px solid #000000;
				border-radius: 3px;
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
    <a href="login.jsp">
	<button class="button3">Login</button>
	</a>
	<a href="signup.jsp">
	<button class="button4">Sign up</button>
	</a>
	<a href="shoppingcart.jsp">
	<button class="button5">Shopping cart</button>
	</a>
	<a href="homepage.jsp">
	<button class="logo"></button>
	</a>

			
		</header>
		
	    <form method="post" action="./product">
    <input type="text" class="search11" name="content" value="" placeholder="Input keyword">
    	
	
	<select name="sortMode" class="Latest" value="Default Mode">
	<option><button name="sortMode" type="submit" value="Latest Released">Latest Released</button></option>
	<option><button name="sortMode" type="submit" value="Default Mode">Default Mode</button></option>
	</select>
		
	<select name="fliter" class="type" value="All">
	<option><button name="fliter" type="submit" value="All">All</button></option>	
	<option><button name="fliter" type="submit" value="Classic">Classic</button></option>
	<option><button name="fliter" type="submit" value="Electronic">Electronic</button></option>
	</select>
			
	<input type="submit" class="btn11" value="">		
	</form>
	<button class="button20">Display Order</button>		
    <button class="button23">Type</button>
</body>
</html>