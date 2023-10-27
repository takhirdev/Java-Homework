public class Duck  extends Animal{
    private String name;
    public Duck(String name) {
        this.name = name;
    }
    @Override
    void sound() {
        System.out.println("Quack Quack Quack");
    }
    @Override
    public String getName() {
        return name;
    }
}
