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
        out.println("body { font-family: Arial, sans-serif; background-color: #f2f2f2; padding: 30px; }");
        out.println("h1 { color: #333; }");
        out.println("form { margin-top: 20px; }");
        out.println("input[type=text] { padding: 8px; width: 250px; border: 1px solid #ccc; border-radius: 4px; }");
        out.println("input[type=submit] { padding: 8px 16px; background-color: #4CAF50; color: white; border: none; border-radius: 4px; cursor: pointer; }");
        out.println("input[type=submit]:hover { background-color: #45a049; }");
        out.println("p { font-size: 16px; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Welcome to " + appTitle + "</h1>");
        out.println("<p><strong>Username:</strong> " + username + "</p>");
        out.println("<p><strong>Email:</strong> " + email + "</p>");
        out.println("<form action=\"index\" method=\"post\">");
        out.println("  Nhập tên của bạn: <input type=\"text\" name=\"guestName\" />");
        out.println("  <input type=\"submit\" value=\"Gửi\" />");
        out.println("</form>");
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
        out.println("body { font-family: Arial, sans-serif; background-color: #e6f7ff; padding: 30px; }");
        out.println("h1 { color: #006699; }");
        out.println("p { font-size: 16px; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Chào bạn, " + guestName + "!</h1>");
        out.println("<p><strong>Trang:</strong> " + appTitle + "</p>");
        out.println("<p><strong>Author:</strong> " + username + " (" + email + ")</p>");
        out.println("</body></html>");
    }
}
