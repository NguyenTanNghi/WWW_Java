package iuh.fit.se.baitaptuan_01;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

// author : Nguyen Tan Nghi
@WebServlet(name = "IndexServlet", value = "/index", initParams = {
        @WebInitParam(name = "username", value = "Tan Nghi"),
        @WebInitParam(name = "email", value = "tannghi@gmail.com"),
})
public class IndexServlet extends HttpServlet {

    private String username;
    private String email;
    private String appTitle;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        username = config.getInitParameter("username");
        email = config.getInitParameter("email");

        ServletContext context = config.getServletContext();
        appTitle = context.getInitParameter("appTitle");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>" + appTitle + "</title>");
        out.println("<style>");
        out.println("body { font-family: 'Segoe UI', Arial, sans-serif; background: linear-gradient(135deg, #89f7fe, #66a6ff); display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; }");
        out.println(".container { background: white; padding: 40px; border-radius: 15px; box-shadow: 0 8px 20px rgba(0,0,0,0.2); text-align: center; animation: fadeIn 1s ease-in-out; }");
        out.println("h1 { color: #333; margin-bottom: 20px; }");
        out.println("p { font-size: 16px; margin: 10px 0; color: #555; }");
        out.println("form { margin-top: 20px; }");
        out.println("input[type=text] { padding: 10px; width: 250px; border: 1px solid #ccc; border-radius: 8px; transition: all 0.3s ease; }");
        out.println("input[type=text]:focus { border-color: #66a6ff; box-shadow: 0 0 8px rgba(102,166,255,0.6); outline: none; }");
        out.println("input[type=submit] { margin-top: 15px; padding: 10px 20px; background: linear-gradient(135deg, #667eea, #764ba2); color: white; border: none; border-radius: 8px; cursor: pointer; transition: 0.3s; font-weight: bold; }");
        out.println("input[type=submit]:hover { transform: scale(1.05); background: linear-gradient(135deg, #764ba2, #667eea); }");
        out.println("@keyframes fadeIn { from {opacity:0; transform: translateY(-20px);} to {opacity:1; transform: translateY(0);} }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h1>Welcome to " + appTitle + "</h1>");
        out.println("<p><strong>Username:</strong> " + username + "</p>");
        out.println("<p><strong>Email:</strong> " + email + "</p>");
        out.println("<form action=\"index\" method=\"post\">");
        out.println("  <input type=\"text\" name=\"guestName\" placeholder=\"Nhập tên của bạn\" /> <br/>");
        out.println("  <input type=\"submit\" value=\"Gửi\" />");
        out.println("</form>");
        out.println("</div>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");

        String guestName = request.getParameter("guestName");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Chào mừng</title>");
        out.println("<style>");
        out.println("body { font-family: 'Segoe UI', Arial, sans-serif; background: linear-gradient(135deg, #ff9a9e, #fad0c4); display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; }");
        out.println(".container { background: white; padding: 40px; border-radius: 15px; box-shadow: 0 8px 20px rgba(0,0,0,0.2); text-align: center; animation: fadeIn 1s ease-in-out; }");
        out.println("h1 { color: #d6336c; margin-bottom: 20px; }");
        out.println("p { font-size: 16px; margin: 10px 0; color: #333; }");
        out.println("@keyframes fadeIn { from {opacity:0; transform: scale(0.9);} to {opacity:1; transform: scale(1);} }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h1>Chào bạn, " + guestName + "!</h1>");
        out.println("<p><strong>Trang:</strong> " + appTitle + "</p>");
        out.println("<p><strong>Author:</strong> " + username + " (" + email + ")</p>");
        out.println("</div>");
        out.println("</body></html>");
    }
}
