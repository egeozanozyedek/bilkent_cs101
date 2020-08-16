import java.util.Scanner;

/*
 Name:Ege Ozan �zyedek
 Date:03.11.2017
 Program Name: Histogram
 Program Description: A program that prints out theamount of stars as the user input until the user input is negative.
 */ 

public class Histogram
{
  public static void main( String[] args)
  {
    Scanner input = new Scanner( System.in);
    
    // constants
    
    // variables
    int userInput ;
    int n;
    
    // program code
    
    
    
    
    System.out.print( "Enter numbers:");
    userInput = input.nextInt();
    
    //This do while will stop the program if the user enters a negative number
    do { 
      
      userInput = input.nextInt();
      
      if( userInput >= 0 ) {
        System.out.print( userInput + "  ");
      }
      
      //For loop here will print out the amount of stars te user enters
      for ( n = 1; n <= userInput; n++ ) {
        System.out.print( "*");
      }   
      
      System.out.println( );
      
    } while ( userInput >= 0 );
    
    System.out.println( "Goodbye!");
    
    input.close();
  }
}