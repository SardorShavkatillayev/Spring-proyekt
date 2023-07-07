package com.example.erppdp;

import User.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/car")
@RequiredArgsConstructor
public class CarController {


    private final CarService carService;


    @GetMapping
    public List<Car> getCar() {
        return carService.getAll();

    }


    @GetMapping("/{id}")
    public Car getCarByID(@PathVariable("id") UUID id) {
        return carService.getById(id);


    }

    @PostMapping
    public UUID getCars(@RequestBody Car car) {
            return carService.createId(car);


    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") UUID id) {
        carService.deleteById(id);
    }

    @PutMapping("/{id}")
    public void updateById(@PathVariable("id") UUID id, @RequestBody Car car) {
        carService.updateCar(id,car);

    }

}

