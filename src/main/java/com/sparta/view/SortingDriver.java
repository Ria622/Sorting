package com.sparta.view;

import com.sparta.controller.BinaryTreeSort;
import com.sparta.controller.Bubblesort;
import com.sparta.controller.QuickSort;
import com.sparta.model.Logger1;
import com.sparta.model.RandomValues;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;


public class SortingDriver <T extends Comparable<? super T>>   {
    public static final Logger logger = LogManager.getLogger("Binary Tree Sort ");
    //private static Comparable[] genericArray1;
    //private static T[] genericArray1;
    public T[] genericArray = (T[]) new Object[5];
    private T[] genericArray1 = (T[]) IntStream.of(38,28,10,39).boxed().toArray();

    public static <T> T[] genericMethod1(List<T> input){
        T[] res = (T[]) new Object[input.size()];
        int i=0;
        for(T t : input){
            res[i] = t;
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        /*Bubblesort b = new Bubblesort();
        int[] nums = {23,23, 66,34,94};
        System.out.println(Arrays.toString(b.Sorta(nums)));
         */

        Bubblesort<Integer> bs = new Bubblesort<>();
        QuickSort qs = new QuickSort();
        BinaryTreeSort bts = new BinaryTreeSort();
        RandomValues rv = new RandomValues();
        Logger1 logger2 = new Logger1();//Singleton Pattern

        Scanner sc = new Scanner(System.in);
        System.out.println("Pick which sorting algorithm you want to use " +
                "1. Bubble Sort int[]" +
                "2. Quick Sort int[]" +
                "3. Binary Tree Sort int[]"+
                "4.Bubble Sort ArrayList<Integer>" +
                "5. Quick Sort ArrayList<Integer>" +
                "6.Binary Tree Sort ArrayList<Integer>" +
                "7.Bubble Sort T[]" +
                "8. Quick Sort T[]" +
                "9.Binary Tree Sort T[]");
        String input = sc.nextLine();
        int option = Integer.parseInt(input);
        if(option == 1){
            bs.sorta(rv.randIn(5));
        }else if(option ==2){
            qs.sorta(rv.randIn(5));
        }else if(option ==3){
            //bts.sorta();
        }else if(option ==4){
            bs.sort(rv.randInAL(5));
        }else if(option ==5){
            qs.sort(rv.randInAL(5));
        }else if(option ==6){
            //bts.sort();
        }else if(option ==7){
            //bs.sortb();
        }else if(option ==8){
            //qs.sortb();
        }else if(option ==9){
            //bts.sortb();
        }else{
            logger2.logError("Incorrect input");
        }


        /*
        bts.sorta(rv.randIn(5));
        //Bubble
        //bs.sorta(rv.randIn(5));
        //bs.sort(rv.randInAL(5));
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addFirst(3);
        list.add(4);
        list.add(1);
        list.add(7);
        Integer[] i = (Integer[]) genericMethod1(list);
        bs.sortb(i);



        //Quicksort

        //qs.sorta(new int[]{1, 5, 3, 66, 2});
        //qs.sort(rv.randInAL(5));

        //bts

        bts.sort(rv.randInAL(5));



         */




        /* String type = "Pick between " +
                "1. Int Array " +
                "2. ArrayList<Integer> " +
                "3. Generic Array";
        //rv.randIn(5);
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick which sorting algorithm you want to use " +
                            "1. Bubble Sort " +
                            "2. Quick Sort " +
                            "3. Binary Tree Sort ");

        String input = sc.nextLine();
        int option = Integer.parseInt(input);
        switch(option){
            case 1: //Bubble sort and the asks for data type used
                System.out.println(type);
                String input1 = sc.nextLine();
                int option1 = Integer.parseInt(input);
                if(option1 == 1){bs.sorta(rv.randIn(5));}
                else if (option1 == 2){bs.sort(rv.randInAL(5));}
                else if (option1 == 3) {
                    //int[] arr = new int[]{4,12,4,5,2}; ////////////////////
                    //logger.info(bs.sortb(genericArray1));
                    LinkedList<Integer> list = new LinkedList<Integer>();
                    list.addFirst(3);
                    list.add(4);
                    list.add(1);
                    list.add(7);
                    Integer[] i = (Integer[]) genericMethod1(list);
                    bs.sortb(i);
                    break;
                }else{
                    logger2.logError("Incorrect input");
                }
            case 2: //Quick Sort and the asks for data type used
                System.out.println(type);
                String input2 = sc.nextLine();
                int option2 = Integer.parseInt(input);
                switch(option2){
                    case 1:
                        qs.sorta(new int[]{1, 5, 3, 66, 2});
                        break;
                    case 2:
                        qs.sort(rv.randInAL(5));
                        break;
                    case 3:
                        int[] arr = new int[]{4,12,4,5,2}; ///////////////
                        //qs.sortb(arr);
                        break;
                    default:
                        logger2.logError("Incorrect input");
                        break;
                }
                break;
            case 3: //Binary Tree sort - not done
                System.out.println(type);
                String input3 = sc.nextLine();
                int option3 = Integer.parseInt(input);
                //bts.add
                switch(option3){
                    case 1:
                        bts.sorta(rv.randIn(5));
                        break;
                    case 2:
                        bts.sort(rv.randInAL(5));
                        break;
                    case 3:
                        //int[] arr = new int[]{4,12,4,5,2};
                        //bts.sortb(arr); ///////////////////////////////
                        break;
                    default:
                        logger2.logError("Incorrect input");
                        break;
                }
                break;
        } */
    }





}
