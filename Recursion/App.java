public class App{
    public static void main(String[]args)
    {

        int value = 4;

        int x = calculate(value);
        System.out.println(x); 

        
        
    }

    // private static void calculate(int value)
    // {

    //     if(value == 1)
    //     {
    //         return;
    //     }

    //     // value = value - 1;
    //     System.out.println("ok");
    //     calculate(value - 1);
    // }

    private static int calculate(int value)
    {

        if(value <= 1)
        {
            return 1;
        }

        // value = value - 1;
        System.out.println("ok");
        int ans = value * calculate(value - 1);
        return ans;
    }
}