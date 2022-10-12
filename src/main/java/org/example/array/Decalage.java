package org.example.array;



public class Decalage {

    public static void Decalage(){
        String[] tab =  {"D","E","C","A","L","A","G","E"};

        String decal =  tab[0];

        String[] tab2 = new String[tab.length];

        for(int i=1;i<tab.length;i++){
            tab2[i]=tab[i];
        }

        tab2[tab2.length-1]= decal;

        for(int i=0;i<tab2.length;i++){
            System.out.println(tab2[i]);
        }
    }
}
