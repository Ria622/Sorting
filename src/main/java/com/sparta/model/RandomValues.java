package com.sparta.model;

import java.util.ArrayList;
import java.util.Random;

public class RandomValues {


    public int[] randIn(int size) {
        Random rand = new Random();
        int[] generated_arr = new int[size];
        for (int i=0; i<size; i++) {
            int input = rand.nextInt(100);  // generates a random integer within the given range (0-100) and stores in integer var "input"
            generated_arr[i] = input;
        }
        return generated_arr;
    }

    public ArrayList<Integer> randInAL(int size){
        Random rand = new Random();
        ArrayList<Integer> generated_arr = new ArrayList<>();
        for (int i=0; i<size; i++) {
            int input = rand.nextInt(100);  // generates a random integer within the given range (0-100) and stores in integer var "input"
            generated_arr.add(input);
        }
        return generated_arr;
    }



}
