import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UTube {
    public static void print (String message, List<Video> videos) {
        System.out.println(message);
        for (Video video: videos) System.out.println(video);
        System.out.println();
    }

    public static void main(String[] args) {
        List<Video> videos = new ArrayList<>();
        videos.add(new Video("abcd", "Avengers: Endgame", 500));
        videos.add(new Video("qwer", "Java | Session 1", 200));
        videos.add(new Video("ijkl", "Mad Max: Fury Road", 300));
        videos.add(new Video("mnop", "Welcome to upGrad", 300));

        print("No Sorting", videos);

        Comparator<Video> sortById = Comparator.comparing(Video::getId);
        videos.sort(sortById);
        print("Sorted by id", videos);

        videos.sort(Comparator.comparing(Video::getName));
        print("Sorted by name", videos);

        videos.sort(Comparator.comparing(Video::getSize).reversed());
        print("Sorted by size in reverse order", videos);

        videos.sort(Comparator.comparing(Video::getSize));
        print("Sorted by size", videos);

        videos.sort(Comparator.comparing(Video::getSize).thenComparing(Comparator.comparing(Video::getName).reversed()));
        print("Sorted by size then sorted by name", videos);
    }
}
