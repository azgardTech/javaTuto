/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rh;

/**
 *
 * @author Azgard
 */
public abstract class Employe {
    
    private int id;
    private String nom;
    private String adresse;
    private int nbrDHeures;

    public Employe(int id, String nom, String adresse, int nbrDHeures) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbrDHeures = nbrDHeures;
    }
    
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the nbrDHeures
     */
    public int getNbrDHeures() {
        return nbrDHeures;
    }

    /**
     * @param nbrDHeures the nbrDHeures to set
     */
    public void setNbrDHeures(int nbrDHeures) {
        this.nbrDHeures = nbrDHeures;
    }
    
    
     public abstract double calculerSalaire();
     
 
    
    
    
}
