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
        else{
            PrintWriter printWriter=res.getWriter();
            printWriter.println("Tai khoan khong hop le");
            printWriter.close();
        }
    }
}
