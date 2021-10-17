import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.*;
public class WriteCustomerList {
    public static final String FILE_PATH = "CustomerList.txt";

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Create list of customers
        ArrayList<Customer> customers = new ArrayList<Customer>();

        // Get info for customors
        while (true) {
            System.out.print("Please enter the id number >> ");
            String idInput = myScanner.nextLine();
            // exit if id number is ZZZ
            if (idInput.equals("ZZZ")) {
                break;
            }

            long idNumber = Long.parseLong(idInput);
            System.out.print("Please enter the first name >> ");
            String firstName = myScanner.nextLine();
            System.out.print("Please enter the last name >> ");
            String lastName = myScanner.nextLine();
            System.out.print("Please enter the balance owed >> ");
            double balanceOwed = Double.parseDouble(myScanner.nextLine());

            customers.add(new Customer(idNumber,firstName,lastName,balanceOwed));
        }

        // Try to write from the file
        OutputStream output = null;
        try {
            // Create output stream to write to the file
            output = new BufferedOutputStream(Files.newOutputStream(Paths.get(FILE_PATH), CREATE, APPEND));
            // Write lines in csv format
            for (int i = 0; i < customers.size(); i++) {
                output.write(customers.get(i).toCSVLine().getBytes());
            }
            output.flush();
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public static ArrayList<Customer> ReadCustomersFromFile(String filePath) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        // Get reader for file
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(
                    Files.newInputStream(Paths.get(WriteCustomerList.FILE_PATH))));

            // Parse in lines to customer objects
            String s = null;
            while ((s = reader.readLine()) != null) {
                String[] spltStr = s.split(",");
                customers.add(new Customer(Long.parseLong(spltStr[0]),
                                            spltStr[1],
                                            spltStr[2],
                                            Double.parseDouble(spltStr[3])));
            }
            
        } catch(Exception e) {
            System.out.println(e);
        }

        return customers;
    }
}
