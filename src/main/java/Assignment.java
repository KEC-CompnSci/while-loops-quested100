
import java.util.Scanner;

public class Assignment {
    // DO NOT MODIFY THIS SCANNER
    // This will be used to autograde your solution
    public static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
      String repeated = repeatWord("hello", 9);
      System.out.println(repeated);
      String pyramid = createPyramid(6);
      String FizzBuzz = countTo(3);
      System.out.println(pyramid);
      
    }
    
    /**
     * Exercise 1: Word Repeater
     * Repeat the provided word the specified number of times
     * Example: word="hello" times=3 → "hello hello hello"
     */
    public static String repeatWord(String word, int times) {
       
        // TODO: Implement this method
        // Use a while loop to build a string that repeats the word
        // Words should be separated by single spaces
        // No trailing space at the end
        String prab = "";

        while (times != 0){
            prab = prab + word + "";
            times -=1;
            
        }

        

        return prab;

    
    }
    
    /**
     * Exercise 2: Number Pyramid
     * Create a string pyramid of numbers from 1 to maxNumber
     * Example: maxNumber=3 →
     * 1
     * 22
     * 333
     */
    public static String createPyramid(int maxNumber) {
        // TODO: Implement this method
        // Use nested while loops:
        // - Outer loop for each row
        // - Inner loop to repeat the number
        // Use \n for newlines
        String num = Integer.toString(maxNumber);
        int maxNumber2 = maxNumber;
        String line = "";
        while(maxNumber != 0)
        maxNumber2 = maxNumber;
        maxNumber -=1;
            while (maxNumber2 != 0){
                line = line + num;
                maxNumber2 -=1;
            }
            return line;
       
    }
    
 
    
    
    /**
     * Exercise 3: Counting Game
     * Return a string of numbers replacing:
     * - Multiples of 3 with "Fizz"
     * - Multiples of 5 with "Buzz"
     * - Multiples of both with "FizzBuzz"
     * Example: countTo(6) → "1 2 Fizz 4 Buzz Fizz"
     */
    public static String countTo(int maxNumber) {
        // TODO: Implement this method
        // Use a while loop
        // Use string concatenation
        // Numbers/words should be separated by spaces
        // No trailing space at the end
        return "";
    }
    
  
}