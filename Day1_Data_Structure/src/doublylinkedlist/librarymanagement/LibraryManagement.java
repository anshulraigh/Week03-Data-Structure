package doublylinkedlist.librarymanagement;

public class LibraryManagement {
    private BookNode head;
    private BookNode tail;
    private int bookCount;

    public void addBookAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable) {
        BookNode newNode = new BookNode(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        bookCount++;
        System.out.println("Book added at the beginning: " + title);
    }

    public void removeBook(int bookId) {
        BookNode current = head;
        while (current != null) {
            if (current.bookId == bookId) {
                if (current == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (current == tail) {
                    tail = tail.prev;
                    if (tail != null) tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                bookCount--;
                System.out.println("Book removed with ID: " + bookId);
                return;
            }
            current = current.next;
        }
        System.out.println("Book not found with ID: " + bookId);
    }

    public void displayBooksForward() {
        BookNode current = head;
        if (current == null) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("Books in forward order:");
        while (current != null) {
            System.out.println("[" + current.bookId + "] " + current.title);
            current = current.next;
        }
    }

    public void displayBooksReverse() {
        BookNode current = tail;
        if (current == null) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("Books in reverse order:");
        while (current != null) {
            System.out.println("[" + current.bookId + "] " + current.title);
            current = current.prev;
        }
    }

    public int getBookCount() {
        return bookCount;
    }
}
