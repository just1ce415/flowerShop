package order.users;

public class Receiver extends User{
    @Override
    public void update(String status) {
        System.out.println("Receiver was notified that " + status);
    }
}
