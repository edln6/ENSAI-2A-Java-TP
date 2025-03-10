package fr.ensai.library;

public class Main {

    public static void main(String[] args) {

        Author tolkien = new Author("J.R.R. Tolkien", 81, "UK");

        Book fellowshipOfTheRing = new Book(
                "978-0-618-26025-6",
                "The Fellowship of the Ring",
                tolkien,
                1954,
                423);

        System.out.println(fellowshipOfTheRing.toString());

        Library mylibrary = new Library("MyLibrary");

        mylibrary.loadBooksFromCSV("books.csv");


        Magazine truc1 = new Magazine(
            "issn1",
            "titre1", 
            0, 
            2025, 
            100);

        mylibrary.addItem(truc1);

        Magazine truc2 = new Magazine(
            "issn2",
            "titre2", 
            0, 
            2025, 
            100);

        mylibrary.addItem(truc2);

        mylibrary.displayItems();

    }
}