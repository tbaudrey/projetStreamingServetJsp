/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
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
@WebServlet(name = "GetCookieServlet", urlPatterns = {"/GetCookieServlet"})
public class GetCookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] tab = req.getCookies();
        String cookieValue=getCookieValue(tab,"login");
        System.out.println(cookieValue);
    }

}
