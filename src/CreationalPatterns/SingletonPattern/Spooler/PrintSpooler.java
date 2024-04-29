package CreationalPatterns.SingletonPattern.Spooler;

import java.util.ArrayList;
import java.util.List;

public class PrintSpooler {

  private static PrintSpooler printSpooler;

    private static boolean isInitialized = false;

    private List<String> printers;

    private PrintSpooler() {

    }

    private void initialize() {
        printSpooler.printers = new ArrayList<>();
        isInitialized = true;
    }


    public static synchronized PrintSpooler getInstance() {
        if (isInitialized)
            return printSpooler;

        printSpooler = new PrintSpooler();
        printSpooler.initialize();
        return printSpooler;
    }

    public synchronized void addPrinter(String printer) {
        printSpooler.printers.add(printer);
    }

    public List<String> getPrinters() {
        return printSpooler.printers;
    }

}
