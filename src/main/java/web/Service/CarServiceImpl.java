package web.Service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService{

    public final CarDao carDao;
    public List<Car> cars = CarDaoImpl.cars;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }


    @Override
    public List<Car> countCars(int count) {
        if ((count == 0) || (count >= 5)) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
