package com.springboot.medcare.UsNine;

import com.springboot.medcare.Classe.Medecin;
import com.springboot.medcare.Connection.ConnectionBD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsNineService {

        @Autowired
        private ConnectionBD connexion;

        public Medecin creermedecin(Medecin o) { connexion.insert(o);  return o; }

        public List<Medecin> findAll() {
        return connexion.findAll();
    }

        public Medecin getById(int id) {
        return connexion.findById(id).get();
    }

        public void delete(int id){   connexion.deleteById(id); }
        //
}




