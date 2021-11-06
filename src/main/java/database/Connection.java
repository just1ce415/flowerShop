package database;

import order.users.User;

import java.util.ArrayList;
import java.util.List;

public class Connection {
    public static Connection thisConnection;
    private final List<User> usersDB = new ArrayList<>();

    private Connection(){

    }
    public static Connection getConnection(){
        if (Connection.thisConnection == null){
            Connection.thisConnection = new Connection();
        }
        return thisConnection;
    }

    public void addUserToDB(User user){
        this.usersDB.add(user);
    }

    public void removeUserFromDB(User user){
        this.usersDB.remove(user);
    }
}
