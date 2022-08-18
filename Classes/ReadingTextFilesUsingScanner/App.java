import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App{
    public static void main(String[]args) throws FileNotFoundException
    {
        // String filename = "/home/sayan/learn.txt";
        String filename = "learn.txt";
        
        File textFile = new File(filename);

        // try {
        //     Scanner in = new Scanner(textFile);
        // } catch (FileNotFoundException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }

        Scanner in = new Scanner(textFile);

        // while(in.hasNextLine())
        // {
        //     String line = in.nextLine();
        //     System.out.println(line);
        // }

        int value = in.nextInt();
        System.out.println("Read Value : " + value);

        in.nextLine();

        int count = 2;

        while(in.hasNextLine())
        {
            String line = in.nextLine();
            System.out.println(count + " : " + line);
            count++;
        }

        in.close();

    }
}