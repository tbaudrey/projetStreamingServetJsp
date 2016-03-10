/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
@Service
public interface FilmCrudService extends CrudRepository<Film, Long>{
    
}
