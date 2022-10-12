package org.example.array;

import java.util.Scanner;

public class ArrayClass {

    public static  void Notes(){
        int[] tab = new int[20];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<20;i++){
            System.out.println("Note n° " +i);
            int valeur = sc.nextInt();
            tab[i] =  valeur;
        }
        for(int i=0;i<tab.length;i++){
            System.out.println(tab[i]);
        }
    }

    public static void Moyenne(){
        int[] tab = new int[20];
        double moyenne=0;
        int total=0;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<20;i++){
            System.out.println("Note n° " +i);
            int valeur = sc.nextInt();
            tab[i] =  valeur;
        }


        for(int i=0;i<tab.length;i++){
            total +=  tab[i];
        }
        moyenne = total / tab.length;
        System.out.println(moyenne);
    }

    public static void PlusGrandPlusPetit(){
        int[] tab = new int[20];
        double moyenne=0;
        int total=0;
        int plusGrand= 0;
        int plusPetit = 20;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<20;i++){
            System.out.println("Note n° " +i);
            int valeur = sc.nextInt();
            tab[i] =  valeur;
        }

        for(int i=0;i<tab.length;i++){
            if(tab[i] > plusGrand){
                plusGrand = tab[i];
            }

            if(plusPetit > tab[i]){
                plusPetit = tab[i];
            }

        }
        System.out.println("Le nombre le plus grand " +  plusGrand);
        System.out.println("Le nombre le plus petit " + plusPetit);
    }
}
