package iuh.fit.se.baitaptuan_01;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

// author : Nguyen Tan Nghi
@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Nguyễn Tấn Nghị";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<title>Hello Servlet</title>");
        out.println("<style>");
        out.println("body { margin:0; height:100vh; display:flex; justify-content:center; align-items:center; font-family:'Segoe UI',Arial,sans-serif; background: linear-gradient(135deg,#89f7fe,#66a6ff); }");
        out.println(".card { background:white; padding:40px 60px; border-radius:20px; box-shadow:0 10px 25px rgba(0,0,0,0.2); text-align:center; animation: fadeIn 1.2s ease-in-out; }");
        out.println("h1 { font-size: 40px; color:#333; margin:0; animation: typing 3s steps(20,end), blink .8s infinite; white-space:nowrap; overflow:hidden; border-right:3px solid #333; display:inline-block; }");
        out.println("@keyframes fadeIn { from {opacity:0; transform:translateY(-30px);} to {opacity:1; transform:translateY(0);} }");
        out.println("@keyframes typing { from { width:0; } to { width:100%; } }");
        out.println("@keyframes blink { 50% { border-color: transparent; } }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='card'>");
        out.println("<h1>" + message + "</h1>");
        out.println("</div>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
