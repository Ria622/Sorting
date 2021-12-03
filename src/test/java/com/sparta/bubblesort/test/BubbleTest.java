package com.sparta.bubblesort.test;

import com.sparta.bubble.Bubblesort;
import com.sparta.bubble.QuickSort;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleTest {

    /*@Test
    public void TestForFiveInts(){
        int[] intArray = {22,766,34,98,1};
        Bubblesort b = new Bubblesort();
        int[] actual = {1,22,34,98,766};
        assertEquals(intArray, actual);
    }

     */

    @Test
    public void TestForThreeIntsQuicksort(){
        int[] intArr = {38,614,83};
        QuickSort q = new QuickSort();
        q.sort(intArr);
        int[] actual = {38,83,614};
        //assertEquals(Arrays.toString(intArr), Arrays.toString(actual));
        assertArrayEquals(intArr, actual);
        //instead of using Arrays.toString()
    }

    @Test
    public void TestForThreeIntsBubble(){
        int[] intArr = {38,614,83};
        Bubblesort b = new Bubblesort();
        b.sort(intArr);
        int[] actual = {38,83,614};
        //assertEquals(Arrays.toString(intArr), Arrays.toString(actual));
        assertArrayEquals(intArr, actual);
    }

    @Test
    public void TestForArrayListThree(){
        ArrayList<Integer> a = new ArrayList<>(List.of(74,93,11));
        QuickSort qs = new QuickSort();
        ArrayList<Integer> actual = qs.sort((ArrayList<Integer>) a);
        System.out.println(actual);
        ArrayList<Integer> expected = new ArrayList<>(List.of(11,74,93));
        assertEquals(expected, actual );
    }

    @Test
    public void TestForArrayListBubble(){
        ArrayList<Integer> a = new ArrayList<>(List.of(72,95,33));
        Bubblesort bs = new Bubblesort();
        ArrayList<Integer> actual = bs.sort((ArrayList<Integer>) a);
        System.out.println(actual);
        ArrayList<Integer> expected = new ArrayList<>(List.of(33,72,95));
        assertEquals(expected, actual);

    }
}
