 import java.util.Scanner; 
/**
 * This program counts up to whatever the user wants
 * @author Zach Ramirez 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner for user input 
    Scanner input = new Scanner(System.in); 
    //prompt user for a positive integer 
    System.out.println("Please enter a positive integer"); 
    int integer = input.nextInt(); 

    //create a for loop to count to whichever number
    for(int count = 1; count < integer; count++){
      System.out.print(count + ",");
    } 
    System.out.print(integer);   
    
    
  }
}
