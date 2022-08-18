class Frog{
    // String name;
    // int age;
    private String name;
    private int age;


    // public void setName(String newName)
    // {
    //     name = newName;
    // }
    public void setName(String name)
    {
        this.name = name;
    }
    // public void setAge(int newAge)
    // {
    //     age = newAge;
    // }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void setInfo(String name, int age)
    {
        setName(name);
        setAge(age);
    }
}

public class settersAndThis {
   public static void main(String []args)
   {
        Frog frog1 = new Frog();
        // frog1.name = "wxyz";
        // frog1.age = 1;

        frog1.setName("abcd");
        frog1.setAge(98);

        System.out.println(frog1.getName());
   }
}
