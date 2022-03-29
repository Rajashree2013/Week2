package se.lexicon.rajashree;



import java.util.Scanner;
import java.util.Random;



public class Checknumber {



    public static void main(String[] args) {



        int maxRange = 10 ;
        int input = 0;



//create objects
        Scanner san = new Scanner(System.in);
        Random rand = new Random();



        int number = rand.nextInt(maxRange);



//logic to check the guess of the user and number of try



        for(int k=1; k<=10; k++)
        {
            System.out.println("Please enter your Guess : ");
            input = san.nextInt();
            if(input == number){
                System.out.println("Yes your guess is correct and your total guess is : "+k);
                break;
            }
            else if(input > number){
                System.out.println("Your Guess is too big ");
                continue;
            }
            if(input < number){
                System.out.println("our Guess is too small.... : ");
                continue;
            }



        }
    }
}