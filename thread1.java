
public class thread1 extends Thread {
    public void run() {
        System.out.println("This is a new thread!");
    }

    public static void main(String[] args) {
        thread1 thread = new thread1();
        thread.start();
    }
}
