package com.springboot.medcare.Classe;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Document(collection = "medecin")
public class Medecin {

    @Id
    private int id;

    @NotNull(message = "Le prénom est obligatoire !")
    private String prenom ;

    @NotNull(message = "Le nom est obligatoire !")
    private String nom ;

    @NotNull(message = "Le CIN est obligatoire !")
    private String cin ;

    @NotNull(message = "La spécialité est obligatoire !")
    private String specialite ;

    @NotNull(message = "Le numéro de téléphone est obligatoire !")
    @Size(min = 10, max = 10, message = "Vous devez saisir 10 chiffres !")
    private String gsm ;

    @NotNull(message = "L'adresse email est obligatoire !")
    private String email ;

    @NotNull(message = "L'adresse est obligatoire !")
    private String adresse ;

    @NotNull(message = "Le login est obligatoire !")
    private String login ;

    @NotNull(message = "Le mot de passe est obligatoire !")
    private String mdp ;

    public Medecin() {}

    public Medecin(int id, String prenom, String nom, String cin, String specialite, String gsm, String email, String adresse, String login, String mdp) {
            this.id = id;
            this.prenom = prenom;
            this.nom = nom;
            this.cin = cin;
            this.specialite = specialite;
            this.gsm = gsm;
            this.email = email;
            this.adresse = adresse ;
            this.login = login;
            this.mdp = mdp;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getCin() { return cin; }
    public void setCin(String cin) { this.cin = cin; }

    public String getSpecialite() { return specialite; }
    public void setSpecialite(String specialite) { this.specialite = specialite; }

    public String getGsm() { return gsm; }
    public void setGsm(String gsm) { this.gsm = gsm; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    public String getMdp() { return mdp; }

    public void setMdp(String mdp) { this.mdp = mdp; }
}
