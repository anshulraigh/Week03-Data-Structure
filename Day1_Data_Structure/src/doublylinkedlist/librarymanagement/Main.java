package doublylinkedlist.librarymanagement;

public class Main {
    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();

        library.addBookAtBeginning("The Alchemist", "Paulo Coelho", "Fiction", 101, true);
        library.addBookAtBeginning("Sapiens", "Yuval Noah Harari", "History", 102, true);

        library.displayBooksForward();
        library.displayBooksReverse();

        library.removeBook(101);

        library.displayBooksForward();

        System.out.println("Total books in library: " + library.getBookCount());
    }
}
