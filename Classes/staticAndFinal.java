
































































































class Thing{
    public String name;
    public static String description;
    public final static int LUCKY_NUMBER = 18;

    public static int count = 0;

    public int id;


    public Thing()
    {
        id = count;
        count++;
    }

    public void showName()
    {
        System.out.println("Object id " + id + " " + description + " " +  name);
    }

    public static void showInfo()
    {
        System.out.println("Hello");
        //only can acess static data
        //only description not name here
        System.out.println(description);

    }
}
public class staticAndFinal {
    public static void main(String [] args){

        Thing.description = "I am a thing";
        
        System.out.println(Thing.description);

        Thing.showInfo();

        System.out.println("Before creating object a "  + Thing.count);

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();
        System.out.println("Before creating object a "  + Thing.count);

        thing1.name = "abc";
        thing2.name = "xyz";

        System.out.println(thing1.name);
        System.out.println(thing2.name);

        thing1.showName();
        thing2.showName();

        System.out.println(Math.PI);

        System.out.println(Thing.LUCKY_NUMBER);

    }
}
