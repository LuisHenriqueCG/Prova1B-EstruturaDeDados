package prova1b;


public class QuickSort {

    int countVezes = 1;
    int i;

    void algoritmoQuickSort(int lista[], int inicio, int fim) {
        int n = lista.length;

        if (inicio < fim) {
            int indicePivo = partition(lista, inicio, fim);
            algoritmoQuickSort(lista, inicio, indicePivo - 1);
            algoritmoQuickSort(lista, indicePivo + 1, fim);
        }
    }

    void printQuickSort(int lista[]) {
                                                 //  dados resultantes
                int n = lista.length;
                if (countVezes == 1) {
                                                 //mostrando na tela

            countVezes++;
        }
                System.out.print("QuickSort: ");
            System.out.print("Vetor Ordenado: ");
        System.out.print("[");
        for (i = 0; i < n; i++) {
            System.out.print(" " + lista[i] + " ");
        }
        System.out.println("];");
    }

    int partition(int lista[], int inicio, int fim) {
        int pivo = lista[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (lista[i] <= pivo) {
                i++;
            } else if (pivo < lista[f]) {
                f--;
            } else {
                int troca = lista[i];
                lista[i] = lista[f];
                lista[f] = troca;
                i++;
                f--;
            }
        }
        
        // troca pivot (values[left]) com f.
        lista[inicio] = lista[f];
        lista[f] = pivo;
        return f;
    }
}