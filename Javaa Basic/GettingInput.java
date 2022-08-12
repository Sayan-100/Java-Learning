import java.util.Scanner;

public class GettingInput {
    public static void main(String []args)
    {
        //Create scanner object
        Scanner input = new Scanner(System.in);

        //output the promt
        // System.out.println("Enter a line of text");

        // //wait for the user to enter a line of text
        // String line = input.nextLine();

        // //output what is entered there
        // System.out.println("You entered : " + line);
        //    //output the promt
        // System.out.println("Enter a Number");

        // int value = input.nextInt();

        // System.out.println("You entered " + value);

        System.out.println("Enter a new double value");

        double value1 = input.nextDouble();

        System.out.println("You Entered " + value1);

        // System.out.println("Enter a float Value");

        // float value = input.nextFloat();

        // System.out.println("You have entered : " + value );

        


    }
}
