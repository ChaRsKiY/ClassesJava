package classes;

import java.util.Scanner;

public class Car {
    private String name;
    private String manufacturer;
    private int year;
    private double engineVolume;

    public Car() {}

    public Car(String name, String manufacturer, int year, double engineVolume) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.year = year;
        this.engineVolume = engineVolume;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название автомобиля: ");
        this.name = scanner.nextLine();
        System.out.print("Введите название производителя: ");
        this.manufacturer = scanner.nextLine();
        System.out.print("Введите год выпуска: ");
        this.year = scanner.nextInt();
        System.out.print("Введите объём двигателя: ");
        this.engineVolume = scanner.nextDouble();
    }

    public void displayData() {
        System.out.println("Название автомобиля: " + name);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Год выпуска: " + year);
        System.out.println("Объём двигателя: " + engineVolume);
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
}
