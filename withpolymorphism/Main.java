package withpolymorphism;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        User member = new Member("Alice");
        User librarian = new Librarian("Bob");

        library.addUser(member);
        library.addUser(librarian);

        library.showAccess();
    }
}
