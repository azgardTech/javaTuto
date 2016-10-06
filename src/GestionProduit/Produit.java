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
public class Produit {

    private int id;
    private String libellé;
    private String marque;
    private double prix;
    private String dateExpiration;

    public Produit() {
    }

    public Produit(int id, String libellé, String marque, double prix, String dateExpiration) {
        this.id = id;
        this.libellé = libellé;
        this.marque = marque;
        this.prix = prix;
        this.dateExpiration = dateExpiration;
    }

    public int getId() {
        return id;
    }

    public String getLibellé() {
        return libellé;
    }

    public String getMarque() {
        return marque;
    }

    public double getPrix() {
        return prix;
    }

    public String getDateExpiration() {
        return dateExpiration;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLibellé(String libellé) {
        this.libellé = libellé;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setDateExpiration(String dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    @Override
    public String toString() {
        return ("\n id: " + this.id + "\n libellé: " + this.libellé + "\n marque: "
                + this.marque + "\n prix: " + this.prix
                + "\n Date d'expriartion: " + this.dateExpiration);
    }

    public static boolean Comparer(Produit p1, Produit p2) {
        return (p1.getId() == p2.getId() && p1.getLibellé().equals(p2.getLibellé()) && p1.getPrix() == p2.getPrix());
    }

    public boolean Comparer(Produit p) {
        return this.id == p.getId() && this.libellé.equals(p.getLibellé()) && this.prix == p.getPrix();
    }

    public static Produit SaisieProduit() {
        Produit p = new Produit(Integer.parseInt(Util.Core.Saisie("^\\d{1,}$", "id: ")),
                Util.Core.Saisie("^\\w{3,}$", "libellé: "),
                Util.Core.Saisie("^\\w{3,}$", "marque: "), 
                Double.parseDouble(Util.Core.Saisie("^\\d{1,}(.\\d{1,})?$", "prix: ")),
                Util.Core.SaisieDate("^\\d{2}-\\d{2}-\\d{4}$", "date d'expiration: "));

        return p;
    }

}
