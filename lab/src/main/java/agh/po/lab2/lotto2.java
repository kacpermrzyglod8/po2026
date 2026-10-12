package agh.po.lab2;
import java.util.ArrayList;

public class lotto2 {
    public static void main(String[] args){
        ArrayList<Integer> lista_wejscie = new ArrayList<>();
            for(int i = 0; i < args.length; i++){
                lista_wejscie.add(Integer.parseInt(args[i]));
            }

        ArrayList<Integer> lista = new ArrayList<>();
        for(int i = 0; i < 6; i++){
            int temp = 0;;
            do{
                temp = (int)(Math.random() * (49 - 1) + 1);
            }
            while(lista.contains(temp) == true);

            lista.add(temp);
        }
        int count = 0;
        for(int i = 0; i < 6; i++){
            if(lista.contains((int)lista_wejscie.get(i))){
                count += 1;
            }
        }
        System.out.println(lista);
        System.out.println("liczba trafien: " + count + '\n');
    }
}
