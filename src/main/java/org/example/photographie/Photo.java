package org.example.photographie;

import java.util.Scanner;

public class Photo {
    public static void getPhoto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre de Photocopies? ");
        int valeur = sc.nextInt();
        double total;
        if(valeur <10){
            total = valeur * 0.15;
        } else if(valeur >= 10 && valeur <= 20){
            total = valeur  * 0.10 ;
        } else {
            total =valeur * 0.05;
        }
        System.out.println("Pour " +  valeur +" photocopies, vous devrez payer: "+ total + "€");
    }
}
