package withpolymorphism;

// Parent class
abstract class User {
    String name;

    public User(String name) {
        this.name = name;
    }

    public abstract void accessLibrary();
}
