package world;
public class OakPlant extends Plant{
    public OakPlant(){

        //will not work it is private
        //typo = "tree";

        //this works because size is protected Oak is a subclass of plant
        this.size = "large";

        //No access specifier oal  and plant are in same package so
        //it works
        this.height = 88;

    }
}
