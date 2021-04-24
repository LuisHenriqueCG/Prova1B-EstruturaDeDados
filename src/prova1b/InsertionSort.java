package prova1b;


public class InsertionSort{

 
    
    int i, j;
    int aux;
    int contador = 1;
    
//Ex
 public void algoritmoInsertionSort(int vetor[]) {
     //O Insertion Sort tem como rotina base a inserção ordenada.
     //A ideia é executar várias vezes essa rotina para ordenar um array. 

        for (i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            while ((j >= 0) && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = aux;
        }

        if (contador == 1) {
            contador++;
        };
         //mostrando na tela
        System.out.print("InsertionSort: ");
        System.out.print("Vetor Ordenado: ");
        System.out.print("[");
        for (i = 0; i < vetor.length; ++i) {
            System.out.print(" " + vetor[i] + " ");
        }
        System.out.println("]; ");
    }


  }

    
