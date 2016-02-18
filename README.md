#Sorts.java

# Introduction
This program sorts an array using BubbleSort in Java. BubbleSort (sinking sort) is a sort algorithm that reads through the array to be sorted and compares each pair of adjacent elements. After it compares the elements, it swaps them if they are in the wrong order. The program keeps reading through the list until no swaps are needed. When no swaps are needed, the list has been sorted. 

# Implementation 
I implemented the bubble sort algorithm in two ways: recursively and iteratively.
This program contains two classes; "Sorts.java" and "Main.java". "Sorts.java" contains all of the logical functions that actually do the sorting. "Main.java" contains the arrays to be sorted and calls on the Bubblesort objects from "Sorts.java"

## Sorts.java
### Methods:
*  public static void bubbleSort(int[] array): sorts the elements in the array iteratively using a nested IF statement in a FOR loop. The int array is hardcoded in my Main class. 
*  public static void bubbleSortRecursive(int[] array): this is a convenience function so that users of the "library" do not need to type the start/end bounds of the array. 
*  private static void bubbleDown(int[] array, int start, int end): This method will recursively bubble down the largest element to the end of the array. This is a helper method that I call inin bubbleSortRecursive.
*  private static void bubbleSortRecursive(int[] array, int start, int end): This method sorts the array recursively using the bubbleDown method for the start and end index.

## Main.java
In my Main Class, I create an array of 10 integers and sort them using the iterative sort, using the "bubbleSort" Object (this sorts them iteratively, not recursively). 
Then I created another random array of 10 integers and sorted them using the recursive sort, with the "bubbleSortRecursive" function.

# How to run Sorts.java
I assume you have the Java Development Kit installed on your machine, so you will just run this like any other java program:
  1.  Open the command prompt in the directory containing "Main.java" and "Sorts.java".
  2.  Compile the Main class by typing: "javac Main.java" and hit enter in the command prompt.
  3.  Now that the program is compiled, run it by typing "java Main" and hit enter.

##Input/Output
Create an int array in the main class. Call the bubbeSort or bubbleSortRecursive function then iterate through the array you created with a FOR loop to get the output to the command line. 

