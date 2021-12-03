package com.sparta.bubble;

import java.util.ArrayList;

public class QuickSort implements Sorting {



    @Override
    public int[] sort(int[] arr) {
        sortingQ(arr, 0, arr.length-1);
        return arr;
    }

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> ar) {
        int[] newArray = new int[ar.size()];
        for (int i=0; i<ar.size();i++){
            newArray[i] = ar.get(i);
        }
        sortingQ(newArray, 0, newArray.length-1);
        ArrayList<Integer> sorted = new ArrayList<>();
        for(int j=0; j < newArray.length; j++)
            sorted.add(newArray[j]);
        return sorted;
    }

    private int[] sortingQ(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            sortingQ(arr, begin, partitionIndex-1);
            sortingQ(arr, partitionIndex+1, end);
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
}
