import java.util.Scanner;

/**
 * This application sorts inputed numbers from smallest to largest. Part of Lab 3.
 * 
 * @author Jordan Byrne
 * @version v1.0
 * @since 2/18/2025
 */

public class Sorting
{
    public static void main (String[] args){
        int n1, n2, n3, low, med, high;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a non-negative number: ");
        n1 = keyboard.nextInt();
        System.out.println("Enter another number: ");
        n2 = keyboard.nextInt();
        System.out.println("Enter a last number: ");
        n3 = keyboard.nextInt();

        //When n1 is smallest 
        if ((n1<=n2) && (n1<=n3)){
            low = n1;
            if (n2<=n3){
                med = n2;
                high = n3;
            }
            else{
                med = n3;
                high = n2;
            }
        }

        else if (n2<=n3) { //n2 is smallest
            low = n2; 
            if (n1<=n3){
                med = n1;
                high = n3;
            }
            else{
                med = n3;
                high = n1;
            }
        }
        else { //n3 is the smallest
            low = n3; 
            if (n1<=n2){
                med = n1;
                high = n2;
            }
            else{
                med = n2;
                high = n1;
            }
        }
        System.out.println("The inputs sorted smallest to largest are: "+low+", "+med+", "+high);
    }
}
