import world.Plant;

public class App{
    /**
     * private only within same class
     * public from anywhere
     * protected same class, subclass and same package
     * no modifier same package only
     */
    public static void main(String []args){
        Plant plant = new Plant();
        System.out.println(plant.name);

        System.out.println(plant.ID);

        //will not work type private
        // System.out.println(plant.typo);

        //size is protected but App is not in same package as plants
        // will not work
        // System.out.println(plant.size);
        //Will not work because App and plant are in different pacakages;
        // System.out.println(plant.height);
    }
}