

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
			.button4{
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
.next{
	position: absolute;
	background-color: white;
	height: 480px;
	width: 80px;
	border: none;
	left: 50%;
	margin-left: 600px;	
	top: 50px;
	background-image:
	url("right.png");
      background-size:80px 480px;			
	}
.last{
	position: absolute;
	background-color: white;
	height: 480px;
	width: 80px;
	border: none;
	left: 50%;
	margin-left: -680px;
	top: 50px;
	background-image:
	url("left.png");
     background-size:80px 480px;			
	}
.show{
	position: absolute;
	height: 480px;
	width: 1200px;
	left: 50%;
	margin-left: -600px;
	top: 50px;			
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
	
	<img class="show" src="1.jpg" id="show" >
	<br>
	<button class="next" id="next"></button>
	<button class="last" id="last"></button>
	<script type="text/javascript">
	var show= document.getElementById("show");
	var nextbtn= document.getElementById("next");
	var lastbtn= document.getElementById("last");
	var max=6;
	var	min=1;
	var	now = min;
	
	nextbtn.onclick=function(){
		if(now==max){
			now = 1;
		}else
			now++;	
	show.setAttribute("src", now + ".jpg")
	}
	lastbtn.onclick=function(){
		if(now==min){
			now = 6;
		}else
			now--;
	show.setAttribute("src", now + ".jpg")	
	}		
	
	</script>		
	
</body>
</html>
