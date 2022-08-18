public class stringbuilderAndStringFormat{
    public static void main(String []args){

        //Inefficient
        String info = "";
        info += "My name is abcd";
        info += " ";
        info += "I am an Engineer";

        System.out.println(info);

        
        StringBuilder sb = new StringBuilder("");
        sb.append("");

        sb.append("My name is ----.");
        sb.append(" ");
        sb.append("I am a --- tamer.");
        
        System.out.println(sb.toString());


        // StringBuilder s = new StringBuilder();
        // s.append("My name is ----");
        // s.append(" ");
        // s.append("I am a sky diver");

        StringBuilder s = new StringBuilder()
        .append("My name is ----")
        .append(" ")
        .append("I am a sky diver");

        System.out.println(s.toString());

        //formatting there
        System.out.print("Here is some text.\t That was a doubt.\nthat was a new line ");
        System.out.println("More text");


        //formatting integars
        System.out.printf("Total cost %d, quatity is %d \n", 5, 98);
      

        //%10d 10 character wide
        System.out.printf("Total cost %10d, quatity is %d", 5, 98);
        System.out.printf("Total cost %-10d, quatity is %d", 5, 98);


        for(int i = 0; i < 20; i++)
        {
            System.out.printf("%2d: some text here\n", i);
        }

        //formatting floating point value
        System.out.printf("Total value: %f\n", 8.9);
        System.out.printf("Total value: %.2f\n", 8.98);
        System.out.printf("Total value: %.1f\n", 894.48543705487);
        System.out.printf("Total value: %-6.1f", 894.48543705487);
    }
    
}