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
public class Caissier extends Employe {
    
    
    private int numeroDeCaisse;
    
    public Caissier(int id, String nom, String adresse, int nbrDHeures,int numeroDeCaisse) {
        super(id, nom, adresse, nbrDHeures);
        this.numeroDeCaisse=numeroDeCaisse;
    }

    /**
     * @return the numeroDeCaisse
     */
    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }

    /**
     * @param numeroDeCaisse the numeroDeCaisse to set
     */
    public void setNumeroDeCaisse(int numeroDeCaisse) {
        this.numeroDeCaisse = numeroDeCaisse;
    }
    
    
    @Override
    public double calculerSalaire()
    {
       return (Math.min(this.getNbrDHeures(),180)*5+Math.max(this.getNbrDHeures()-180,0)*5.75);
    }

    
    public static Caissier SaisieEmp()
    {
        Caissier c= new Caissier(Integer.parseInt(Util.Core.Saisie("^\\d{1,}$","id : ")),
        Util.Core.Saisie("^\\w{3,20}$", "nom : "),
        Util.Core.Saisie("^\\w{3,}$", "adresse"),
        Integer.parseInt(Util.Core.Saisie("^\\d{1,}$", "nombre d'heure : ")),
        Integer.parseInt(Util.Core.Saisie("^\\d{1,}$", "Numero de caisse : ")));
        
        return c;
    }

  
    
}
