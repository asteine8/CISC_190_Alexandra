import java.util.ArrayList;
import java.util.Random;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        // Generate a random from current time
        Random rand = new Random(System.currentTimeMillis());
        
        // Populate al with 10 random numbers in range (0,100]
        for (int i = 0; i < 10; i++) {
            al.add(rand.nextInt(100)+1);
        }

        printArrayListContents(al);

        // Remove and print the first element in al
        System.out.println(al.remove(0));

        printArrayListContents(al);
    }

    private static void printArrayListContents(ArrayList<Integer> array) {
        System.out.print("[");

        // Iterate through everything but the last element
        int i = 0;
        for (; i < array.size()-1; i++) {
            System.out.print(array.get(i)+",");
        }

        // Print out the last element
        System.out.println(array.get(i) + "]");
    }
}
