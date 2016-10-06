/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionProduit;

import GestionProduit.Interface.ICritere;

/**
 *
 * @author Azgard
 */
public class Fruit extends Agricole implements ICritere {

    public Fruit() {
    }

    public Fruit(int id, String lib, double qte, String saison) {
        this.setId(id);
        this.setLibelle(lib);
        this.setQuantite(qte);
        this.setSaison(saison);
    }

    @Override
    public boolean estFrais(String saison) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.getSaison().equals(saison);
    }

}
