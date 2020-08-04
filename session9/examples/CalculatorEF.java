import java.util.*;
import java.util.concurrent.*;

interface Operation {
    int operate(int x, int y);
}

class Computation {
    private int x;
    private int y;
    private ThreadLocal<String> threadLocal = new ThreadLocal<>();
    private Operation operation;

    public Computation(int x, int y, Operation operation) {
        this.x = x;
        this.y = y;
        this.operation = operation;
    }

    public int compute () {
        return operation.operate(x, y);
    }
}

class DataFetcher implements Runnable {
    private final Map<String, Operation> supportedOperations;
    private List<Future<Integer>> futures;
    private ExecutorService executorService;

    public DataFetcher (Map<String, Operation> supportedOperations) {
        this.supportedOperations = supportedOperations;
        futures = new ArrayList<>();
        executorService = Executors.newFixedThreadPool(2);
    }

    public void run () {
        Scanner scanner = new Scanner(System.in);
        String selectedOperation;
        do {
            System.out.print("Type here: ");
            selectedOperation = scanner.nextLine();
            if (!supportedOperations.containsKey(selectedOperation)) {
                continue;
            }
            System.out.print("Enter first argument: ");
            int x = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter second argument: ");
            int y = Integer.parseInt(scanner.nextLine());

            Computation computation = new Computation(x, y, supportedOperations.get(selectedOperation));
            Future<Integer> future = executorService.submit(new DataComputer(computation));
            futures.add(future);
            if (futures.size() >= 3) {
                while (futures.size() > 0) {
                    Future<Integer> calc = futures.remove(0);
                    try {
                        System.out.println(calc.get());
                    } catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    }
                }
            }
        } while (!selectedOperation.equals("EXIT"));
        if (!futures.isEmpty()) {
            while (futures.size() > 0) {
                Future<Integer> calc = futures.remove(0);
                try {
                    System.out.println(calc.get());
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }
        }
        executorService.shutdown();
    }
}

class DataComputer implements Callable<Integer> {
    private Computation computation;

    public DataComputer (Computation computation) {
        this.computation = computation;
    }

    @Override
    public Integer call() throws Exception {
        return computation.compute();
    }
}

public class CalculatorEF {
    private Map<String, Operation> supportedOperations;

    private void load () {
        supportedOperations = new LinkedHashMap<>();
        supportedOperations.put("add", Integer::sum);
        supportedOperations.put("sub", (x, y) -> x - y);
        supportedOperations.put("mul", (x, y) -> x * y);
        supportedOperations.put("div", (x, y) -> x / y);
    }

    public void start () {
        load();
        System.out.print("Currently supported operations: ");
        for (String opr: supportedOperations.keySet()) {
            System.out.print("'" + opr + "'" + ", ");
        }
        System.out.println("Type 'EXIT' to close");
        new Thread(new DataFetcher(supportedOperations)).start();
    }

    public static void main(String[] args) {
        new CalculatorEF().start();
    }
}
