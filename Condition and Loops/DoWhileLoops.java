import java.util.Scanner;


public class DoWhileLoops{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter a Number");

        // int value = scanner.nextInt();

        // while(value != 5)
        // {
        //     System.out.println("Enter a Number : ");
        //     value = scanner.nextInt();
        // }

        int value = 5;
        do{
            System.out.println("Enter a Number : ");
            value = scanner.nextInt();

        }
        while(value != 5);

        System.out.println("Loop finished");
    }
}