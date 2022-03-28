package se.lexicon.rajashree;

import java.util.Arrays;

public class UnevenNumbers {


        public static void main(String args[]) {
            int a[] = {1, 2, 4, 7, 9, 12};
            System.out.println("Array: " + Arrays.toString(a));


        for (int i = 0; i < a.length; i++) {

               // if(a[i] % 2 == 0){
                 //   System.out.println(a[i]);


                 if (a[i] % 2 != 0) {
                    System.out.println(a[i]);
                }


            }
        }}