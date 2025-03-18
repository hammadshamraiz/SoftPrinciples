package withoutpolymorphism;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.accessLibrary("Member");
        library.accessLibrary("Librarian");
    }
}
