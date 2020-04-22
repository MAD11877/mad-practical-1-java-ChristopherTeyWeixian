import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the height and weight of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    Scanner in= new Scanner(System.in);
    System.out.println("Enter Weight in kg:"); 
    double weight= in.nextDouble(); 
    
    System.out.println("Enter Height in metres:"); 
    double height = in.nextDouble();
    double bmi=weight/(height*height);

    System.out.println("Height is "+height);
    System.out.println("Weight is "+weight);
    System.out.println("BMI is "+bmi);
  }
}
