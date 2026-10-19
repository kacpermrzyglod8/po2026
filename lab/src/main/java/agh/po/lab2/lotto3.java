package agh.po.lab2;
import java.util.ArrayList;

public class lotto3 {
    public static void main(String[] args){
        ArrayList<Integer> lista_wejscie = new ArrayList<>();
        for(int i = 0; i < args.length; i++){
            lista_wejscie.add(Integer.parseInt(args[i]));
        }
        long start = System.currentTimeMillis();
        int losowania = 0;
        int count = 0;
        ArrayList<Integer> lista = new ArrayList<>();

        while(count != 6){
            losowania++;
            count = 0;
            lista = new ArrayList<>();
            for(int i = 0; i < 6; i++){
                int temp = 0;
                do{
                    temp = (int)(Math.random() * (49 - 1 + 1) + 1);
                }
                while(lista.contains(temp) == true);
                lista.add(temp);
            }
            for(int i = 0; i < 6; i++){
                if(lista.contains((int)lista_wejscie.get(i))){
                    count += 1;
                }
            }
        }
        long runtime = System.currentTimeMillis() - start;
        System.out.println("Wylosowana lista: " + lista);
        System.out.println("Liczba losowań: " + losowania);
        System.out.println("Czas dzziałania: " + runtime + " ms");
        System.out.println("Czas dzialania/liczba losowań: " +  (double)runtime / losowania + "ms");
    }
}
