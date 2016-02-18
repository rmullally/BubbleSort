import java.util.*;

public class Main {

    public static void main(String[] args) {
        // TODO
        // Create a random array of 10 integers and sort
        // them using the iterative sort. 
        // Then create another random array of 10 integers
        // and sort them using the recursive sort. 
        // Both sorted arrays should be printed to the screen.
        
        //iterative bubbleSort:
        
        int[] x = {3, 1, 5, 9, 18, 4, 21, 147, 92, 31};
        Sorts mySorts = new Sorts();
        mySorts.bubbleSort(x);
        for(int i = 0; i < x.length; i++){
            System.out.print(x[i] + ", ");
        }
        
        //recursive bubblSsort:
        
        int[] y = {99, 37, 19, 36, 1, 5, 57, 9, 15, 103};
        mySorts.bubbleSortRecursive(y);
        for(int j = 0; j < y.length; j++){
            System.out.println(y[j]);
        }
    }
}
