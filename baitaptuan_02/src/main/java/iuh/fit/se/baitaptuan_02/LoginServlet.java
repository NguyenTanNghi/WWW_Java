package iuh.fit.se.baitaptuan_02;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "loginServlet", value = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();

        // Lấy username để hiển thị chào mừng
        String username = req.getParameter("username");

        out.println("<!DOCTYPE html>");
        out.println("<html lang='vi'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Đăng nhập thành công</title>");
        out.println("<style>");
        out.println("  body {");
        out.println("    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;");
        out.println("    background: linear-gradient(135deg, #74ebd5, #ACB6E5);");
        out.println("    display: flex;");
        out.println("    justify-content: center;");
        out.println("    align-items: center;");
        out.println("    height: 100vh;");
        out.println("    margin: 0;");
        out.println("    animation: fadeIn 1s ease-in;");
        out.println("  }");
        out.println("  @keyframes fadeIn {");
        out.println("    from {opacity: 0; transform: translateY(-20px);} ");
        out.println("    to {opacity: 1; transform: translateY(0);}");
        out.println("  }");
        out.println("  .container {");
        out.println("    background: white;");
        out.println("    padding: 40px 60px;");
        out.println("    border-radius: 12px;");
        out.println("    box-shadow: 0 8px 20px rgba(0,0,0,0.2);");
        out.println("    text-align: center;");
        out.println("  }");
        out.println("  h1 {");
        out.println("    color: #4CAF50;");
        out.println("    margin-bottom: 20px;");
        out.println("  }");
        out.println("  p {");
        out.println("    font-size: 18px;");
        out.println("    color: #333;");
        out.println("  }");
        out.println("  a.button {");
        out.println("    display: inline-block;");
        out.println("    margin-top: 30px;");
        out.println("    padding: 12px 24px;");
        out.println("    background-color: #4CAF50;");
        out.println("    color: white;");
        out.println("    text-decoration: none;");
        out.println("    font-weight: bold;");
        out.println("    border-radius: 8px;");
        out.println("    transition: background-color 0.3s ease, transform 0.2s;");
        out.println("  }");
        out.println("  a.button:hover {");
        out.println("    background-color: #45a049;");
        out.println("    transform: scale(1.05);");
        out.println("  }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("  <div class='container'>");
        out.println("    <h1>Đăng nhập thành công!</h1>");
        out.println("    <p>Chào mừng <strong>" + (username != null ? username : "bạn") + "</strong> đến với hệ thống.</p>");
        out.println("    <a href='index.jsp' class='button'>Đăng xuất / Đăng nhập lại</a>");
        out.println("  </div>");
        out.println("</body>");
        out.println("</html>");

        out.close();
    }
}
