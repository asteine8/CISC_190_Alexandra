import java.util.*;

public class DisplaySelectedCustomersByBalance {
    public static void main(String[] args) {
        ArrayList<Customer> customers = WriteCustomerList.ReadCustomersFromFile(WriteCustomerList.FILE_PATH);
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter the balace of the customer file you wish to retrieve >> ");
        double bal = Double.parseDouble(myScanner.nextLine());

        int numFilesFound = 0;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).balanceOwed == bal) {
                System.out.println(customers.get(i).toCSV());
                numFilesFound++;
            }
        }

        if (numFilesFound == 0) {
            System.out.println("No records found");
        }
    }
}
