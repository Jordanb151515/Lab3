import javax.swing.JOptionPane;

/**
 * ProbChal4 asks user for 3 test scores then finds the average and displays their letter grade. Part of Lab 3.
 *
 * @author Jordan Byrne
 * @version v1.0
 * @since 2/20/2025
 */
public class ProbChal4
{
    public static void main (String[] args){
        int test1, test2, test3;
        double avg;
        char grade;
        String temp;
       
        temp = JOptionPane.showInputDialog("Enter score for test 1: ");
        test1 = Integer.parseInt(temp);
        temp = JOptionPane.showInputDialog("Enter score for test 2: ");
        test2 = Integer.parseInt(temp);
        temp = JOptionPane.showInputDialog("Enter score for test 3: ");
        test3 = Integer.parseInt(temp);
        
        avg = (double)(test1 + test2 + test3)/3;
        
        if (avg >= 90){
            grade = 'A';
        }
        else if (avg >= 80){
            grade = 'B';
        }
        else if (avg >= 70){
            grade = 'C';
        }
        else if (avg >= 60){
            grade = 'D';
        }
        else {
            grade = 'F';
        }
     
        JOptionPane.showMessageDialog(null, String.format("The average grade is: %.1f\n",avg) +
                String.format("The letter grade is: %c", grade));
      
        System.exit(0);
    }
}
