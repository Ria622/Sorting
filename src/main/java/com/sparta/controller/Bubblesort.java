package com.sparta.controller;

import java.util.ArrayList;

public class Bubblesort implements Sorting {




    @Override
    public int[] sort(int[] arr) {

        if(arr.length == 0){
            System.out.println("Array is empty");
        }

        int lenArray = arr.length;
        int temp;
        for(int i = 0; i < lenArray; i++){
            for(int j = 1; j < lenArray; j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;


    }

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> ar) {
        int[] newArray = {};
        for (int i=0; i<ar.size();i++){
            newArray[i] = ar.get(i);
        }
        sort(newArray);
        ArrayList<Integer> sorted = new ArrayList<>();
        for(int j=0; j < newArray.length; j++)
            sorted.add(newArray[j]);
        return sorted;

    }


}//end of class
