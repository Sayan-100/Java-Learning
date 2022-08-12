public class whileLoops {
    public static void main(String []args)
    {
        // boolean loop = true;
        int value = 0;
        boolean loop = value < 20;

        System.out.println(loop);

        while(value < 10)
        {
            System.out.println("Hello " + value);
            
            value = value + 1;
        }

    }
}
