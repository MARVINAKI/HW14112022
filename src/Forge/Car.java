package Forge;

public class Car {
    private String brand;
    private String model;
    private Double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    public Car(String brand, String model, int year, String country, String color, Double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.productionYear = year;
        this.productionCountry = country;
        this.color = color;
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Марка='" + brand + '\'' +
                ", модель='" + model + '\'' +
                ", объём двигателя (литров)=" + engineVolume +
                ", цвет кузова='" + color + '\'' +
                ", год производства=" + productionYear +
                ", страна сборки='" + productionCountry + '\'' +
                '}';
    }
}
