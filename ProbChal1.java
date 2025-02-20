import java.util.Scanner;

/**
 * ProbChal1 asks user for a number between 1 and 3 and displays what they are as Roman numerals. Part of Lab 3.
 *
 * @author Jordan Byrne
 * @version v1.0
 * @since 2/20/2025
 */
public class ProbChal1 {
    public static void main (String[] args){
        int input;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a number between 1 and 3: ");
        input = Integer.parseInt(keyboard.nextLine());
        
        switch(input){
            case 1:
                System.out.println("The number 1 written as a Roman numeral is I");
                break;
            case 2:
                System.out.println("The number 2 written as a Roman numeral is II");
                break;
            case 3:
                System.out.println("The number 3 written as a Roman numeral is III");
                break;
            default:
                System.out.println("The number entered was not in the valid range.");
        }
    }
}
