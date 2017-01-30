import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.*;





@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    private int counter=0;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        counter+=1;
        String name = request.getParameter("name");
        out.println("<h1>Count: " + counter +"</h1>");
        if (name==null){
            out.println("<h1>Hello, World!</h1>");
        }else{
            out.println("<h1>Hello, " + name +"</h1>");
        }
    }
}
