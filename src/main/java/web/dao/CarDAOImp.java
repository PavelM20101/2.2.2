package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAOImp implements CarDAO{
    @Override
    public List<Car> getCars(List<Car> list, int number) {
        if (number >= 5) return list;
        if (number < 0) return list.subList(0,0);
        return list.subList(0, number);
    }
}
