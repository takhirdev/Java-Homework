public class Lor extends Doctor{
    private int id;
    @Override
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Lor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", sex='" + sex + '\'' +
                '}';
    }
}
