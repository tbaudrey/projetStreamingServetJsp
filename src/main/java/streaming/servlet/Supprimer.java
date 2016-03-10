/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import streaming.entity.Film;
import streaming.service.FilmCrudService;
import streaming.spring.AutowireServlet;

/**
 *
 * @author admin
 */
@WebServlet(name = "Supprimer", urlPatterns = {"/Supprimer"})
public class Supprimer extends AutowireServlet {
    
    @Autowired
    private FilmCrudService filmCrudService;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        Long id=Long.parseLong(req.getParameter("id"));
        
        Film f = new Film();
        f=filmCrudService.findOne(id);
        filmCrudService.delete(f);
        
        req.getRequestDispatcher("ListerFilms").include(req, resp);
        
    }

    

}
