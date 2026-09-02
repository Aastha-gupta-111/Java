class NumberPrinter extends Thread {
    private static final Object lock = new Object();
    private static boolean jaiTurn = true;   // jai always prints first
    private static final int LIMIT = 10;

    private int num;
    private final boolean isJaiThread;

    public NumberPrinter(String name, int startNum, boolean isJaiThread) {
        super(name);
        this.num = startNum;
        this.isJaiThread = isJaiThread;
    }

    public void run() {
        while (num <= LIMIT) {
            synchronized (lock) {
                // wait until it's this thread's turn
                while (jaiTurn != isJaiThread) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(getName() + " : " + num);
                num += 2;          // jai: 2,4,6.. veeru: 1,3,5..
                jaiTurn = !jaiTurn; // pass turn to the other thread
                lock.notifyAll();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        NumberPrinter jai   = new NumberPrinter("Jai", 2, true);
        NumberPrinter veeru = new NumberPrinter("Veeru", 1, false);

        jai.start();
        veeru.start();
    }
}
