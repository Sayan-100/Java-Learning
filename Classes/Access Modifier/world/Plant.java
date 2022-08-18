package world;
public class Plant {
    //dont do
    public String name;

    //Acceptable practice
    public final static int ID = 98;

    private String typo;

    protected String size;


    int height;

    public Plant(){
        this.name = "I am a plant.";
        typo = "plant";
        this.size = "small";
        this.height = 8;
    }

}
