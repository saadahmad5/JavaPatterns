package CreationalPatterns.SingletonPattern.Spooler;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        PrintSpooler printSpooler = PrintSpooler.getInstance();

        printSpooler.addPrinter("Main Printer");

        Thread thread1 = new Thread(() -> {
            PrintSpooler printSpooler1 = PrintSpooler.getInstance();
            delayByThreeSeconds();
            printSpooler1.addPrinter("Thread1 Printer");
        });

        Thread thread2 = new Thread(() -> {
            PrintSpooler printSpooler2 = PrintSpooler.getInstance();
            delayByThreeSeconds();
            printSpooler2.addPrinter("Thread2 Printer");
        });

        Thread thread3 = new Thread(() -> {
            PrintSpooler printSpooler3 = PrintSpooler.getInstance();
            delayByThreeSeconds();
            printSpooler3.addPrinter("Thread3 Printer");
        });

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        printSpooler.getPrinters().forEach(System.out::println);

    }

    private static void delayByThreeSeconds() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
