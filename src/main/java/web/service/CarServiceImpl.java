package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    private static final List<Car> LIST_CAR = new ArrayList<>();

    public CarServiceImpl() {
        LIST_CAR.add(new Car("BMW", "M5", 2010));
        LIST_CAR.add(new Car("KIA", "OPTIMA", 2012));
        LIST_CAR.add(new Car("MERS", "S classe", 2015));
        LIST_CAR.add(new Car("TOYOTA", "CAMRY", 2008));
        LIST_CAR.add(new Car("LEXUS", "GS", 2020));
    }

    @Override
    public List<Car> getListCarByCount(Long count) {
        return LIST_CAR.stream().limit(count).collect(Collectors.toList());
    }
}