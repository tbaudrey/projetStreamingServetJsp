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
import streaming.entity.Serie;
import streaming.service.SerieCrudService;
import streaming.spring.AutowireServlet;

/**
 *
 * @author admin
 */
@WebServlet(name = "ListerSeries", urlPatterns = {"/ListerSeries"})
public class ListerSeries extends AutowireServlet {

    @Autowired
    private SerieCrudService serieCrudService;
 
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
        List<Serie> listeSeries = new ArrayList<>();
        listeSeries.add(new Serie(1L, "Serie11111111111"));
        listeSeries.add(new Serie(2L, "Serie2222222222"));
        listeSeries.add(new Serie(3L, "Serie3333333333"));
        listeSeries.add(new Serie(4L, "Serie4444444444"));
        
        serieCrudService.save(listeSeries);

        req.setAttribute("mesSeries", listeSeries);
        req.getRequestDispatcher("lister_series.jsp").include(req, resp);
        
    }

    
    
}
