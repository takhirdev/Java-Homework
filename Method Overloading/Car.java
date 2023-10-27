public class Car {
    private String colour ;
    private String model ;
    private double cost;
    private String transmission ;

    public Car() {
    }
    public Car(String colour, String model, double cost, String transmission) {
        this.colour = colour;
        this.model = model;
        this.cost = cost;
        this.transmission = transmission;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", model='" + model + '\'' +
                ", cost=" + cost +
                ", transmission='" + transmission + '\'' +
                '}';
    }
}
