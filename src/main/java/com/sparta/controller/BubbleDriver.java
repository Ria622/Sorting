package com.sparta.controller;

import com.sparta.model.RandomValues;

import java.util.Scanner;

public class BubbleDriver {
    public static void main(String[] args) {
        /*Bubblesort b = new Bubblesort();
        int[] nums = {23,23, 66,34,94};
        System.out.println(Arrays.toString(b.Sorta(nums)));

         */
        Bubblesort bs = new Bubblesort();
        QuickSort qs = new QuickSort();
        RandomValues rv = new RandomValues();

        //Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick which sorting algorithm you want to use" +
                            "1. Bubble Sort " +
                            "2. Quick Sort " +
                            "3. Binary Tree Sort ");
        String input = sc.nextLine();
        int option = Integer.parseInt(input);
        switch(option){
            case 1: //Bubble sort and the asks for data type used
                bs.sort(rv.randIn(100));
                break;
            case 2: //Quick Sort and the asks for data type used
                qs.sort(rv.randIn(100));
                break;
            case 3: //Binary Tree sort - not done
                break;
        }


    }

    public void dataType(int sorter){

    }

}
