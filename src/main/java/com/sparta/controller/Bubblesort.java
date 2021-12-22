package com.sparta.controller;

import com.sparta.model.Logger1;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;


public class Bubblesort<T extends Comparable<? super T>>  implements Sorting<T> {

    public static final Logger logger = LogManager.getLogger("Bubblesort");
    Logger1 logger2 = new Logger1();//Singleton Pattern

    @Override
    public int[] sorta(int[] arr) {
        long startTime = System.nanoTime();
        logger.info("Array of ints before: " + Arrays.toString(arr));
        //logger.log(Level.INFO,arr);
        if (arr.length == 0) {
            System.out.println("Array is empty");
        }

        int lenArray = arr.length;
        int temp;
        for (int i = 0; i < lenArray; i++) {
            for (int j = 1; j < lenArray; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        long endTime = System.nanoTime();
        logger.info("Array of ints sorted: " + Arrays.toString(arr)
                    + " Time take in nanoseconds :" + (endTime-startTime));
        logger2.logSortTime(" QuickSort Int Array ",(endTime-startTime));
        logger.log(Level.INFO,Arrays.toString(arr));
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
        if (newArray.length == 0) {
            System.out.println("Array is empty");
        }
        int lenArray = newArray.length;
        int temp;
        for (int i = 0; i < lenArray; i++) {
            for (int j = 1; j < lenArray; j++) {
                if (newArray[j - 1] > newArray[j]) {
                    temp = newArray[j - 1];
                    newArray[j - 1] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }
        logger.info("ArrayList<Integer> sorted: " + Arrays.toString(newArray));
        ArrayList<Integer> sorted = new ArrayList<>();
        for(int j=0; j < newArray.length; j++)
            sorted.add(newArray[j]);
        long endTime = System.nanoTime();
        logger.info(" Time take in nanoseconds:" + (endTime-startTime));
        logger2.logSortTime("QuickSort Int Array",(endTime-startTime));
        return sorted;
    }

    @Override
    public T[] sortb(T[] array){
        long startTime = System.nanoTime();
        T buffer;
        T entered[] = array;
        logger.info("ArrayList<Integer> before: " + Arrays.toString(entered));
        T sorted[] = array;
        for (int i = 0; i < entered.length; i++)
            for (int j = 0; j < entered.length-i-1; j++)
                try {
                    if (entered[j].compareTo(entered[j + 1]) > 0) {
                        //so.add()
                        //how to get a value form a list to add to another list
                        buffer = entered[j + 1];
                        sorted[j + 1] = entered[j];
                        sorted[j] = buffer;
                    }
                }catch(IndexOutOfBoundsException|ClassCastException e){
                    //System.out.println("Bubblesort completed within" + (endTime-startTime));
                    System.out.println("ooopps");
                    e.printStackTrace();
                }
        System.out.println(Arrays.toString(sorted));
        //System.out.println(Arrays.);
        long endTime = System.nanoTime();
        logger.info("ArrayList<Integer> sorted: " + Arrays.toString(sorted)
                + "Time take in nanoseconds:" + (endTime-startTime));
        logger2.logSortTime("QuickSort Int Array",(endTime-startTime));
        System.out.println(Arrays.toString(sorted));
        return sorted;
    }



}//end of class
