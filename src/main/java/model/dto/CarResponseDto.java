package model.dto;

import java.util.Objects;

public class CarResponseDto {
    private Long id;
    private ModelDto model;
    private TypeDto type;
    private Long ownerId;
    private Double engineCapacity;
    private EngineTypeDto engineType;
    private Long price;
    private Integer carYear;

    public CarResponseDto() {
    }

    public CarResponseDto(Long id, ModelDto model, TypeDto type,
                          Long ownerId, Double engineCapacity,
                          EngineTypeDto engineType, Long price,
                          Integer carYear) {
        this.id = id;
        this.model = model;
        this.type = type;
        this.ownerId = ownerId;
        this.engineCapacity = engineCapacity;
        this.engineType = engineType;
        this.price = price;
        this.carYear = carYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ModelDto getModel() {
        return model;
    }

    public void setModel(ModelDto model) {
        this.model = model;
    }

    public TypeDto getType() {
        return type;
    }

    public void setType(TypeDto type) {
        this.type = type;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public EngineTypeDto getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineTypeDto engineType) {
        this.engineType = engineType;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getCarYear() {
        return carYear;
    }

    public void setCarYear(Integer carYear) {
        this.carYear = carYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarResponseDto that = (CarResponseDto) o;
        return Objects.equals(id, that.id) && Objects.equals(model, that.model) && Objects.equals(type, that.type) && Objects.equals(ownerId, that.ownerId) && Objects.equals(engineCapacity, that.engineCapacity) && Objects.equals(engineType, that.engineType) && Objects.equals(price, that.price) && Objects.equals(carYear, that.carYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, type, ownerId, engineCapacity, engineType, price, carYear);
    }

    @Override
    public String toString() {
        return "CarResponseDto{" +
                "id=" + id +
                ", model=" + model +
                ", type=" + type +
                ", ownerId=" + ownerId +
                ", engineCapacity='" + engineCapacity + '\'' +
                ", engineType=" + engineType +
                ", price=" + price +
                ", carYear=" + carYear +
                '}';
    }
}
