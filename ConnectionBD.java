package com.springboot.medcare.Connection;


import com.springboot.medcare.Classe.Medecin;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConnectionBD extends MongoRepository <Medecin,Integer> {

}
