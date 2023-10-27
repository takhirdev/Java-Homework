public class Main{
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Xirurg xirurg = new Xirurg();
        Lor lor = new Lor();
        doctor.setId(12345);
        doctor.name = "Johnson";
        doctor.salary = 12_000_000;
        doctor.sex = "Male";
        System.out.println(doctor.toString());
        xirurg.setId(67892);
        xirurg.name = "Liza";
        xirurg.salary = 15_000_000;
        xirurg.sex = "Female";
        System.out.println(xirurg.toString());
        lor.setId(54321);
        lor.name = "Angelina";
        lor.salary = 21_000_000;
        lor.sex = "Female";
        System.out.println(lor.toString());
    }
}