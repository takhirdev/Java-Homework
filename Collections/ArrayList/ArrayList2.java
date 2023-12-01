import java.util.*;

public class ArrayList2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <String> listOfCars = new ArrayList<>();
        listOfCars.add("Captiva");
        listOfCars.add("Gentra");
        listOfCars.add("Nexia");
        listOfCars.add("Cobalt");
        listOfCars.add("Malibu");
        listOfCars.add("Tracker");

        // Search car from list
        System.out.println("Search car: ");
        String car = scanner.next();
        boolean isHave = listOfCars.contains(car);
        if(isHave == true){
            System.out.println(car + " is found");
        } else System.out.println(car + " is not found");

        // copy of list
        List copyList = listOfCars.subList(0,listOfCars.size() );
        System.out.println(copyList);

        //  ArrayList elementlarni aralashtirish
        Collections.shuffle(listOfCars);
        System.out.println(listOfCars);
    }
}
