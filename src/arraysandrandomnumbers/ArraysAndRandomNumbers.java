/*
 * Evan Robertson
 * October 29th 2018
 * Generates 10 random numbers between 1 and 100, calculates average, sum and max and min values
 */

package arraysandrandomnumbers;
import java.util.Scanner;

/**
 *
 * @author evrob0095
 */
public class ArraysAndRandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Variables
        String userInput;
        int total = 0;
        int max = 0;
        int min = 0;
        double average;
        
        //Array
        int [ ] numbers = new int [10];
        
        //Generate Random numbers and print on screen
        System.out.println("Generated Random Numbers:");
        
        for (int i = 0; i <= 9; i++)
        {
           int randomNumber = (int)Math.round(Math.random()*99+1);
           numbers[i] = randomNumber;
           System.out.println(numbers[i]);
        }
        
        System.out.println("What would you like to do?");
        System.out.println("1. Find sum of all numbers");
        System.out.println("2. Find average of all numbers");
        System.out.println("3. Find max and min value out of all numbers");
        System.out.println("4. Exit");
        userInput = input.nextLine();
        
        //Switch statement to determine which calculation the user wants to do
        switch (userInput) {
            case "1":
                //Use loops and arrays to calculate the sum of all the numbers
                System.out.println("Calculating Sum....");
                for (int i = 0; i <= 9; i = i + 1)
                {
                    total = total + numbers[i];
                }
                System.out.println("The total sum of all the numbers is " + total);
                break;
                
            case "2":
                //Use loops and arrays and division the calculate the average of all the numbers
                System.out.println("Calculating Average....");
                for (int i = 0; i <= 9; i = i + 1)
                {
                    total = total + numbers[i];
                }
                average = total / numbers.length;
                System.out.println("The average of all the numbers is " + average);
                break;
                
            case "3":
                //Use loops, arrays,and if statements to determine the highest and lowest values
                System.out.println("Calculating max and min values....");
                for (int i = 0; i <= 9; i = i + 1)
                {
                    if (i == 0) 
                    {
                        max = numbers[i];
                    }
                    if (i != 0) 
                    {
                        if (max < numbers[i]) 
                        {
                            max = numbers[i];
                        } else {
                        max = max;
                        }
                    }
                }
                
                
                for (int i = 0; i <= 9; i = i + 1)
                { 
                    if (i == 0) 
                    {
                    min = numbers[i];
                    }
                    if (i != 0) 
                    {
                        if (min > numbers[i]) 
                        {
                            min = numbers[i];
                        } else {
                        min = min;
                        }
                    }
                }
                System.out.println("The maximun and minimum values are " + max + " and " + min);
                break;
                
            default:
                //Close program
                System.exit(0);
                break;
        }
    }
}
