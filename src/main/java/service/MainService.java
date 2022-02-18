package service;

import model.entity.CarEntity;

public interface MainService {
    CarEntity getCarById(Long id);

    CarEntity getCarByParams(String model, String type, Double engineCapacity);

    CarEntity updateCarById(Long id, CarEntity carEntity);

    CarEntity saveCar(CarEntity carEntity);

    boolean deleteCarById(Long id);
}
