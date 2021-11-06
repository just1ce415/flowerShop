package order.users;

public class Sender extends User {
    @Override
    public void update(String status) {
        System.out.println("Sender was notified that " + status);
    }
}
