package uz.muhammadtrying.carcrudmicroservices.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.muhammadtrying.carcrudmicroservices.entity.Car;
import uz.muhammadtrying.carcrudmicroservices.repo.CarRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public Car findById(Integer carId) {
        return carRepository.findById(carId).get();
    }

    @Override
    public Integer addCar(Car car) {
        return carRepository.save(car).getId();
    }

    @Override
    public Integer deleteById(Integer carId) {
        carRepository.deleteById(carId);
        return carId;
    }

    @Override
    public Car update(Car car) {
        return carRepository.save(car);
    }
}
