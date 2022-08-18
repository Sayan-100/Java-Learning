import java.util.ArrayList;
import java.util.HashMap;


public class App{
    public static void main(String[]args)
    {
        
        ArrayList list = new ArrayList();
        list.add("Apple");
        list.add("banana");
        list.add("orange");

        String fruit = (String)list.get(1);

        System.out.println(fruit);

        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("e");
        strings.add("o");

        String animal = strings.get(1);

        System.out.println(animal);
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        ArrayList<Integer>someList = new ArrayList<>();

    }
}