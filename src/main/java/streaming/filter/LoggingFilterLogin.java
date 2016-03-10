/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.filter;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author admin
 */
@WebFilter(filterName = "LoggingFilterLogin", urlPatterns = {"/Supprimer","/Ajouter"})
public class LoggingFilterLogin implements Filter {

    @Override
    public void init(FilterConfig fc) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest sr, ServletResponse sr1, FilterChain fc) throws IOException, ServletException {
        HttpServletRequest req =(HttpServletRequest)sr;
        if(req.getSession().getAttribute("login")==null){
            req.getRequestDispatcher("lister_films.jsp").forward(req, sr1);
        }
        else{
            fc.doFilter(sr, sr1);
        }
    }

    @Override
    public void destroy() {
    }
    
    
    
}
