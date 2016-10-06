/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monmagasin;

import Gestion.Magasin;
import GestionProduit.Fruit;
import GestionProduit.Legume;
import Rh.Vendeur;
import java.util.Scanner;
import GestionProduit.Interface.ICritere;

/**
 *
 * @author Azgard
 */
public class MonMagasin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  /*     Scanner s = new Scanner(System.in);
        char cmd = ' ';
        Magasin m=new Magasin(0,"Menzah 6",50);
        do {

            do {
                System.out.println("0:to exit");
                System.out.println("1:to add product");
                System.out.println("2:to list products");
                System.out.println("3:to search product");
                System.out.println("4:to delete product");
                cmd = s.next().charAt(0);
            } while ((cmd != '0') && (cmd != '1') && (cmd != '2') && (cmd != '3')&&(cmd!='4'));

            switch (cmd) {
                case '1':m.AjouterProduit(Produit.SaisieProduit());break;
                case '2':m.AfficherProduit();break;
                case '3':m.ChercherProduit(Produit.SaisieProduit());break;
                case '4':m.supprimerProduit(Produit.SaisieProduit());break;
            }
        } while (cmd != '0');*/
     
  
       
Magasin m=new Magasin(1,"monop","menzah6",50);
        System.out.println(m.ajouterEmp(new Vendeur(1,"ali","manar",5,5)));
m.ajouterEmp(new Vendeur(2,"ali","manar",5,5));
m.ajouterEmp(new Vendeur(3,"ali","manar",5,5));
m.ajouterEmp(new Vendeur(4,"ali","manar",5,5));
m.ajouterEmp(new Vendeur(5,"ali","manar",5,5));

m.AjouterProduit(new Fruit(1,"banane",3,"Janvier"));
m.AjouterProduit(new Fruit(2,"banane",3,"Janvier"));
m.AjouterProduit(new Fruit(3,"banane",3,"Janvier"));
m.AjouterProduit(new Fruit(4,"banane",3,"Janvier"));
m.AjouterProduit(new Fruit(5,"banane",3,"Janvier"));
m.AjouterProduit(new Legume(6,"tomate",3,"Janvier"));
m.AjouterProduit(new Legume(7,"tomate",3,"Janvier"));
m.AjouterProduit(new Legume(8,"tomate",3,"Janvier"));
m.AjouterProduit(new Legume(9,"tomate",3,"Janvier"));


m.AfficherMagasinDetails();

        
    }
}
