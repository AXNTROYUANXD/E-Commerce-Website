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
				left: 200px;
				top: 550px;
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
				left: 200px;
				top: 587px;
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
				left: 200px;
				top: 350px;
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
				left: 200px;
				top: 387px;
				font-size:20px;
				border: 2px solid #000000;
				border-bottom-left-radius: 10px;
				border-bottom-right-radius: 10px;
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
				top: 200px;
				font-size:64px;
				border-radius: 36px;
            }			
			
		.product_name1{
				background: white;
				position: absolute;
				height: 50px;
				width: 300px;
				left: 50%;
				margin-left: -350px;
				top: 660px;
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
				top: 660px;
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
				top: 1060px;
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
				top: 1060px;
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
				top: 1460px;
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
				top: 1460px;
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
				top: 1860px;
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
				top: 1860px;
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
				top: 2260px;
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
				top: 2260px;
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
				top: 350px;
				font-size:20px;
				background-image: url("<%= picName1 %>");
				background-size:48px 48px;
	    
			}
			.detail2{
				background:#FFFFFF;
				position: absolute;
				height: 300px;
				width: 300px;
				border-color: #000000;
				left: 50%;
				margin-left: 50px;
				top: 350px;
				font-size:20px;
				background-image: url("<%= picName2 %>");
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
				top: 750px;
				font-size:20px;
				background-image: url("<%= picName3 %>");
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
				top: 750px;
				font-size:20px;
				background-image: url("<%= picName4 %>");
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
				top: 1150px;
				font-size:20px;
				background-image: url("<%= picName5 %>");
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
				top: 1150px;
				font-size:20px;
				background-image: url("<%= picName6 %>");
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
				top: 1550px;
				font-size:20px;
				background-image: url("<%= picName7 %>");
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
				top: 1550px;
				font-size:20px;
				background-image: url("<%= picName8 %>");
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
				top: 1950px;
				font-size:20px;
				background-image: url("<%= picName9 %>");
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
				top: 1950px;
				font-size:20px;
				background-image: url("<%= picName10 %>");
				background-size:48px 48px;
			}
		
.backgnd1 {
    height: 250px;
    width: 100%;
	top:50px;
	position: absolute;	
	background-color: #EEEEEE;
	border:none;
	}			
.backgnd2 {
    height: 100px;
    width: 1200px;
    top: 125px;
	left: 50%;
	margin-left: -600px;
	border-radius: 18px;
    border: none;
	position: absolute;	
	background-color: #FFFFFF;
	font-size: 25px;
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
		
<form method="get">
	<% String cname1 = (String)session.getAttribute("cname1"); %>	
	<button class="product_name1"><%= cname1 %></button>
	
	<% String cname2 = (String)session.getAttribute("cname2"); %>	
	<button class="product_name2"><%= cname2 %></button>
		
	<% String cname3 = (String)session.getAttribute("cname3"); %>	
	<button class="product_name3"><%= cname3 %></button>
		
	<% String cname4 = (String)session.getAttribute("cname4"); %>	
	<button class="product_name4"><%= cname4 %></button>
		
	<% String cname5 = (String)session.getAttribute("cname5"); %>	
	<button class="product_name5"><%= cname5 %></button>
		
	<% String cname6 = (String)session.getAttribute("cname6"); %>	
	<button class="product_name6"><%= cname6 %></button>
		
	<% Stringcname7 = (String)session.getAttribute("cname7"); %>
	<button class="product_name7"><%= cname7 %></button>
		
	<% String cname8 = (String)session.getAttribute("cname8"); %>	
	<button class="product_name8"><%= cname8 %></button>
	<% String cname9 = (String)session.getAttribute("cname9"); %>	
	<button class="product_name9"><%= cname9 %></button>
		
	<% String cname10 = (String)session.getAttribute("cname10"); 	
	<button class="product_name10"><%= cname10 %></button>	
		</form>
		
<form>	
	<% String picName1 = (String)session.getAttribute("picName1"); %>	

	<% String picName2 = (String)session.getAttribute("picName2"); %>	
		
	<% String picName3 = (String)session.getAttribute("picName3"); %>	

	<% String picName4 = (String)session.getAttribute("picName4"); %>	

	<% String picName5 = (String)session.getAttribute("picName5"); %>	

	<% String picName6 = (String)session.getAttribute("picName6"); %>	

	<% String picName7 = (String)session.getAttribute("picName7"); %>
	
	<% String picName8 = (String)session.getAttribute("picName8"); %>	

	<% String picName9 = (String)session.getAttribute("picName9"); %>	

	<% String picName10 = (String)session.getAttribute("picName10");%>
	   
	<% String commityID1 = (String)session.getAttribute("commityID1"); %>	

	<% String commityID2 = (String)session.getAttribute("commityID2"); %>	
		
	<% String commityID3 = (String)session.getAttribute("commityID3"); %>	

	<% String commityID4 = (String)session.getAttribute("commityID4"); %>	

	<% String commityID5 = (String)session.getAttribute("commityID5"); %>	

	<% String commityID6 = (String)session.getAttribute("commityID6"); %>	

	<% String commityID7 = (String)session.getAttribute("commityID7"); %>
	
	<% String commityID8 = (String)session.getAttribute("commityID8"); %>	

	<% String commityID9 = (String)session.getAttribute("commityID9"); %>	

	<% String commityID10 = (String)session.getAttribute("commityID10"); 
	</form>
	
		<form>
	<button class="backgnd1"></button>
	<button class="backgnd2"></button>
	</form>	
		
	    <form method="post">
    <input type="text" class="search11" name="keyword" value="" placeholder="Input keyword">
    	
	<select name="order" class="order" value="Latest">
	<option><button name="order" type="submit" value="Latest">Latest</button></option>
	<option><button name="order" type="submit" value="Default">Default</button></option>
	</select>
		
	<select name="type" class="type" value="all">
	<option><button name="type" type="submit" value="all">All</button></option>	
	<option><button name="type" type="submit" value="Classic">Classic</button></option>
	<option><button name="type" type="submit" value="Electronic">Electronic</button></option>
	</select>
	<button class="btn11" name="username" value="<%= username %>"></button>		
	</form>

	<button class="button20">Order</button>
    <button class="button23">Type</button>	
		
	  
	
	<form method="get">	
	
	<a href="loginproductdetail.jsp">
    <button name="detail" class="detail1"  value="<%= commityID1%>" ></button>
    </a>
	
	<a href="loginproductdetail.jsp">
    <button name="detail" class="detail2" value="<%= commityID2%>" ></button>
	</a>
	<a href="loginproductdetail.jsp">
    <button name="detail" class="detail3" type = "sumbit" value="<%= commityID3%>" ></button>
	</a>

	<a href="loginproductdetail.jsp">
    <button name="detail" class="detail4" type = "sumbit" value="<%= commityID4%>" ></button>
	</a>

	<a href="loginproductdetail.jsp">
    <button name="detail" class="detail5" type = "sumbit" value="<%= commityID5%>" ></button>
	</a>


	<a href="loginproductdetail.jsp">
    <button name="detail" class="detail6" type = "sumbit" value="<%= commityID6%>" ></button>
	</a>

	<a href="loginproductdetail.jsp">
    <button name="detail" class="detail7" type = "sumbit" value="<%= commityID7%>" ></button>
	</a>
		
	<a href="loginproductdetail.jsp">
    <button name="detail" class="detail8" type = "sumbit" value="<%= commityID8%>" ></button>
	</a>

	<a href="loginproductdetail.jsp">
    <button name="detail" class="detail9" type = "sumbit" value="<%= commityID9%>" ></button>
	</a>

	<a href="loginproductdetail.jsp">
    <button name="detail" class="detail10" type = "sumbit" value="<%= commityID10 %>" ></button>
	</a>
		
	</form>		
		
</body>
</html>