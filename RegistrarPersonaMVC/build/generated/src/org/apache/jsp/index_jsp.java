package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registrar</title>\n");
      out.write("        \n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"mt-4 p-5 bg-primary text-white rounded\">\n");
      out.write("            <h1 style=\"text-align: center\">Registro de Personas</h1>\n");
      out.write("            <pre></pre>\n");
      out.write("            <form action=\"recibir.do\" method=\"post\" style=\"text-align: center\"> \n");
      out.write("\n");
      out.write("\n");
      out.write("                <table cellspacing=\"3\" cellpadding=\"3\" border=\"2\" align=\"center\">\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td align=\"alight\" border=\"2\">Dui : </td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtDui\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td align=\"alight\">Apellidos : </td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtApellidos\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td align=\"alight\">Nombres : </td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtNombres\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("                 <br>\n");
      out.write("                \n");
      out.write("                <input type=\"submit\" class=\"btn btn-success\" value=\"REGISTRAR\">          \n");
      out.write("                <a href=\"mostrar.do\" class=\"btn btn-success\">MOSTRAR</a>\n");
      out.write("                <a href=\"/RegistrarPersonaMVC/btnEliminar.jsp\" class=\"btn btn-success\">ELIMINAR</a>\n");
      out.write("                <a href=\"/RegistrarPersonaMVC/btnModificar.jsp\" class=\"btn btn-success\">MODIFICAR</a>\n");
      out.write("                \n");
      out.write("            </form> \n");
      out.write("        </div>\n");
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
