package iuh.fit.se.baitaptuan_01;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
//author : Nguyen Tan Nghi
@WebServlet(name = "userServlet", value = "/user-servlet")
public class UserServlet extends HttpServlet {

    private ObjectMapper objectMapper;

    public void init() {
        objectMapper = new ObjectMapper();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        User user = new User("nguyentannghi", 21);

        String jsonString = objectMapper.writeValueAsString(user);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(jsonString);
        out.flush();
    }

    public void destroy() {
    }
}
