







class Plant{
    
    public static final int ID = 88;
    private String name;

    public String getData()
    {
        String data = "some stuff" + calculateGrowthForecast();
        return data;
    }


    private int calculateGrowthForecast()
    {
        return 7246;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

public class App{
    public static void main(String[] args)
    {

    }
}