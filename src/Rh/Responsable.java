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
public class Responsable extends Employe{
    
    private double prime;

    public Responsable( int id,String nom, String adresse, int nbrDHeures, double prime) {
        super(id, nom, adresse, nbrDHeures);
        this.prime = prime;
    }

    /**
     * @return the prime
     */
    public double getPrime() {
        return prime;
    }

    /**
     * @param prime the prime to set
     */
    public void setPrime(double prime) {
        this.prime = prime;
    }

    @Override
    public double calculerSalaire() {      
        return (Math.min(this.getNbrDHeures(), 160)*10+Math.max(this.getNbrDHeures()-160,0)*12+this.getPrime());
    }
    
   /* public static Responsable SaisieEmp()
    {
        Responsable r=new Responsable(Integer.parseInt( Util.Core.Saisie("^\\d{1,}$", "id : ")),
                
                Double.parseDouble(Util.Core.Saisie("^\\d{1,}(.\\d{1,)?$", "prime : "))
               );
    }
    */
}
