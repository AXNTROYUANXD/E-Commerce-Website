/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.9
 * Generated at: 2020-07-04 07:14:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logedinproductdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t\t<title></title>\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("\t\t\t*{\r\n");
      out.write("\t\t\t\tpadding: 0;\r\n");
      out.write("\t\t\t\tmargin: 0;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#head{\r\n");
      out.write("\t\t\t\theight: 50px;\r\n");
      out.write("\t\t\t\tbackground-color: black;\r\n");
      out.write("\t\t\t\tmargin: 0 auto;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.button0{\r\n");
      out.write("\t\t\t\tbackground: black;\r\n");
      out.write("\t\t\t\tcolor: white;\r\n");
      out.write("\t\t\t\tposition: absolute;\r\n");
      out.write("\t\t\t\theight: 40px;\r\n");
      out.write("\t\t\t\twidth: 100px;\r\n");
      out.write("\t\t\t\tborder: black;\r\n");
      out.write("\t\t\t\tleft: 50%;\r\n");
      out.write("\t\t\t\tmargin-left: -200px;\r\n");
      out.write("\t\t\t\ttop: 5px;\r\n");
      out.write("\t\t\t\tfont-size:20px\r\n");
      out.write("            }\r\n");
      out.write("\t\t\t.button1{\r\n");
      out.write("\t\t\t\tbackground: black;\r\n");
      out.write("\t\t\t\tcolor: white;\r\n");
      out.write("\t\t\t\tposition: absolute;\r\n");
      out.write("\t\t\t\theight: 40px;\r\n");
      out.write("\t\t\t\twidth: 100px;\r\n");
      out.write("\t\t\t\tborder: black;\r\n");
      out.write("\t\t\t\tleft: 50%;\r\n");
      out.write("\t\t\t\tmargin-left: 100px;\r\n");
      out.write("\t\t\t\ttop: 5px;\r\n");
      out.write("\t\t\t\tfont-size:20px\r\n");
      out.write("            }\r\n");
      out.write("\t\t\t.button3{\r\n");
      out.write("\t\t\t\tbackground: black;\r\n");
      out.write("\t\t\t\tcolor: white;\r\n");
      out.write("\t\t\t\tposition: absolute;\r\n");
      out.write("\t\t\t\theight: 40px;\r\n");
      out.write("\t\t\t\twidth: 100px;\r\n");
      out.write("\t\t\t\tborder: black;\r\n");
      out.write("\t\t\t\tleft: 1720px;\r\n");
      out.write("\t\t\t\ttop: 5px;\r\n");
      out.write("\t\t\t\tfont-size:20px\r\n");
      out.write("            }\r\n");
      out.write("\t\t\t.button5{\r\n");
      out.write("\t\t\t\tbackground: black;\r\n");
      out.write("\t\t\t\tcolor: white;\r\n");
      out.write("\t\t\t\tposition: absolute;\r\n");
      out.write("\t\t\t\theight: 40px;\r\n");
      out.write("\t\t\t\twidth: 200px;\r\n");
      out.write("\t\t\t\tborder: black;\r\n");
      out.write("\t\t\t\tleft: 1530px;\r\n");
      out.write("\t\t\t\ttop: 5px;\r\n");
      out.write("\t\t\t\tfont-size:20px\r\n");
      out.write("            }\r\n");
      out.write("\t\t\t.button010{\r\n");
      out.write("\t\t\t\tbackground: black;\r\n");
      out.write("\t\t\t\tcolor: white;\r\n");
      out.write("\t\t\t\tposition: absolute;\r\n");
      out.write("\t\t\t\theight: 40px;\r\n");
      out.write("\t\t\t\twidth: 200px;\r\n");
      out.write("\t\t\t\tborder: black;\r\n");
      out.write("\t\t\t\tleft: 1330px;\r\n");
      out.write("\t\t\t\ttop: 5px;\r\n");
      out.write("\t\t\t\tfont-size:20px\r\n");
      out.write("            }\r\n");
      out.write("\t\t\t.logo{\r\n");
      out.write("\t\t\t\tposition: absolute;\r\n");
      out.write("\t\t\t\theight: 40px;\r\n");
      out.write("\t\t\t\twidth: 40px;\r\n");
      out.write("\t\t\t\tborder: black;\r\n");
      out.write("\t\t\t\tleft: 50%;\r\n");
      out.write("\t\t\t\tmargin-left: -20px;\r\n");
      out.write("\t\t\t\ttop: 5px;\r\n");
      out.write("\t\t\t\tbackground: #FFFFFF;\r\n");
      out.write("\t\t\t\tbackground-image:url(\"logo.png\");\r\n");
      out.write("        \t\tbackground-size:40px 40px;\r\n");
      out.write("\t\t\t\tborder-radius: 20px;\r\n");
      out.write("            }\r\n");
      out.write("\t.cname{\r\n");
      out.write("\t\tposition: absolute;\r\n");
      out.write("\t\theight: 80px;\r\n");
      out.write("\t\twidth: 300px;\r\n");
      out.write("\t\tborder: black;\r\n");
      out.write("\t\tleft: 50%;\r\n");
      out.write("\t\tmargin-left: -50px;\r\n");
      out.write("\t\ttop: 150px;\r\n");
      out.write("\t\tbackground: #FFFFFF;\r\n");
      out.write("\t\tfont-size: 36px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.picName{\r\n");
      out.write("\t\tposition: absolute;\r\n");
      out.write("\t\theight: 200px;\r\n");
      out.write("\t\twidth: 200px;\r\n");
      out.write("\t\tborder: black;\r\n");
      out.write("\t\tleft: 25%;\r\n");
      out.write("\t\ttop: 350px;\r\n");
      out.write("\t\tbackground: #FFFFFF;\r\n");
      out.write("\t\tbackground-image: url(\"logo.png\");\r\n");
      out.write("\t\tbackground-size:200px 200px;\r\n");
      out.write("\t\tborder-radius: 20px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.price{\r\n");
      out.write("\t\tposition: absolute;\r\n");
      out.write("\t\theight: 60px;\r\n");
      out.write("\t\twidth: 200px;\r\n");
      out.write("\t\tborder: black;\r\n");
      out.write("\t\tleft: 50%;\r\n");
      out.write("\t\ttop: 350px;\r\n");
      out.write("\t\tfont-size: 20px;\r\n");
      out.write("\t\tbackground: #FFFFFF;\r\n");
      out.write("\t\tborder-color: #000000;\r\n");
      out.write("\t}\r\n");
      out.write("\t.addedDate{\r\n");
      out.write("\t\tposition: absolute;\r\n");
      out.write("\t\theight: 40px;\r\n");
      out.write("\t\twidth: 200px;\r\n");
      out.write("\t\tborder: black;\r\n");
      out.write("\t\tleft: 50%;\r\n");
      out.write("\t\ttop: 400px;\r\n");
      out.write("\t\tfont-size: 12px;\r\n");
      out.write("\t\tbackground: #FFFFFF;\r\n");
      out.write("\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t.num{\r\n");
      out.write("\t\t\t\tbackground: white;\r\n");
      out.write("\t\t\t\tcolor: #606060;\r\n");
      out.write("\t\t\t\tposition: absolute;\r\n");
      out.write("\t\t\t\theight: 40px;\r\n");
      out.write("\t\t\t\twidth: 200px;\r\n");
      out.write("\t\t\t\tborder: black;\r\n");
      out.write("\t\t\t\tleft: 50%;\r\n");
      out.write("\t\t\t\tmargin-left: 300px;\r\n");
      out.write("\t\t\t\ttop: 387px;\r\n");
      out.write("\t\t\t\tfont-size:20px;\r\n");
      out.write("\t\t\t\tborder: 2px solid #000000;\r\n");
      out.write("\t\t\t\tborder-bottom-left-radius: 8px;\r\n");
      out.write("\t\t\t\tborder-bottom-right-radius: 8px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t.buy{\r\n");
      out.write("\t\t\t\tbackground: #EEEEEE;\r\n");
      out.write("\t\t\t\tcolor:#606060;\r\n");
      out.write("\t\t\t\tposition: absolute;\r\n");
      out.write("\t\t\t\theight: 100px;\r\n");
      out.write("\t\t\t\twidth: 1200px;\r\n");
      out.write("\t\t\t\tborder: black;\r\n");
      out.write("\t\t\t\tleft: 50%;\r\n");
      out.write("\t\t\t\tmargin-left: -600px;\r\n");
      out.write("\t\t\t\ttop: 850px;\r\n");
      out.write("\t\t\t\tfont-size:64px;\r\n");
      out.write("\t\t\t\tborder-radius: 36px;\r\n");
      out.write("            }\r\n");
      out.write("\t\t\t.add{\r\n");
      out.write("\t\t\t\tposition: absolute;\r\n");
      out.write("\t\t\t\tbackground: #EEEEEE;\r\n");
      out.write("\t\t\t\theight: 285px;\r\n");
      out.write("\t\t\t\twidth: 285px;\r\n");
      out.write("\t\t\t\tleft: 50%;\r\n");
      out.write("\t\t\t\tmargin-left: 650px;\r\n");
      out.write("\t\t\t\ttop: 350px;\r\n");
      out.write("\t\t\t\tborder-radius: 36px;\r\n");
      out.write("\t\t\t\tbackground-image: url(\"shoppingcart.png\");\r\n");
      out.write("        \t\tbackground-size:280px 280px;\r\n");
      out.write("\t\t\t\tborder-radius: 10px;\r\n");
      out.write("\t\t\t\tborder: 2px solid #FFFFFF;\r\n");
      out.write("            }\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t.numchoice{\r\n");
      out.write("\t\t\t\tbackground: white;\r\n");
      out.write("\t\t\t\tcolor: #606060;\r\n");
      out.write("\t\t\t\tposition: absolute;\r\n");
      out.write("\t\t\t\theight: 40px;\r\n");
      out.write("\t\t\t\twidth: 200px;\r\n");
      out.write("\t\t\t\tborder: black;\r\n");
      out.write("\t\t\t\tleft: 50%;\r\n");
      out.write("\t\t\t\tmargin-left: 300px;\r\n");
      out.write("\t\t\t\ttop: 350px;\r\n");
      out.write("\t\t\t\tfont-size:20px;\r\n");
      out.write("\t\t\t\tborder: 2px solid #000000;\r\n");
      out.write("\t\t\t\tborder-top-left-radius: 8px;\r\n");
      out.write("\t\t\t\tborder-top-right-radius: 8px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t\t<header id=\"head\">\r\n");
      out.write("\t\r\n");
      out.write("\t<a href=\"logedinproduct.jsp\">\r\n");
      out.write("\t<button class=\"button0\">Product</button>\r\n");
      out.write("\t</a>\r\n");
      out.write("\t<a href=\"aboutus.jsp\">\r\n");
      out.write("\t<button class=\"button1\">About us</button>\r\n");
      out.write("\t</a>\r\n");
      out.write("\t<a href=\"logedinhomepage.jsp\">\r\n");
      out.write("\t<button class=\"button3\">Log out</button>\r\n");
      out.write("\t</a>\r\n");
      out.write("\t<a href=\"shopping cart.jsp\">\r\n");
      out.write("\t<button class=\"button5\">Shopping cart</button>\r\n");
      out.write("\t</a>\r\n");
      out.write("\t<a href=\"logedinhomepage.jsp\">\r\n");
      out.write("\t<button class=\"logo\"></button>\r\n");
      out.write("\t</a>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t");
 String username = (String)session.getAttribute("username"); 
      out.write("\r\n");
      out.write("\t<button class=\"button010\">Hello! ");
      out.print( username );
      out.write("</button>\t\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\r\n");
      out.write("\t<form>\r\n");
      out.write("\t");
 String commodityID0 = (String)session.getAttribute("searchResult0commodityID"); 
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");
 String cname = (String)session.getAttribute("detailscname"); 
      out.write("\r\n");
      out.write("\t<a href=\"loginproductdetail.html\">\r\n");
      out.write("\t<button class=\"cname\">");
      out.print( cname );
      out.write("</button></a>\r\n");
      out.write("\t\t\r\n");
      out.write("\t");
 String price = (String)session.getAttribute("detailsprice"); 
      out.write("\r\n");
      out.write("\t<button class=\"price\">");
      out.print( price );
      out.write("</button>\r\n");
      out.write("\t\t\r\n");
      out.write("\t");
 String addedDate = (String)session.getAttribute("detailsaddedDate"); 
      out.write("\t\r\n");
      out.write("\t<button class=\"addedDate\">");
      out.print( addedDate );
      out.write("</button>\r\n");
      out.write("\t\t\r\n");
      out.write("\t");
 String picName = (String)session.getAttribute("detailspicName"); 
      out.write("\t\r\n");
      out.write("\t<button class=\"picName\">");
      out.print( picName );
      out.write("</button>\r\n");
      out.write("\t</form>\t\r\n");
      out.write("\t\r\n");
      out.write("\t<form method=\"post\" action=\"./logedinproductdetails\">\r\n");
      out.write("\t<select name=\"number\" class=\"num\" value=\"1\">\r\n");
      out.write("\t<option><button name=\"num\" type=\"submit\" value=\"1\">1</button></option>\t\r\n");
      out.write("\t<option><button name=\"num\" type=\"submit\" value=\"2\">2</button></option>\r\n");
      out.write("\t<option><button name=\"num\" type=\"submit\" value=\"3\">3</button></option>\t\r\n");
      out.write("\t<option><button name=\"num\" type=\"submit\" value=\"4\">4</button></option>\t\r\n");
      out.write("\t<option><button name=\"num\" type=\"submit\" value=\"5\">5</button></option>\r\n");
      out.write("\t<option><button name=\"num\" type=\"submit\" value=\"6\">6</button></option>\t\r\n");
      out.write("\t<option><button name=\"num\" type=\"submit\" value=\"7\">7</button></option>\t\r\n");
      out.write("\t<option><button name=\"num\" type=\"submit\" value=\"8\">8</button></option>\r\n");
      out.write("\t<option><button name=\"num\" type=\"submit\" value=\"9\">9</button></option>\t\r\n");
      out.write("\t</select>\r\n");
      out.write("\t\r\n");
      out.write("\t<button class=\"add\" name=\"opt\" type=\"submit\" value=\"add\"></button>\r\n");
      out.write("  \t<input class=\"buy\" name=\"opt\" type=\"submit\" value=\"BUY\" />\r\n");
      out.write("\t</form>\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t<button class=\"numchoice\">Order</button>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}