package order.users;

public abstract class User {
    private final int userId = UserId.getUserId();

    public int getUserId(){
        return this.userId;
    }

    public abstract void update(String status);
}
