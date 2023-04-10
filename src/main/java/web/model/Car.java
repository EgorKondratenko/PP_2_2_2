package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String brand;
    private String model;
    private int year;
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand() {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel() {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear() {
        this.year = year;
    }
    public static List<Car> createListCars() {
        List<Car> listCar = new ArrayList<>();
        return listCar;
    }
}
