package repository;

import model.entity.CarEntity;
import model.entity.EngineTypeEntity;
import model.entity.ModelEntity;
import model.entity.TypeEntity;

public class MainRepositoryImpl implements MainRepository {
    @Override
    public CarEntity getCarById(Long id) {
        CarEntity firstCar = new CarEntity(1L,new ModelEntity(),new TypeEntity(),1L,3.5D,new EngineTypeEntity(),20000L, 2021);
        CarEntity secondCar = new CarEntity(2L,new ModelEntity(),new TypeEntity(),2L,1.5D,new EngineTypeEntity(),5000L, 2011);
        CarEntity thirdCar = new CarEntity(3L,new ModelEntity(),new TypeEntity(),3L,2.5D,new EngineTypeEntity(),10000L, 2017);
        return firstCar.getId().equals(id) ? firstCar :
                secondCar.getId().equals(id) ? secondCar :
                thirdCar.getId().equals(id) ? thirdCar : null;
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
