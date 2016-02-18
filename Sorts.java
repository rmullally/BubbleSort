public class Sorts {

    public static void bubbleSort(int[] array) {
        
        // PSUEDOCODE FOR BUBBLESORT
        // ALGORITHM BubbleSort(A[1..n])
        //    FOR i <- 1 TO n - 1 LOOP
        //       FOR j <- 1 TO n - 1 - i LOOP
        //          IF A[j] > A[j + 1] THEN
        //             Swap(A[j], A[j + 1])
       for(int j = 0; j < array.length; j++){
           for(int i = 0; i < array.length - 1 - j; i++){
               if(array[i] > array[i + 1]) {
               int temp = array[i];
               array[i] = array [i + 1];
               array[i + 1] = temp;
               }   
           }
       }
    }

    public static void bubbleSortRecursive(int[] array) {
        bubbleSortRecursive(array, 0, array.length - 1);
    }

    private static void bubbleDown(int[] array, int start, int end) {

         if(start < end){
           
           if(array[start] > array[start + 1]){
               int temp = array[start];
               array[start] = array[start + 1];
               array[start + 1] = temp;
           }
           bubbleDown(array, start + 1, end);
    }
}    

    private static void bubbleSortRecursive(int[] array, int start, int end) {
            if(start == end) {   //base case
            start = end;
        }
        
        else {
        bubbleDown(array, 0, end);
        bubbleSortRecursive(array, start + 1, end);
        }
    }
}
