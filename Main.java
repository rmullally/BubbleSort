public class Sorts {

    public static void bubbleSort(int[] array) {
        // TODO
        // Convert the pseudocode to Java code for
        // the bubble sort.
        //
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
        // This is a convenience function so that users of your 
        // library do not need to type the start/end bounds of
        // the array. Do NOT change or remove this code, or the
        // submission tests will fail.
        bubbleSortRecursive(array, 0, array.length - 1);
    }

    private static void bubbleDown(int[] array, int start, int end) {
        // TODO
        // This method should recursively bubble down the largest
        // element to the end of the array. (Think of this as
        // doing the same job as the inner FOR loop in the 
        // iterative version.) This is a helper method that you
        // should call in the appropriate place in
        // bubbleSortRecursive.
        //
        // Do NOT use loops in this method.
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
        // TODO
        // This method should perform the sort by making use
        // of the bubbleDown method.
        //
        // Do NOT use loops in this method.
            if(start == end) {   //base case
            start = end;
        }
        
        else {
        bubbleDown(array, 0, end);
        bubbleSortRecursive(array, start + 1, end);
        }
    }
}
