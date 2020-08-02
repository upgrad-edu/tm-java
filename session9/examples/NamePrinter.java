import java.util.ArrayList;
import java.util.List;

public class NamePrinter implements Runnable {

    private List<String> names;

    public NamePrinter (List<String> names) {
        this.names = names;
    }

    @Override
    public void run() {
        names.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("ishwar");
        names.add("srishti");
        names.add("deepak");
        names.add("akash");
        names.add("sreejit");
        names.add("ifrah");

        Thread namePrinter = new Thread (new NamePrinter(names));
        namePrinter.start();
    }
}
