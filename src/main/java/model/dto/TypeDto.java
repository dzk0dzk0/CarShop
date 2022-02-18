package model.dto;

import java.util.Objects;

public class TypeDto {
    private Long id;
    private String type;

    public TypeDto(Long id, String type) {
        this.id = id;
        this.type = type;
    }

    public TypeDto() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeDto typeDto = (TypeDto) o;
        return Objects.equals(id, typeDto.id) && Objects.equals(type, typeDto.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type);
    }

    @Override
    public String toString() {
        return "TypeDto{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
