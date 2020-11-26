<%@ page import="jspservlet.service.car_m" %>
<%@ page import="jspservlet.vo.commodity" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title></title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/news.css" />
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
			.button7{
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
				background-image:url("logo.png");
        		background-size:40px 40px;
				border-radius: 20px;
            }
	.cname{
		position: absolute;
		height: 80px;
		width: 600px;
		border: black;
		left: 50%;
		margin-left: -200px;
		top: 130px;
		background: #FFFFFF;
		font-size: 70px;
	}
	.picName{
		position: absolute;
		height: 400px;
		width: 400px;
		border: black;
		left: 15%;
		top: 240px;
		background: #FFFFFF;
		background-size:400px 400px;
		border-radius: 20px;
	}
	.price{
		position: absolute;
		height: 60px;
		width: 500px;
		border: black;
		left: 42%;
		top: 500px;
		font-size: 50px;
		background: #FFFFFF;
		border-color: #000000;
	}
	.addedDate{
		position: absolute;
		height: 40px;
		width: 200px;
		border: black;
		left: 43%;
		top: 470px;
		font-size: 20px;
		background: #FFFFFF;
	}
			
			.num{
				background: white;
				color: #606060;
				position: absolute;
				height: 40px;
				width: 200px;
				border: black;
				left: 45%;
				margin-left: 300px;
				top: 357px;
				font-size:20px;
				border: 2px solid #000000;
				border-bottom-left-radius: 8px;
				border-bottom-right-radius: 8px;
			}
			
			.add{
				position: absolute;
				background: #EEEEEE;
				height: 285px;
				width: 285px;
				left: 50%;
				margin-left: 200px;
				top: 470px;
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
				left: 45%;
				margin-left: 300px;
				top: 320px;
				font-size:20px;
				border: 2px solid #000000;
				border-top-left-radius: 8px;
				border-top-right-radius: 8px;
			}
			
			.tb {
				position: absolute;
				top: 380px;
				width: 100%;
			}
			.tb tr td{
				width: 100px;
				height: 100px;
				text-align: center;
				position: relative;
			}
			.tb tr td .detail1{
				position: absolute;
				top: 4px;
				margin-left: -300px;
				background: #FFFFFF;
				height: 100px;
				width: 100px;
				border: black;
				font-size:20px;
				border: 2px solid #606060;
			}
			.tb tr td .product_name1{
				position: absolute;
				top: 4px;
				margin-left: -200px;
				background: #FFFFFF;
				height: 100px;
				width: 450px;
				border: black;
				font-size:20px;
				border: 2px solid #606060;
			}
		.s11{
		
		width: 500px;
    height: 50px;
	top: 150px;
	left: 50%;
	margin-left: -250px;
    border-radius: 18px;
    outline: none;
    padding-left: 20px;
	position: absolute;
	font-size: 50px;
		
		}

		</style>
</head>
<body>


		<header id="head">
	
	<a href="logedinproduct.jsp">
	<button class="button0">Product</button>
	</a>
	<a href="loginabout us.jsp">
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
	<button class="button7">Central</button>
	</a>
			
	<% String username = (String)session.getAttribute("username"); %>
	<button class="button010">Hello! <%= username %></button>	
		</header>


<form action="order.jsp">
    <button class="backgnd1"></button>
    <button class="backgnd2"></button>
    <h1 class="s11"> <%= username %>'s Order History</h1>
    
</form>


<%
    car_m car = new car_m();
    Object id = request.getParameter("commodityID");
    List<commodity> list = new ArrayList<commodity>();
    if(id!=null){
        if(id==""){
            list = car.find(username);
        }else{
            list = car.findU(username,Integer.parseInt((String) id));
        }
    }else{
        list = car.find(username);
    }
%>

    <table class="tb" border="0">
        <%
            for(commodity c: list){
        %>
        <tr>
            <td>
                <button name="detail" class="detail1"  value="<&= commityID1 %>" formtarget="_blank"></button>
                <a href="delete?commodityID=<%=c.getCommodityID()%>"><button class="product_name1"><%= c.getCname() %> </button></a>
            </td>
        </tr>
        <%
            }
        %>
    </table>



</body>
</html>