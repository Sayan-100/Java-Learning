public class ArrayDS {
    public static void main(String []args)
    {
        int value = 8;
        int[]values;
        values = new int[4];

        System.out.println(values[0]);

        values[0] = 10;
        values[1] = 20;
        values[2] = 30;
        values[3] = 40;


        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);
        System.out.println(values[3]);

        for(int i = 0; i < values.length; i++)
        {
            System.out.println(values[i]);
        }

        int [] numbers = {5, 6, 7, 8};

        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }

    }
}
