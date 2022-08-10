public class ifStatement {
    public static void main(String []args)
    {
        boolean cond = 5 != 5;

        System.out.println(cond);

        if(4 != 4)
        {
            System.out.println("Yes it's true");
        }
        else if(4 == 4){
            System.out.println("Yes it's true");
        }
        else
        {
            System.out.println("No it's False");
        }

        for(int i = 0; i < 96; i++)
        {
            if(i == 5)
            {
                break;
            }
            System.out.printf("The value of i is %d\n", i);
            System.out.println("Hello");
        }
    }
}
