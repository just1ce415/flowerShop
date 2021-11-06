package order;

import order.users.User;

import java.util.ArrayList;
import java.util.List;

public class OrderNotifier {
    private final List<User> users = new ArrayList<>();

    public void addUser(User user){
        this.users.add(user);
    }

    public void removeUser(User user){
        this.users.remove(user);
    }

    public void notifyUsers(String status){
        for (User user : this.users){
            user.update(status);
        }
    }
}
