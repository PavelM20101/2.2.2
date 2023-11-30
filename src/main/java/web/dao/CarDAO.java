package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDAO {
    List<Car> getAllCars();
    public List<Car> getCars(List<Car> list, int number);

}
