package classes;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числитель: ");
        this.numerator = scanner.nextInt();
        System.out.print("Введите знаменатель: ");
        this.denominator = scanner.nextInt();
    }

    public void displayData() {
        System.out.println("Дробь: " + numerator + "/" + denominator);
    }

    public Fraction add(Fraction other) {
        int resultNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int resultDenominator = this.denominator * other.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction subtract(Fraction other) {
        int resultNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int resultDenominator = this.denominator * other.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction multiply(Fraction other) {
        int resultNumerator = this.numerator * other.numerator;
        int resultDenominator = this.denominator * other.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction divide(Fraction other) {
        int resultNumerator = this.numerator * other.denominator;
        int resultDenominator = this.denominator * other.numerator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public void simplify() {
        int gcd = gcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
