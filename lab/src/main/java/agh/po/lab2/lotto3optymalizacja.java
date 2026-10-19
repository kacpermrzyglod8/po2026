package agh.po.lab2;
import java.util.ArrayList;
import java.util.Random;

public class lotto3optymalizacja {
    public static void main(String[] args){
        ArrayList<Integer> lista_wejscie = new ArrayList<>();
        for(int i = 0; i < args.length; i++){
            lista_wejscie.add(Integer.parseInt(args[i]));
        }
        long start = System.currentTimeMillis();
        int losowania = 0;
        ArrayList<Integer> lista = new ArrayList<>();

        Random r = new Random();

        while(true){
            losowania++;
            lista = new ArrayList<>();
            int temp = 0;
            for(int i = 0; i < 6; i++){
                temp = 0;
                do{
                    temp = r.nextInt(49) + 1;
                }
                while(lista.contains(temp) == true);
                lista.add(temp);
            }
            if (lista.containsAll(lista_wejscie))
                break;
        }
        long runtime = System.currentTimeMillis() - start;
        System.out.println("Wylosowana lista: " + lista);
        System.out.println("Liczba losowań: " + losowania);
        System.out.println("Czas działania: " + runtime + " ms");
        System.out.println("Czas na losowanie: " + (double) runtime / losowania + " ms");
    }
}
