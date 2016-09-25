/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monmagasin;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Azgard
 */
public class Produit {
    
private int id;
private String libellé;
private String marque;
private double prix;
private  String dateExpiration;

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
    public String toString()
    {return ("\n id: "+this.id+"\n libellé: "+this.libellé+"\n marque: "
            +this.marque+"\n prix: "+this.prix
            +"\n Date d'expriartion: "+this.dateExpiration);
    }
    
    
    public static Produit SaisieProduit()
    {Produit p=new Produit();
    
     p.setId(Integer.parseInt(StringChecker("[0-9]+","id :")));
     p.setLibellé(StringChecker("\\w{3,}","libellé :"));
     p.setMarque(StringChecker("\\w{3,}","marque :"));
     p.setDateExpiration(StringChecker("\\d{2}-\\d{2}-\\d{4}","date d'exp :"));
     p.setPrix(Double.parseDouble(StringChecker("\\d+(.\\d+)?","prix :")));
     
     
       
    return p;
    }
    
    
        public static boolean Comparer(Produit p1,Produit p2){
        return (p1.getId()==p2.getId()&&p1.getLibellé().equals(p2.getLibellé())&&p1.getPrix()==p2.getPrix());
    }

    public  boolean Comparer(Produit p){
        return this.id==p.getId()&&this.libellé.equals(p.getLibellé())&&this.prix==p.getPrix();
    }
     
    
    private static String StringChecker(String regexp,String msg)
    {   
        Scanner s=new Scanner(System.in);
        String str;
        do
        {
         System.out.println(msg);
         str=s.nextLine();
        }while(!str.matches(regexp));
        return str;
    }
    
    

}
