package order.users;

public class UserId {
    private static int userID = -1;
    public static int getUserId(){
        userID ++;
        return userID;
    }
}
