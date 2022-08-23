package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("blue", 12, 13));
        carList.add(new Car("red", 1, 8));
        carList.add(new Car("black", 9, 9));
        carList.add(new Car("green", 6, 1));
        carList.add(new Car("gray", 2, 3));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count < 1 || count > 5) {
            count = 5;
        }
        return carList.subList(0, count);
    }

}
