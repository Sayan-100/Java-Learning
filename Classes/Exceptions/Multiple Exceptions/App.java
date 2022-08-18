import java.io.IOException;
import java.text.ParseException;
import java.io.FileNotFoundException;

public class App{
    // public static void main(String []args) throws IOException, ParseException
    // {
    //     Test test = new Test();
        
    //     test.run();
    // }
    public static void main(String []args)
    {
        Test test = new Test();
        
        /* 
        try {
            test.run();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            System.out.println("Couldn't parse command file.");
        }*/

        /* 
        try {
            test.run();
        } catch (IOException | ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/



        try {
            test.run();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 

        try {
            test.input();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }

        try {
            test.input();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}