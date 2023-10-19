package day36.encapsulation;

public class Cars {
    private String carName;

    public Cars(String carName) {       // Constructor
        this.carName = carName;
    }

    public String getCarName() {        // Getter
        return carName;
    }

    public void setCarName(String carName) {    // Setter
        this.carName = carName;
    }

    @Override
    public String toString() {              // toString
        return "Cars{" +
                "carName='" + carName + '\'' +
                '}';
    }
}
