package web.service;

import web.model.Car;

import java.util.List;

public interface CarCervice {
    List<Car> getCarList (List<Car> listCar, int count);
}
