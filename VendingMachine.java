
import java.util.List;

public class VendingMachine {

    int nickels;
    int dimes;
    int quarters;
    int dollars;

    int nickelsInserted;
    int dimesInserted;
    int quartersInserted;
    int dollarsInserted;

    int itemA = 10;
    int itemB = 10;
    int itemC = 10;


    public int handleInput(List<String> commands)
    {
        double sum = 0.0;

        for (String c : commands)
        {
            sum = handleMoney(sum, c);

            handleItems(c);
            getItem(sum, c);

            if (c.equals("COIN-RETURN"))
            {
                System.out.print("->");
                coinReturn();
                return 0;
            }
            if (c.equals("SERVICE"))
            {
                System.out.print("->");
                updateVendingMachineWithMoney();
                System.out.print("SERVICE COMPLETED");
                return 0;
            }

        }
        return 1;
    }

    private int getItem(double sum, String c) {
        if (c.equals("GET-A"))
        {
            return handleGetA(sum);
        }
        if (c.equals("GET-B"))
        {
            return handleGetB(sum);
        }
        if (c.equals("GET-C"))
        {
            return handleGetC(sum);
        }
        return 0;

    }

    private void handleItems(String c) {
        if (c.equals("A"))
        {
            itemA++;
        }
        if (c.equals("B"))
        {
            itemB++;
        }
        if (c.equals("C"))
        {
            itemC++;
        }
    }

    private double handleMoney(double sum, String c) {
        if (c.equals("DOLLAR"))
        {
            dollarsInserted++;
            sum += 1.00;
        }
        if (c.equals("Q"))
        {
            quartersInserted++;

            sum += 0.25;
        }
        if (c.equals("D"))
        {
            dimesInserted++;
            sum += 0.10;
        }
        if (c.equals("N"))
        {
            nickelsInserted++;
            sum += 0.05;
        }
        return sum;
    }

    private int handleGetC(double sum) {
        if (sum >= 1.50 && itemC > 0)
        {
            updateVendingMachineWithMoney();
            itemC --;
            System.out.println("-> C");
            return 0;
        }
        return 1;
    }

    private int handleGetB(double sum) {
        if (sum >= 1.00 && itemB > 0)
        {
            updateVendingMachineWithMoney();
            itemB --;
            System.out.println("-> B");
            return 0;
        }
        return 1;
    }

    private int handleGetA(double sum) {
        if (sum >= 0.65 && itemA > 0)
        {
            updateVendingMachineWithMoney();
            itemA --;
            System.out.println("-> A");
            return 0;

        }
        return 1;
    }

    private void coinReturn() {
        for (int i = 0; i < dollarsInserted; i++) {
            System.out.print("DOLLAR");
        }
        for (int i = 0; i < quartersInserted; i++) {
            System.out.print("QUARTER");
        }
        for (int i = 0; i < dimesInserted; i++) {
            System.out.print("DIME");
        }
        for (int i = 0; i < nickelsInserted; i++) {
            System.out.print("NICKELS");
        }
        dollarsInserted = 0;
        quartersInserted = 0;
        dimesInserted = 0;
        nickelsInserted = 0;
    }


    private void updateVendingMachineWithMoney() {
        dollars = dollars + dollarsInserted;
        quarters = quarters + quartersInserted;
        dimes = dimes + dimesInserted;
        nickels = nickels + nickelsInserted;
        dollarsInserted = 0;
        quartersInserted = 0;
        dimesInserted = 0;
        nickelsInserted = 0;

    }

}
