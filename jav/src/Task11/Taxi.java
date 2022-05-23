package Task11;

import java.util.Arrays;

public class Taxi {
    private String typeOfCar;
    private int capacity;
    private Driver[] driver;

    public Taxi(final String typeOfCar, final int capacity, final Driver[] driver) {
        this.typeOfCar = typeOfCar;
        this.capacity = capacity;
        this.driver = driver;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(final String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(final int capacity) {
        this.capacity = capacity;
    }

    public Driver[] getDriver() {
        return driver;
    }

    public void setDriver(final Driver[] driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "typeOfCar='" + typeOfCar + '\'' +
                ", capacity=" + capacity +
                ", driver=" + Arrays.toString(driver) +
                '}';
    }
}
