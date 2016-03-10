/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
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
@WebServlet(name = "Ajouter", urlPatterns = {"/Ajouter"})
public class Ajouter extends AutowireServlet {

    @Autowired
    private FilmCrudService filmCrudService;
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Film f = new Film();
        String titre=req.getParameter("titre");
        f.setTitre(titre);
        System.out.println(f);
        filmCrudService.save(f);
        
        resp.sendRedirect("ListerFilms");
    }

    
}
