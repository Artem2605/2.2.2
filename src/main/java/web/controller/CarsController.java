package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarsController {

    private final CarServiceImpl CAR_SERVICE;

    @Autowired
    public CarsController(CarServiceImpl carService) {
        this.CAR_SERVICE = carService;
    }

    @GetMapping("/cars")
    public String getCountCars(@RequestParam(value = "count", defaultValue = "5") Long count,
                               Model model) {
        model.addAttribute("countCars", CAR_SERVICE.getListCarByCount(count));
        return "cars";
    }
}