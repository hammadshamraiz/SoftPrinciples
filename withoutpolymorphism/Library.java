
package withoutpolymorphism;

class Library {
    public void accessLibrary(String role) {
        if (role.equals("Member")) {
            System.out.println("Member can borrow books.");
        } else if (role.equals("Librarian")) {
            System.out.println("Librarian can manage books and members.");
        } else {
            System.out.println("Access Denied.");
        }
    }
}
