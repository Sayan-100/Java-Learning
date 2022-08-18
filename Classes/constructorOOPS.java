
class Machine{

    private String name;
    private int code;

    public Machine()
    {
        this("Article", 0);
        System.out.println("Constructor running");
        name = "abcd";
        
    }

    public Machine(String name)
    {
        this(name, 0);
        System.out.println("Second constructor running");
        this.name = name;
    }

    public Machine(String name, int code)
    {
        System.out.println("Third constructor ");
        this.name = name;
        this.code = code;

    }
}

public class constructorOOPS {
    public static void main(String []args){
        Machine machine1  = new Machine();
        // Machine machine2 = new Machine("abcd");
        // Machine machine3 = new Machine("Chowky", 7);

        new Machine();

    }
}
