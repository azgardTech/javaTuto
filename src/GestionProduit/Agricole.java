/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionProduit;

/**
 *
 * @author Azgard
 */
public abstract class Agricole extends ProduitP5 {
    
    
    private String saison;
    
    
    
    
    

    /**
     * @return the saison
     */
    public String getSaison() {
        return saison;
    }

    /**
     * @param saison the saison to set
     */
    public void setSaison(String saison) {
        this.saison = saison;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+"\n saison : "+this.getSaison();
    }
    
}
