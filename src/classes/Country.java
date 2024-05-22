package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Country {
    private String name;
    private String continent;
    private int population;
    private String phoneCode;
    private String capital;
    private List<String> cities;

    public Country() {
        cities = new ArrayList<>();
    }

    public Country(String name, String continent, int population, String phoneCode, String capital, List<String> cities) {
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.phoneCode = phoneCode;
        this.capital = capital;
        this.cities = cities;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название страны: ");
        this.name = scanner.nextLine();
        System.out.print("Введите название континента: ");
        this.continent = scanner.nextLine();
        System.out.print("Введите количество жителей в стране: ");
        this.population = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Введите телефонный код страны: ");
        this.phoneCode = scanner.nextLine();
        System.out.print("Введите название столицы: ");
        this.capital = scanner.nextLine();
        System.out.print("Введите количество городов в стране: ");
        int numCities = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Введите названия городов:");
        for (int i = 0; i < numCities; i++) {
            cities.add(scanner.nextLine());
        }
    }

    public void displayData() {
        System.out.println("Название страны: " + name);
        System.out.println("Континент: " + continent);
        System.out.println("Население: " + population);
        System.out.println("Телефонный код: " + phoneCode);
        System.out.println("Столица: " + capital);
        System.out.println("Города: " + String.join(", ", cities));
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public int getPopulation() {
        return population;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public String getCapital() {
        return capital;
    }

    public List<String> getCities() {
        return cities;
    }
}