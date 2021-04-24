package prova1b;

public class SelectionSort {
 
    

    int i, menor, indiceMenor, j;
    int countVezes = 1;
//EX
    public void algoritmoSelectionSort(int lista[]) {
        int n = lista.length;
        for (i = 0; i < n - 1; i++) {
            // antes dele iniciar Conceitua-se como menor o valor no índice atual do loop, o valor inserido no loop
            
            
            menor = lista[i];
            indiceMenor = i;
            // faz a comparação junto aos outros valores da lista
            for (j = i + 1; j < n; j++) {
                if (lista[j] < menor) {
                    menor = lista[j];
                    indiceMenor = j;
                }
            }
            // faz a troca de valores
            //quando o valor comparado é menor que o valor atual  
            lista[indiceMenor] = lista[i]; //
            lista[i] = menor;
        }
        
        if (countVezes == 1) {
        };//mostrando na tela
         System.out.print("SelectionSort: ");
         
            System.out.print("Vetor Ordenado :");
            countVezes++;
        System.out.print("[");
        for (i = 0; i < n; i++) {
            System.out.print(" " + lista[i] + " ");
        }
        System.out.println("];");
    }
}
    
