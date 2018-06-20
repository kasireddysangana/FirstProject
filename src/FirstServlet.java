import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletResponse;
import javax.servlet.ServletRequest;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

@WebServlet("/fs")
public class FirstServlet extends GenericServlet
{
	public void service(ServletRequest request, ServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html> <body>");
		out.print("<center> <h1>");
		out.print("<input type=text value="+new java.util.Date()+"/>");
		out.println("</h1> </center>");
		out.println("</body> </html>");
	}
}
