/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
@WebServlet(name = "ListerFilms", urlPatterns = {"/ListerFilms"})
public class ListerFilms extends AutowireServlet {

    @Autowired
    private FilmCrudService filmCrudService;
 
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        List<Film> listeFilms = new ArrayList<>();
        listeFilms=(List<Film>) filmCrudService.findAll();
        System.out.println(listeFilms);
        
        req.setAttribute("mesFilms", listeFilms);
        req.getRequestDispatcher("lister_films.jsp").include(req, resp);
        
    }
    
    
}
