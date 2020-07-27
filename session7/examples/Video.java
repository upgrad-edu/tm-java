public class Video {
    private String id;
    private String name;
    private int size;

    public Video(String id, String name, int size) {
        this.id = id;
        this.name = name;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", size: " + size;
    }
}
