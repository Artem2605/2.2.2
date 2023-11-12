package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    private static final List<Car> listCar = new ArrayList<>();//todo: прислушиваемся к IDE

    public CarServiceImpl() {
        listCar.add(new Car("BMW", "M5", 2010));
        listCar.add(new Car("KIA", "OPTIMA", 2012));
        listCar.add(new Car("MERS", "S classe", 2015));
        listCar.add(new Car("TOYOTA", "CAMRY", 2008));
        listCar.add(new Car("LEXUS", "GS", 2020));
    }

    @Override
    public List<Car> getListCarByCount(Long count) {
        return listCar.stream().limit(count).collect(Collectors.toList());
    }
}