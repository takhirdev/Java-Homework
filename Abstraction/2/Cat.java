public class Cat extends Animal{
    private String name;

    public Cat(String name) {
        this.name = name;
    }
    @Override
    void sound() {
        System.out.println("Meow Meow Meow");
    }
    @Override
    public String getName() {
        return name;
    }
}
