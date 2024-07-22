package com.leo.pojo;

/**
 * @author Leo
 * @data 2024/7/11 上午 11:18
 */
public class Brand {
    //品牌名稱
    private String brand;
    //序列號
    private String id;
    //價格
    private int price;
    //處理器
    private String runner;

    public Brand() {
    }

    public Brand(String brand, String id, int price, String runner) {
        this.brand = brand;
        this.id = id;
        this.price = price;
        this.runner = runner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
                "brand='" + brand + '\'' +
                ", id='" + id + '\'' +
                ", price=" + price +
                ", runner='" + runner + '\'' +
                '}';
    }
}
