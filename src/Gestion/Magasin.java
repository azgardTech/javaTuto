/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import GestionProduit.ProduitP5;
import Rh.Employe;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Azgard
 */
public class Magasin {

    private int id;
    private String nom;
    private String adresse;
    private int capacité;
    private HashSet<ProduitP5> h;
    private HashSet<Employe> e;
    

    public Magasin() {
    }

    public Magasin(int id, String nom, String adresse, int capacité) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.capacité = capacité;
        this.h = new HashSet<ProduitP5>();
        this.e= new HashSet<Employe>();

    }

    public int getId() {
        return id;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getCapacité() {
        return capacité;
    }

    public HashSet<ProduitP5> getH() {
        return h;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setCapacité(int capacité) {
        this.capacité = capacité;
    }

    public void setH(HashSet<ProduitP5> h) {
        this.h = h;
    }

    public void AjouterProduit(ProduitP5 P) {
        if (this.h.size() < capacité) {
            h.add(P);

        } else {
            System.out.println("Magasin complet");
        }
    }

    public void AfficherMagasin() {
        System.out.println("id est:" + id);
        System.out.println("nom magasin: "+nom);
        System.out.println("adresse est:" + adresse);
        System.out.println("capacité est:" + capacité);
        System.out.println("**************");

    }

    public void AfficherMagasinDetails() {
        AfficherMagasin();
        Iterator<ProduitP5> iter = h.iterator();
        ProduitP5 p=new ProduitP5();
        System.out.println("***Produit***");
        while (iter.hasNext()) {
            p = iter.next();
            System.out.println(p.toString());
        }
        
        
        System.out.println("***Employé***");
        Employe ep;
        Iterator<Employe> iterat=e.iterator();
        while(iterat.hasNext()){
           ep=iterat.next();
            System.out.println(ep.toString());
        }
    }

    public boolean ChercherProduit(ProduitP5 p) {
        Iterator<ProduitP5> iter = h.iterator();
        boolean ok = false;
         ProduitP5 prd;
        while ((iter.hasNext() && (!ok))) {
            prd = iter.next();
            if (prd.Comparer(p)) {
                ok = true;
            }

        }

        return ok;
    }

    public boolean supprimerProduit(ProduitP5 p) {
        Iterator<ProduitP5> iter = h.iterator();
        ProduitP5 prd = new ProduitP5();
        boolean ok = false;
        while ((iter.hasNext()) && (!ok)) {
            prd = iter.next();
            ok = ProduitP5.Comparer(prd, p);
        }
        
        if (ok)
        { h.remove(prd);}
        
        return ok;
    }

    public static void ComparerCapacite(Magasin m1, Magasin m2) {

        if (m1.getH().size() > m2.getH().size()) {
            System.out.println("store with id: " + m1.getId() + " has more products then " + m2.getId());
        }

        if (m1.getH().size() == m2.getH().size()) {
            System.out.println("both stores has the same number of products");
        }

        if (m1.getH().size() < m2.getH().size()) {
            System.out.println("store with id: " + m2.getId() + " has more products then " + m1.getId());
        }
    }
    
    
    public static Magasin SaisieMagasin()
    {
        Magasin m=new Magasin(Integer.parseInt(Util.Core.Saisie("^\\d{1,}$", "id magasin: ")),
        Util.Core.Saisie("^\\w{3,}$","nom magasin: "),
        Util.Core.Saisie("^\\w{10,}$", "adresse: "),
        Integer.parseInt(Util.Core.Saisie("^\\d{1,}$","capacité: ")));
        return m;
    }

    /**
     * @return the e
     */
    public HashSet<Employe> getE() {
        return e;
    }

    /**
     * @param e the e to set
     */
    public void setE(HashSet<Employe> e) {
        this.e = e;
    }
    
    
    public boolean ajouterEmp(Employe emp)
    {
        boolean ok=false;
        
        Iterator<Employe> iter = e.iterator();
        Employe em;
        while ((iter.hasNext() && (!ok))) {
             em = iter.next();
            if (em.equals(emp)) {
                ok = true;
            }
          
           
        
        
    }
        
        if(!ok)
        this.getE().add(emp);
    return !ok;
    }
    
    
    
    public boolean supprimerEmp(Employe emp)
    {
        boolean ok=false;
        
        Iterator<Employe> iter = e.iterator();
        Employe em;
        while ((iter.hasNext() && (!ok))) {
             em = iter.next();
            if (em.equals(emp)) {
                ok = true;
            }
           if(ok) 
           {e.remove(emp);}
        
        
    }
    return ok;
    }
    
    
    
        public boolean rechercheEmp(Employe emp)
    {
        boolean ok=false;
        
        Iterator<Employe> iter = e.iterator();
        Employe em;
        while ((iter.hasNext() && (!ok))) {
             em = iter.next();
            if (em.equals(emp)) {
                ok = true;
            }
            
    }
    return ok;
    }

}
