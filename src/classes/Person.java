package classes;

import java.util.Scanner;

public class Person {
    private String fullName;
    private String birthDate;
    private String phone;
    private String city;
    private String country;
    private String address;

    public Person() {}

    public Person(String fullName, String birthDate, String phone, String city, String country, String address) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.address = address;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        this.fullName = scanner.nextLine();
        System.out.print("Введите дату рождения: ");
        this.birthDate = scanner.nextLine();
        System.out.print("Введите контактный телефон: ");
        this.phone = scanner.nextLine();
        System.out.print("Введите город: ");
        this.city = scanner.nextLine();
        System.out.print("Введите страну: ");
        this.country = scanner.nextLine();
        System.out.print("Введите домашний адрес: ");
        this.address = scanner.nextLine();
    }

    public void displayData() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Дата рождения: " + birthDate);
        System.out.println("Телефон: " + phone);
        System.out.println("Город: " + city);
        System.out.println("Страна: " + country);
        System.out.println("Домашний адрес: " + address);
    }

    public String getFullName() {
        return fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }
}
