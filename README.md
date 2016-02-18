#Sorts.java

# Introduction
This program sorts an array using BubbleSort in Java. BubbleSort (sinking sort) is a sort algorithm that reads through the array to be sorted and compares each pair of adjacent elements. After it compares the elements, it swaps them if they are in the wrong order. The program keeps reading through the list until no swaps are needed. When no swaps are needed, the list has been sorted. 
The array being sorted is hardcoded in my Main class.

# Implementation 
This program contains two classes; "Sorts.java" and "Main.java". "Sorts.java" contains all of the logical functions that actually do the sorting. "Main.java" contains the arrays to be sorted and calls on the Bubblesort objects from "Sorts.java"

## Sorts.java
There are two different implementations of the Bubblesort algorithm in this program. One is a recursive function called "bubbleSortRecursive". This function performs the sort by making use of the "bubbleDown" method. 
The "bubbleDown" function will recursively bubble down the largest element to the end of the array. This is a helper method that I call in "bubbleSortRecursive" to keep track of the starting and ending index.

In the second implementation of Bubblesort in "Sorts.java", it sorts the elements in the array iteratively using a nested IF statement in a FOR loop. The first and second elements are compared and swapped if out of order.  
Then the second and third elements are compared and swapped if out of order. This sorting process continues until the last two elements of the array are compared and swapped if out of order.

## Main.java
In my Main Class, I create an array of 10 integers and sort them using the iterative sort, using the "bubbleSort" Object (this sorts them iteratively, not recursively). 
Then I created another random array of 10 integers and sorted them using the recursive sort, with the "bubbleSortRecursive" function.

# How to run Sorts.java
I assume you have the Java Development Kit installed on your machine, so you will just run this like any other java program:
  1.  Open the command prompt in the directory containing "Main.java" and "Sorts.java".
  2.  Compile the Main class by typing: "javac Main.java" and hit enter in the command prompt.
  3.  Now that the program is compiled, run it by typing "java Main" and hit enter.



