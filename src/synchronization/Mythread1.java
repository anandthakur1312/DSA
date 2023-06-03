package synchronization;

public class Mythread1 extends Thread {

    Display display;
    String name;

    Mythread1(Display display){
        this.display = display;
    }

    Mythread1(Display display, String name){
        this.display = display;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            this.display.wish(this.name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



//    @Override
//    public void run() {
//        try {
//            this.display.displayChars();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
}
