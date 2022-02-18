package model.entity;

import java.util.Objects;

public class CarEntity {
    private Long id;
    private ModelEntity model;
    private TypeEntity type;
    private Long ownerId;
    private Double engineCapacity;
    private EngineTypeEntity engineType;
    private Long price;
    private Integer carYear;

    public CarEntity() {
    }

    public CarEntity(Long id, ModelEntity model, TypeEntity type, Long ownerId,
                     Double engineCapacity, EngineTypeEntity engineType,
                     Long price, Integer carYear) {
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

    public ModelEntity getModel() {
        return model;
    }

    public void setModel(ModelEntity model) {
        this.model = model;
    }

    public TypeEntity getType() {
        return type;
    }

    public void setType(TypeEntity type) {
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

    public EngineTypeEntity getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineTypeEntity engineType) {
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
        CarEntity carEntity = (CarEntity) o;
        return Objects.equals(id, carEntity.id) && Objects.equals(model, carEntity.model) && Objects.equals(type, carEntity.type) && Objects.equals(ownerId, carEntity.ownerId) && Objects.equals(engineCapacity, carEntity.engineCapacity) && Objects.equals(engineType, carEntity.engineType) && Objects.equals(price, carEntity.price) && Objects.equals(carYear, carEntity.carYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, type, ownerId, engineCapacity, engineType, price, carYear);
    }

    @Override
    public String toString() {
        return "CarEntity{" +
                "id=" + id +
                ", model=" + model +
                ", type=" + type +
                ", ownerId=" + ownerId +
                ", engineCapacity=" + engineCapacity +
                ", engineType=" + engineType +
                ", price=" + price +
                ", carYear=" + carYear +
                '}';
    }
}
