package com.example.erppdp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CarService {
    List<Car> carlist = new ArrayList<>();

    {
        carlist.add(new Car("cobalt", UUID.randomUUID(), 21));
        carlist.add(new Car("gentra", UUID.randomUUID(), 20));
        carlist.add(new Car("malibu", UUID.randomUUID(), 18));
        carlist.add(new Car("ravon", UUID.randomUUID(), 19));

    }


    public List<Car> getAll() {
        return carlist;
    }

    public Car getById(UUID id) {
        return carlist.stream()
                .filter(car -> car.getId().equals(id))
                .findFirst()
                .orElse(null);

    }

    public UUID createId(Car car) {
        UUID id = UUID.randomUUID();
        car.setId(id);
        carlist.add(car);
        return id;
    }

    public void deleteById(UUID id) {
        carlist.removeIf(car -> car.getId().equals(id));

    }

    public void updateCar(UUID id, Car car) {
        Car idTopilmadi = carlist.
                stream()
                .filter(exisringer -> exisringer.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("id topilmadi"));


        idTopilmadi.setYaer(car.getYaer());
        idTopilmadi.setName(car.getName());
    }
}
