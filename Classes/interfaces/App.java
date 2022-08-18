
public class App{
    public static void main(String []args)
    {
        Machine mach1 = new Machine();
        mach1.start();

        person person1 = new person("Bob");
        person1.greet();


        Info info1 = new Machine();
        info1.showInfo();

        Info info2 = person1;
        info2.showInfo();
        System.out.println();
        outputInfo(mach1);
        outputInfo(person1);
    }

    private static void outputInfo(Info info)
    {
        info.showInfo();
    }
}