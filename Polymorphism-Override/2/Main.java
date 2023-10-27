public class Main{
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal duck = new Duck();
        dog.setName("Bella");
        System.out.println(dog.getName());
        dog.sound();
        cat.setName("Angela");
        System.out.println(cat.getName());
        cat.sound();
        duck.setName("duck");
        System.out.println(duck.getName());
        duck.sound();
    }
}