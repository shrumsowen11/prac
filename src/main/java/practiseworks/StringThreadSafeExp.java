package practiseworks;

public class StringThreadSafeExp implements Runnable {
    private String str;
    public StringThreadSafeExp(String str){
        this.str = str;
    }
    @Override
    public void run() {
        System.out.println("Executing Thread- " + Thread.currentThread().getName());
        // Adding to String
        str = str + " World";
        System.out.println("Modified String " + str);
    }

    public static void main(String[] args) {
    String str = "Hello";

        Thread t1 = new Thread(new StringThreadSafeExp(str));
        Thread t2 = new Thread(new StringThreadSafeExp("Hi"));
        Thread t3 = new Thread(new StringThreadSafeExp("Bye!"));
        t1.start();
        t2.start();
        t3.start();
        // Wait for all threads to terminate
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Original String is " + str);
    }
}