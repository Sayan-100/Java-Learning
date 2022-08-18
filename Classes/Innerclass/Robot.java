public class Robot{
    private int id;

    private class Brain {
        public void think()
        {
            System.out.println("Robot " + id + " is thinking it");
        }
    }

    // public class Brain {
    //     public void think()
    //     {
    //         System.out.println("Robot " + id + " is thinking it");
    //     }
    // }

    // static class Battery {
    //     public void charge(){
    //         System.out.println("Battery charging......");
    //     }
    // }

    public static class Battery {
        public void charge(){
            System.out.println("Battery charging......");
        }
    }



    public Robot(int id) {
        this.id = id;
    }

    public void start()
    {
        System.out.println("Starting robot " + id);

        Brain brain = new Brain();
        brain.think();






















































        final String name = "Robert";


        class Temp{
            public void helper()
            {
                System.out.println("ID is :" + id);
                System.out.println("My name is " + name);
            }

        }

        Temp temp = new Temp();
        temp.helper();
    }

    
}