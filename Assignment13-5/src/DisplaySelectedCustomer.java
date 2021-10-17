import java.util.*;

public class DisplaySelectedCustomer {
    public static void main(String[] args) {
        ArrayList<Customer> customers = WriteCustomerList.ReadCustomersFromFile(WriteCustomerList.FILE_PATH);
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter the id number of the customer file you wish to retrieve >> ");
        long id = Long.parseLong(myScanner.nextLine());

        int i;
        for (i = 0; i < customers.size(); i++) {
            if (customers.get(i).id == id) {
                System.out.println(customers.get(i).toCSV());
                break;
            }
        }
        if (i == customers.size()) {
            System.out.println("No records found");
        }
    }
}