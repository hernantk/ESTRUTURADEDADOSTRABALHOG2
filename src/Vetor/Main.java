package Vetor;

import java.util.Random;

public class Main {


    public static void main(String[] args) {
        Integer[] array = new Integer[300];
        Random d = new Random();
        for(int i = array.length-1 ; i>0;i--){
            array[i]=d.nextInt(6000);


        }

        System.out.println(array[2]);

    }


}
