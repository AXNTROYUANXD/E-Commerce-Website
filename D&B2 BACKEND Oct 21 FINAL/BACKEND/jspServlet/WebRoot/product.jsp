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
    border: 2px solid #CCC;
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
				top: 500px;
				font-size:20px;
				border: 2px solid #000000;
				border-top-left-radius: 10px;
				border-top-right-radius: 10px;
			}
			.order{
				background: white;
				color: #606060;
				position: absolute;
				height: 40px;
				width: 200px;
				border: black;
				left: 100px;
				top: 537px;
				font-size:20px;
				border: 2px solid #000000;
				border-bottom-left-radius: 10px;
				border-bottom-right-radius: 10px;
            }
			.button23{
				background: white;
				color: #606060;
				position: absolute;
				height: 40px;
				width: 200px;
				border: black;
				left: 100px;
				top: 300px;
				font-size:20px;
				border: 2px solid #000000;
				border-top-left-radius: 10px;
				border-top-right-radius: 10px;
			}
			.type{
				background: white;
				color: #606060;
				position: absolute;
				height: 40px;
				width: 200px;
				border: black;
				left: 100px;
				top: 337px;
				font-size:20px;
				border: 2px solid #000000;
				border-bottom-left-radius: 10px;
				border-bottom-right-radius: 10px;
			}

			.product_name1{
				background: white;
				position: absolute;
				height: 50px;
				width: 300px;
				left: 50%;
				margin-left: -350px;
				top: 610px;
				font-size:20px;
				border: 2px solid #FFFFFF;
			}
			.product_name2{
				background: white;
				position: absolute;
				height: 50px;
				width: 300px;
				left: 50%;
				margin-left: 50px;
				top: 610px;
				font-size:20px;
				border: 2px solid #FFFFFF;
			}
			.product_name3{
				background: white;
				position: absolute;
				height: 50px;
				width: 300px;
				left: 50%;
				margin-left: -350px;
				top: 1010px;
				font-size:20px;
				border: 2px solid #FFFFFF;
			}
			.product_name4{
				background: white;
				position: absolute;
				height: 50px;
				width: 300px;
				left: 50%;
				margin-left: 50px;
				top: 1010px;
				font-size:20px;
				border: 2px solid #FFFFFF;
			}
			.product_name5{
				background: white;
				position: absolute;
				height: 50px;
				width: 300px;
				left: 50%;
				margin-left: -350px;
				top: 1410px;
				font-size:20px;
				border: 2px solid #FFFFFF;
			}
			.product_name6{
				background: white;
				position: absolute;
				height: 50px;
				width: 300px;
				left: 50%;
				margin-left: 50px;
				top: 1410px;
				font-size:20px;
				border: 2px solid #FFFFFF;
			}
			.product_name7{
				background: white;
				position: absolute;
				height: 50px;
				width: 300px;
				border: black;
				left: 50%;
				margin-left: -350px;
				top: 1810px;
				font-size:20px;
				border: 2px solid #FFFFFF;
			}
			.product_name8{
				background: white;
				position: absolute;
				height: 50px;
				width: 300px;
				left: 50%;
				margin-left: 50px;
				top: 1810px;
				font-size:20px;
				border: 2px solid #FFFFFF;
			}
			.product_name9{
				background: white;
				position: absolute;
				height: 50px;
				width: 300px;
				left: 50%;
				margin-left: -350px;
				top: 2210px;
				font-size:20px;
				border: 2px solid #FFFFFF;
			}
			.product_name10{
				background: white;
				position: absolute;
				height: 50px;
				width: 300px;
				left: 50%;
				margin-left: 50px;
				top: 2210px;
				font-size:20px;
				border: 2px solid #FFFFFF;
			}
			.detail1{
				background: #FFFFFF;
				position: absolute;
				height: 300px;
				width: 300px;
				border-color: black;
				left: 50%;
				margin-left: -350px;
				top: 300px;
				font-size:20px;
				background-size:48px 48px;

			}
			.detailimg{
				background: #FFFFFF;
				position: absolute;
				height: 300px;
				width: 300px;
				border-color: black;
				left: -2px;	
				top: -2px;
				font-size:20px;
				background-size:48px 48px;

			}
			.detail2{
				background:#FFFFFF;
				position: absolute;
				height: 300px;
				width: 300px;
				border-color: black;
				left: 50%;
				margin-left: 50px;
				top: 300px;
				font-size:20px;
				background-size:48px 48px;
			}
			.detail3{
				background: #FFFFFF;
				position: absolute;
				height: 300px;
				width: 300px;
				border-color: black;
				left: 50%;
				margin-left: -350px;
				top: 700px;
				font-size:20px;
				background-size:48px 48px;
			}
			.detail4{
				background:#FFFFFF;
				position: absolute;
				height: 300px;
				width: 300px;
				border-color: black;
				left: 50%;
				margin-left: 50px;
				top: 700px;
				font-size:20px;
				background-size:48px 48px;
			}
			.detail5{
				background: #FFFFFF;
				position: absolute;
				height: 300px;
				width: 300px;
				border-color: black;
				left: 50%;
				margin-left: -350px;
				top: 1100px;
				font-size:20px;
				background-size:48px 48px;
			}
			.detail6{
				background:#FFFFFF;
				position: absolute;
				height: 300px;
				width: 300px;
				border-color: black;
				left: 50%;
				margin-left: 50px;
				top: 1100px;
				font-size:20px;
				background-size:48px 48px;
			}
			.detail7{
				background: #FFFFFF;
				position: absolute;
				height: 300px;
				width: 300px;
				border-color: black;
				left: 50%;
				margin-left: -350px;
				top: 1500px;
				font-size:20px;
				background-size:48px 48px;
			}
			.detail8{
				background:#FFFFFF;
				position: absolute;
				height: 300px;
				width: 300px;
				border-color: black;
				left: 50%;
				margin-left: 50px;
				top: 1500px;
				font-size:20px;
				background-size:48px 48px;
			}
			.detail9{
				background: #FFFFFF;
				position: absolute;
				height: 300px;
				width: 300px;
				border-color: black;
				left: 50%;
				margin-left: -350px;
				top: 1900px;
				font-size:20px;
				background-size:48px 48px;
			}
			.detail10{
				background:#FFFFFF;
				position: absolute;
				height: 300px;
				width: 300px;
				border-color: black;
				left: 50%;
				margin-left: 50px;
				top: 1900px;
				font-size:20px;
				background-size:48px 48px;
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
	<a href="cart.jsp">
	<button class="button5">Shopping cart</button>
	</a>
	<a href="homepage.jsp">
	<button class="logo"></button>
	</a>	
		</header>

    					
</header>
				
	    <form method="post" action="./logedinproduct">
    <input type="text" class="search11" name="content" value="" placeholder="Input keyword">
    	
	
	<select name="sortMode" class="order" value="Default Mode">
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
	<button class="button20">Order</button>
    <button class="button23">Type</button>
    
<form method="post" action="./logedinproduct">
	<% String cname1 = (String)session.getAttribute("searchResult0cname"); %>
	<button class="product_name1"><%= cname1 %></button>
	
	<% String cname2 = (String)session.getAttribute("searchResult1cname"); %>	
	<button class="product_name2"><%= cname2 %></button>
		
	<% String cname3 = (String)session.getAttribute("searchResult2cname"); %>	
	<button class="product_name3"><%= cname3 %></button>
		
	<% String cname4 = (String)session.getAttribute("searchResult3cname"); %>	
	<button class="product_name4"><%= cname4 %></button>
		
	<% String cname5 = (String)session.getAttribute("searchResult4cname"); %>	
	<button class="product_name5"><%= cname5 %></button>
		
	<% String cname6 = (String)session.getAttribute("searchResult5cname"); %>	
	<button class="product_name6"><%= cname6 %></button>
		
	<% String cname7 = (String)session.getAttribute("searchResult6cname"); %>
	<button class="product_name7"><%= cname7 %></button>
		
	<% String cname8 = (String)session.getAttribute("searchResult7cname"); %>	
	<button class="product_name8"><%= cname8 %></button>

	<% String cname9 = (String)session.getAttribute("searchResult8cname"); %>	
	<button class="product_name9"><%= cname9 %></button>

	<% String cname10 = (String)session.getAttribute("searchResult9cname"); %>
	<button class="product_name10"><%= cname10 %></button>
		
</form>



	<form method="post" action="./loginproductdetail">
		<% String commodityID0 = (String)session.getAttribute("searchResult0commodityID"); %>
		
    	<button name="commodityID" class="detail1" value="<%= commodityID0 %>" type = "SUBMIT" formtarget="_blank">
    	<% String picName0 = (String)session.getAttribute("searchResult0picName"); %>
    	<img class="detailimg" src="<%= picName0 %>"  alt="" />
    	</button>
	</form>

	<form method="post" action="./loginproductdetail">
		<% String commodityID1 = (String)session.getAttribute("searchResult1commodityID"); %>
		
    	<button name="commodityID" class="detail2" value="<%= commodityID1 %>" type = "SUBMIT" formtarget="_blank">
    	<% String picName1 = (String)session.getAttribute("searchResult1picName"); %>
    	<img class="detailimg" src="<%= picName1 %>"  alt="" />
    	</button>
	</form>
	
	<form method="post" action="./loginproductdetail">
		<% String commodityID2 = (String)session.getAttribute("searchResult2commodityID"); %>

    	<button name="commodityID" class="detail3" value="<%= commodityID2 %>" type = "SUBMIT" formtarget="_blank">
    	<% String picName2 = (String)session.getAttribute("searchResult2picName"); %>
    	<img class="detailimg" src="<%= picName2 %>"  alt="" />
    	</button>
	</form>
	
	<form method="post" action="./loginproductdetail">
		<% String commodityID3 = (String)session.getAttribute("searchResult3commodityID"); %>
		
    	<button name="commodityID" class="detail4" value="<%= commodityID3 %>" type = "SUBMIT" formtarget="_blank">
    	<% String picName3 = (String)session.getAttribute("searchResult3picName"); %>
    	<img class="detailimg" src="<%= picName3 %>"  alt="" />
    	</button>
	</form>
	
	
	<form method="post" action="./loginproductdetail">
		<% String commodityID4 = (String)session.getAttribute("searchResult4commodityID"); %>
		
    	<button name="commodityID" class="detail5" value="<%= commodityID4 %>" type = "SUBMIT" formtarget="_blank">
    	<% String picName4 = (String)session.getAttribute("searchResult4picName"); %>
    	<img class="detailimg" src="<%= picName4 %>"  alt="" />
    	</button>
	</form>
	
	<form method="post" action="./loginproductdetail">
		<% String commodityID5 = (String)session.getAttribute("searchResult5commodityID"); %>
		
    	<button name="commodityID" class="detail6" value="<%= commodityID5 %>" type = "SUBMIT" formtarget="_blank">
    	<% String picName5 = (String)session.getAttribute("searchResult5picName"); %>
    	<img class="detailimg" src="<%= picName5 %>"  alt="" />
    	</button>
	</form>
	
	
	<form method="post" action="./loginproductdetail">
		<% String commodityID6 = (String)session.getAttribute("searchResult6commodityID"); %>
		
    	<button name="commodityID" class="detail7" value="<%= commodityID6 %>" type = "SUBMIT" formtarget="_blank">
    	<% String picName6 = (String)session.getAttribute("searchResult6picName"); %>
    	<img class="detailimg" src="<%= picName6 %>"  alt="" />
    	</button>
	</form>
	
	<form method="post" action="./loginproductdetail">
		<% String commodityID7 = (String)session.getAttribute("searchResult7commodityID"); %>
		
    	<button name="commodityID" class="detail8" value="<%= commodityID7 %>" type = "SUBMIT" formtarget="_blank">
    	<% String picName7 = (String)session.getAttribute("searchResult7picName"); %>
    	<img class="detailimg" src="<%= picName7 %>"  alt="" />
    	</button>
	</form>
	
	<form method="post" action="./loginproductdetail">
		<% String commodityID8 = (String)session.getAttribute("searchResult8commodityID"); %>
		
    	<button name="commodityID" class="detail9" value="<%= commodityID8 %>" type = "SUBMIT" formtarget="_blank">
    	<% String picName8 = (String)session.getAttribute("searchResult8picName"); %>
    	<img class="detailimg" src="<%= picName8 %>"  alt="" />
    	</button>
	</form>
	
	<form method="post" action="./loginproductdetail">
		<% String commodityID9 = (String)session.getAttribute("searchResult9commodityID"); %>
		
    	<button name="commodityID" class="detail10" value="<%= commodityID9 %>" type = "SUBMIT" formtarget="_blank">
    	<% String picName9 = (String)session.getAttribute("searchResult9picName"); %>
    	<img class="detailimg" src="<%= picName9 %>"  alt="" />
    	</button>
    	
	</form>

	
</body>
</html>