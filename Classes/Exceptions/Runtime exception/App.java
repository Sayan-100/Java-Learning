public class App{
    public static void main(String []args)
    {

        String text = null;

        System.out.println(text.length());

        String [] texts = {"one", "two"};


        // try{
        // System.out.println(texts[2]);
        // } 
        // catch(Exception e)
        // {
        //     System.out.println(e.getMessage());
        // }


        try{
            System.out.println(texts[2]);
            } 
            catch(RuntimeException e) //ArrayIndexOutOfBoundsException
            {
                System.out.println(e.getMessage());
            }


    }
}