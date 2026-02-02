import java.util.Random;
import java.util.Scanner;

public class ludu {


    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numberOfDice;
        int total = 0;

        System.out.print("ENTER THE NUMBER OF TIMES YOU WANT TO ROLL THE DICE: ");
        numberOfDice = scanner.nextInt();

        for(int i = 1; i <= numberOfDice; i++){
           int myNum =  random.nextInt(1, 7);
            System.out.println(myNum);
            total += myNum;
        }
        System.out.println("the sum of the numbers i: " + total);




        scanner.close();


    }
}