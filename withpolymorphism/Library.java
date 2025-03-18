package withpolymorphism;

import java.util.ArrayList;
import java.util.List;

// Library class to manage users
class Library {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void showAccess() {
        for (User user : users) {
            user.accessLibrary();
        }
    }
}
