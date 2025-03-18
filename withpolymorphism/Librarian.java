package withpolymorphism;

// Member class
class Member extends User {
    public Member(String name) {
        super(name);
    }

    public void accessLibrary() {
        System.out.println(name + " (Member) can borrow books.");
    }
}

// Librarian class
class Librarian extends User {
    public Librarian(String name) {
        super(name);
    }

    public void accessLibrary() {
        System.out.println(name + " (Librarian) can manage books and members.");
    }
}
