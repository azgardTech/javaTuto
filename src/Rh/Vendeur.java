/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rh;

import Rh.Employe;

/**
 *
 * @author Azgard
 */
public class Vendeur extends Employe{
    
    private float tauxDeVente;
    
    public Vendeur(int id, String nom, String adresse, int nbrDHeures,float tauxDeVente) {
        super(id, nom, adresse, nbrDHeures);
        this.tauxDeVente=tauxDeVente;
    }

    /**
     * @return the tauxDeVente
     */
    public float getTauxDeVente() {
        return tauxDeVente;
    }

    /**
     * @param tauxDeVente the tauxDeVente to set
     */
    public void setTauxDeVente(float tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public double calculerSalaire() {
        
        return 450* this.getTauxDeVente();
    }
    
   
    
}
