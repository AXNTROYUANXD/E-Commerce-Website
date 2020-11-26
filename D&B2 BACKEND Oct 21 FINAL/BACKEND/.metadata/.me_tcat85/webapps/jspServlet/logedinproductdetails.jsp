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
				background-image:url("logo.png");
        		background-size:40px 40px;
				border-radius: 20px;
            }
	.cname{
		position: absolute;
		height: 80px;
		width: 300px;
		border: black;
		left: 50%;
		margin-left: -50px;
		top: 150px;
		background: #FFFFFF;
		font-size: 36px;
	}
	.picName{
		position: absolute;
		height: 200px;
		width: 200px;
		border: black;
		left: 25%;
		top: 350px;
		background: #FFFFFF;
		background-image: url("logo.png");
		background-size:200px 200px;
		border-radius: 20px;
	}
	.price{
		position: absolute;
		height: 60px;
		width: 200px;
		border: black;
		left: 50%;
		top: 350px;
		font-size: 20px;
		background: #FFFFFF;
		border-color: #000000;
	}
	.addedDate{
		position: absolute;
		height: 40px;
		width: 200px;
		border: black;
		left: 50%;
		top: 400px;
		font-size: 12px;
		background: #FFFFFF;
	}
			
			.num{
				background: white;
				color: #606060;
				position: absolute;
				height: 40px;
				width: 200px;
				border: black;
				left: 50%;
				margin-left: 300px;
				top: 387px;
				font-size:20px;
				border: 2px solid #000000;
				border-bottom-left-radius: 8px;
				border-bottom-right-radius: 8px;
			}
			
			.buy{
				background: #EEEEEE;
				color:#606060;
				position: absolute;
				height: 100px;
				width: 1200px;
				border: black;
				left: 50%;
				margin-left: -600px;
				top: 850px;
				font-size:64px;
				border-radius: 36px;
            }
			.add{
				position: absolute;
				background: #EEEEEE;
				height: 285px;
				width: 285px;
				left: 50%;
				margin-left: 650px;
				top: 350px;
				border-radius: 36px;
				background-image: url("shoppingcart.png");
        		background-size:280px 280px;
				border-radius: 10px;
				border: 2px solid #FFFFFF;
            }
			
			.numchoice{
				background: white;
				color: #606060;
				position: absolute;
				height: 40px;
				width: 200px;
				border: black;
				left: 50%;
				margin-left: 300px;
				top: 350px;
				font-size:20px;
				border: 2px solid #000000;
				border-top-left-radius: 8px;
				border-top-right-radius: 8px;
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
	<a href="logedinhomepage.jsp">
	<button class="button3">Log out</button>
	</a>
	<a href="shopping cart.jsp">
	<button class="button5">Shopping cart</button>
	</a>
	<a href="logedinhomepage.jsp">
	<button class="logo"></button>
	</a>
			
	<% String username = (String)session.getAttribute("username"); %>
	<button class="button010">Hello! <%= username %></button>	
		</header>
	
	<form>
	<% String commodityID0 = (String)session.getAttribute("searchResult0commodityID"); %>
	
	<% String cname = (String)session.getAttribute("detailscname"); %>
	<a href="loginproductdetail.html">
	<button class="cname"><%= cname %></button></a>
		
	<% String price = (String)session.getAttribute("detailsprice"); %>
	<button class="price"><%= price %></button>
		
	<% String addedDate = (String)session.getAttribute("detailsaddedDate"); %>	
	<button class="addedDate"><%= addedDate %></button>
		
	<% String picName = (String)session.getAttribute("detailspicName"); %>	
	<button class="picName"><%= picName %></button>
	</form>	
	
	<form method="post" action="./logedinproductdetails">
	<select name="number" class="num" value="1">
	<option><button name="num" type="submit" value="1">1</button></option>	
	<option><button name="num" type="submit" value="2">2</button></option>
	<option><button name="num" type="submit" value="3">3</button></option>	
	<option><button name="num" type="submit" value="4">4</button></option>	
	<option><button name="num" type="submit" value="5">5</button></option>
	<option><button name="num" type="submit" value="6">6</button></option>	
	<option><button name="num" type="submit" value="7">7</button></option>	
	<option><button name="num" type="submit" value="8">8</button></option>
	<option><button name="num" type="submit" value="9">9</button></option>	
	</select>
	
	<button class="add" name="opt" type="submit" value="add"></button>
  	<input class="buy" name="opt" type="submit" value="BUY" />
	</form>		
	
	<button class="numchoice">Order</button>
		
		
</body>
</html>