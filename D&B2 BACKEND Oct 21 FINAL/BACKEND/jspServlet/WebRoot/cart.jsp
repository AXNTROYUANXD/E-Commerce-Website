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
				height: 150px;
				width: 600px;
				border: black;
				left: 850px;
				margin-left: -150px;
				top: 120px;
				font-size:64px;
				border-radius: 18px;
            }
            .buy1{
				background: #EEEEEE;
				color:#606060;
				position: absolute;
				height: 100px;
				width: 200px;
				border: black;
				left: 450px;
				margin-left: -150px;
				top: 120px;
				font-size:32px;
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
            
            .h1{
				position: absolute;
				height: 40px;
				width: 200px;
				border: black;
				left: 250px;
				top: 300px;
				font-size:48px
            }
            .h2{
				position: absolute;
				height: 40px;
				width: 400px;
				border: black;
				left: 850px;
				top: 300px;
				font-size:48px
            }
            .h3{
				position: absolute;
				height: 40px;
				width: 400px;
				border: black;
				left: 1450px;
				top: 300px;
				font-size:48px
            }
            .detail1{
				background: #FFFFFF;
				position: absolute;
				height: 200px;
				width: 200px;
				border-color: black;
				left: 25%;
				margin-left: -350px;
				top: 400px;
				font-size:20px;
				background-size:48px 48px;

			}
			.p0{
				background: #FFFFFF;
				position: absolute;
				height: 200px;
				width: 200px;
				border-color: black;
				left: 35%;
				margin-left: -300px;
				top: 400px;
				font-size:20px;
				background-size:48px 48px;

			}
			.p1{
				background: #FFFFFF;
				position: absolute;
				height: 200px;
				width: 300px;
				border-color: black;
				left: 35%;
				margin-left: -300px;
				top: 430px;
				font-size:36px;
				background-size:48px 48px;

			}
			.p2{
				background: #FFFFFF;
				position: absolute;
				height: 200px;
				width: 300px;
				border-color: black;
				left: 970px;
				top: 430px;
				font-size:36px;
				background-size:48px 48px;

			}
			.p3{
				background: #FFFFFF;
				position: absolute;
				height: 200px;
				width: 300px;
				border-color: black;
				left: 1550px;
				top: 430px;
				font-size:36px;
				background-size:48px 48px;

			}
			
			.detail2{
				background: #FFFFFF;
				position: absolute;
				height: 200px;
				width: 200px;
				border-color: black;
				left: 25%;
				margin-left: -350px;
				top: 730px;
				font-size:20px;
				background-size:48px 48px;

			}
			.p01{
				background: #FFFFFF;
				position: absolute;
				height: 200px;
				width: 200px;
				border-color: black;
				left: 35%;
				margin-left: -300px;
				top: 730px;
				font-size:20px;
				background-size:48px 48px;

			}
			.p11{
				background: #FFFFFF;
				position: absolute;
				height: 200px;
				width: 300px;
				border-color: black;
				left: 35%;
				margin-left: -300px;
				top: 730px;
				font-size:36px;
				background-size:48px 48px;

			}
			.p21{
				background: #FFFFFF;
				position: absolute;
				height: 200px;
				width: 300px;
				border-color: black;
				left: 970px;
				top: 730px;
				font-size:36px;
				background-size:48px 48px;

			}
			.p31{
				background: #FFFFFF;
				position: absolute;
				height: 200px;
				width: 300px;
				border-color: black;
				left: 1550px;
				top: 730px;
				font-size:36px;
				background-size:48px 48px;

			}
			.detailimg{
				background: #FFFFFF;
				position: absolute;
				height: 200px;
				width: 200px;
				border-color: black;
				left: -2px;	
				top: -2px;
				font-size:20px;
				background-size:48px 48px;

			}
			
			.detail3{
				background: #FFFFFF;
				position: absolute;
				height: 200px;
				width: 200px;
				border-color: black;
				left: 25%;
				margin-left: -350px;
				top: 1030px;
				font-size:20px;
				background-size:48px 48px;

			}
			.p02{
				background: #FFFFFF;
				position: absolute;
				height: 200px;
				width: 200px;
				border-color: black;
				left: 35%;
				margin-left: -300px;
				top: 1030px;
				font-size:20px;
				background-size:48px 48px;

			}
			.p12{
				background: #FFFFFF;
				position: absolute;
				height: 200px;
				width: 300px;
				border-color: black;
				left: 35%;
				margin-left: -300px;
				top: 1030px;
				font-size:36px;
				background-size:48px 48px;

			}
			.p22{
				background: #FFFFFF;
				position: absolute;
				height: 200px;
				width: 300px;
				border-color: black;
				left: 970px;
				top: 1030px;
				font-size:36px;
				background-size:48px 48px;

			}
			.p32{
				background: #FFFFFF;
				position: absolute;
				height: 200px;
				width: 300px;
				border-color: black;
				left: 1550px;
				top: 1030px;
				font-size:36px;
				background-size:48px 48px;

			}
			
			.detail4{
				background: #FFFFFF;
				position: absolute;
				height: 200px;
				width: 200px;
				border-color: black;
				left: 25%;
				margin-left: -350px;
				top: 1330px;
				font-size:20px;
				background-size:48px 48px;

			}
			.p03{
				background: #FFFFFF;
				position: absolute;
				height: 200px;
				width: 200px;
				border-color: black;
				left: 35%;
				margin-left: -300px;
				top: 1330px;
				font-size:20px;
				background-size:48px 48px;

			}
			.p13{
				background: #FFFFFF;
				position: absolute;
				height: 200px;
				width: 300px;
				border-color: black;
				left: 35%;
				margin-left: -300px;
				top: 1330px;
				font-size:36px;
				background-size:48px 48px;

			}
			.p23{
				background: #FFFFFF;
				position: absolute;
				height: 200px;
				width: 300px;
				border-color: black;
				left: 970px;
				top: 1330px;
				font-size:36px;
				background-size:48px 48px;

			}
			.p33{
				background: #FFFFFF;
				position: absolute;
				height: 200px;
				width: 300px;
				border-color: black;
				left: 1550px;
				top: 1330px;
				font-size:36px;
				background-size:48px 48px;

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
	<button class="button3">Log out</button>
	</a>
	<a href="cart.jsp">
	<button class="button5">Shopping cart</button>
	</a>	
	<a href="logedinhomepage.jsp">
	<button class="logo"></button>
	</a>
	<a href="central.jsp">
	<button class="central">Central</button>
	</a>
			
	<% String username = (String)session.getAttribute("username"); %>	
	<button class="button010">Hello! <%= username %></button>			
		</header>
		

	
	<form method="post" action="./purchasesuccess">
	<input hidden name="username" value="<%= username %>">
	<button name="buy" type="submit" class="buy" value="Buy">BUY NOW</button>	
	</form>
	
	<h1 class="h1"> Product </h1>
	<h1 class="h2"> Price per Each </h1>
	<h1 class="h3"> Quantities </h1>
	
		<% String commodityID0 = null;
		commodityID0 = (String)session.getAttribute("cart0commodityID"); %>
    	<p class="p0">Commodity ID: <%= commodityID0 %></p>
    	
    	<% String cname0 = (String)session.getAttribute("cart0cname"); %>
    	<b class="p1"> <%= cname0 %></b>
    	
    	<% String price0 = (String)session.getAttribute("cart0price"); %>
    	<b class="p2"> <%= price0 %></b>
    	
    	<% String number0 = (String)session.getAttribute("cart0number"); %>
    	<b class="p3"> <%= number0 %></b>
    	
    	<button class="detail1">
    	<% String picName0 = (String)session.getAttribute("cart0picName"); %>
    	<img class="detailimg" src="<%= picName0 %>"  alt="" />
    	</button>
    	
    	
    		
		<% String commodityID1 = null;
		commodityID1 = (String)session.getAttribute("cart1commodityID"); %>
    	<p class="p01">Commodity ID: <%= commodityID1 %></p>
    	
    	<% String cname1 =null;
    	cname1 = (String)session.getAttribute("cart1cname"); %>
    	<b class="p11"> <%= cname1 %></b>
    	
    	<% String price1 = (String)session.getAttribute("cart1price"); %>
    	<b class="p21"> <%= price1 %></b>
    	
    	<% String number1 = (String)session.getAttribute("cart1number"); %>
    	<b class="p31"> <%= number1 %></b>
    	
    	<button class="detail2">
    	<% String picName1 = (String)session.getAttribute("cart1picName"); %>
    	<img class="detailimg" src="<%= picName1 %>"  alt="" />
    	</button>
    	
    	
    		
		<% String commodityID2 = (String)session.getAttribute("cart2commodityID"); %>
    	<p class="p02">Commodity ID: <%= commodityID2 %></p>
    	
    	<% String cname2 = (String)session.getAttribute("cart2cname"); %>
    	<b class="p12"> <%= cname2 %></b>
    	
    	<% String price2 = (String)session.getAttribute("cart2price"); %>
    	<b class="p22"> <%= price2 %></b>
    	
    	<% String number2 = (String)session.getAttribute("cart2number"); %>
    	<b class="p32"> <%= number2 %></b>
    	
    	<button class="detail3">
    	<% String picName2 = (String)session.getAttribute("cart2picName"); %>
    	<img class="detailimg" src="<%= picName2 %>"  alt="" />
    	</button>
    	
    	<% String commodityID3 = (String)session.getAttribute("cart3commodityID"); %>
    	<p class="p03">Commodity ID: <%= commodityID3 %></p>
    	
    	<% String cname3 = (String)session.getAttribute("cart3cname"); %>
    	<b class="p13"> <%= cname3 %></b>
    	
    	<% String price3 = (String)session.getAttribute("cart3price"); %>
    	<b class="p23"> <%= price3 %></b>
    	
    	<% String number3 = (String)session.getAttribute("cart3number"); %>
    	<b class="p33"> <%= number3 %></b>
    	
    	<button class="detail4">
    	<% String picName3 = (String)session.getAttribute("cart3picName"); %>
    	<img class="detailimg" src="<%= picName3 %>"  alt="" />
    	</button>
</body>
</html>