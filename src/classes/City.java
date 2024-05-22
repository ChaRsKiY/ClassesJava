package classes;

import java.util.Scanner;

public class City {
    private String name;
    private String region;
    private String country;
    private int population;
    private String postalCode;
    private String phoneCode;

    public City() {}

    public City(String name, String region, String country, int population, String postalCode, String phoneCode) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.population = population;
        this.postalCode = postalCode;
        this.phoneCode = phoneCode;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название города: ");
        this.name = scanner.nextLine();
        System.out.print("Введите название региона: ");
        this.region = scanner.nextLine();
        System.out.print("Введите название страны: ");
        this.country = scanner.nextLine();
        System.out.print("Введите количество жителей в городе: ");
        this.population = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Введите почтовый индекс города: ");
        this.postalCode = scanner.nextLine();
        System.out.print("Введите телефонный код города: ");
        this.phoneCode = scanner.nextLine();
    }

    public void displayData() {
        System.out.println("Название города: " + name);
        System.out.println("Регион: " + region);
        System.out.println("Страна: " + country);
        System.out.println("Население: " + population);
        System.out.println("Почтовый индекс: " + postalCode);
        System.out.println("Телефонный код: " + phoneCode);
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getCountry() {
        return country;
    }

    public int getPopulation() {
        return population;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getPhoneCode() {
        return phoneCode;
    }
}
