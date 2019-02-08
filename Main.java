
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        State state = new State(0, 0, 0, 0);
        VendingMachine vendingMachine = new VendingMachine();

        while (true) {
            System.out.println("Enter command:");
            String commandLine = scanner.nextLine();
            String[] commands = commandLine.split(",");

            for (String command : commands) {
                state = vendingMachine.handleCommand(state, command);
                System.out.println(state);
            }
        }

    }
}