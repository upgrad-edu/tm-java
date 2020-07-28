import java.util.*;

public class UTubeV5 {

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
        Map<String, VideoV5> videoMap = new HashMap<>();

        List<VideoV5> videos = new ArrayList<>();
        videos.add(new VideoV5("", "Avengers: Endgame", 500));
        videos.add(new VideoV5("", "Java | Session 1", 200));
        videos.add(new VideoV5("", "Mad Max: Fury Road", 300));
        videos.add(new VideoV5("", "Welcome to upGrad", 300));
        
        for (int i=0; i<videos.size();) {
            String id = getId();
            if (videoMap.containsKey(id)) {
                continue;
            }
            videos.get(i).setId(id);
            videoMap.put(id, videos.get(i));
            i++;
        }

        System.out.println("Iterating using entrySet");
        for (Map.Entry<String, VideoV5> entry: videoMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getName() + ", " + entry.getValue().getSize());
        }
        System.out.println();

        System.out.println("Iterating using keySet");
        for (String key: videoMap.keySet()) {
            System.out.println(key + ": " + videoMap.get(key).getName() + ", " + videoMap.get(key).getSize());
        }
        System.out.println();
    }
}
