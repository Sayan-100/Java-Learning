public class Program{




    // public static final int DOG = 0;
    // public static final int CAT = 1;

    // public static final int RABBIT = 2;
    public static void main(String []args)
    {
        Animal animal = Animal.CAT;
        // switch(animal)
        // {
        //     case DOG:
        //     System.out.println("Dog");
        //     break;

        //     case CAT:
        //     System.out.println("Cat");
        //     break;
        // }

        switch(animal)
        {
            case CAT:
                System.out.println("Cat");
                break;
            case DOG:
                System.out.println("Dog");
                break;
            case RABBIT:
            break;
            default:
            break;
        }

        System.out.println(Animal.DOG);
        System.out.println("Enum name is a string " + Animal.DOG.name());

        System.out.println(Animal.DOG instanceof Enum);

        System.out.println(Animal.CAT.getName());

        Animal animal2 = Animal.valueOf("CAT");


        System.out.println(animal2);

    }
}