/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Eric R Smith
 */
public class UI {

    private Scanner scanner;

    public UI(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        ArrayList<Book> bookList = new ArrayList<>();

        while (true) {
            System.out.print("Input the name of the book, empty stops:");
            String bookTitle = scanner.nextLine();

            if (bookTitle.isEmpty()) {
                break;
            }

            System.out.print("Input the age recommendation:");
            int ageRec = Integer.valueOf(scanner.nextLine());

            bookList.add(new Book(bookTitle, ageRec));

            System.out.println("");
        }

        System.out.println("");
        System.out.println(bookList.size() + " books in total.");
        System.out.println("");
        System.out.println("Books:");
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRec)
                .thenComparing(Book::getTitle);
        
        Collections.sort(bookList, comparator);
        
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

}
