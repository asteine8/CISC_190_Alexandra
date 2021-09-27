import java.util.*;
public class RecordingSort {
    private static ArrayList<Recording> recordings = new ArrayList<Recording>();

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // populate recordings from user input
        for (int i = 1; i <= 5; i++) {
            Recording rec = new Recording();
            System.out.println("Enter a song for recording "+i);
            rec.setSong(myScanner.nextLine());
            System.out.println("Enter an artist for recording "+i);
            rec.setArtist(myScanner.nextLine());
            System.out.println("Enter the time for the recording in seconds "+i);
            rec.setPlayTime(Integer.parseInt(myScanner.nextLine()));
            recordings.add(rec);
        }

        System.out.println("By which field do you want to sort?\n(S)ong, (A)rtist, or (T)ime");
        String userInput = myScanner.nextLine();

        if (userInput.equals("A")) {
            sortByArtist(recordings);
        }
        else if (userInput.equals("S")) {
            sortBySong(recordings);
        }
        else if (userInput.equals("T")) {
            sortByTime(recordings);
        }
        else {
            System.out.println("Invalid input entered, I hate you baka");
        }

    }

    public static void sortByArtist(ArrayList<Recording> array) {
        Collections.sort(array,
            (Recording r1, Recording r2)->
            {
                return r1.getArtist().compareToIgnoreCase(r2.getArtist());
            }
        );
        for (int i = 0; i < recordings.size(); i++) {
            recordings.get(i).display();
        }
    }

    public static void sortBySong(ArrayList<Recording> array) {
        Collections.sort(recordings,
            (Recording r1, Recording r2)->
            {
                return r1.getSong().compareToIgnoreCase(r2.getSong());
            }
        );
        for (int i = 0; i < recordings.size(); i++) {
            recordings.get(i).display();
        }
    }

    public static void sortByTime(ArrayList<Recording> array) {
        Collections.sort(recordings,
            (Recording r1, Recording r2)->
            {
                return r1.getPlayTime()-r2.getPlayTime();
            }
        );
        for (int i = 0; i < recordings.size(); i++) {
            recordings.get(i).display();
        }
    }
}
