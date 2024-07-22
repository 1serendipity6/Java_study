package com.leo.domain;

/**
 * @author Leo
 * @data 2024/7/17 下午 02:11
 */
public class Brand {
    private String brand;
    private  int price;
    private String id;
    private String runner;

    public Brand() {
    }

    public Brand(String brand, int price, String id, String runner) {
        this.brand = brand;
        this.price = price;
        this.id = id;
        this.runner = runner;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", id='" + id + '\'' +
                ", runner='" + runner + '\'' +
                '}';
    }
}
