package service;

import model.entity.CarEntity;
import repository.MainRepository;

import static java.util.Objects.isNull;

public class MainServiceImpl implements MainService {
    private final MainRepository mainRepository;

    public MainServiceImpl(MainRepository mainRepository) {
        this.mainRepository = mainRepository;
    }

    @Override
    public CarEntity getCarById(Long id) {
        if (isNull(id) || id < 0) {
            throw new IllegalStateException("id can't be null or negative value");
        }
        CarEntity carById = mainRepository.getCarById(id);
        if (isNull(carById)) {
            throw new IllegalStateException("Can't find car by id: " + id);
        }
        return carById;
    }

    @Override
    public CarEntity getCarByParams(String model, String type, Double engineCapacity) {
        return null;
    }

    @Override
    public CarEntity updateCarById(Long id, CarEntity carEntity) {
        return null;
    }

    @Override
    public CarEntity saveCar(CarEntity carEntity) {
        return null;
    }

    @Override
    public boolean deleteCarById(Long id) {
        return false;
    }
}
