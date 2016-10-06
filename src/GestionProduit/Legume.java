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
public class Legume extends Agricole implements ICritere{
    
   public Legume()
   {}
   
   

   public Legume(int id,String lib,double qte,String saison)
   {
       this.setId(id);
       this.setLibelle(lib);
       this.setQuantite(qte);
       this.setSaison(saison);
   }       

    @Override
    public boolean estFrais(String saison) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            boolean ok =false;
            if(this.getSaison().equals("Janvier"))
            {ok=saison.equals("Janvier")||saison.equals("Février");}
            else if(this.getSaison().equals("Février"))
            {ok=saison.equals("Février")||saison.equals("Mars");}
            else if(this.getSaison().equals("Mars"))
            {ok=saison.equals("Février")||saison.equals("Mars");}
            else if(this.getSaison().equals("Avril"))
            {ok=saison.equals("Avril")||saison.equals("Mars");}
            else if (this.getSaison().equals("Mai"))
            {ok=saison.equals("Mai")||saison.equals("Juin");}
            else if(this.getSaison().equals("Juin"))
            {ok=saison.equals("Juin")||saison.equals("Juillet");}
            else if(this.getSaison().equals("Juillet"))
            {ok=saison.equals("Juillet")||saison.equals("Aout");}
            else if(this.getSaison().equals("Aout"))
            {ok=saison.equals("Aout")||saison.equals("Septembre");}
            else if(this.getSaison().equals("Septembre"))
            {ok=saison.equals("Septembre")||saison.equals("Octobre");}
            else if(this.getSaison().equals("Octobre"))
            {ok=saison.equals("Octobre")||saison.equals("Novembre");}
            else if(this.getSaison().equals("Novembre"))
            {ok=saison.equals("Novembre")||saison.equals("Decembre");}
            else if(this.getSaison().equals("Decembre"))
            {ok=saison.equals("Decembre")||saison.equals("Janvier");}    
              
        
 
        return ok;
    }
   
   
   
    
}
