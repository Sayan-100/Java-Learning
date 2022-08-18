public enum Animal {
    CAT("xy"), DOG("yz"), RABBIT("zx");



    private String name;

    Animal(String name){
        this.name = name;
    }

    public String getName()
    {
        return name;
    }


    public String toString()
    {
        return name;
    }

}
