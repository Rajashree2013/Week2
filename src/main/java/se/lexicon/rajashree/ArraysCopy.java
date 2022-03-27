package se.lexicon.rajashree;

import java.util.Arrays;

public class ArraysCopy {

    public static void main(String[] args) {


        int[] array1 = {1, 15, 20,};
        int[] array2 = Arrays.copyOf(array1, 3);

        System.out.print("\n Elements from first array: ");
        for(int num:array1)
        {
            System.out.print(num+" ");
        }



        System.out.print("\n Elements from second array:");
        for(int num:array2)
        {
            System.out.print(num+" ");
        }


    }
}
