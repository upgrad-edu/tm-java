import java.util.*;

public class UTubeV4 {
    public static void main(String[] args) {
        Set<VideoV4> videoHashSet = new HashSet<>();
        Set<VideoV4> videoLinkedSet = new LinkedHashSet<>();
        Set<VideoV4> videoTreeSet = new TreeSet<>();

        List<VideoV4> videos = new ArrayList<>();
        videos.add(new VideoV4("abcd", "Avengers: Endgame", 500));
        videos.add(new VideoV4("qwer", "Java | Session 1", 200));
        videos.add(new VideoV4("ijkl", "Mad Max: Fury Road", 300));
        videos.add(new VideoV4("mnop", "Welcome to upGrad", 300));

        for (VideoV4 videoV4: videos) {
            videoHashSet.add(videoV4);
            videoLinkedSet.add(videoV4);
            videoTreeSet.add(videoV4);
        }

        System.out.println("Iterating HashSet");
        for (VideoV4 videoV4 : videoHashSet) {
            System.out.println(videoV4);
        }
        System.out.println();

        System.out.println("Iterating LinkedHashSet");
        Iterator<VideoV4> iterator = videoLinkedSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        System.out.println("Iterating TreeSet");
        for (VideoV4 videoV4 : videoTreeSet) {
            System.out.println(videoV4);
        }
        System.out.println();
    }
}
