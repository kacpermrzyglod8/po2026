package agh.po.lab2;
import java.util.ArrayList;

public class lotto {
    public static void main(String[] args){
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i = 0; i < 6; i++){
            int temp = 0;;
            do{
                temp = (int)(Math.random() * (49 - 1) + 1);
            }
            while(lista.contains(temp) == true);

            lista.add(temp);
        }
        System.out.println(lista);
    }
}
