public class Xirurg extends Doctor{
    private int id;
    @Override
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Xirurg{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", sex='" + sex + '\'' +
                '}';
    }
}
