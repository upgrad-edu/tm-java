import java.util.HashSet;
import java.util.Set;

public class UTubeV3 {
    public static void main(String[] args) {
        Video video1 = new Video("1", "video1", 100);
        Video video2 = new Video("1", "video1", 100);
        Set<Video> videos = new HashSet<>();
        videos.add(video1);
        videos.add(video2);
        System.out.println(videos.size());

        VideoV2 videoV21 = new VideoV2("1", "video1", 100);
        VideoV2 videoV22 = new VideoV2("1", "video1", 100);
        Set<VideoV2> videosV2 = new HashSet<>();
        videosV2.add(videoV21);
        videosV2.add(videoV22);
        System.out.println(videosV2.size());
    }
}
