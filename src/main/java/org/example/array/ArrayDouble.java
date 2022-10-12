package org.example.array;

public class ArrayDouble {

    public static int[] generateRandomArray(int random) {

        int[] tab = new int[random];
        for(int i=0;i<tab.length;i++){
            int randomNumber = (int) Math.round(Math.random()*100);
            tab[i] = randomNumber;
        }

        return tab;
    }
    public static int[] extendArray(int[] arr){
        int[] tab = new int[arr.length*2];


        int[] tabMultiple = new int[arr.length];

        for(int i=0;i<tabMultiple.length;i++){
            tabMultiple[i] =  arr[i] * 2;
        }
        for(int i=0;i<tab.length/2;i++){
            tab[i] =  arr[i];
        }

        int compteur = 0;
        for (int i= tab.length/2; i<tab.length;i++){

            tab[i] = tabMultiple[compteur];
            compteur++;
        }

        return tab;
    }

}
