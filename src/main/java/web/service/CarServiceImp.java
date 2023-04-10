package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {
    @Override
    public List<Car> getCarList(List<Car> listCar, int count) {
        listCar = new ArrayList<>();
        listCar.add(new Car("Ford", "Focus", 2018));
        listCar.add(new Car("Nissan", "Almera", 2009));
        listCar.add(new Car("Hyundai", "Creta", 2020));
        listCar.add(new Car("Toyota", "Tundra", 2015));
        listCar.add(new Car("Kia", "Rio", 2019));
        return listCar.stream().limit(count).toList();
    }
}
