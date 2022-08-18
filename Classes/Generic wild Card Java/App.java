import java.util.ArrayList;

class Machine {

    public String toString() {
        return "I am a machine";
    }


    public void start()
    {
        System.out.println("Machine Starting");
    }

}

class Camera extends Machine {

    public String toString() {
        return "I am a camera";
    }

    public void snap()
    {
        System.out.println("snap!");
    }

}
public class App{
    /**
     * @param args
     */
    public static void main(String[]args)
    {
        // ArrayList<String> list = new ArrayList<String>();
        ArrayList<Machine> list1 = new ArrayList<Machine>();
        
        // list.add("one");
        // list.add("Two");
        list1.add(new Machine());
        list1.add(new Machine());
        // showList(list1);
          // ArrayList<String> list = new ArrayList<String>();
          ArrayList<Camera> list2 = new ArrayList<Camera>();
        
          // list.add("one");
          // list.add("Two");
          list2.add(new Camera());
          list2.add(new Camera());
        //   showList(list2);
          showList2(list1);
          showList4(list1);

    }

    // public static void showList(ArrayList<String> list)
    // {
    //     for(String value : list)
    //     {
    //         System.out.println(value);
    //     }
    // }


    // public static void showList(ArrayList<Machine> list)
    // {
    //     for(Machine value : list)
    //     {
    //         System.out.println(value);
    //     }
    // }

    public static void showList4(ArrayList<?> list)
    {
        for(Object value : list)
        {
            System.out.println(value);
        }
    }

    // public static void showList(ArrayList<? extends Machine> list)
    // {
    //     for(Machine value : list)
    //     {
    //         System.out.println(value);
    //         value.start();
    //     }

    
    // }
    public static void showList2(ArrayList<? super Camera> list)
    {
        for(Object value : list)
        {
            System.out.println(value);
           
        }

    
    }
}