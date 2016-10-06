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
public class ProduitP5 {
    
    private int id;
    private String libelle;
    private double quantite;

    
    public ProduitP5()
    {}
    
    
     public ProduitP5(int id,String lib,double qte)
    {
        this.id=id;
        this.libelle=lib;
        this.quantite=qte;     
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
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * @param libelle the libelle to set
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    /**
     * @return the quantite
     */
    public double getQuantite() {
        return quantite;
    }

    /**
     * @param quantite the quantite to set
     */
    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }
    
    
    @Override
    public String toString()
    {
        return "id : "+this.getId()+"\n Type : "+this.getClass().getSimpleName()+
                "\n libellé : "+this.getLibelle()+"\n quantité : "+this.getQuantite();
    }
    
    public static ProduitP5 SaisiePrd()
    {
       ProduitP5 p=new ProduitP5(Integer.parseInt(Util.Core.Saisie("^\\d{1,}$", "id: ")),
                                  Util.Core.Saisie("^\\w{3,}$", "libellé: "),
                                  Double.parseDouble(Util.Core.Saisie("^\\d{1,}(.\\d{1,})?$","quantité : "))
       );
        
       
       return p;
    }
    

    
    public static boolean Comparer(ProduitP5 p1,ProduitP5 p2)
    {
        
    return p1.getId()==p2.getId() && p1.getLibelle().equals(p2.getLibelle()) && p1.quantite==p2.getQuantite() ;
    }
    
    public boolean Comparer(ProduitP5 p1)
    {
        return this.getId()==p1.getId() && this.getLibelle().equals(p1.getLibelle()) && this.quantite==p1.getQuantite() ;
    }
    
    
    
    
    
}
