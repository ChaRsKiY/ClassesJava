package classes;

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private int year;
    private String publisher;
    private String genre;
    private int pageCount;

    public Book() {}

    public Book(String title, String author, int year, String publisher, String genre, int pageCount) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        this.pageCount = pageCount;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название книги: ");
        this.title = scanner.nextLine();
        System.out.print("Введите ФИО автора: ");
        this.author = scanner.nextLine();
        System.out.print("Введите год выпуска: ");
        this.year = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Введите название издательства: ");
        this.publisher = scanner.nextLine();
        System.out.print("Введите жанр книги: ");
        this.genre = scanner.nextLine();
        System.out.print("Введите количество страниц: ");
        this.pageCount = scanner.nextInt();
    }

    public void displayData() {
        System.out.println("Название книги: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Год выпуска: " + year);
        System.out.println("Издательство: " + publisher);
        System.out.println("Жанр: " + genre);
        System.out.println("Количество страниц: " + pageCount);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getGenre() {
        return genre;
    }

    public int getPageCount() {
        return pageCount;
    }
}
