// public class Machine {
//     private int id;

//     public int getId() {
//         return id;
//     }

//     public void setId(int id) {
//         this.id = id;
//     }


// }

public abstract class Machine {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void doIt();
    public abstract void shutdown();
    public abstract void start();

    public void run()
    {
        start();
        doIt();
        shutdown();
    }
    

}
