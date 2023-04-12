package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImp implements CarService {
    public static List<Car> listCar = new ArrayList<>();
    {
        listCar.add(new Car("Ford", "Focus", 2018));
        listCar.add(new Car("Nissan", "Almera", 2009));
        listCar.add(new Car("Hyundai", "Creta", 2020));
        listCar.add(new Car("Toyota", "Tundra", 2015));
        listCar.add(new Car("Kia", "Rio", 2019));
    }
    @Override
    public List<Car> getCarList(int count) {
        return listCar.stream().limit(count).toList();
    }
}
