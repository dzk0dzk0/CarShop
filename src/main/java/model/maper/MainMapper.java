package model.maper;

import model.dto.CarResponseDto;
import model.entity.CarEntity;

public class MainMapper {
    public CarResponseDto entityToResponseDto(CarEntity carEntity) {
        CarResponseDto carResponseDto = new CarResponseDto();
        carResponseDto.setCarYear(carEntity.getCarYear());
        carResponseDto.setEngineCapacity(carEntity.getEngineCapacity());
        carResponseDto.setEngineType(carEntity.getEngineType());
        carResponseDto.setId(carEntity.getId());
        carResponseDto.setModel(carEntity.getModel());
        carResponseDto.setPrice(carEntity.getPrice());
        carResponseDto.setType(carEntity.getType());
        return carResponseDto;
    }

}
