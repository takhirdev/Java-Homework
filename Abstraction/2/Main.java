public class Main{
    public static void main(String[] args) {
        Animal dog = new Dog("Bella");
        Animal cat = new Cat("Angel");
        Animal duck = new Duck("Duck");
        System.out.println(dog.getName());
        dog.sound();
        System.out.println(cat.getName());
        cat.sound();
        System.out.println(duck.getName());
        duck.sound();
    }
}