/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static streaming.cookie.util.CookieUtil.getCookieValue;

/**
 *
 * @author admin
 */
@WebServlet(name = "StyleServlet", urlPatterns = {"/Style"})
public class StyleServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        Cookie c = new Cookie("Style", "");
        String style=req.getParameter("Style");
        
        if(style.equals("1")){
            c.setValue("1");
        }
        if(style.equals("2")){
            c.setValue("2");
        }
        if(style.equals("3")){
            c.setValue("3");
        }
        
        resp.addCookie(c);
//        req.getRequestDispatcher("lister_films.jsp").include(req, resp);
        resp.sendRedirect("ListerFilms");
        
    }


}
