class Robot{
    // public void speak()
    // {
    //     System.out.println("Hello");
    // }
    public void speak(String text)
    {
        // System.out.println("Hello");
        System.out.println(text);
    }

    public void jump(int height)
    {
        System.out.println("Jumping: " + height);
    }

    public void move(String direction, double distance)
    {
        System.out.println("Moving " + distance + " in drection " + direction);
    }
}

public class MethodPrameters {
    public static void main(String[]args)
    {
        Robot robo = new Robot();
        robo.speak("Hi I am  The");
        robo.jump(8);

        String direction = "West";
        double distance = 98;
        robo.move(direction, distance);

        String greeting = "Hello There";

        robo.speak(greeting);

        int jump = 98;
        robo.jump(jump);
    }    
}
