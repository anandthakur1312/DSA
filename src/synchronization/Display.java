package synchronization;

public class Display {

    public synchronized void displayNums() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println(i);
        }
    }

    public synchronized void displayChars() throws InterruptedException {
        for (int i = 65; i <= 75; i++) {
            Thread.sleep(1000);
            System.out.println((char) i);
        }
    }

    public void wish(String name) throws InterruptedException {
        synchronized (Display.class) {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.println("Good Morning " + name);
            }
        }
    }


    public static void main(String[] args) {

        Display d = new Display();

//        Mythread1 t1 = new Mythread1(d);
//        Mythread2 t2 = new Mythread2(d);

        Mythread1 t1 = new Mythread1(d, "Dhoni");
        Mythread2 t2 = new Mythread2(d, "Yuvi");

        t1.start();
        t2.start();
    }

}