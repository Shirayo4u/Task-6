package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    public static final List<Car> cars= new ArrayList<>();

    static  {
        cars.add(new Car("Renault", 754, 264));
        cars.add(new Car("KIA", 666, 666));
        cars.add(new Car("VW", 555, 555));
        cars.add(new Car("Dodge", 111, 222));
        cars.add(new Car("Niva", 888, 888));
        cars.add(new Car("Niva", 888, 888));

    }




//    @Override
//    public List<Car> cars() {
//        return cars;
//    }
}
