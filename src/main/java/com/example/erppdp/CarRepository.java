package com.example.erppdp;


public class CarRepository {
    private static  CarRepository carRepository = new CarRepository();
    private CarRepository(){}

    public static CarRepository getInstance() {
        return carRepository;
    }
}



