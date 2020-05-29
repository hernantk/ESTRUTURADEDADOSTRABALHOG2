package vetor10000;

import Vetor.QuickSort;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Vetor10000 {
    //Tentei Não Consegui


    public static void main(String[] args) throws IOException {


        MontarVetor montarVetor= new MontarVetor();

        Integer[] vetor = montarVetor.montarVetor();



        long tempoinicio = System.currentTimeMillis();
        QuickSort quickSort = new QuickSort();
        quickSort.quicksort(vetor,0,vetor.length-1);
        long tempofinal = System.currentTimeMillis();


        toString(vetor);

        System.out.println("Tempo : "+(tempofinal-tempoinicio));
        System.out.println("Trocas : "+quickSort.getTroca());
        System.out.println("Comparações : "+quickSort.getComparaçoes());



}
    public static void toString(Integer[] vetor) {
     StringBuilder vetorord = new StringBuilder();
      for (int numero:vetor) {

          vetorord.append(numero);
            vetorord.append(",");

   }
      System.out.println(vetorord);}
}



