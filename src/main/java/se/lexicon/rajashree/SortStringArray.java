package se.lexicon.rajashree;

import java.util.Arrays;

public class SortStringArray {

    public static void main(String[] args) {

        String[] names = {"Paris", "London", "New York", "Stockholm"};


        Arrays.sort(names);
        System.out.print("[");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.print("]");
    }

}
