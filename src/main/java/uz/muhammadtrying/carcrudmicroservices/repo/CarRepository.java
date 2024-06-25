package uz.muhammadtrying.carcrudmicroservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.muhammadtrying.carcrudmicroservices.entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {
}