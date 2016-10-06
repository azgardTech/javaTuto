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
    
    private double tauxDeVente;
    
    public Vendeur(int id, String nom, String adresse, int nbrDHeures,double tauxDeVente) {
        super(id, nom, adresse, nbrDHeures);
        this.tauxDeVente=tauxDeVente;
    }

    /**
     * @return the tauxDeVente
     */
    public double getTauxDeVente() {
        return tauxDeVente;
    }

    /**
     * @param tauxDeVente the tauxDeVente to set
     */
    public void setTauxDeVente(double tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public double calculerSalaire() {
        
        return 450* this.getTauxDeVente();
    }
    
   public static Vendeur SaisieEmp()
   {
       Vendeur v=new Vendeur(Integer.parseInt( Util.Core.Saisie("^\\d{1,}$", "id : ")),
                            Util.Core.Saisie("^\\w{3,20}$", "nom : "),
                            Util.Core.Saisie("^\\w{3,}$", "adresse"),
                            Integer.parseInt(Util.Core.Saisie("^\\d{1,}$", "nombre d'heure : ")),
                            Double.parseDouble(Util.Core.Saisie("^\\d{1,}(.\\d{1,)?$", "taux de vente : ")));
       
       
         return v;
   }
   
    @Override
    public String toString()
    {
        return super.toString()+"\n taux de vente : "+this.getTauxDeVente();
    }
    
    
            @Override
    public boolean equals(Object obj) {
       
        Vendeur c=(Vendeur) obj;
        return this.getId()==c.getId(); //To change body of generated methods, choose Tools | Templates.
    }

}
