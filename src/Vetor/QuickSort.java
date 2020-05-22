package Vetor;

public class QuickSort {



                                          // 0           // tamanho lista-1
    public void quicksort(Integer[] vetor,Integer ini,Integer fin){
        if (ini < fin){
            Integer kpt= particion(vetor,ini,fin);
            quicksort(vetor,ini,kpt-1);
            quicksort(vetor,kpt+1,fin);
        }



    }

    private Integer particion(Integer[] vetor,Integer ini,Integer fin){
        Integer pivo = vetor[fin];
        Integer inicio=ini;
        for (int i=ini;i<fin;i++){
            if(vetor[i]<= pivo){
                troca(vetor,i,ini);
                inicio++;
            }
            troca(vetor,vetor[inicio],vetor[fin]);

        }
        return inicio;
    }

    private void troca(Integer[] vetor,Integer vlr, Integer vlr1) {
        Integer troca = vetor[vlr];
        vetor[vlr] = vetor[vlr1];
        vetor[vlr1] = troca;



    }


}
