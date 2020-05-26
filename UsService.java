package com.springboot.medcare.Us;


import com.springboot.medcare.Classe.Medecin;
import com.springboot.medcare.Connection.ConnectionBD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UsService {

    @Autowired
    private ConnectionBD connexion;

    public List<Medecin> findAll() {
        return connexion.findAll();
    }

    public Medecin getById(int id) {
        return connexion.findById(id).get();
    }

    public Medecin save(Medecin medecin){
        return connexion.insert(medecin);
    }


    public void delete(int id){
       connexion.deleteById(id);
    }

    /*
    public Medecin update(Medecin o){
        connexion.save(o);
        return o ;
    }*/

    /*
    public Medecin getByLogin(String login) {
        return connexion.findByLogin(login).get();
    }*/
}
