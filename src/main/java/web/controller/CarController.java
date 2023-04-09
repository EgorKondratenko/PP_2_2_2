package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarCervice;
import web.service.CarCerviceImp;

import java.util.List;

import static web.model.Car.createListCars;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        CarCervice carCervice = new CarCerviceImp();
        List<Car> listCar = carCervice.getCarList(createListCars(), count);
        model.addAttribute("cars", listCar);
        return "/cars";
    }
}
