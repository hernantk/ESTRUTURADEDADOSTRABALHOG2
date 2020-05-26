package Vetor;

public class Teste {
    public static void main(String[] args) {


    Integer[] vetor = new Integer[30];


    // Random d = new Random();
    // for(int i = 0; i<vetor.length;i++){
    //    vetor[i]=d.nextInt(30);
    // }


    StringBuilder vetordes = new StringBuilder();
        for (int numero:vetor) {
        vetordes.append(numero);
        vetordes.append(",");
    }


    QuickSort quickSort = new QuickSort();
        quickSort.quicksort(vetor,0,vetor.length-1);

    StringBuilder vetorord = new StringBuilder();
        for (int numero:vetor ) {

        vetorord.append(numero);
        vetorord.append(",");

    }
        System.out.println(vetordes);
        System.out.println(vetorord);







}
}
