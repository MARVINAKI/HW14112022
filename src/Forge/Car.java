package Forge;

public class Car {
    private String brand;
    private String model;
    private Double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    public Car(String brand, String model, int productionYear, String productionCountry, String color, Double engineVolume) {
        this.brand = brand.trim();
        this.model = model.trim();
        this.productionYear = Math.abs(productionYear);
        this.productionCountry = productionCountry.trim();
        this.color = color.trim();
        this.engineVolume = Math.abs(engineVolume);
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
