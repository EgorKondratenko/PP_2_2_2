package web.service;

import web.model.Car;

import java.util.List;

public class CarCerviceImp implements CarCervice{
    @Override
    public List<Car> getCarList(List<Car> listCar, int count) {
        return listCar.stream().limit(count).toList();
    }
}
