package iuh.fit.se.baitaptuan_02;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpFilter;

import java.io.IOException;
import java.io.PrintWriter;

public class AuthFilter extends HttpFilter implements Filter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        String userName=req.getParameter("username");
        String password=req.getParameter("password");

        String userNameConfig=this.getInitParameter("username");
        String passwordConfig=this.getInitParameter("password");

        if(userName.equals(userNameConfig)&&password.equals(passwordConfig)){
            chain.doFilter(req, res);
        }
        else {
            res.setContentType("text/html; charset=UTF-8");
            PrintWriter printWriter = res.getWriter();
            printWriter.println("<!DOCTYPE html>");
            printWriter.println("<html lang='vi'>");
            printWriter.println("<head>");
            printWriter.println("<meta charset='UTF-8'>");
            printWriter.println("<title>Thông báo lỗi</title>");
            printWriter.println("<style>");
            printWriter.println("  body {");
            printWriter.println("    display: flex;");
            printWriter.println("    justify-content: center;");
            printWriter.println("    align-items: center;");
            printWriter.println("    height: 100vh;");
            printWriter.println("    margin: 0;");
            printWriter.println("    background: linear-gradient(135deg, #ff7e5f, #feb47b);");
            printWriter.println("    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;");
            printWriter.println("  }");
            printWriter.println("  .error-box {");
            printWriter.println("    background: white;");
            printWriter.println("    padding: 30px 50px;");
            printWriter.println("    border-radius: 12px;");
            printWriter.println("    box-shadow: 0 8px 20px rgba(0, 0, 0, 0.2);");
            printWriter.println("    text-align: center;");
            printWriter.println("    animation: shake 0.5s ease-in-out;");
            printWriter.println("  }");
            printWriter.println("  h1 {");
            printWriter.println("    color: #d32f2f;");
            printWriter.println("    margin-bottom: 20px;");
            printWriter.println("  }");
            printWriter.println("  p {");
            printWriter.println("    font-size: 18px;");
            printWriter.println("    color: #555;");
            printWriter.println("  }");
            printWriter.println("  a {");
            printWriter.println("    display: inline-block;");
            printWriter.println("    margin-top: 20px;");
            printWriter.println("    padding: 10px 20px;");
            printWriter.println("    background-color: #d32f2f;");
            printWriter.println("    color: white;");
            printWriter.println("    text-decoration: none;");
            printWriter.println("    border-radius: 8px;");
            printWriter.println("    transition: background-color 0.3s ease;");
            printWriter.println("  }");
            printWriter.println("  a:hover {");
            printWriter.println("    background-color: #b71c1c;");
            printWriter.println("  }");
            printWriter.println("  @keyframes shake {");
            printWriter.println("    0%, 100% { transform: translateX(0); }");
            printWriter.println("    20%, 60% { transform: translateX(-10px); }");
            printWriter.println("    40%, 80% { transform: translateX(10px); }");
            printWriter.println("  }");
            printWriter.println("</style>");
            printWriter.println("</head>");
            printWriter.println("<body>");
            printWriter.println("  <div class='error-box'>");
            printWriter.println("    <h1>Thông báo lỗi</h1>");
            printWriter.println("    <p>Tài khoản không hợp lệ. Vui lòng thử lại.</p>");
            printWriter.println("    <a href='index.jsp'>Quay lại trang đăng nhập</a>");
            printWriter.println("  </div>");
            printWriter.println("</body>");
            printWriter.println("</html>");
            printWriter.close();
        }

    }
}
