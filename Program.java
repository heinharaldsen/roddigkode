import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Program {

    public static void main (String args[])
    {

        VendingMachine vm = new VendingMachine();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        System.out.println("Velkommen til vår flotte automat :");
        System.out.println("Hva vil du kjøpe :");
        try
        {
            input = br.readLine();
            br.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
        String command =  input.toUpperCase();

        List<String> commands = Arrays.asList(command.split(","));
        commands.replaceAll(String::trim);

        System.out.println("Du har puttet på " + commands);
        int status = vm.handleInput(commands);
        if (status == 0)
        {
            System.out.println("Takk for handelen");
        }
        else
        {
            System.out.println("Ikke nok penger, eller ingen tilgjengelige produkter av ditt ønske ");
        }


    }
}
