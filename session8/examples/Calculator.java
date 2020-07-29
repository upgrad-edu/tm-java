import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

interface Operation {
    int operate(int x, int y);
}

public class Calculator {

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
        Scanner scanner = new Scanner(System.in);
        String selectedOperation;
        System.out.print("Currently supported operations: ");
        for (String opr: supportedOperations.keySet()) {
            System.out.print("'" + opr + "'" + ", ");
        }
        System.out.println("Type 'EXIT' to close");

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

            System.out.println(supportedOperations.get(selectedOperation).operate(x, y));
            System.out.println("**********************************");
        } while (!selectedOperation.equals("EXIT"));
    }

    public static void main(String[] args) {
        new Calculator().start();
    }
}
