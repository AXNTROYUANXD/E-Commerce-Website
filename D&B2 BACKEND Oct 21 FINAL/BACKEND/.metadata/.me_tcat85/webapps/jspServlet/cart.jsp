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
				color: black;
				position: absolute;
				height: 40px;
				width: 200px;
				border: black;
				left: 100px;
				top: 400px;
				font-size:20px
			}
			.Latest{
				background: white;
				color: black;
				position: absolute;
				height: 40px;
				width: 200px;
				border: black;
				left: 100px;
				top: 500px;
				font-size:20px
            }
			.Default{
				background: white;
				color: black;
				position: absolute;
				height: 40px;
				width: 200px;
				border: black;
				left: 100px;
				top: 450px;
				font-size:20px
            }
			.delete{
				background: #EEEEEE;
				color:#606060;
				position: absolute;
				height: 50px;
				width: 150px;
				border: black;
				left: 50%;
				margin-left: 50px;
				top: 225px;
				font-size:24px;
				border-radius: 18px;
            }
			.buy{
				background: #EEEEEE;
				color:#606060;
				position: absolute;
				height: 300px;
				width: 300px;
				border: black;
				left: 50%;
				margin-left: 450px;
				top: 150px;
				font-size:64px;
				border-radius: 18px;
            }
				.add{
				background: #EEEEEE;
				color:#606060;
				position: absolute;
				height: 50px;
				width: 150px;
				border: black;
				left: 50%;
				margin-left: -225px;
				top: 225px;
				font-size:24px;
				border-radius: 18px;
            }
			
		</style>
	</head>
<body>

		<header id="head">
	
	<a href="product_log.html">
    <button class="button0">Product</button>
	</a>
	<a href="about us.html">
	<button class="button1">About us</button>
	</a>
    <a href="homepage.html">
	<button class="button3">Log out</button>
	</a>
	<a href="shopping cart.html">
	<button class="button5">Shopping cart</button>
	</a>	
	<a href="homepage_log.html">
	<button class="logo"></button>
	</a>
	<a href="cantral.html">
	<button class="central">Central</button>
	</a>
			
	<% String username = (String)session.getAttribute("username"); %>	
	<button class="button010">Hello! <%= username %></button>			
		</header>
	

	    
	<form>
    <input type="text" class="search11" name="keyword" value="" placeholder="Input keyword">
    <input type="submit" class="btn11" value="">	
    </form>
	
	<form>
	<button class="button20">Order</button>	
	<button name="order" type="submit" class="Latest" value="Latest&nbsp;Released">Order by latest</button>
	<button name="order" type="submit" class="Default" value="Default&nbsp;Mode">Order by default</button>

	<button name="delete" type="submit" class="delete" value="Delete">Delete</button>
	
	<button name="buy" type="submit" class="buy" value="Buy">BUY</button>	
	</form>

	<a href="product_log.html">
    <button class="add">Add</button>
	</a>
	
</body>
</html>