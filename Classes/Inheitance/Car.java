public class Car extends Machine{


    public void start()
    {
        System.out.println("Car started");
    }

   public void wipeWindShield(){
        System.out.println("Wiping winshield");
   }

   public void showInfo(){
    System.out.println("Car name: " + name);
   }
}
