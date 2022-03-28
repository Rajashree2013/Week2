package se.lexicon.rajashree;

public class TwoDimensionalStringArray {

    public static void main(String[]args) {
        int columns = 2;
        int rows = 2;


        String[][] st = new String[columns][rows];

        st[0][0] = "France";
        st[0][1] = "Paris";

        st[1][0] = "Sweden";
        st[1][1] = "Stockholm";

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(st[i][j]+" ");
            }
            System.out.print("\n");

        }
    }}