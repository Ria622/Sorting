package com.sparta.controller;

import com.sparta.model.Logger1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;

public class BinaryTreeSort<T extends Comparable<? super T>>  implements Sorting<T> {

    public static final Logger logger = LogManager.getLogger("Binary Tree Sort ");
    Logger1 logger2 = new Logger1();//Singleton Pattern
    BinaryTree tree = new BinaryTree();
    BinaryTreeG treeG = new BinaryTreeG();

    //All Binary tree sort methods are completed in "IN ORDER TRAVERSAL"//

    @Override
    public int[] sorta(int[] arr) {
        long startTime = System.nanoTime();
        logger.info("Array of ints before: " + Arrays.toString(arr));


        for (int j = 0; j < arr.length; j++)
            tree.addNode(arr[j]);
        tree.inOrderTraverseT(tree.root);
        int[] array = tree.getsorted();
        long endTime = System.nanoTime();
        logger.info("Array of ints sorted: " + Arrays.toString(array)
                + "Time take in nanoseconds:" + (endTime - startTime));
        logger2.logSortTime("Binary Tree Sort Int Array", (endTime - startTime));//Singleton Pattern
        return new int[0];
    }

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> ar) {
        long startTime = System.nanoTime();

        //code for binary tree sort goes here

        int[] newArray = new int[ar.size()];
        for (int i = 0; i < ar.size(); i++) {
            newArray[i] = ar.get(i);
        }
        logger.info("ArrayList<Integer> before: " + Arrays.toString(newArray));

        for (int j = 0; j < newArray.length; j++)
            treeG.insert(newArray[j]);
        treeG.inOrder(treeG.getRoot());


        long endTime = System.nanoTime();
        logger.info("ArrayList<Integer> sorted: " + Arrays.toString(newArray)
                + "Time take in nanoseconds:" + (endTime - startTime));
        logger2.logSortTime("Binary Tree Sort Int ArrayList", (endTime - startTime));//Singleton Pattern
        return null;
    }

    @Override
    public T[] sortb(T[] array) {
        long startTime = System.nanoTime();
        logger.info("Array of ints before: " + array);
        //code for binary tree sort goes here


        long endTime = System.nanoTime();
        logger.info("Array of ints sorted: " + array
                + "Time take in nanoseconds:" + (endTime - startTime));
        logger2.logSortTime("QuickSort Generic Array", (endTime - startTime));//Singleton Pattern

        return null;
    }

    /*class Node{
        T k;
        Node left; //child node, smaller than parent
        Node right;//child node, greater than parent

        public Node(T item) {
            k = item;
            left = right = null;
        }

        //void Node(T item){
        //  k = item;
        //left = right = null;
        //}

        public String toString(){
            return  "key: " + k;
        }
    }//end of class

     */
}




class Node{
    int key;
    //String name;
    Node left;
    Node right;

    Node(int key){
        this.key = key;
        //  this.name = name;
    }

    public String toString(){
        return  "key: " + key;
    }
}



