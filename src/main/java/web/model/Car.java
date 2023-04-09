package web.model;

import org.springframework.util.StringValueResolver;

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
        listCar.add(new Car("Ford", "Focus", 2018));
        listCar.add(new Car("Nissan", "Almera", 2009));
        listCar.add(new Car("Hyundai", "Creta", 2020));
        listCar.add(new Car("Toyota", "Tundra", 2015));
        listCar.add(new Car("Kia", "Rio", 2019));
        return listCar;
    }
}
