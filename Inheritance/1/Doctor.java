public class Doctor {
    private int id;
    String name;
    double salary;
    String sex;

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Doctor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", sex='" + sex + '\'' +
                '}';
    }
}
