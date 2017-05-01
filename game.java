/**
 * Created by riyadh on 3/2/2017.
 */

import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        // Create a Random object.
        Random randomIntegers = new Random();
        //create scanning variables
        Scanner keyboard = new Scanner(System.in);
        Scanner question = new Scanner(System.in);
        Random lever = new Random();
        // Declare variables
        int bet, total = 0;
        int[] count = new int[3];
        while (true) {
            // promt user for bet
            System.out.println("Enter your bet");
            bet = keyboard.nextInt();
            for (int i = 0; i < 3; i++) {
                int x = lever.nextInt(6);

                //
                switch (x) {
                    case 0:
                        System.out.print("cherry ");
                        break;
                    case 1:
                        System.out.print("oranges ");
                        break;
                    case 2:
                        System.out.print("plums ");
                        break;
                    case 3:
                        System.out.print("bells ");
                        break;
                    case 4:
                        System.out.print("mellons ");
                        break;
                    case 5:
                        System.out.print("bars ");
                        break;
                    default:
                        break;
                }
                //create array to store the random numbers for lever
                count[i] = x;
                //System.out.println(x);
            }
            if (count[0] == count[1] || count[0] == count[2] || count[1] == count[2]) {
                total += 2*bet;
                System.out.println("you win: " + bet + " your total is: " + total);
                System.out.println("do you want to play another game ? yes/no");
                String ques = question.nextLine();
                if(ques.equalsIgnoreCase("yes")){
                    continue;
                }else{
                    System.out.println("your earned:" + total);
                    break;
                }
            }else if(count[0]==count[1] && count[1]==count[2] && count[0]== count[2]){
                total +=3*bet;
                System.out.println("you win: " + bet + " your total is: " + total);
                System.out.println("do you want to play another game ? yes/no");
                String ques = question.nextLine();
                if(ques.equalsIgnoreCase("yes")){
                    continue;
                }else{
                    System.out.println("your earned:" + total);
                    break;
                }
            }else{
                total -=bet;
                System.out.println("you lose "+ "your entered: "+ bet +  " you earned: "+ total + " bye");
                break;
            }
        }
    }
}

