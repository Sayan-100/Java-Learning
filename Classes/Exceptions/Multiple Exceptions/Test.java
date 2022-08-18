import java.io.IOException;
import java.io.FileNotFoundException;
import java.text.ParseException;

public class Test {
    public void run() throws IOException, ParseException{
        // throw new IOException();

        //one exception at a time
        throw new ParseException("Error in command list. ", 2);
        
    }

    public void input() throws IOException, FileNotFoundException{
        
    }
}
