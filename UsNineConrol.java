package com.springboot.medcare.UsNine;

import com.springboot.medcare.Classe.Medecin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
@RequestMapping("/admin")
public class UsNineConrol {
    @Autowired
    private UsNineService nineusService;
    @GetMapping(value={"/affichertoutmedecin"})
    public List<Medecin> affichertoutmedecin(){
        return nineusService.findAll();
    }
    @GetMapping(value={"/affichertoutmedecin/{id}"})
    public Medecin affichermedecin(@PathVariable int id){
            return nineusService.getById(id);
    }
    @PostMapping(value = {"/creermedecin"})
    public Medecin create(@RequestBody Medecin i) {
        return nineusService.creermedecin(i);

    }

    @DeleteMapping(value = "/supprimermedecin/{id}")
    public void supprimerMedecin(@PathVariable int id){
        nineusService.delete(id);
    }
}
