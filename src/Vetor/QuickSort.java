package Vetor;

public class QuickSort {



                                          // 0           // tamanho lista-1
    public void quicksort(Integer[] vetor,Integer ini,Integer fin){
        // Verficação para continuidade do processo
        if (ini < fin){
            // Part = posição ordenada do pivo no vetor
            Integer part= particion(vetor,ini,fin);

            quicksort(vetor,ini,part-1);

            quicksort(vetor,part+1,fin);
        }





    }

    private Integer particion(Integer[] vetor,Integer vlrini,Integer vlrfim){

        Integer pivo = vetor[vlrfim];

        Integer posicaopivo=vlrini;


        //Ordenação do vetor a partir do pivo
        for (int i=vlrini;i<vlrfim;i++){
            if(vetor[i]<= pivo){
                troca(vetor,i,posicaopivo);
                posicaopivo++;
            }
        }
                            //#PIVO
        troca(vetor,posicaopivo,vlrfim);
        return posicaopivo;
    }
    //Valores são as posições do Vetor
    private void troca(Integer[] vetor,Integer vlr, Integer vlr1) {
        Integer troca = vetor[vlr];
        vetor[vlr] = vetor[vlr1];
        vetor[vlr1] = troca;



    }





}
