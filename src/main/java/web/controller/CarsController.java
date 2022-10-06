package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import java.util.Optional;

@Controller
public class CarsController {

    private CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping( "/cars")
    public String printCars(@RequestParam("count")Optional<Integer> count, ModelMap model){
    model.addAttribute("carList", carService.countCars(count.orElse(0)));

    return "car";

    }
}
