package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;
@Component
public class CarServiceImp implements CarService{
    @Autowired
    private CarDAO carDAO;
    @Override
    public List<Car> getCars(List<Car> list, int number) {
        return carDAO.getCars(list, number);
    }
}
