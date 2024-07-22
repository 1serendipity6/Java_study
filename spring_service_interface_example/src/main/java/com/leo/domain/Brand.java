package com.leo.domain;

/**
 * @author Leo
 * @data 2024/7/19 上午 10:52
 */
public class Brand {
    private String id;
    private String brand;
    private int price;
    private String runner;

    public Brand() {
    }

    public Brand(String id, String brand, int price, String runner) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.runner = runner;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRunner() {
        return runner;
    }

    public void setRunner(String runner) {
        this.runner = runner;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", runner='" + runner + '\'' +
                '}';
    }
}
