import java.nio.file.*;
import java.io.*;
public class DisplaySavedCustomerList {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(
                    Files.newInputStream(Paths.get(WriteCustomerList.FILE_PATH))));
            
            String s = null;
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
