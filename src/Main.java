import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int val = generator.nextInt(10) + 1;
        int guess;
        String trash;

        System.out.print("Try to guess the number 1-10: ");
        if(in.hasNextInt())
        {
            guess = in.nextInt();
            in.nextLine();
            if(guess >= 1 && guess <= 10){
                if(guess > val){
                    System.out.println("You guessed too high. The number was " + val);
                } else if (guess < val) {
                    System.out.println("You guessed too low. The number was " +val);
                } else {
                    System.out.println("You guessed the right number! It was " + val);
                }
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid input.");
                System.exit(0);
            }

        } else {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid input.");
            System.exit(0);
        }

    }
}