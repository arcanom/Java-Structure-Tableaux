package org.example.Achat;

import java.util.Scanner;

public class AchatClient {

    public static void GetMonnaie(){
        boolean isStopped =  true;
        int valeur = 0;
        int total = 0;

       while(isStopped){
           Scanner sc = new Scanner(System.in);
           System.out.println("Prix de votre article? ");
           valeur = sc.nextInt();

           if(valeur == 0){
               isStopped = false;
           }


           total += valeur;

       }

        System.out.println(total);


        if(total%10 == 0){
            int rendu =  total / 10;
            System.out.println("Voila votre rendu " + rendu  + " billets de 10€");
        } else {
            int nbreBillets10€ =  Math.round(total/10);
            int rendu10Euros =  total % 10;
            if(rendu10Euros%5==0){
                int rendu = rendu10Euros / 5;
                System.out.println("Voila votre rendu " +  nbreBillets10€ + "Billets de 10€ et " + rendu + " Billets de 5€" );
            } else {
                int nbreBillets5€ = Math.round(rendu10Euros/5);
                int rendu = rendu10Euros%5;
                System.out.println("Voila votre rendu " +  nbreBillets10€ + " Billets de 10€ et " + nbreBillets5€ + " Billets de 5€ " + rendu + " Pieces de 1€" );
            }
        }
    }
}
