package com.practice;

public class CarBuilder {

    private String name;

    private Integer modelYear;

    private Long price;

    private CarBuilder(Builder builder) {

        this.name = builder.name;
        this.modelYear = builder.modelYear;
        this.price = builder.price;
    }

    public static class Builder {
        String name;
        Integer modelYear;
        Long price;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setModelYear(Integer modelYear) {
            this.modelYear = modelYear;
            return this;
        }

        public Builder setPrice(Long price) {
            this.price = price;
            return this;
        }

        public CarBuilder build() {
            return new CarBuilder(this);
        }

    }

    @Override
    public String toString() {
        return "CarBuilder{" +
                "name='" + name + '\'' +
                ", modelYear=" + modelYear +
                ", price=" + price +
                '}';
    }
}