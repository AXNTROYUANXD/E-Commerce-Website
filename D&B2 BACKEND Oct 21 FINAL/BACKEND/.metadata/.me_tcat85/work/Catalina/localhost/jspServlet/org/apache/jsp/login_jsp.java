/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.9
 * Generated at: 2020-07-04 08:17:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\t\t\t\tleft: 1820px;\r\n");
      out.write("\t\t\t\ttop: 5px;\r\n");
      out.write("\t\t\t\tfont-size:20px\r\n");
      out.write("            }\r\n");
      out.write("\t\t\t.button4{\r\n");
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
      out.write("\t\t\t\tleft: 1500px;\r\n");
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
      out.write("\t\t\t\tbackground-image: url(\"logo.png\");\r\n");
      out.write("        \t\tbackground-size:40px 40px;\r\n");
      out.write("\t\t\t\tborder-radius: 20px;\r\n");
      out.write("            }\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t.button51{\r\n");
      out.write("\t\t\tbackground:#EEEEEE;\r\n");
      out.write("\t\t\tcolor:#606060;\r\n");
      out.write("\t\t\tposition: absolute;\r\n");
      out.write("\t\t\theight: 40px;\r\n");
      out.write("\t\t\twidth: 200px;\r\n");
      out.write("\t\t\tborder: black;\r\n");
      out.write("\t\t\tleft: 30%;\r\n");
      out.write("\t\t\tmargin-left: -50px;\r\n");
      out.write("\t\t\ttop: 360px;\r\n");
      out.write("\t\t\tfont-size:30px;\r\n");
      out.write("\t\t\tborder-radius: 10px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.button52{\r\n");
      out.write("\t\t\tbackground: #EEEEEE;\r\n");
      out.write("\t\t\tcolor: #606060;\r\n");
      out.write("\t\t\tposition: absolute;\r\n");
      out.write("\t\t\theight: 40px;\r\n");
      out.write("\t\t\twidth: 200px;\r\n");
      out.write("\t\t\tborder: black;\r\n");
      out.write("\t\t\tleft: 30%;\r\n");
      out.write("\t\t\tmargin-left: -50px;\r\n");
      out.write("\t\t\ttop: 420px;\r\n");
      out.write("\t\t\tfont-size:30px;\r\n");
      out.write("\t\t\tborder-radius: 10px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t.username {\r\n");
      out.write("    width: 500px;\r\n");
      out.write("    height: 40px;\r\n");
      out.write("\ttop: 360px;\r\n");
      out.write("\tleft: 50%;\r\n");
      out.write("\tmargin-left: -250px;\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    outline: none;\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    padding-left: 20px;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("    .password {\r\n");
      out.write("    width: 500px;\r\n");
      out.write("    height: 40px;\r\n");
      out.write("\ttop: 420px;\r\n");
      out.write("\tleft: 50%;\r\n");
      out.write("\tmargin-left: -250px;\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    outline: none;\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    padding-left: 20px;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("}\r\n");
      out.write("\t.btn51 {\r\n");
      out.write("    height: 80px;\r\n");
      out.write("    width: 300px;\r\n");
      out.write("    top: 550px;\r\n");
      out.write("\tleft: 50%;\r\n");
      out.write("\tmargin-left: -150px;\r\n");
      out.write("\tborder-radius: 18px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    outline: none;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("\tposition: absolute;\t\r\n");
      out.write("\tbackground-color: #EEEEEE;\r\n");
      out.write("\tfont-size: 45px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.btn52 {\r\n");
      out.write("    height: 80px;\r\n");
      out.write("    width: 300px;\r\n");
      out.write("    top: 650px;\r\n");
      out.write("\tleft: 50%;\r\n");
      out.write("\tmargin-left: -150px;\r\n");
      out.write("\tborder-radius: 18px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    outline: none;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("\tposition: absolute;\t\r\n");
      out.write("\tbackground-color: #EEEEEE;\r\n");
      out.write("\tfont-size: 25px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t\t<header id=\"head\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<a href=\"product.jsp\">\r\n");
      out.write("\t\t<button class=\"button0\">Product</button>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t\t<a href=\"aboutus.jsp\">\r\n");
      out.write("\t\t<button class=\"button1\">About us</button>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t\t<a href=\"product.jsp\">\r\n");
      out.write("\t\t<button class=\"button5\">Shopping cart</button>\t\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t\t<a href=\"signup.jsp\">\r\n");
      out.write("\t\t<button class=\"button4\">Sign up</button>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t\t<a href=\"homepage.jsp\">\r\n");
      out.write("\t\t<button class=\"logo\"></button>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\r\n");
      out.write("\t<form method=\"post\" action=\"./login\">\r\n");
      out.write("\t<button class=\"button51\">User name</button>\t\r\n");
      out.write("\t<button class=\"button52\">Password</button>\t\r\n");
      out.write("\t<input type=\"text\" class=\"username\" name=\"username\" value=\"\" placeholder=\"Username\">\r\n");
      out.write("\t<input type=\"text\" class=\"password\" name=\"password\" value=\"\" placeholder=\"Password\">\r\n");
      out.write("\t<input type=\"SUBMIT\" name=\"login\" class=\"btn51\" value=\"Login in\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
