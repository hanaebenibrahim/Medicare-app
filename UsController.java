package com.springboot.medcare.Us;

import com.springboot.medcare.Classe.Medecin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/fichepersonnelle")
public class UsController {

    @Autowired
    private UsService usService;


    @GetMapping(value = {"","/"})
    public List<Medecin> afficherToutMedecin(){
         return usService.findAll() ;
    }

    @GetMapping(value = "/{id}")
    public Medecin afficherMedecin(@PathVariable int id) {
          return usService.getById(id);
    }

    /*
    @GetMapping(value = "/{login}")
    public Medecin loginMedecin(@PathVariable String login) {
        return usService.getByLogin(login);
    }*/

    @PostMapping(value = {"","/"})
    public Medecin creerMedecin(@RequestBody Medecin m){
        return usService.save(m);
    }

    /*
    @PostMapping(value={"/modifier"})
    public Medecin update(@RequestBody Medecin o ){
        return  usService.update(o);
    }*/


    @DeleteMapping(value = "/{id}")
    public void supprimerMedecin(@PathVariable int id){
        usService.delete(id);
    }
}
