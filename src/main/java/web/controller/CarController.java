package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarService carService;
    @GetMapping("")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int num, Model model){
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Volkswagen", "Tiguan", 2016));
        carList.add(new Car("KIA", "Sportage", 2019));
        carList.add(new Car("Volvo", "XC90", 2020));
        carList.add(new Car("Honda", "Civic", 2006));
        carList.add(new Car("Geely", "Coolray", 2020));
        carList = carService.getCars(carList, num);
        model.addAttribute("cars", carList);
        return "cars";
    }
}
