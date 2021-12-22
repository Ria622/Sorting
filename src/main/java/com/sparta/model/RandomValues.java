package com.sparta.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomValues <T extends Comparable<? super T>> {
    private Random rand = new Random();

    public int[] randIn(int size) {
        //This way is more lines of code than the line of code not commented out
        //This way works
        /*
        int[] generated_arr = new int[size];
        for (int i=0; i<size; i++) {
            int input = rand.nextInt(100);  // generates a random integer within the given range (0-100) and stores in integer var "input"
            generated_arr[i] = input;
        }
         */
        int[] generated_arr = rand.ints(0,100).limit(size).toArray();
        //  System.out.println(generated_arr.toString());
        //generated_arr.forEach(s -> System.out.println(s));
       // for(int i=0; i<size;i++)
         //   System.out.println(generated_arr[i]);
        return generated_arr;
    }

    public ArrayList<Integer> randInAL(int size){
        //Random rand = new Random();
        ArrayList<Integer> generated_arr = new ArrayList<>();
        for (int i=0; i<size; i++) {
            int input = rand.nextInt(100);  // generates a random integer within the given range (0-100) and stores in integer var "input"
            generated_arr.add(input);
        }
        return generated_arr;
    }

    /*
    public T[] randGenericsInts(int size){
        //T[] array = (T[]) IntStream.of();
        Array<Integer> genericsArr = new Array<>(size); //using the class "Array"
        for(int i=0; i<size;i++)
            genericsArr.set(i, i* rand.nextInt(11));
        System.out.println(genericsArr);
        //return genericsArr;
    }

    public T[] randGenericsString(int size){
        Array<String> genericsArr = new Array<>(size); //using the class "Array"
        for(int i=0; i<size;i++)
            genericsArr.set(i, String.valueOf((char)(i+97)));
        System.out.println(genericsArr);
    }

     */




}

class Array<T>{
    private final Object[] obj_array;
    public final int length;
    public Array(int length){
        obj_array = new Object[length];
        this.length = length;
    }

    T get(int i){
        @SuppressWarnings("unchecked")
        final T t = (T)obj_array[i];
        return t;
    }

    void set(int i,T t){
        obj_array[i] = t;
    }

    @Override
    public String toString(){
        return Arrays.toString(obj_array);
    }
}