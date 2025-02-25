import java.util.Scanner;

/**
 * This program takes input of a date by user and returns if the date is valid and the reason if it is not. Part of Lab 3.
 *
 * @ Jordan Byrne
 * @ version v1.0
 * @ since 2/25/25
 */

public class ValidDate { 
    public static void main (String[] args){
        int month, day, year;
        String output = "";   //tells why date isn't valid, has to be intialized
        String temp;
        boolean isValid = false;

        Scanner keyboard = new Scanner(System.in);
        keyboard.useDelimiter("/");

        System.out.print("Enter a date in mm/dd/yyyy format: ");
        month = keyboard.nextInt();
        day = keyboard.nextInt();
        temp = keyboard.nextLine().substring(1); //take rest of string starting after / , can't use nextInt because of delimiter
        year = Integer.parseInt(temp);

        ////Section 1, day is less than 1
        if (day < 1)
            output = "There cannot be less than 1 day in a month.";
        ////Section 2, day is larger than 31
        else if (day > 31)
            output = "There cannot be more than 31 days in any month.";
        ////Section 3, btw 1 and 31 days,
        else{  //day is in valid range
            switch(month){
                    //Cases for all 31 day months
                case 1: case 3: case 5: case 7: case 8: case 10: case 12: {
                        //fill in other cases for months with 31 days
                        isValid = true;
                        break;
                    }
                    //Cases for all 30 day months
                case 4: case 6: case 9: case 11: {
                        if(day <=30) 
                            isValid = true;
                        else
                            output = "This month only has 30 days in it.";
                        break;
                    }
                    //February
                case 2:
                    boolean isLeapYear = false;
                    if(year%400==0 || (year%4==0&&!(year%100==0)))
                        isLeapYear = true;
                    if (isLeapYear){ 
                        if(day <=29) 
                            isValid = true;
                        else
                            output = "February does not have more than 29 days during a leap year.";
                    }
                    else{ ////non-leap year
                        if(day <=28) 
                            isValid = true;
                        else
                            output = "February does not have more than 28 days during a non-leap year.";
                    }
                    break;

                default:
                    output = "Valid months must be between 1 and 12.";
            }
        }
        //// Output section 
        if (isValid) 
            System.out.println(month + "/" + day + "/" + year + " is a valid date.");
        else
            System.out.println(month + "/" + day + "/" + year + " is not a valid date. " + output);
    }////end main
}////end class
