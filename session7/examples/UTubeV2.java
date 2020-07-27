import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class UTubeV2 {
    //Generate a random id of length 11
    public static String getId () {
        String SALTCHARS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz-_";
        int idLength = 11;
        char[] id = new char[idLength];
        Random random = new Random();
        for (int i=0; i<idLength; i++) {
            int randIndex = random.nextInt(SALTCHARS.length());
            id[i] = SALTCHARS.charAt(randIndex);
        }
        return new String(id);
    }

    public static void main(String[] args) {
        LocalTime start, end;

        List<String> idsList = new ArrayList<>();
        start = LocalTime.now();
        for (int i=0; i<100000; i++) {
            String id = getId();
            if (!idsList.contains(id)) {
                idsList.add(id);
            }
        }
        end = LocalTime.now();
        System.out.println(start.until(end, ChronoUnit.MILLIS));

        Set<String> idsSet = new HashSet<>();
        start = LocalTime.now();
        for (int i=0; i<100000; i++) {
            String id = getId();
            idsSet.add(id);
        }
        end = LocalTime.now();
        System.out.println(start.until(end, ChronoUnit.MILLIS));
    }
}
