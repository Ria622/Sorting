package com.sparta.controller;

import com.sparta.model.Logger1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort<T extends Comparable<? super T>>  implements Sorting<T>{

    public static final Logger logger = LogManager.getLogger(" Quicksort ");
    Logger1 logger2 = new Logger1();//Singleton Pattern

    @Override
    public int[] sorta(int[] arr) {
        long startTime = System.nanoTime();

        logger.info("Array of ints before: " + Arrays.toString(arr));
        //logger.log(Level.INFO,arr);
        sortingQ(arr, 0, arr.length-1);
        long endTime = System.nanoTime();
        logger.info("Array of ints sorted: " + Arrays.toString(arr)
                + "Time take in nanoseconds: " + (endTime-startTime));
        logger2.logSortTime(" QuickSort Int Array ",(endTime-startTime));//Singleton Pattern
        return arr;
    }

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> ar) {
        long startTime = System.nanoTime();
        int[] newArray = new int[ar.size()];
        for (int i=0; i<ar.size();i++){
            newArray[i] = ar.get(i);
        }
        logger.info("ArrayList<Integer> before: " + Arrays.toString(newArray));
        sortingQ(newArray, 0, newArray.length-1);
        logger.info("ArrayList<Integer> sorted: " + Arrays.toString(newArray));
        ArrayList<Integer> sorted = new ArrayList<>();
        for(int j=0; j < newArray.length; j++)
            sorted.add(newArray[j]);
        long endTime = System.nanoTime();
        logger.info("Time take in nanoseconds:" + (endTime-startTime));
        logger2.logSortTime("QuickSort Int ArrayList",(endTime-startTime));//Singleton Pattern
        return sorted;
    }

    private int[] sortingQ(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            sortingQ(arr, begin, partitionIndex-1);
            sortingQ(arr, partitionIndex+1, end);
            //for indexing purposes there has been adding and subtracting for partitionIndex
        }
        return arr;
    }
    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);
        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;
        return i+1;
    }

    @Override
    public T[] sortb(T[] array){
        long startTime = System.nanoTime();
        logger.info("Array of ints before: " + Arrays.toString(array));
        sortingT(array, 0, array.length-1);
        long endTime = System.nanoTime();
        logger.info("Array of ints sorted: " + Arrays.toString(array)
                + "Time take in nanoseconds:" + (endTime-startTime));
        logger2.logSortTime("QuickSort Generic Array",(endTime-startTime));//Singleton Pattern
        return array;
    }

    private T[] sortingT(T[] arr, int first, int last) {
        if (first < last) {
            int partitionIndex = partitionT(arr, first, last); //getting the pivot's index within the new sorted array
            sortingT(arr, first, partitionIndex-1);
            sortingT(arr, partitionIndex+1, last);
        }
        return arr;
    }

    private int partitionT(T[] arr, int first, int last) {
        T pivot = arr[last]; //taking the end element of T[] as pivot
        first--; //first will be 1 but we want the first element/val of the array
        last++;


        while(true){
            do{
                first++; //iterating through arr[].
            }while(arr[first].compareTo(pivot) <= 0); //if arr[first]>pivot the statement will be false
            //does this until there is a larger number ar arr[first]
            do{
                last--;
            } while(arr[last].compareTo(pivot) > 0); //if arr[last]<=pivot, the statement will be false
            if(first >= last){
                return last;
            }
            T swapTemp = arr[first];
            arr[first] = arr[last];
            arr[last] = swapTemp;
            //swapping these numbers as the higher val is on the left of the arr
            //and lower val on the right of arr
            //we want left of pivot in arr to be lower than pivot
            //and right of pivot in arr to be higher than pivot
        }
/*
                Ignore this, I'm still trying to find a way to do it this way

        for (int j = first; j < last; j++) {   //for loop to go through the whole array until the pivot is in the correct place
            if (arr[j].compareTo(pivot) > 0 ) { //checks to see if the current val of j(in arr) is larger than the pivot
                //if true: assigns the smaller val(of j in arr[]) to the position at i which starts at the beggining of the array
                // this is then populated and moves onto the next position of i in the array as it is incremented below
                i++;
                T swapTemp = arr[i]; //moves what is already in arr[i] at a temp val
                arr[i] = arr[j]; //assigning the smaller or equal val to the beggining of the arr[]
                arr[j] = swapTemp; //assigning the original val at arr[i] to the next
            }
        }
*/

    }//end of method "patitionT"

}//end of class
