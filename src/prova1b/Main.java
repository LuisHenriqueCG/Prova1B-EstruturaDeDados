package prova1b;


public class Main {
    public static void main (String args[]){
       BubbleSort executeBubbleSort = new BubbleSort();
       InsertionSort executeInsertionSort = new InsertionSort();
       SelectionSort executeSelectionSort = new SelectionSort();
       QuickSort executeQuickSort = new QuickSort();
       
            int vetorBubble1[] = {8,2,5,4,1,7};
            int vetorBubble2[] = {9,6,3,7,10,2};
       
            int vetorInsertion1[] = {10,14,13,12,11,9};
            int vetorInsertion2[] = {17,16,18,15,19,20};
        
            int vetorSelection1[] = {6,5,7,4,8,3};
            int vetorSelection2[] = {8,5,2,3,11,1};
        
            int vetorQuick1[] = {4,0,5,1,6,3};
            int vetorQuick2[] = {15,14,10,7,9,8};
            int n1 = vetorQuick1.length;
            int n2 = vetorQuick2.length;
            
       executeBubbleSort.algoritimoBubblesort(vetorBubble1);//O VETOR ESPERADO É:(1, 2, 4, 5, 7, 8)
       executeBubbleSort.algoritimoBubblesort(vetorBubble2);//O VETOR ESPERADO É:(2, 3, 6, 7, 9, 10)
       System.out.println();
       executeInsertionSort.algoritmoInsertionSort(vetorInsertion1);//O VETOR ESPERADO É:(9, 10, 11, 12, 13, 14) 
       executeInsertionSort.algoritmoInsertionSort(vetorInsertion2);//O VETOR ESPERADO É:(15, 16, 17, 18, 19, 20)
       System.out.println();
       executeSelectionSort. algoritmoSelectionSort(vetorSelection1);//O VETOR ESPERADO É:(3, 4, 5, 6, 7, 8) 
       executeSelectionSort.algoritmoSelectionSort(vetorSelection2);//O VETOR ESPERADO É:(1, 2, 3, 5, 8, 11)
       System.out.println();
       executeQuickSort.algoritmoQuickSort(vetorQuick1, 0, n1 - 1);//O VETOR ESPERADO É:(0, 1, 3, 4, 5, 6)
       executeQuickSort.printQuickSort(vetorQuick1);    
       executeQuickSort.algoritmoQuickSort(vetorQuick2, 0, n2 - 1);//O VETOR ESPERADO É:(7, 8, 9, 10, 14, 15)
       executeQuickSort.printQuickSort(vetorQuick2);
    }
    
}