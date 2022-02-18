package model.dto;

import java.util.Objects;

public class EngineTypeDto {
    private Long id;
    private String type;
    private Integer horsePower;

    public EngineTypeDto() {
    }

    public EngineTypeDto(Long id, String type, Integer horsePower) {
        this.id = id;
        this.type = type;
        this.horsePower = horsePower;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EngineTypeDto that = (EngineTypeDto) o;
        return Objects.equals(id, that.id) && Objects.equals(type, that.type) && Objects.equals(horsePower, that.horsePower);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, horsePower);
    }

    @Override
    public String toString() {
        return "EngineTypeDto{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
