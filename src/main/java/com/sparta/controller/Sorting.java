package com.sparta.controller;

import java.util.ArrayList;

public interface Sorting<T extends Comparable<? super T>> {

    public int[] sorta(int[] arr);
    public ArrayList<Integer> sort(ArrayList<Integer> ar);
    public T[] sortb(T[] array);

}
