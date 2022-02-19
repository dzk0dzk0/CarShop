package controller;

import model.dto.CarRequestDto;
import model.dto.CarResponseDto;
import model.dto.CarUpdateRequestDto;
import model.dto.CarUpdateResponseDto;
import model.maper.MainMapper;
import service.MainService;

public class MainController {

    private final MainService mainService;
    private final MainMapper mainMapper;

    public MainController(MainService mainService, MainMapper mainMapper) {
        this.mainService = mainService;
        this.mainMapper = mainMapper;
    }

    public CarResponseDto getCarById(Long id) {
        return mainMapper.entityToResponseDto(mainService.getCarById(id));
    }

    public CarResponseDto getCarByParams(String model, String type, Double engineCapacity) {
        return null;
    }

    public CarUpdateResponseDto updateCarById(Long id, CarUpdateRequestDto carUpdateRequestDto) {
        return null;
    }

    public CarResponseDto saveCar(CarRequestDto carRequestDto) {
        return null;
    }

    public Boolean deleteCarById(Long id) {
        return null;
    }
}
