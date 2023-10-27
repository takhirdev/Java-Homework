public class Dog extends Animal{
    private String name;

    public Dog(String name) {
        this.name = name;
    }
    @Override
    void sound() {
        System.out.println("bow bow bow");
    }
    @Override
    public String getName() {
        return name;
    }
}
