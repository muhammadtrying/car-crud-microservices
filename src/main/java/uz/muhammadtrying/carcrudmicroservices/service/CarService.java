package uz.muhammadtrying.carcrudmicroservices.service;

import org.springframework.stereotype.Service;
import uz.muhammadtrying.carcrudmicroservices.entity.Car;

import java.util.List;

@Service
public interface CarService {
    List<Car> findAll();

    Car findById(Integer carId);

    Integer addCar(Car car);

    Integer deleteById(Integer carId);

    Car update(Car car);
}
