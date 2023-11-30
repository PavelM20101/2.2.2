package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarService carService;
    @GetMapping("")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int num, Model model){
        model.addAttribute("cars", carService.getCars(carService.getAllCars(), num));
        return "cars";
    }
}
