public class Field {
    Plant plant = new Plant();
    public Field()
    {
        //size is protected field is in same package as plant
        System.out.println(plant.size);
    }
}
