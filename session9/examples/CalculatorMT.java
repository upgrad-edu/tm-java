import java.util.*;

interface Operation {
    int operate(int x, int y);
}

class Computation {
    private int x;
    private int y;
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

class ComputationList {
    private List<Computation> computationList;

    public ComputationList () {
        computationList = new LinkedList<>();
    }

    public void insert (Computation data) {
        computationList.add(data);
    }

    public Computation retrieve () {
        return computationList.remove(0);
    }

    public int computationCount () {
        return computationList.size();
    }
}

class DataFetcher implements Runnable {
    private final ComputationList computationList;
    private final Map<String, Operation> supportedOperations;

    public DataFetcher (ComputationList computationList, Map<String, Operation> supportedOperations) {
        this.computationList = computationList;
        this.supportedOperations = supportedOperations;
    }

    public void run () {
        synchronized (computationList) {
            Scanner scanner = new Scanner(System.in);
            String selectedOperation;

            do {
                while (computationList.computationCount() >= 3) {
                    try {
                        computationList.notify();
                        computationList.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("Type here: ");
                selectedOperation = scanner.nextLine();
                if (!supportedOperations.containsKey(selectedOperation)) {
                    if (selectedOperation.equals("EXIT")) {
                        computationList.insert(new Computation(0, 0, null));
                    }
                    continue;
                }
                System.out.print("Enter first argument: ");
                int x = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter second argument: ");
                int y = Integer.parseInt(scanner.nextLine());

                computationList.insert(new Computation(x, y, supportedOperations.get(selectedOperation)));
                System.out.println("DataFetcher: [" + x + ", " + y + ", " + selectedOperation + "]");
            } while (!selectedOperation.equals("EXIT"));
            computationList.notify();
        }
    }
}

class DataComputer implements Runnable {
    private final ComputationList computationList;

    public DataComputer (ComputationList computationList) {
        this.computationList = computationList;
    }

    public void run () {
        synchronized (computationList) {
            boolean flag = true;
            while (flag) {
                while (computationList.computationCount() == 0) {
                    try {
                        computationList.notify();
                        computationList.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    int result = computationList.retrieve().compute();
                    System.out.println("DataComputer: " + result);
                } catch (NullPointerException e) {
                    System.out.println("Exit");
                    flag = false;
                }
            }
            computationList.notify();
        }
    }
}

public class CalculatorMT {
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
        ComputationList computationList = new ComputationList();
        new Thread(new DataFetcher(computationList, supportedOperations)).start();
        new Thread(new DataComputer(computationList)).start();
    }

    public static void main(String[] args) {
        new CalculatorMT().start();
    }
}
