/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import org.joda.time.DateTime;
/**
 *
 * @author Azgard
 */
public class Core {

    public static String StringChecker(String regexp) {
        Scanner s = new Scanner(System.in);
        String str;

        try {
            str = s.nextLine();
            if (!str.matches(regexp)) {
                str = "";
            }
        } catch (Exception e) {
            str = "";
        }

        return str;
    }

    public static String Saisie(String regexp, String msg) {
        String str = "";
        do {
            System.out.print(msg);
            str = Util.Core.StringChecker(regexp);
        } while (str.equals(""));

        return str;
    }
    
    public static String SaisieDate(String regexp,String msg)
    {
      
      String str="";
      
       do{
           System.out.println(msg);
           str=StringChecker(regexp);
       }
       while(!validateDate(str));
     
        return str;
    }
    
    
    
    public static boolean validateDate(String dateString){
    SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
    sdf.setLenient(false);
    try {
        sdf.parse(dateString);
        return true;
    } catch (ParseException ex) {
        return false;
    }
}

}
