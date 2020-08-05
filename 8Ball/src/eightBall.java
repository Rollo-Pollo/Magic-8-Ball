import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class eightBall {
    //throws exception for the time unit.
    public static void main(String[] args) throws InterruptedException {

        //Repeat checker to loop the program
        boolean repeat = true;

        //Do this at least once while repeat is true
        do {
            System.out.println("Welcome to Magic 8 ball, Please ask you're question and recieve your fortune");

            //Stores the value of the scanner and the random
            Scanner scan = new Scanner(System.in);
            String question = scan.nextLine();
            Random rand = new Random();


            //This choses a random number between 1-8.
            int fortune = rand.nextInt(8);

            System.out.println("");
            System.out.println("Calculating your fortune...");
            System.out.println("");

            //Time unit makes a delay, in this case for 2 seconds.
            TimeUnit.SECONDS.sleep(2);

            //Switch statment determines what the fortune will be.
            switch (fortune) {
                case 0:
                    System.out.println("Yes!");
                    break;
                case 1:
                    System.out.println("Never going to happen");
                    break;
                case 2:
                    System.out.println("I like turtles!");
                    break;
                case 3:
                    System.out.println("Guaranteed!");
                    break;
                case 4:
                    System.out.println("Error 404 not found. ");
                    break;
                case 5:
                    System.out.println("Sure?");
                    break;
                case 6:
                    System.out.println("Of course");
                    break;
                case 7:
                    System.out.println("Unsure");
                    break;
            }

            //Asks user to test their fortune again
            System.out.println("");
            System.out.println("Test your fortune again? yes or no?");

            //Another scanner for the program to know if they want to try again
            Scanner scanF = new Scanner(System.in);
            String scanForRepeat = scanF.nextLine();

            if (scanForRepeat.equals("yes")) {
                repeat = true;
            } else if (scanForRepeat.equals("no")) {
                repeat = false;
            } else {
                System.out.println("Unknown answer, terminating program!");
                repeat = false;
            }

        }while (repeat);

    }
}

