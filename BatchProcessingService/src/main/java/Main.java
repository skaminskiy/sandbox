
public class Main {

    private Main() {}

    public static void main(String[] args) throws InterruptedException {

        while (true) {
            Thread.sleep(1000L);
            System.out.println("ping");
        }
    }
}
