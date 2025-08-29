package iuh.fit.se.baitaptuan_01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegistrationForm", value = "/registration")
public class RegisterForm extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest("GET", request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest("POST", request, response);
    }

    private void processRequest(String method, HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String gender = request.getParameter("gender");
        String[] hobbies = request.getParameterValues("hobbies");
        String facebook = request.getParameter("facebook");
        String shortBio = request.getParameter("shortBio");

        out.println("<!DOCTYPE html>");
        out.println("<html lang='vi'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Kết quả đăng ký</title>");
        out.println("<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css'>");
        out.println("<style>");
        // Gradient nền động
        out.println("body { font-family: 'Segoe UI', sans-serif; margin:0; padding:0; display:flex; justify-content:center; align-items:center; height:100vh;");
        out.println("background: linear-gradient(-45deg, #ff758c, #ff7eb3, #6dd5ed, #2193b0); background-size:400% 400%; animation: gradientBG 12s ease infinite; }");
        out.println("@keyframes gradientBG { 0%{background-position:0% 50%;} 50%{background-position:100% 50%;} 100%{background-position:0% 50%;} }");

        // Card container
        out.println(".card { background: rgba(255,255,255,0.95); border-radius: 20px; padding: 40px; width: 480px; box-shadow: 0 15px 35px rgba(0,0,0,0.3); animation: fadeInUp 1s ease forwards; }");
        out.println("@keyframes fadeInUp { from {opacity:0; transform:translateY(50px);} to {opacity:1; transform:translateY(0);} }");

        out.println("h2 { text-align:center; color:#222; margin-bottom:30px; animation: fadeIn 0.8s ease forwards; }");
        out.println("@keyframes fadeIn { from{opacity:0;} to{opacity:1;} }");

        out.println(".info-item { margin-bottom: 18px; font-size:16px; animation: slideIn 0.8s ease forwards; }");
        out.println("@keyframes slideIn { from {opacity:0; transform:translateX(-20px);} to {opacity:1; transform:translateX(0);} }");

        out.println("strong { color:#2193b0; }");

        // Button
        out.println(".back-btn { display:block; text-align:center; margin-top:25px; padding:12px; border:none; border-radius:10px;");
        out.println("background: linear-gradient(45deg,#2193b0,#6dd5ed); color:white; font-weight:bold; text-decoration:none; transition:0.3s; }");
        out.println(".back-btn:hover { transform:translateY(-3px) scale(1.05); box-shadow:0 8px 20px rgba(0,0,0,0.25); background: linear-gradient(45deg,#6dd5ed,#2193b0); }");

        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='card'>");
        out.println("<h2><i class='fa fa-check-circle'></i> Thông tin đăng ký (" + method + ")</h2>");

        if (name != null) out.println("<div class='info-item'><strong>Họ tên:</strong> " + name + "</div>");
        if (email != null) out.println("<div class='info-item'><strong>Email:</strong> " + email + "</div>");
        out.println("<div class='info-item'><strong>Mật khẩu:</strong> (không hiển thị)</div>");
        if (gender != null) out.println("<div class='info-item'><strong>Giới tính:</strong> " + gender + "</div>");
        if (hobbies != null) {
            out.print("<div class='info-item'><strong>Sở thích:</strong> ");
            for (String h : hobbies) {
                out.print("<span style='background:#e0f7fa; padding:3px 8px; margin-right:5px; border-radius:5px;'>" + h + "</span>");
            }
            out.println("</div>");
        }
        if (facebook != null) out.println("<div class='info-item'><strong>Facebook:</strong> " + facebook + "</div>");
        if (shortBio != null) out.println("<div class='info-item'><strong>Giới thiệu:</strong> " + shortBio + "</div>");

        out.println("<a href='register.jsp' class='back-btn'><i class='fa fa-arrow-left'></i> Quay lại Form</a>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }

}
