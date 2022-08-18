class Human{



    private int id;
    private String name;

    public Human(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){

        return String.format("%d: %s", id, name);
        // StringBuilder sb = new StringBuilder();
        // sb.append(id).append(": ").append(name);
        // // return id + ": " + name;
        // return sb.toString();
    }
}


public class toStringMethod {
    public static void main(String []args){
        // Object obj = new Object();
        // obj.
        // Human hum1 = new Human();
        Human hum1 = new Human(98, "abcd");
        // hum1.toString();
        System.out.println(hum1);
    }
}
