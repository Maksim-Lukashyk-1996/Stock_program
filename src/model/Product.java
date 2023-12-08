package model;

public class Product{
    private long id; // Уникальный номер товара
    private String name; // Наименование товара
    private Double weight; // Вес товара
    private Float size; // Размер


    public Product(long id, String name, Double weight, Float size) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.size = size;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Float getSize() {
        return size;
    }

    public void setSize(Float size) {
        this.size = size;
    }
}

