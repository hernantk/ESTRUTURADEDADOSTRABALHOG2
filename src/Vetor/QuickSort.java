package Vetor;

public class QuickSort {



                                          // 0           // tamanho lista-1
    public void quicksort(Integer[] vetor,Integer ini,Integer fin){
        // Verficação para continuidade do processo
        if (ini < fin){
            Integer pivoord= particion(vetor,ini,fin);


            quicksort(vetor,ini,pivoord-1);
            quicksort(vetor,pivoord+1,fin);
        }





    }

    private Integer particion(Integer[] vetor,Integer vlrini,Integer vlrfim){

        Integer pivo = vetor[vlrfim];

        Integer inicio=vlrini;

        for (int i=vlrini;i<vlrfim;i++){
            if(vetor[i]<= pivo){
                troca(vetor,i,inicio);
                inicio++;
            }
        }
                            //#PIVO
        troca(vetor,inicio,vlrfim);
        return inicio;
    }
    //Valores são as posições do Vetor
    private void troca(Integer[] vetor,Integer vlr, Integer vlr1) {
        Integer troca = vetor[vlr];
        vetor[vlr] = vetor[vlr1];
        vetor[vlr1] = troca;



    }





}
