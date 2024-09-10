public class App {
    public static void main(String[] args) {
        User u1 = new User(2912, "BRENO ANDRADE");

        u1.status();

        u1.depositar(4456);
        u1.status();
        u1.sacar(1000);
        u1.status();
    }
}
