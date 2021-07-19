package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Principal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <nav class=\"navbar navbar-expand-lg navbar-light bg-info\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                    <ul class=\"navbar-nav\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link active\" href=\"#\">Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a style=\"margin-left:10px;border: none \" class=\"btn btn-outline-light\" href=\"Controlador?menu=Producto\" target=\"myFrame\">Producto</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"btn btn-outline-light\" style=\"margin-left:10px;border: none \" href=\"Controlador?menu=Empleado&accion=Listar\" target=\"myFrame\">Empleado</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a style=\"margin-left:10px;border: none \" class=\"btn btn-outline-light\" target=\"myFrame\" href=\"Controlador?menu=Clientes\">Cientes</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a style=\"margin-left:10px;border: none \" class=\"btn btn-outline-light\" target=\"myFrame\" href=\"Controlador?menu=RegistrarVenta&accion=default\">Nuevo Ventas</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("            </div>\n");
      out.write("<div class=\"dropdown\">\n");
      out.write("    <button style=\"border: no\" class=\"btn btn-outline-light dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write(" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getNom()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("  </button>\n");
      out.write("  <ul class=\"dropdown-menu text-center \" aria-labelledby=\"dropdownMenuButton2\">\n");
      out.write("      <li><a class=\"dropdown-item \" href=\"#\">\n");
      out.write("              <img src=\"img/user.jpg\" alt=\"60\" width=\"60\"/>\n");
      out.write("          </a></li>\n");
      out.write("    <li><a class=\"dropdown-item\" href=\"#\">Usuario</a></li>\n");
      out.write("    <li><a class=\"dropdown-item\" href=\"#\">Usuario@gmail.com</a></li>\n");
      out.write("    <div class=\"dropdown-item\" href=\"#\">\n");
      out.write("       <form action=\"Validar\" method=\"POST\">\n");
      out.write("           <button name=\"accion\" value=\"Salir\" class=\"dropdown-item\" href=\"#\">\n");
      out.write("               Salir\n");
      out.write("           </button>\n");
      out.write("               \n");
      out.write("       </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </ul>\n");
      out.write("   </div>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("  \n");
      out.write("       <div class=\"n-4\" style=\"height: 550px; \">\n");
      out.write("      <iframe name=\"myFrame\" style=\"height: 100%;width: 100%;border: none\"></iframe>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("    \n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\" crossorigin=\"anonymous\"></script>\n");
      out.write(" \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
