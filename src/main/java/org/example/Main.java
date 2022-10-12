package org.example;

import org.example.Achat.AchatClient;
import org.example.array.ArrayClass;
import org.example.array.ArrayDouble;
import org.example.array.Decalage;
import org.example.photographie.Photo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Photo.getPhoto();
//        AchatClient.GetMonnaie();
//        ArrayClass.PlusGrandPlusPetit();

//        Decalage.Decalage();
        Scanner sc = new Scanner(System.in);
        System.out.println("Taille du tableau");
        int valeur = sc.nextInt();

        int[] tab = new int[valeur];
        tab = ArrayDouble.generateRandomArray(valeur);
//        for (int i=0;i<tab.length;i++){
//            System.out.println(tab[i]);
//        }
        int[] newTab = new int[tab.length*2];
        newTab =  ArrayDouble.extendArray(tab);

        for (int i=0;i<newTab.length;i++){
            System.out.println(newTab[i]);
        }
    }
}