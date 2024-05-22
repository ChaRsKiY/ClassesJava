package classes;

public class Main {
    public static void main(String[] args) {
        // Person
        System.out.println("Тестирование класса Person:");
        Person person = new Person();
        person.inputData();
        person.displayData();

        // City
        System.out.println("\nТестирование класса City:");
        City city = new City();
        city.inputData();
        city.displayData();

        // Country
        System.out.println("\nТестирование класса Country:");
        Country country = new Country();
        country.inputData();
        country.displayData();

        // Fraction
        System.out.println("\nТестирование класса Fraction:");
        Fraction fraction1 = new Fraction(3, 4);
        Fraction fraction2 = new Fraction(2, 5);
        System.out.print("Первая дробь: ");
        fraction1.displayData();
        System.out.print("Вторая дробь: ");
        fraction2.displayData();
        Fraction sum = fraction1.add(fraction2);
        System.out.print("Сумма дробей: ");
        sum.displayData();
        Fraction difference = fraction1.subtract(fraction2);
        System.out.print("Разность дробей: ");
        difference.displayData();
        Fraction product = fraction1.multiply(fraction2);
        System.out.print("Произведение дробей: ");
        product.displayData();
        Fraction quotient = fraction1.divide(fraction2);
        System.out.print("Частное дробей: ");
        quotient.displayData();

        // Book
        System.out.println("Тестирование класса Book:");
        Book book = new Book();
        book.inputData();
        book.displayData();

        // Car
        System.out.println("\nТестирование класса Car:");
        Car car = new Car();
        car.inputData();
        car.displayData();
    }
}
