package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImp implements CarDAO{
    public List<Car> getAllCars(){
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Volkswagen", "Tiguan", 2016));
        carList.add(new Car("KIA", "Sportage", 2019));
        carList.add(new Car("Volvo", "XC90", 2020));
        carList.add(new Car("Honda", "Civic", 2006));
        carList.add(new Car("Geely", "Coolray", 2020));
        return carList;
    }
    @Override
    public List<Car> getCars(List<Car> list, int number) {
        if (number >= 5) return list;
        if (number < 0) return list.subList(0,0);
        return list.subList(0, number);
    }

}
